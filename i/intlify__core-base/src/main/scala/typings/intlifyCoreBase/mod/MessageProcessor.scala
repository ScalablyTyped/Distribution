package typings.intlifyCoreBase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageProcessor[T] extends StObject {
  
  var interpolate: js.UndefOr[MessageInterpolate[T]] = js.undefined
  
  var normalize: js.UndefOr[MessageNormalize[T]] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object MessageProcessor {
  
  inline def apply[T](): MessageProcessor[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageProcessor[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MessageProcessor[?], T] (val x: Self & MessageProcessor[T]) extends AnyVal {
    
    inline def setInterpolate(value: /* val */ Any => MessageType[T]): Self = StObject.set(x, "interpolate", js.Any.fromFunction1(value))
    
    inline def setInterpolateUndefined: Self = StObject.set(x, "interpolate", js.undefined)
    
    inline def setNormalize(value: /* values */ js.Array[MessageType[String | T]] => MessageType[T | js.Array[T]]): Self = StObject.set(x, "normalize", js.Any.fromFunction1(value))
    
    inline def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
