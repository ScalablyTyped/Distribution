package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUpdateSectionStyleRequest extends StObject {
  
  /**
    * The fields that should be updated. At least one field must be specified. The root `section_style` is implied and must not be specified. A single `"*"` can be used as short-hand for listing every field. For example to update the left margin, set `fields` to `"margin_left"`.
    */
  var fields: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The range overlapping the sections to style. Because section breaks can only be inserted inside the body, the segment ID field must be empty.
    */
  var range: js.UndefOr[SchemaRange] = js.undefined
  
  /**
    * The styles to be set on the section. Certain section style changes may cause other changes in order to mirror the behavior of the Docs editor. See the documentation of SectionStyle for more information.
    */
  var sectionStyle: js.UndefOr[SchemaSectionStyle] = js.undefined
}
object SchemaUpdateSectionStyleRequest {
  
  inline def apply(): SchemaUpdateSectionStyleRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateSectionStyleRequest]
  }
  
  extension [Self <: SchemaUpdateSectionStyleRequest](x: Self) {
    
    inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsNull: Self = StObject.set(x, "fields", null)
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setRange(value: SchemaRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setSectionStyle(value: SchemaSectionStyle): Self = StObject.set(x, "sectionStyle", value.asInstanceOf[js.Any])
    
    inline def setSectionStyleUndefined: Self = StObject.set(x, "sectionStyle", js.undefined)
  }
}
