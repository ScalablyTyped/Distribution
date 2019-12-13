package typings.instagramDashPrivateDashApi

import typings.instagramDashPrivateDashApi.distErrorsIgDashResponseDotErrorMod.IgResponseError
import typings.instagramDashPrivateDashApi.distResponsesCheckpointDotResponseMod.CheckpointResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/errors/ig-checkpoint.error", JSImport.Namespace)
@js.native
object distErrorsIgDashCheckpointDotErrorMod extends js.Object {
  @js.native
  class IgCheckpointError () extends IgResponseError[CheckpointResponse] {
    def apiUrl(): String = js.native
    def url(): String = js.native
  }
  
}

