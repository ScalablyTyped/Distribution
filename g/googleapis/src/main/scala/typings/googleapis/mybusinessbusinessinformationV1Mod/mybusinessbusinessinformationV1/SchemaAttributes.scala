package typings.googleapis.mybusinessbusinessinformationV1Mod.mybusinessbusinessinformationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAttributes extends StObject {
  
  /**
    * A collection of attributes that need to be updated.
    */
  var attributes: js.UndefOr[js.Array[SchemaAttribute]] = js.undefined
  
  /**
    * Required. Google identifier for this location in the form of `locations/{location_id\}/attributes`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaAttributes {
  
  inline def apply(): SchemaAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAttributes]
  }
  
  extension [Self <: SchemaAttributes](x: Self) {
    
    inline def setAttributes(value: js.Array[SchemaAttribute]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setAttributesVarargs(value: SchemaAttribute*): Self = StObject.set(x, "attributes", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
