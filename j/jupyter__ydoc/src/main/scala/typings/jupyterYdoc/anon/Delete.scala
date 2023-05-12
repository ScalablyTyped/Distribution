package typings.jupyterYdoc.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Delete[T] extends StObject {
  
  var delete: js.UndefOr[Double] = js.undefined
  
  var insert: js.UndefOr[T] = js.undefined
  
  var retain: js.UndefOr[Double] = js.undefined
}
object Delete {
  
  inline def apply[T](): Delete[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Delete[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Delete[?], T] (val x: Self & Delete[T]) extends AnyVal {
    
    inline def setDelete(value: Double): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
    
    inline def setInsert(value: T): Self = StObject.set(x, "insert", value.asInstanceOf[js.Any])
    
    inline def setInsertUndefined: Self = StObject.set(x, "insert", js.undefined)
    
    inline def setRetain(value: Double): Self = StObject.set(x, "retain", value.asInstanceOf[js.Any])
    
    inline def setRetainUndefined: Self = StObject.set(x, "retain", js.undefined)
  }
}
