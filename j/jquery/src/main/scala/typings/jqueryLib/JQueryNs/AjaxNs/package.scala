package typings
package jqueryLib.JQueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object AjaxNs {
  type CompleteCallback[TContext] = js.ThisFunction2[
    /* this */ TContext, 
    /* jqXHR */ jqueryLib.JQueryNs.jqXHR[js.Any], 
    /* textStatus */ TextStatus, 
    scala.Unit
  ]
  type ErrorCallback[TContext] = js.ThisFunction3[
    /* this */ TContext, 
    /* jqXHR */ jqueryLib.JQueryNs.jqXHR[js.Any], 
    /* textStatus */ ErrorTextStatus, 
    /* errorThrown */ java.lang.String, 
    scala.Unit
  ]
  type ErrorTextStatus = jqueryLib.jqueryLibStrings.timeout | jqueryLib.jqueryLibStrings.error | jqueryLib.jqueryLibStrings.abort | jqueryLib.jqueryLibStrings.parsererror
  // region StatusCodeCallbacks
  // #region StatusCodeCallbacks
  type StatusCodeCallbacks[TContext] = jqueryLib.Anon_205[TContext] with (// Status codes not listed require type annotations when defining the callback
  ScalablyTyped.runtime.NumberDictionary[SuccessCallback[TContext] | ErrorCallback[TContext]])
  type SuccessCallback[TContext] = js.ThisFunction3[
    /* this */ TContext, 
    /* data */ js.Any, 
    /* textStatus */ SuccessTextStatus, 
    /* jqXHR */ jqueryLib.JQueryNs.jqXHR[js.Any], 
    scala.Unit
  ]
  type SuccessTextStatus = jqueryLib.jqueryLibStrings.success | jqueryLib.jqueryLibStrings.notmodified | jqueryLib.jqueryLibStrings.nocontent
  type TextStatus = SuccessTextStatus | ErrorTextStatus
}
