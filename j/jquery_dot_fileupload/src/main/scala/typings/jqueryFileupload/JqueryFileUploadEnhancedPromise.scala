package typings.jqueryFileupload

import typings.jquery.JQuery.Deferred.CallbackBase
import typings.jquery.JQuery.PromiseBase
import typings.jquery.JQuery.TypeOrArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JqueryFileUploadEnhancedPromise[T]
  extends StObject
     with PromiseBase[T, Any, Any, T, Any, Any, T, Any, Any, T, Any, Any] {
  
  def complete(
    alwaysCallback: TypeOrArray[CallbackBase[T | Any, T | Any, T | Any, T | Any]],
    alwaysCallbacks: (TypeOrArray[CallbackBase[T | Any, T | Any, T | Any, T | Any]])*
  ): this.type = js.native
  @JSName("complete")
  var complete_Original: js.Function2[
    /* alwaysCallback */ TypeOrArray[CallbackBase[T | Any, T | Any, T | Any, T | Any]], 
    /* repeated */ TypeOrArray[CallbackBase[T | Any, T | Any, T | Any, T | Any]], 
    this.type
  ] = js.native
  
  def error(
    failCallback: TypeOrArray[CallbackBase[Any, Any, Any, Any]],
    failCallbacks: (TypeOrArray[CallbackBase[Any, Any, Any, Any]])*
  ): this.type = js.native
  @JSName("error")
  var error_Original: js.Function2[
    /* failCallback */ TypeOrArray[CallbackBase[Any, Any, Any, Any]], 
    /* repeated */ TypeOrArray[CallbackBase[Any, Any, Any, Any]], 
    this.type
  ] = js.native
  
  def success(
    doneCallback: TypeOrArray[CallbackBase[T, T, T, T]],
    doneCallbacks: (TypeOrArray[CallbackBase[T, T, T, T]])*
  ): this.type = js.native
  @JSName("success")
  var success_Original: js.Function2[
    /* doneCallback */ TypeOrArray[CallbackBase[T, T, T, T]], 
    /* repeated */ TypeOrArray[CallbackBase[T, T, T, T]], 
    this.type
  ] = js.native
}
