package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Per resource and severity counts of fixable and total vulnerabilities.
  */
trait SchemaFixableTotalByDigest extends StObject {
  
  /**
    * The number of fixable vulnerabilities associated with this resource.
    */
  var fixableCount: js.UndefOr[String] = js.undefined
  
  /**
    * The affected resource.
    */
  var resource: js.UndefOr[SchemaResource] = js.undefined
  
  /**
    * The severity for this count. SEVERITY_UNSPECIFIED indicates total across
    * all severities.
    */
  var severity: js.UndefOr[String] = js.undefined
  
  /**
    * The total number of vulnerabilities associated with this resource.
    */
  var totalCount: js.UndefOr[String] = js.undefined
}
object SchemaFixableTotalByDigest {
  
  @scala.inline
  def apply(): SchemaFixableTotalByDigest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFixableTotalByDigest]
  }
  
  @scala.inline
  implicit class SchemaFixableTotalByDigestMutableBuilder[Self <: SchemaFixableTotalByDigest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFixableCount(value: String): Self = StObject.set(x, "fixableCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixableCountUndefined: Self = StObject.set(x, "fixableCount", js.undefined)
    
    @scala.inline
    def setResource(value: SchemaResource): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    @scala.inline
    def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    @scala.inline
    def setTotalCount(value: String): Self = StObject.set(x, "totalCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalCountUndefined: Self = StObject.set(x, "totalCount", js.undefined)
  }
}
