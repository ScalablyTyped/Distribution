package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A named style. Paragraphs in the document can inherit their TextStyle and
  * ParagraphStyle from this named style when they have the same named style
  * type.
  */
trait SchemaNamedStyle extends StObject {
  
  /**
    * The type of this named style.
    */
  var namedStyleType: js.UndefOr[String] = js.undefined
  
  /**
    * The paragraph style of this named style.
    */
  var paragraphStyle: js.UndefOr[SchemaParagraphStyle] = js.undefined
  
  /**
    * The text style of this named style.
    */
  var textStyle: js.UndefOr[SchemaTextStyle] = js.undefined
}
object SchemaNamedStyle {
  
  @scala.inline
  def apply(): SchemaNamedStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNamedStyle]
  }
  
  @scala.inline
  implicit class SchemaNamedStyleMutableBuilder[Self <: SchemaNamedStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNamedStyleType(value: String): Self = StObject.set(x, "namedStyleType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamedStyleTypeUndefined: Self = StObject.set(x, "namedStyleType", js.undefined)
    
    @scala.inline
    def setParagraphStyle(value: SchemaParagraphStyle): Self = StObject.set(x, "paragraphStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParagraphStyleUndefined: Self = StObject.set(x, "paragraphStyle", js.undefined)
    
    @scala.inline
    def setTextStyle(value: SchemaTextStyle): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
  }
}
