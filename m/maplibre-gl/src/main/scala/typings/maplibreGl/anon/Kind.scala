package typings.maplibreGl.anon

import typings.maplibreGl.maplibreGlStrings.constant
import typings.maplibreGl.mod.PossiblyEvaluatedValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Kind[T]
  extends StObject
     with PossiblyEvaluatedValue[T] {
  
  var kind: constant
  
  var value: T
}
object Kind {
  
  inline def apply[T](value: T): Kind[T] = {
    val __obj = js.Dynamic.literal(kind = "constant", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Kind[T]]
  }
  
  extension [Self <: Kind[?], T](x: Self & Kind[T]) {
    
    inline def setKind(value: constant): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
