package typings.googleapis.formsV1Mod.formsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRowQuestion extends StObject {
  
  /**
    * Required. The title for the single row in the QuestionGroupItem.
    */
  var title: js.UndefOr[String | Null] = js.undefined
}
object SchemaRowQuestion {
  
  inline def apply(): SchemaRowQuestion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRowQuestion]
  }
  
  extension [Self <: SchemaRowQuestion](x: Self) {
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
