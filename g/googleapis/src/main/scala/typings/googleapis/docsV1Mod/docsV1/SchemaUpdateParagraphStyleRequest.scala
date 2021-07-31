package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Update the styling of all paragraphs that overlap with the given range.
  */
trait SchemaUpdateParagraphStyleRequest extends StObject {
  
  /**
    * The fields that should be updated.  At least one field must be specified.
    * The root `paragraph_style` is implied and should not be specified.  For
    * example, to update the paragraph style&#39;s alignment property, set
    * `fields` to `&quot;alignment&quot;`.  To reset a property to its default
    * value, include its field name in the field mask but leave the field
    * itself unset.
    */
  var fields: js.UndefOr[String] = js.undefined
  
  /**
    * The styles to set on the paragraphs.  Certain paragraph style changes may
    * cause other changes in order to mirror the behavior of the Docs editor.
    * See the documentation of ParagraphStyle for more information.
    */
  var paragraphStyle: js.UndefOr[SchemaParagraphStyle] = js.undefined
  
  /**
    * The range overlapping the paragraphs to style.
    */
  var range: js.UndefOr[SchemaRange] = js.undefined
}
object SchemaUpdateParagraphStyleRequest {
  
  @scala.inline
  def apply(): SchemaUpdateParagraphStyleRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateParagraphStyleRequest]
  }
  
  @scala.inline
  implicit class SchemaUpdateParagraphStyleRequestMutableBuilder[Self <: SchemaUpdateParagraphStyleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setParagraphStyle(value: SchemaParagraphStyle): Self = StObject.set(x, "paragraphStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParagraphStyleUndefined: Self = StObject.set(x, "paragraphStyle", js.undefined)
    
    @scala.inline
    def setRange(value: SchemaRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
