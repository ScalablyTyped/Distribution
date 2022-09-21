package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FixableTotalByDigest extends StObject {
  
  /** The number of fixable vulnerabilities associated with this resource. */
  var fixableCount: js.UndefOr[String] = js.undefined
  
  /** The affected resource. */
  var resourceUri: js.UndefOr[String] = js.undefined
  
  /** The severity for this count. SEVERITY_UNSPECIFIED indicates total across all severities. */
  var severity: js.UndefOr[String] = js.undefined
  
  /** The total number of vulnerabilities associated with this resource. */
  var totalCount: js.UndefOr[String] = js.undefined
}
object FixableTotalByDigest {
  
  inline def apply(): FixableTotalByDigest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FixableTotalByDigest]
  }
  
  extension [Self <: FixableTotalByDigest](x: Self) {
    
    inline def setFixableCount(value: String): Self = StObject.set(x, "fixableCount", value.asInstanceOf[js.Any])
    
    inline def setFixableCountUndefined: Self = StObject.set(x, "fixableCount", js.undefined)
    
    inline def setResourceUri(value: String): Self = StObject.set(x, "resourceUri", value.asInstanceOf[js.Any])
    
    inline def setResourceUriUndefined: Self = StObject.set(x, "resourceUri", js.undefined)
    
    inline def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    inline def setTotalCount(value: String): Self = StObject.set(x, "totalCount", value.asInstanceOf[js.Any])
    
    inline def setTotalCountUndefined: Self = StObject.set(x, "totalCount", js.undefined)
  }
}
