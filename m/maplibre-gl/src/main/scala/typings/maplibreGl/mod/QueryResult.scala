package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryResult[T] extends StObject {
  
  var key: T
  
  var x1: Double
  
  var x2: Double
  
  var y1: Double
  
  var y2: Double
}
object QueryResult {
  
  inline def apply[T](key: T, x1: Double, x2: Double, y1: Double, y2: Double): QueryResult[T] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryResult[T]]
  }
  
  extension [Self <: QueryResult[?], T](x: Self & QueryResult[T]) {
    
    inline def setKey(value: T): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setX1(value: Double): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
    
    inline def setX2(value: Double): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
    
    inline def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
    
    inline def setY2(value: Double): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
  }
}
