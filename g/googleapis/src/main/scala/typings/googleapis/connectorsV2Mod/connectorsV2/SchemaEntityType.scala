package typings.googleapis.connectorsV2Mod.connectorsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEntityType extends StObject {
  
  /**
    * List containing metadata information about each field of the entity type.
    */
  var fields: js.UndefOr[js.Array[SchemaField]] = js.undefined
  
  /**
    * The name of the entity type.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaEntityType {
  
  inline def apply(): SchemaEntityType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEntityType]
  }
  
  extension [Self <: SchemaEntityType](x: Self) {
    
    inline def setFields(value: js.Array[SchemaField]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: SchemaField*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
