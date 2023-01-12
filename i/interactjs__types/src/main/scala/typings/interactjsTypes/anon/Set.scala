package typings.interactjsTypes.anon

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Set[T] extends StObject {
  
  var __set: js.UndefOr[Partial[T]] = js.undefined
}
object Set {
  
  inline def apply[T](): Set[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Set[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Set[?], T] (val x: Self & Set[T]) extends AnyVal {
    
    inline def set__set(value: Partial[T]): Self = StObject.set(x, "__set", value.asInstanceOf[js.Any])
    
    inline def set__setUndefined: Self = StObject.set(x, "__set", js.undefined)
  }
}
