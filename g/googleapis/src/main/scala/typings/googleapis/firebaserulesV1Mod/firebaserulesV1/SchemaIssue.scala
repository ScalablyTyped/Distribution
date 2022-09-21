package typings.googleapis.firebaserulesV1Mod.firebaserulesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIssue extends StObject {
  
  /**
    * Short error description.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The severity of the issue.
    */
  var severity: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Position of the issue in the `Source`.
    */
  var sourcePosition: js.UndefOr[SchemaSourcePosition] = js.undefined
}
object SchemaIssue {
  
  inline def apply(): SchemaIssue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIssue]
  }
  
  extension [Self <: SchemaIssue](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityNull: Self = StObject.set(x, "severity", null)
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    inline def setSourcePosition(value: SchemaSourcePosition): Self = StObject.set(x, "sourcePosition", value.asInstanceOf[js.Any])
    
    inline def setSourcePositionUndefined: Self = StObject.set(x, "sourcePosition", js.undefined)
  }
}
