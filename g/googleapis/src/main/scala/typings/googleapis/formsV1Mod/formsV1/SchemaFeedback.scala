package typings.googleapis.formsV1Mod.formsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFeedback extends StObject {
  
  /**
    * Additional information provided as part of the feedback, often used to point the respondent to more reading and resources.
    */
  var material: js.UndefOr[js.Array[SchemaExtraMaterial]] = js.undefined
  
  /**
    * Required. The main text of the feedback.
    */
  var text: js.UndefOr[String | Null] = js.undefined
}
object SchemaFeedback {
  
  inline def apply(): SchemaFeedback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFeedback]
  }
  
  extension [Self <: SchemaFeedback](x: Self) {
    
    inline def setMaterial(value: js.Array[SchemaExtraMaterial]): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
    
    inline def setMaterialUndefined: Self = StObject.set(x, "material", js.undefined)
    
    inline def setMaterialVarargs(value: SchemaExtraMaterial*): Self = StObject.set(x, "material", js.Array(value*))
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextNull: Self = StObject.set(x, "text", null)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
