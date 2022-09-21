package typings.hellosignSdk.anon

import typings.hellosignSdk.mod.CustomFieldTemplate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Customfields extends StObject {
  
  var custom_fields: js.Array[CustomFieldTemplate]
  
  var field_groups: js.Array[Rule]
  
  var form_fields: js.Array[Group]
  
  var index: Double
  
  var name: String
}
object Customfields {
  
  inline def apply(
    custom_fields: js.Array[CustomFieldTemplate],
    field_groups: js.Array[Rule],
    form_fields: js.Array[Group],
    index: Double,
    name: String
  ): Customfields = {
    val __obj = js.Dynamic.literal(custom_fields = custom_fields.asInstanceOf[js.Any], field_groups = field_groups.asInstanceOf[js.Any], form_fields = form_fields.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Customfields]
  }
  
  extension [Self <: Customfields](x: Self) {
    
    inline def setCustom_fields(value: js.Array[CustomFieldTemplate]): Self = StObject.set(x, "custom_fields", value.asInstanceOf[js.Any])
    
    inline def setCustom_fieldsVarargs(value: CustomFieldTemplate*): Self = StObject.set(x, "custom_fields", js.Array(value*))
    
    inline def setField_groups(value: js.Array[Rule]): Self = StObject.set(x, "field_groups", value.asInstanceOf[js.Any])
    
    inline def setField_groupsVarargs(value: Rule*): Self = StObject.set(x, "field_groups", js.Array(value*))
    
    inline def setForm_fields(value: js.Array[Group]): Self = StObject.set(x, "form_fields", value.asInstanceOf[js.Any])
    
    inline def setForm_fieldsVarargs(value: Group*): Self = StObject.set(x, "form_fields", js.Array(value*))
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
