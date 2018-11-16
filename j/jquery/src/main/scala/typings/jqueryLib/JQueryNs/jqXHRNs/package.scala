package typings
package jqueryLib.JQueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jqXHRNs {
  type AlwaysCallback[TResolve, TjqXHR] = jqueryLib.JQueryNs.DeferredNs.Callback3[TResolve | TjqXHR, jqueryLib.JQueryNs.AjaxNs.TextStatus, TjqXHR | java.lang.String]
  type DoneCallback[TResolve, TjqXHR] = jqueryLib.JQueryNs.DeferredNs.Callback3[TResolve, jqueryLib.JQueryNs.AjaxNs.SuccessTextStatus, TjqXHR]
  type FailCallback[TjqXHR] = jqueryLib.JQueryNs.DeferredNs.Callback3[TjqXHR, jqueryLib.JQueryNs.AjaxNs.ErrorTextStatus, java.lang.String]
}
