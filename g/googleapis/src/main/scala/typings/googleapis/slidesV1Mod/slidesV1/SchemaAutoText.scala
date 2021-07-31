package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A TextElement kind that represents auto text.
  */
trait SchemaAutoText extends StObject {
  
  /**
    * The rendered content of this auto text, if available.
    */
  var content: js.UndefOr[String] = js.undefined
  
  /**
    * The styling applied to this auto text.
    */
  var style: js.UndefOr[SchemaTextStyle] = js.undefined
  
  /**
    * The type of this auto text.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaAutoText {
  
  @scala.inline
  def apply(): SchemaAutoText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAutoText]
  }
  
  @scala.inline
  implicit class SchemaAutoTextMutableBuilder[Self <: SchemaAutoText] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setStyle(value: SchemaTextStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
