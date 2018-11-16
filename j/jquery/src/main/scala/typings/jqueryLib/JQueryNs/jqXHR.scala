package typings
package jqueryLib.JQueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * @see \`{@link https://api.jquery.com/jquery.ajax/#jqXHR }\`
     */
/* RemoveDifficultInheritance: 
- Lifted 2 members from Set(std.Pick, std.Partial) */ @js.native
trait jqXHR[TResolve]
  extends PromiseBase[
      TResolve, 
      jqXHR[TResolve], 
      scala.Nothing, 
      jqueryLib.JQueryNs.AjaxNs.SuccessTextStatus, 
      jqueryLib.JQueryNs.AjaxNs.ErrorTextStatus, 
      scala.Nothing, 
      jqXHR[TResolve], 
      java.lang.String, 
      scala.Nothing, 
      scala.Nothing, 
      scala.Nothing, 
      scala.Nothing
    ] {
  var responseJSON: js.UndefOr[js.Any] = js.native
  def statusCode(map: jqueryLib.JQueryNs.AjaxNs.StatusCodeCallbacks[_]): scala.Unit = js.native
}

