package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StructArrayMember extends StObject {
  
  var components: Double
  
  var name: String
  
  var offset: Double
  
  var `type`: ViewType
}
object StructArrayMember {
  
  inline def apply(components: Double, name: String, offset: Double, `type`: ViewType): StructArrayMember = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructArrayMember]
  }
  
  extension [Self <: StructArrayMember](x: Self) {
    
    inline def setComponents(value: Double): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setType(value: ViewType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
