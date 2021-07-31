package typings.instagramPrivateApi

import typings.instagramPrivateApi.igClientErrorMod.IgClientError
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object igNetworkErrorMod {
  
  @JSImport("instagram-private-api/dist/errors/ig-network.error", "IgNetworkError")
  @js.native
  class IgNetworkError protected () extends IgClientError {
    def this(e: Error) = this()
  }
}
