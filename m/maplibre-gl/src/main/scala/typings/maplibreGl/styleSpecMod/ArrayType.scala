package typings.maplibreGl.styleSpecMod

import typings.maplibreGl.maplibreGlStrings.array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayType
  extends StObject
     with Type {
  
  var N: Double
  
  var itemType: Type
  
  var kind: array
}
object ArrayType {
  
  inline def apply(N: Double, itemType: Type): ArrayType = {
    val __obj = js.Dynamic.literal(N = N.asInstanceOf[js.Any], itemType = itemType.asInstanceOf[js.Any], kind = "array")
    __obj.asInstanceOf[ArrayType]
  }
  
  extension [Self <: ArrayType](x: Self) {
    
    inline def setItemType(value: Type): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
    
    inline def setKind(value: array): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setN(value: Double): Self = StObject.set(x, "N", value.asInstanceOf[js.Any])
  }
}
