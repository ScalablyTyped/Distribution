package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the parameters of the conversational query.
  */
trait SchemaGoogleCloudDialogflowV2QueryParameters extends StObject {
  
  /**
    * Optional. The collection of contexts to be activated before this query is
    * executed.
    */
  var contexts: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2Context]] = js.undefined
  
  /**
    * Optional. The geo location of this conversational query.
    */
  var geoLocation: js.UndefOr[SchemaGoogleTypeLatLng] = js.undefined
  
  /**
    * Optional. This field can be used to pass custom data into the webhook
    * associated with the agent. Arbitrary JSON objects are supported.
    */
  var payload: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  /**
    * Optional. Specifies whether to delete all contexts in the current session
    * before the new ones are activated.
    */
  var resetContexts: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional. Configures the type of sentiment analysis to perform. If not
    * provided, sentiment analysis is not performed.
    */
  var sentimentAnalysisRequestConfig: js.UndefOr[SchemaGoogleCloudDialogflowV2SentimentAnalysisRequestConfig] = js.undefined
  
  /**
    * Optional. Additional session entity types to replace or extend developer
    * entity types with. The entity synonyms apply to all languages and persist
    * for the session of this query.
    */
  var sessionEntityTypes: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2SessionEntityType]] = js.undefined
  
  /**
    * Optional. The time zone of this conversational query from the [time zone
    * database](https://www.iana.org/time-zones), e.g., America/New_York,
    * Europe/Paris. If not provided, the time zone specified in agent settings
    * is used.
    */
  var timeZone: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudDialogflowV2QueryParameters {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2QueryParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2QueryParameters]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2QueryParameters](x: Self) {
    
    inline def setContexts(value: js.Array[SchemaGoogleCloudDialogflowV2Context]): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
    
    inline def setContextsUndefined: Self = StObject.set(x, "contexts", js.undefined)
    
    inline def setContextsVarargs(value: SchemaGoogleCloudDialogflowV2Context*): Self = StObject.set(x, "contexts", js.Array(value :_*))
    
    inline def setGeoLocation(value: SchemaGoogleTypeLatLng): Self = StObject.set(x, "geoLocation", value.asInstanceOf[js.Any])
    
    inline def setGeoLocationUndefined: Self = StObject.set(x, "geoLocation", js.undefined)
    
    inline def setPayload(value: StringDictionary[js.Any]): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    inline def setResetContexts(value: Boolean): Self = StObject.set(x, "resetContexts", value.asInstanceOf[js.Any])
    
    inline def setResetContextsUndefined: Self = StObject.set(x, "resetContexts", js.undefined)
    
    inline def setSentimentAnalysisRequestConfig(value: SchemaGoogleCloudDialogflowV2SentimentAnalysisRequestConfig): Self = StObject.set(x, "sentimentAnalysisRequestConfig", value.asInstanceOf[js.Any])
    
    inline def setSentimentAnalysisRequestConfigUndefined: Self = StObject.set(x, "sentimentAnalysisRequestConfig", js.undefined)
    
    inline def setSessionEntityTypes(value: js.Array[SchemaGoogleCloudDialogflowV2SessionEntityType]): Self = StObject.set(x, "sessionEntityTypes", value.asInstanceOf[js.Any])
    
    inline def setSessionEntityTypesUndefined: Self = StObject.set(x, "sessionEntityTypes", js.undefined)
    
    inline def setSessionEntityTypesVarargs(value: SchemaGoogleCloudDialogflowV2SessionEntityType*): Self = StObject.set(x, "sessionEntityTypes", js.Array(value :_*))
    
    inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
  }
}
