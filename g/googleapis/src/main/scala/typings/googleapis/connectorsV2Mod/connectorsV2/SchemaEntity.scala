package typings.googleapis.connectorsV2Mod.connectorsV2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEntity extends StObject {
  
  /**
    * Fields of the entity. The key is name of the field and the value contains the applicable `google.protobuf.Value` entry for this field.
    */
  var fields: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
  
  /**
    * Output only. Resource name of the Entity. Format: projects/{project\}/locations/{location\}/connections/{connection\}/entityTypes/{type\}/entities/{id\}
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaEntity {
  
  inline def apply(): SchemaEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEntity]
  }
  
  extension [Self <: SchemaEntity](x: Self) {
    
    inline def setFields(value: StringDictionary[Any]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsNull: Self = StObject.set(x, "fields", null)
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
