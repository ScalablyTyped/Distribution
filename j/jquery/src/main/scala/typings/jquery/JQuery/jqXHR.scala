package typings.jquery.JQuery

import typings.jquery.JQuery.Ajax.ErrorTextStatus
import typings.jquery.JQuery.Ajax.StatusCodeCallbacks
import typings.jquery.JQuery.Ajax.SuccessTextStatus
import typings.jquery.JQuery.Ajax.TextStatus
import typings.jquery.JQuery.Deferred.CallbackBase
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

@JSGlobal("JQuery.jqXHR")
@js.native
object jqXHR extends js.Object {
  type AlwaysCallback[TResolve, TjqXHR] = CallbackBase[TResolve | TjqXHR, TextStatus, TjqXHR | String, scala.Nothing]
  type DoneCallback[TResolve, TjqXHR] = CallbackBase[TResolve, SuccessTextStatus, TjqXHR, scala.Nothing]
  type FailCallback[TjqXHR] = CallbackBase[TjqXHR, ErrorTextStatus, String, scala.Nothing]
}

