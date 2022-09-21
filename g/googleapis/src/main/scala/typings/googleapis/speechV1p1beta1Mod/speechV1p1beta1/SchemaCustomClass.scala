package typings.googleapis.speechV1p1beta1Mod.speechV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCustomClass extends StObject {
  
  /**
    * If this custom class is a resource, the custom_class_id is the resource id of the CustomClass. Case sensitive.
    */
  var customClassId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A collection of class items.
    */
  var items: js.UndefOr[js.Array[SchemaClassItem]] = js.undefined
  
  /**
    * The resource name of the custom class.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaCustomClass {
  
  inline def apply(): SchemaCustomClass = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomClass]
  }
  
  extension [Self <: SchemaCustomClass](x: Self) {
    
    inline def setCustomClassId(value: String): Self = StObject.set(x, "customClassId", value.asInstanceOf[js.Any])
    
    inline def setCustomClassIdNull: Self = StObject.set(x, "customClassId", null)
    
    inline def setCustomClassIdUndefined: Self = StObject.set(x, "customClassId", js.undefined)
    
    inline def setItems(value: js.Array[SchemaClassItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SchemaClassItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
