package typings.instagramPrivateApi

import typings.instagramPrivateApi.clientMod.IgApiClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/core/repository", JSImport.Namespace)
@js.native
object repositoryMod extends js.Object {
  @js.native
  abstract class Repository protected () extends js.Object {
    def this(client: IgApiClient) = this()
    var client: IgApiClient = js.native
  }
  
}

