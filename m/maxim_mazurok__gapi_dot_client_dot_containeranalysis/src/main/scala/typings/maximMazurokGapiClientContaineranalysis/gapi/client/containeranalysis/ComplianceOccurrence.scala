package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComplianceOccurrence extends StObject {
  
  var nonComplianceReason: js.UndefOr[String] = js.undefined
  
  var nonCompliantFiles: js.UndefOr[js.Array[NonCompliantFile]] = js.undefined
}
object ComplianceOccurrence {
  
  inline def apply(): ComplianceOccurrence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComplianceOccurrence]
  }
  
  extension [Self <: ComplianceOccurrence](x: Self) {
    
    inline def setNonComplianceReason(value: String): Self = StObject.set(x, "nonComplianceReason", value.asInstanceOf[js.Any])
    
    inline def setNonComplianceReasonUndefined: Self = StObject.set(x, "nonComplianceReason", js.undefined)
    
    inline def setNonCompliantFiles(value: js.Array[NonCompliantFile]): Self = StObject.set(x, "nonCompliantFiles", value.asInstanceOf[js.Any])
    
    inline def setNonCompliantFilesUndefined: Self = StObject.set(x, "nonCompliantFiles", js.undefined)
    
    inline def setNonCompliantFilesVarargs(value: NonCompliantFile*): Self = StObject.set(x, "nonCompliantFiles", js.Array(value*))
  }
}
