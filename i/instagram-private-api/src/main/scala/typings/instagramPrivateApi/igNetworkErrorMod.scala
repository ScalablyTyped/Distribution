package typings.instagramPrivateApi

import typings.instagramPrivateApi.igClientErrorMod.IgClientError
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("instagram-private-api/dist/errors/ig-network.error", JSImport.Namespace)
@js.native
object igNetworkErrorMod extends js.Object {
  
  @js.native
  class IgNetworkError protected () extends IgClientError {
    def this(e: Error) = this()
  }
}
