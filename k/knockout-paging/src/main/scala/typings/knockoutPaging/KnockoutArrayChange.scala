package typings.knockoutPaging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnockoutArrayChange[T] extends StObject {
  
  var index: Double
  
  var moved: js.UndefOr[Double] = js.undefined
  
  var status: String
  
  var value: T
}
object KnockoutArrayChange {
  
  inline def apply[T](index: Double, status: String, value: T): KnockoutArrayChange[T] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutArrayChange[T]]
  }
  
  extension [Self <: KnockoutArrayChange[?], T](x: Self & KnockoutArrayChange[T]) {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setMoved(value: Double): Self = StObject.set(x, "moved", value.asInstanceOf[js.Any])
    
    inline def setMovedUndefined: Self = StObject.set(x, "moved", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
