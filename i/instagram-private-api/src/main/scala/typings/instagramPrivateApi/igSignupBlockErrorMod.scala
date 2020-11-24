package typings.instagramPrivateApi

import typings.instagramPrivateApi.igResponseErrorMod.IgResponseError
import typings.instagramPrivateApi.spamResponseMod.SpamResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("instagram-private-api/dist/errors/ig-signup-block.error", JSImport.Namespace)
@js.native
object igSignupBlockErrorMod extends js.Object {
  
  @js.native
  class IgSignupBlockError () extends IgResponseError[SpamResponse]
}
