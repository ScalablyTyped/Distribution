package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3Match extends StObject {
  
  /**
    * The confidence of this match. Values range from 0.0 (completely uncertain) to 1.0 (completely certain). This value is for informational purpose only and is only used to help match
    * the best intent within the classification threshold. This value may change for the same end-user expression at any time due to a model retraining or change in implementation.
    */
  var confidence: js.UndefOr[Double] = js.undefined
  
  /** The event that matched the query. Filled for `EVENT`, `NO_MATCH` and `NO_INPUT` match types. */
  var event: js.UndefOr[String] = js.undefined
  
  /** The Intent that matched the query. Some, not all fields are filled in this message, including but not limited to: `name` and `display_name`. Only filled for `INTENT` match type. */
  var intent: js.UndefOr[GoogleCloudDialogflowCxV3Intent] = js.undefined
  
  /** Type of this Match. */
  var matchType: js.UndefOr[String] = js.undefined
  
  /**
    * The collection of parameters extracted from the query. Depending on your protocol or client library language, this is a map, associative array, symbol table, dictionary, or JSON
    * object composed of a collection of (MapKey, MapValue) pairs: * MapKey type: string * MapKey value: parameter name * MapValue type: If parameter's entity type is a composite entity
    * then use map, otherwise, depending on the parameter value type, it could be one of string, number, boolean, null, list or map. * MapValue value: If parameter's entity type is a
    * composite entity then use map from composite entity property names to property values, otherwise, use parameter value.
    */
  var parameters: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientDialogflow.maximMazurokGapiClientDialogflowStrings.GoogleCloudDialogflowCxV3Match & TopLevel[Any]
  ] = js.undefined
  
  /** Final text input which was matched during MatchIntent. This value can be different from original input sent in request because of spelling correction or other processing. */
  var resolvedInput: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowCxV3Match {
  
  inline def apply(): GoogleCloudDialogflowCxV3Match = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3Match]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3Match](x: Self) {
    
    inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setIntent(value: GoogleCloudDialogflowCxV3Intent): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    inline def setIntentUndefined: Self = StObject.set(x, "intent", js.undefined)
    
    inline def setMatchType(value: String): Self = StObject.set(x, "matchType", value.asInstanceOf[js.Any])
    
    inline def setMatchTypeUndefined: Self = StObject.set(x, "matchType", js.undefined)
    
    inline def setParameters(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientDialogflow.maximMazurokGapiClientDialogflowStrings.GoogleCloudDialogflowCxV3Match & TopLevel[Any]
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setResolvedInput(value: String): Self = StObject.set(x, "resolvedInput", value.asInstanceOf[js.Any])
    
    inline def setResolvedInputUndefined: Self = StObject.set(x, "resolvedInput", js.undefined)
  }
}
