package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBlankScreen extends StObject {
  
  /**
    * The screen id of the element
    */
  var screenId: js.UndefOr[String | Null] = js.undefined
}
object SchemaBlankScreen {
  
  inline def apply(): SchemaBlankScreen = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBlankScreen]
  }
  
  extension [Self <: SchemaBlankScreen](x: Self) {
    
    inline def setScreenId(value: String): Self = StObject.set(x, "screenId", value.asInstanceOf[js.Any])
    
    inline def setScreenIdNull: Self = StObject.set(x, "screenId", null)
    
    inline def setScreenIdUndefined: Self = StObject.set(x, "screenId", js.undefined)
  }
}
