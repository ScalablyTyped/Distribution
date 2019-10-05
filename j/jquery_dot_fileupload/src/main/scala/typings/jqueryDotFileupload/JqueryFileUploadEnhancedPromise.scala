package typings.jqueryDotFileupload

import typings.jquery.JQuery.Deferred.CallbackBase
import typings.jquery.JQuery.PromiseBase
import typings.jquery.JQuery.TypeOrArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JqueryFileUploadEnhancedPromise[T]
  extends PromiseBase[T, js.Any, js.Any, T, js.Any, js.Any, T, js.Any, js.Any, T, js.Any, js.Any] {
  @JSName("complete")
  var complete_Original: js.Function2[
    /* alwaysCallback */ TypeOrArray[CallbackBase[T | _, T | _, T | _, T | _]], 
    /* repeated */ TypeOrArray[CallbackBase[T | _, T | _, T | _, T | _]], 
    this.type
  ] = js.native
  @JSName("error")
  var error_Original: js.Function2[
    /* failCallback */ TypeOrArray[CallbackBase[_, _, _, _]], 
    /* repeated */ TypeOrArray[CallbackBase[_, _, _, _]], 
    this.type
  ] = js.native
  @JSName("success")
  var success_Original: js.Function2[
    /* doneCallback */ TypeOrArray[CallbackBase[T, T, T, T]], 
    /* repeated */ TypeOrArray[CallbackBase[T, T, T, T]], 
    this.type
  ] = js.native
  def complete(
    alwaysCallback: TypeOrArray[CallbackBase[T | _, T | _, T | _, T | _]],
    alwaysCallbacks: (TypeOrArray[CallbackBase[T | _, T | _, T | _, T | _]])*
  ): this.type = js.native
  def error(
    failCallback: TypeOrArray[CallbackBase[_, _, _, _]],
    failCallbacks: (TypeOrArray[CallbackBase[_, _, _, _]])*
  ): this.type = js.native
  def success(
    doneCallback: TypeOrArray[CallbackBase[T, T, T, T]],
    doneCallbacks: (TypeOrArray[CallbackBase[T, T, T, T]])*
  ): this.type = js.native
}

