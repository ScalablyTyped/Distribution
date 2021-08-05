package typings.googleapis.v2betaMod.deploymentmanagerV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPollingOptions extends StObject {
  
  /**
    * An array of diagnostics to be collected by Deployment Manager, these
    * diagnostics will be displayed to the user.
    */
  var diagnostics: js.UndefOr[js.Array[SchemaDiagnostic]] = js.undefined
  
  /**
    * JsonPath expression that determines if the request failed.
    */
  var failCondition: js.UndefOr[String] = js.undefined
  
  /**
    * JsonPath expression that determines if the request is completed.
    */
  var finishCondition: js.UndefOr[String] = js.undefined
  
  /**
    * JsonPath expression that evaluates to string, it indicates where to poll.
    */
  var pollingLink: js.UndefOr[String] = js.undefined
  
  /**
    * JsonPath expression, after polling is completed, indicates where to fetch
    * the resource.
    */
  var targetLink: js.UndefOr[String] = js.undefined
}
object SchemaPollingOptions {
  
  inline def apply(): SchemaPollingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPollingOptions]
  }
  
  extension [Self <: SchemaPollingOptions](x: Self) {
    
    inline def setDiagnostics(value: js.Array[SchemaDiagnostic]): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
    
    inline def setDiagnosticsUndefined: Self = StObject.set(x, "diagnostics", js.undefined)
    
    inline def setDiagnosticsVarargs(value: SchemaDiagnostic*): Self = StObject.set(x, "diagnostics", js.Array(value :_*))
    
    inline def setFailCondition(value: String): Self = StObject.set(x, "failCondition", value.asInstanceOf[js.Any])
    
    inline def setFailConditionUndefined: Self = StObject.set(x, "failCondition", js.undefined)
    
    inline def setFinishCondition(value: String): Self = StObject.set(x, "finishCondition", value.asInstanceOf[js.Any])
    
    inline def setFinishConditionUndefined: Self = StObject.set(x, "finishCondition", js.undefined)
    
    inline def setPollingLink(value: String): Self = StObject.set(x, "pollingLink", value.asInstanceOf[js.Any])
    
    inline def setPollingLinkUndefined: Self = StObject.set(x, "pollingLink", js.undefined)
    
    inline def setTargetLink(value: String): Self = StObject.set(x, "targetLink", value.asInstanceOf[js.Any])
    
    inline def setTargetLinkUndefined: Self = StObject.set(x, "targetLink", js.undefined)
  }
}
