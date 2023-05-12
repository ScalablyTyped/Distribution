package typings.hlsJs.mod

import typings.hlsJs.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoaderCallbacks[T /* <: LoaderContext */] extends StObject {
  
  var onAbort: js.UndefOr[LoaderOnAbort[T]] = js.undefined
  
  def onError(error: Code, context: T, networkDetails: Any, stats: LoaderStats): Unit
  @JSName("onError")
  var onError_Original: LoaderOnError[T]
  
  var onProgress: js.UndefOr[LoaderOnProgress[T]] = js.undefined
  
  def onSuccess(response: LoaderResponse, stats: LoaderStats, context: T, networkDetails: Any): Unit
  @JSName("onSuccess")
  var onSuccess_Original: LoaderOnSuccess[T]
  
  def onTimeout(stats: LoaderStats, context: T, networkDetails: Any): Unit
  @JSName("onTimeout")
  var onTimeout_Original: LoaderOnTimeout[T]
}
object LoaderCallbacks {
  
  inline def apply[T /* <: LoaderContext */](
    onError: (/* error */ Code, T, /* networkDetails */ Any, /* stats */ LoaderStats) => Unit,
    onSuccess: (/* response */ LoaderResponse, /* stats */ LoaderStats, T, /* networkDetails */ Any) => Unit,
    onTimeout: (/* stats */ LoaderStats, T, /* networkDetails */ Any) => Unit
  ): LoaderCallbacks[T] = {
    val __obj = js.Dynamic.literal(onError = js.Any.fromFunction4(onError), onSuccess = js.Any.fromFunction4(onSuccess), onTimeout = js.Any.fromFunction3(onTimeout))
    __obj.asInstanceOf[LoaderCallbacks[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoaderCallbacks[?], T /* <: LoaderContext */] (val x: Self & LoaderCallbacks[T]) extends AnyVal {
    
    inline def setOnAbort(value: (/* stats */ LoaderStats, T, /* networkDetails */ Any) => Unit): Self = StObject.set(x, "onAbort", js.Any.fromFunction3(value))
    
    inline def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
    
    inline def setOnError(value: (/* error */ Code, T, /* networkDetails */ Any, /* stats */ LoaderStats) => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction4(value))
    
    inline def setOnProgress(
      value: (/* stats */ LoaderStats, T, /* data */ String | js.typedarray.ArrayBuffer, /* networkDetails */ Any) => Unit
    ): Self = StObject.set(x, "onProgress", js.Any.fromFunction4(value))
    
    inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
    
    inline def setOnSuccess(
      value: (/* response */ LoaderResponse, /* stats */ LoaderStats, T, /* networkDetails */ Any) => Unit
    ): Self = StObject.set(x, "onSuccess", js.Any.fromFunction4(value))
    
    inline def setOnTimeout(value: (/* stats */ LoaderStats, T, /* networkDetails */ Any) => Unit): Self = StObject.set(x, "onTimeout", js.Any.fromFunction3(value))
  }
}
