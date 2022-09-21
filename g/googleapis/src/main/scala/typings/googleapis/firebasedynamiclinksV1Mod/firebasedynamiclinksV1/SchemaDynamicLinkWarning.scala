package typings.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDynamicLinkWarning extends StObject {
  
  /**
    * The warning code.
    */
  var warningCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The document describing the warning, and helps resolve.
    */
  var warningDocumentLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The warning message to help developers improve their requests.
    */
  var warningMessage: js.UndefOr[String | Null] = js.undefined
}
object SchemaDynamicLinkWarning {
  
  inline def apply(): SchemaDynamicLinkWarning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDynamicLinkWarning]
  }
  
  extension [Self <: SchemaDynamicLinkWarning](x: Self) {
    
    inline def setWarningCode(value: String): Self = StObject.set(x, "warningCode", value.asInstanceOf[js.Any])
    
    inline def setWarningCodeNull: Self = StObject.set(x, "warningCode", null)
    
    inline def setWarningCodeUndefined: Self = StObject.set(x, "warningCode", js.undefined)
    
    inline def setWarningDocumentLink(value: String): Self = StObject.set(x, "warningDocumentLink", value.asInstanceOf[js.Any])
    
    inline def setWarningDocumentLinkNull: Self = StObject.set(x, "warningDocumentLink", null)
    
    inline def setWarningDocumentLinkUndefined: Self = StObject.set(x, "warningDocumentLink", js.undefined)
    
    inline def setWarningMessage(value: String): Self = StObject.set(x, "warningMessage", value.asInstanceOf[js.Any])
    
    inline def setWarningMessageNull: Self = StObject.set(x, "warningMessage", null)
    
    inline def setWarningMessageUndefined: Self = StObject.set(x, "warningMessage", js.undefined)
  }
}
