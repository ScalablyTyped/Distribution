package typings.jquery.JQueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jqXHRNs {
  import typings.jquery.JQueryNs.AjaxNs.ErrorTextStatus
  import typings.jquery.JQueryNs.AjaxNs.SuccessTextStatus
  import typings.jquery.JQueryNs.AjaxNs.TextStatus
  import typings.jquery.JQueryNs.DeferredNs.Callback3

  type AlwaysCallback[TResolve, TjqXHR] = Callback3[TResolve | TjqXHR, TextStatus, TjqXHR | String]
  type DoneCallback[TResolve, TjqXHR] = Callback3[TResolve, SuccessTextStatus, TjqXHR]
  type FailCallback[TjqXHR] = Callback3[TjqXHR, ErrorTextStatus, String]
}
