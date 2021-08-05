package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCustomGroup extends StObject {
  
  /**
    * The sub-attributes.
    */
  var attributes: js.UndefOr[js.Array[SchemaCustomAttribute]] = js.undefined
  
  /**
    * The name of the group. Underscores will be replaced by spaces upon
    * insertion.
    */
  var name: js.UndefOr[String] = js.undefined
}
object SchemaCustomGroup {
  
  inline def apply(): SchemaCustomGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomGroup]
  }
  
  extension [Self <: SchemaCustomGroup](x: Self) {
    
    inline def setAttributes(value: js.Array[SchemaCustomAttribute]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setAttributesVarargs(value: SchemaCustomAttribute*): Self = StObject.set(x, "attributes", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
