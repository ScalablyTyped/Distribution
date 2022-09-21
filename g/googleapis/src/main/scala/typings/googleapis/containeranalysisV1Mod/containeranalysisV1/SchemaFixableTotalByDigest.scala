package typings.googleapis.containeranalysisV1Mod.containeranalysisV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFixableTotalByDigest extends StObject {
  
  /**
    * The number of fixable vulnerabilities associated with this resource.
    */
  var fixableCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The affected resource.
    */
  var resourceUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The severity for this count. SEVERITY_UNSPECIFIED indicates total across all severities.
    */
  var severity: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The total number of vulnerabilities associated with this resource.
    */
  var totalCount: js.UndefOr[String | Null] = js.undefined
}
object SchemaFixableTotalByDigest {
  
  inline def apply(): SchemaFixableTotalByDigest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFixableTotalByDigest]
  }
  
  extension [Self <: SchemaFixableTotalByDigest](x: Self) {
    
    inline def setFixableCount(value: String): Self = StObject.set(x, "fixableCount", value.asInstanceOf[js.Any])
    
    inline def setFixableCountNull: Self = StObject.set(x, "fixableCount", null)
    
    inline def setFixableCountUndefined: Self = StObject.set(x, "fixableCount", js.undefined)
    
    inline def setResourceUri(value: String): Self = StObject.set(x, "resourceUri", value.asInstanceOf[js.Any])
    
    inline def setResourceUriNull: Self = StObject.set(x, "resourceUri", null)
    
    inline def setResourceUriUndefined: Self = StObject.set(x, "resourceUri", js.undefined)
    
    inline def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityNull: Self = StObject.set(x, "severity", null)
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    inline def setTotalCount(value: String): Self = StObject.set(x, "totalCount", value.asInstanceOf[js.Any])
    
    inline def setTotalCountNull: Self = StObject.set(x, "totalCount", null)
    
    inline def setTotalCountUndefined: Self = StObject.set(x, "totalCount", js.undefined)
  }
}
