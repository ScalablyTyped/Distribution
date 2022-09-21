package typings.googleapis.formsV1Mod.formsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOption extends StObject {
  
  /**
    * Section navigation type.
    */
  var goToAction: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Item ID of section header to go to.
    */
  var goToSectionId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Display image as an option.
    */
  var image: js.UndefOr[SchemaImage] = js.undefined
  
  /**
    * Whether the option is "other". Currently only applies to `RADIO` and `CHECKBOX` choice types, but is not allowed in a QuestionGroupItem.
    */
  var isOther: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Required. The choice as presented to the user.
    */
  var value: js.UndefOr[String | Null] = js.undefined
}
object SchemaOption {
  
  inline def apply(): SchemaOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOption]
  }
  
  extension [Self <: SchemaOption](x: Self) {
    
    inline def setGoToAction(value: String): Self = StObject.set(x, "goToAction", value.asInstanceOf[js.Any])
    
    inline def setGoToActionNull: Self = StObject.set(x, "goToAction", null)
    
    inline def setGoToActionUndefined: Self = StObject.set(x, "goToAction", js.undefined)
    
    inline def setGoToSectionId(value: String): Self = StObject.set(x, "goToSectionId", value.asInstanceOf[js.Any])
    
    inline def setGoToSectionIdNull: Self = StObject.set(x, "goToSectionId", null)
    
    inline def setGoToSectionIdUndefined: Self = StObject.set(x, "goToSectionId", js.undefined)
    
    inline def setImage(value: SchemaImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setIsOther(value: Boolean): Self = StObject.set(x, "isOther", value.asInstanceOf[js.Any])
    
    inline def setIsOtherNull: Self = StObject.set(x, "isOther", null)
    
    inline def setIsOtherUndefined: Self = StObject.set(x, "isOther", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
