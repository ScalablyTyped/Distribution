package typings.instagramDashPrivateDashApi

import typings.instagramDashPrivateDashApi.distErrorsIgDashResponseDotErrorMod.IgResponseError
import typings.instagramDashPrivateDashApi.distResponsesSpamDotResponseMod.SpamResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/errors/ig-action-spam.error", JSImport.Namespace)
@js.native
object distErrorsIgDashActionDashSpamDotErrorMod extends js.Object {
  @js.native
  class IgActionSpamError () extends IgResponseError[SpamResponse] {
    def expirationDate(): String | Null = js.native
  }
  
}

