package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAuxiliaryMessage extends StObject {
  
  /**
    * Human readable message in English. Example: "Given printer is invalid or no longer supported."
    */
  var auxiliaryMessage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Field that this message concerns.
    */
  var fieldMask: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Message severity
    */
  var severity: js.UndefOr[String | Null] = js.undefined
}
object SchemaAuxiliaryMessage {
  
  inline def apply(): SchemaAuxiliaryMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAuxiliaryMessage]
  }
  
  extension [Self <: SchemaAuxiliaryMessage](x: Self) {
    
    inline def setAuxiliaryMessage(value: String): Self = StObject.set(x, "auxiliaryMessage", value.asInstanceOf[js.Any])
    
    inline def setAuxiliaryMessageNull: Self = StObject.set(x, "auxiliaryMessage", null)
    
    inline def setAuxiliaryMessageUndefined: Self = StObject.set(x, "auxiliaryMessage", js.undefined)
    
    inline def setFieldMask(value: String): Self = StObject.set(x, "fieldMask", value.asInstanceOf[js.Any])
    
    inline def setFieldMaskNull: Self = StObject.set(x, "fieldMask", null)
    
    inline def setFieldMaskUndefined: Self = StObject.set(x, "fieldMask", js.undefined)
    
    inline def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityNull: Self = StObject.set(x, "severity", null)
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
  }
}
