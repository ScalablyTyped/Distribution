package typings.instagramDashPrivateDashApi

import org.scalablytyped.runtime.StringDictionary
import typings.instagramDashPrivateDashApi.distErrorsIgDashClientDotErrorMod.IgClientError
import typings.instagramDashPrivateDashApi.distTypesCommonDotTypesMod.IgResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/errors/ig-response.error", JSImport.Namespace)
@js.native
object distErrorsIgDashResponseDotErrorMod extends js.Object {
  @js.native
  class IgResponseError[TBody /* <: StringDictionary[js.Any] */] protected () extends IgClientError {
    def this(response: IgResponse[TBody]) = this()
    var response: IgResponse[TBody] = js.native
    var text: String = js.native
  }
  
}

