package typings.googleapis.ondemandscanningV1Mod.ondemandscanningV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaComplianceOccurrence extends StObject {
  
  var nonComplianceReason: js.UndefOr[String | Null] = js.undefined
  
  var nonCompliantFiles: js.UndefOr[js.Array[SchemaNonCompliantFile]] = js.undefined
}
object SchemaComplianceOccurrence {
  
  inline def apply(): SchemaComplianceOccurrence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaComplianceOccurrence]
  }
  
  extension [Self <: SchemaComplianceOccurrence](x: Self) {
    
    inline def setNonComplianceReason(value: String): Self = StObject.set(x, "nonComplianceReason", value.asInstanceOf[js.Any])
    
    inline def setNonComplianceReasonNull: Self = StObject.set(x, "nonComplianceReason", null)
    
    inline def setNonComplianceReasonUndefined: Self = StObject.set(x, "nonComplianceReason", js.undefined)
    
    inline def setNonCompliantFiles(value: js.Array[SchemaNonCompliantFile]): Self = StObject.set(x, "nonCompliantFiles", value.asInstanceOf[js.Any])
    
    inline def setNonCompliantFilesUndefined: Self = StObject.set(x, "nonCompliantFiles", js.undefined)
    
    inline def setNonCompliantFilesVarargs(value: SchemaNonCompliantFile*): Self = StObject.set(x, "nonCompliantFiles", js.Array(value*))
  }
}
