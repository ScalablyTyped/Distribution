package typings.instagramPrivateApi

import typings.instagramPrivateApi.igClientErrorMod.IgClientError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/errors/ig-no-checkpoint.error", JSImport.Namespace)
@js.native
object igNoCheckpointErrorMod extends js.Object {
  @js.native
  class IgNoCheckpointError () extends IgClientError {
    def this(message: String) = this()
  }
  
}

