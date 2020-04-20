package typings.instagramPrivateApi

import typings.instagramPrivateApi.igResponseErrorMod.IgResponseError
import typings.instagramPrivateApi.spamResponseMod.SpamResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/errors/ig-action-spam.error", JSImport.Namespace)
@js.native
object igActionSpamErrorMod extends js.Object {
  @js.native
  class IgActionSpamError () extends IgResponseError[SpamResponse] {
    def expirationDate: String | Null = js.native
  }
  
}

