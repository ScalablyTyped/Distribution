package typings
package jqueryDotFileuploadLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JqueryFileUploadEnhancedPromise[T]
  extends jqueryLib.JQueryNs.PromiseBase[T, js.Any, js.Any, T, js.Any, js.Any, T, js.Any, js.Any, T, js.Any, js.Any] {
  @JSName("complete")
  var complete_Original: js.Function2[
    /* alwaysCallback */ jqueryLib.JQueryNs.TypeOrArray[jqueryLib.JQueryNs.DeferredNs.CallbackBase[T | _, T | _, T | _, T | _]], 
    /* repeated */ jqueryLib.JQueryNs.TypeOrArray[jqueryLib.JQueryNs.DeferredNs.CallbackBase[T | _, T | _, T | _, T | _]], 
    this.type
  ] = js.native
  @JSName("error")
  var error_Original: js.Function2[
    /* failCallback */ jqueryLib.JQueryNs.TypeOrArray[jqueryLib.JQueryNs.DeferredNs.CallbackBase[_, _, _, _]], 
    /* repeated */ jqueryLib.JQueryNs.TypeOrArray[jqueryLib.JQueryNs.DeferredNs.CallbackBase[_, _, _, _]], 
    this.type
  ] = js.native
  @JSName("success")
  var success_Original: js.Function2[
    /* doneCallback */ jqueryLib.JQueryNs.TypeOrArray[jqueryLib.JQueryNs.DeferredNs.CallbackBase[T, T, T, T]], 
    /* repeated */ jqueryLib.JQueryNs.TypeOrArray[jqueryLib.JQueryNs.DeferredNs.CallbackBase[T, T, T, T]], 
    this.type
  ] = js.native
  def complete(
    alwaysCallback: jqueryLib.JQueryNs.TypeOrArray[jqueryLib.JQueryNs.DeferredNs.CallbackBase[T | _, T | _, T | _, T | _]],
    alwaysCallbacks: (jqueryLib.JQueryNs.TypeOrArray[jqueryLib.JQueryNs.DeferredNs.CallbackBase[T | _, T | _, T | _, T | _]])*
  ): this.type = js.native
  def error(
    failCallback: jqueryLib.JQueryNs.TypeOrArray[jqueryLib.JQueryNs.DeferredNs.CallbackBase[_, _, _, _]],
    failCallbacks: (jqueryLib.JQueryNs.TypeOrArray[jqueryLib.JQueryNs.DeferredNs.CallbackBase[_, _, _, _]])*
  ): this.type = js.native
  def success(
    doneCallback: jqueryLib.JQueryNs.TypeOrArray[jqueryLib.JQueryNs.DeferredNs.CallbackBase[T, T, T, T]],
    doneCallbacks: (jqueryLib.JQueryNs.TypeOrArray[jqueryLib.JQueryNs.DeferredNs.CallbackBase[T, T, T, T]])*
  ): this.type = js.native
}

