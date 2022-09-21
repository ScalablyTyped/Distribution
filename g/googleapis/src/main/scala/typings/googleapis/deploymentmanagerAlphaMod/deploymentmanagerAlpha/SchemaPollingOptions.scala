package typings.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPollingOptions extends StObject {
  
  /**
    * An array of diagnostics to be collected by Deployment Manager, these diagnostics will be displayed to the user.
    */
  var diagnostics: js.UndefOr[js.Array[SchemaDiagnostic]] = js.undefined
  
  /**
    * JsonPath expression that determines if the request failed.
    */
  var failCondition: js.UndefOr[String | Null] = js.undefined
  
  /**
    * JsonPath expression that determines if the request is completed.
    */
  var finishCondition: js.UndefOr[String | Null] = js.undefined
  
  /**
    * JsonPath expression that evaluates to string, it indicates where to poll.
    */
  var pollingLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * JsonPath expression, after polling is completed, indicates where to fetch the resource.
    */
  var targetLink: js.UndefOr[String | Null] = js.undefined
}
object SchemaPollingOptions {
  
  inline def apply(): SchemaPollingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPollingOptions]
  }
  
  extension [Self <: SchemaPollingOptions](x: Self) {
    
    inline def setDiagnostics(value: js.Array[SchemaDiagnostic]): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
    
    inline def setDiagnosticsUndefined: Self = StObject.set(x, "diagnostics", js.undefined)
    
    inline def setDiagnosticsVarargs(value: SchemaDiagnostic*): Self = StObject.set(x, "diagnostics", js.Array(value*))
    
    inline def setFailCondition(value: String): Self = StObject.set(x, "failCondition", value.asInstanceOf[js.Any])
    
    inline def setFailConditionNull: Self = StObject.set(x, "failCondition", null)
    
    inline def setFailConditionUndefined: Self = StObject.set(x, "failCondition", js.undefined)
    
    inline def setFinishCondition(value: String): Self = StObject.set(x, "finishCondition", value.asInstanceOf[js.Any])
    
    inline def setFinishConditionNull: Self = StObject.set(x, "finishCondition", null)
    
    inline def setFinishConditionUndefined: Self = StObject.set(x, "finishCondition", js.undefined)
    
    inline def setPollingLink(value: String): Self = StObject.set(x, "pollingLink", value.asInstanceOf[js.Any])
    
    inline def setPollingLinkNull: Self = StObject.set(x, "pollingLink", null)
    
    inline def setPollingLinkUndefined: Self = StObject.set(x, "pollingLink", js.undefined)
    
    inline def setTargetLink(value: String): Self = StObject.set(x, "targetLink", value.asInstanceOf[js.Any])
    
    inline def setTargetLinkNull: Self = StObject.set(x, "targetLink", null)
    
    inline def setTargetLinkUndefined: Self = StObject.set(x, "targetLink", js.undefined)
  }
}
