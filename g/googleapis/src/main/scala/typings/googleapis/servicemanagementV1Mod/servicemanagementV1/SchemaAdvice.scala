package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAdvice extends StObject {
  
  /**
    * Useful description for why this advice was applied and what actions should be taken to mitigate any implied risks.
    */
  var description: js.UndefOr[String | Null] = js.undefined
}
object SchemaAdvice {
  
  inline def apply(): SchemaAdvice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdvice]
  }
  
  extension [Self <: SchemaAdvice](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
  }
}
