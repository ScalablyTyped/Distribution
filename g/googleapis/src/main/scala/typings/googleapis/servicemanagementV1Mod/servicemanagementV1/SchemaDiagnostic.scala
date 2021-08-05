package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a diagnostic message (error or warning)
  */
trait SchemaDiagnostic extends StObject {
  
  /**
    * The kind of diagnostic information provided.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * File name and line number of the error or warning.
    */
  var location: js.UndefOr[String] = js.undefined
  
  /**
    * Message describing the error or warning.
    */
  var message: js.UndefOr[String] = js.undefined
}
object SchemaDiagnostic {
  
  inline def apply(): SchemaDiagnostic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDiagnostic]
  }
  
  extension [Self <: SchemaDiagnostic](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
