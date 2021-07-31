package typings.instagramPrivateApi

import typings.instagramPrivateApi.clientMod.IgApiClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object repositoryMod {
  
  @JSImport("instagram-private-api/dist/core/repository", "Repository")
  @js.native
  abstract class Repository protected () extends StObject {
    def this(client: IgApiClient) = this()
    
    var client: IgApiClient = js.native
  }
}
