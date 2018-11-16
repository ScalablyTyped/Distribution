package typings
package jqueryDotFileuploadLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JqueryFileUploadEnhancedPromise[T]
  extends jqueryLib.JQueryNs.PromiseBase[T, js.Any, js.Any, T, js.Any, js.Any, T, js.Any, js.Any, T, js.Any, js.Any] {
  var complete: js.Function2[
    /* alwaysCallback */ jqueryLib.JQueryNs.TypeOrArray[jqueryLib.JQueryNs.DeferredNs.CallbackBase[T | _, T | _, T | _, T | _]], 
    /* repeated */jqueryLib.JQueryNs.TypeOrArray[jqueryLib.JQueryNs.DeferredNs.CallbackBase[T | _, T | _, T | _, T | _]], 
    this.type
  ] = js.native
  var error: js.Function2[
    /* failCallback */ jqueryLib.JQueryNs.TypeOrArray[jqueryLib.JQueryNs.DeferredNs.CallbackBase[_, _, _, _]], 
    /* repeated */jqueryLib.JQueryNs.TypeOrArray[jqueryLib.JQueryNs.DeferredNs.CallbackBase[_, _, _, _]], 
    this.type
  ] = js.native
  var success: js.Function2[
    /* doneCallback */ jqueryLib.JQueryNs.TypeOrArray[jqueryLib.JQueryNs.DeferredNs.CallbackBase[T, T, T, T]], 
    /* repeated */jqueryLib.JQueryNs.TypeOrArray[jqueryLib.JQueryNs.DeferredNs.CallbackBase[T, T, T, T]], 
    this.type
  ] = js.native
}

