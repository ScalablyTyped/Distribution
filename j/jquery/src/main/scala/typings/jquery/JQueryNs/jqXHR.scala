package typings.jquery.JQueryNs

import typings.jquery.JQueryNs.AjaxNs.ErrorTextStatus
import typings.jquery.JQueryNs.AjaxNs.StatusCodeCallbacks
import typings.jquery.JQueryNs.AjaxNs.SuccessTextStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see \`{@link https://api.jquery.com/jquery.ajax/#jqXHR }\`
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in 'abort' | 'getAllResponseHeaders' | 'getResponseHeader' | 'overrideMimeType' | 'readyState' | 'responseText' | 'setRequestHeader' | 'status' | 'statusText' ]: std.XMLHttpRequest[P]}
- Dropped {[ P in keyof std.Pick<std.XMLHttpRequest, 'responseXML'> ]:? std.Pick<std.XMLHttpRequest, 'responseXML'>[P]} */ @js.native
trait jqXHR[TResolve]
  extends PromiseBase[
      TResolve, 
      jqXHR[TResolve], 
      scala.Nothing, 
      SuccessTextStatus, 
      ErrorTextStatus, 
      scala.Nothing, 
      jqXHR[TResolve], 
      String, 
      scala.Nothing, 
      scala.Nothing, 
      scala.Nothing, 
      scala.Nothing
    ] {
  var responseJSON: js.UndefOr[js.Any] = js.native
  def abort(): Unit = js.native
  def abort(statusText: String): Unit = js.native
  def statusCode(map: StatusCodeCallbacks[_]): Unit = js.native
}

