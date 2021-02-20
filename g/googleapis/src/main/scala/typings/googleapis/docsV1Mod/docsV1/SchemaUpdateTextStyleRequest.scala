package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Update the styling of text.
  */
@js.native
trait SchemaUpdateTextStyleRequest extends StObject {
  
  /**
    * The fields that should be updated.  At least one field must be specified.
    * The root `text_style` is implied and should not be specified. A single
    * `&quot;*&quot;` can be used as short-hand for listing every field.  For
    * example, to update the text style to bold, set `fields` to
    * `&quot;bold&quot;`.  To reset a property to its default value, include
    * its field name in the field mask but leave the field itself unset.
    */
  var fields: js.UndefOr[String] = js.native
  
  /**
    * The range of text to style.  The range may be extended to include
    * adjacent newlines.  If the range fully contains a paragraph belonging to
    * a list, the paragraph&#39;s bullet is also updated with the matching text
    * style.
    */
  var range: js.UndefOr[SchemaRange] = js.native
  
  /**
    * The styles to set on the text.  If the value for a particular style
    * matches that of the parent, that style will be set to inherit.  Certain
    * text style changes may cause other changes in order to to mirror the
    * behavior of the Docs editor. See the documentation of TextStyle for more
    * information.
    */
  var textStyle: js.UndefOr[SchemaTextStyle] = js.native
}
object SchemaUpdateTextStyleRequest {
  
  @scala.inline
  def apply(): SchemaUpdateTextStyleRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateTextStyleRequest]
  }
  
  @scala.inline
  implicit class SchemaUpdateTextStyleRequestMutableBuilder[Self <: SchemaUpdateTextStyleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setRange(value: SchemaRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    @scala.inline
    def setTextStyle(value: SchemaTextStyle): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
  }
}
