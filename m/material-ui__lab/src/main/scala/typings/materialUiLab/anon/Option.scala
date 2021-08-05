package typings.materialUiLab.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Option[T] extends StObject {
  
  var index: Double
  
  var option: T
}
object Option {
  
  inline def apply[T](index: Double, option: T): Option[T] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], option = option.asInstanceOf[js.Any])
    __obj.asInstanceOf[Option[T]]
  }
  
  extension [Self <: Option[?], T](x: Self & Option[T]) {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setOption(value: T): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
  }
}
