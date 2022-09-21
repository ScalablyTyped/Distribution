package typings.googleapis.connectorsV1Mod.connectorsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRuntimeEntitySchema extends StObject {
  
  /**
    * Output only. Name of the entity.
    */
  var entity: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. List of fields in the entity.
    */
  var fields: js.UndefOr[js.Array[SchemaField]] = js.undefined
}
object SchemaRuntimeEntitySchema {
  
  inline def apply(): SchemaRuntimeEntitySchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRuntimeEntitySchema]
  }
  
  extension [Self <: SchemaRuntimeEntitySchema](x: Self) {
    
    inline def setEntity(value: String): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    inline def setEntityNull: Self = StObject.set(x, "entity", null)
    
    inline def setEntityUndefined: Self = StObject.set(x, "entity", js.undefined)
    
    inline def setFields(value: js.Array[SchemaField]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: SchemaField*): Self = StObject.set(x, "fields", js.Array(value*))
  }
}
