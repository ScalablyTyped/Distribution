package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the parameters of the conversational query.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2QueryParameters extends js.Object {
  /**
    * Optional. The collection of contexts to be activated before this query is
    * executed.
    */
  var contexts: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2Context]] = js.native
  /**
    * Optional. The geo location of this conversational query.
    */
  var geoLocation: js.UndefOr[SchemaGoogleTypeLatLng] = js.native
  /**
    * Optional. This field can be used to pass custom data into the webhook
    * associated with the agent. Arbitrary JSON objects are supported.
    */
  var payload: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Optional. Specifies whether to delete all contexts in the current session
    * before the new ones are activated.
    */
  var resetContexts: js.UndefOr[Boolean] = js.native
  /**
    * Optional. Configures the type of sentiment analysis to perform. If not
    * provided, sentiment analysis is not performed.
    */
  var sentimentAnalysisRequestConfig: js.UndefOr[SchemaGoogleCloudDialogflowV2SentimentAnalysisRequestConfig] = js.native
  /**
    * Optional. Additional session entity types to replace or extend developer
    * entity types with. The entity synonyms apply to all languages and persist
    * for the session of this query.
    */
  var sessionEntityTypes: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2SessionEntityType]] = js.native
  /**
    * Optional. The time zone of this conversational query from the [time zone
    * database](https://www.iana.org/time-zones), e.g., America/New_York,
    * Europe/Paris. If not provided, the time zone specified in agent settings
    * is used.
    */
  var timeZone: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudDialogflowV2QueryParameters {
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2QueryParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2QueryParameters]
  }
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2QueryParametersOps[Self <: SchemaGoogleCloudDialogflowV2QueryParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContextsVarargs(value: SchemaGoogleCloudDialogflowV2Context*): Self = this.set("contexts", js.Array(value :_*))
    @scala.inline
    def setContexts(value: js.Array[SchemaGoogleCloudDialogflowV2Context]): Self = this.set("contexts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContexts: Self = this.set("contexts", js.undefined)
    @scala.inline
    def setGeoLocation(value: SchemaGoogleTypeLatLng): Self = this.set("geoLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeoLocation: Self = this.set("geoLocation", js.undefined)
    @scala.inline
    def setPayload(value: StringDictionary[js.Any]): Self = this.set("payload", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
    @scala.inline
    def setResetContexts(value: Boolean): Self = this.set("resetContexts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResetContexts: Self = this.set("resetContexts", js.undefined)
    @scala.inline
    def setSentimentAnalysisRequestConfig(value: SchemaGoogleCloudDialogflowV2SentimentAnalysisRequestConfig): Self = this.set("sentimentAnalysisRequestConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSentimentAnalysisRequestConfig: Self = this.set("sentimentAnalysisRequestConfig", js.undefined)
    @scala.inline
    def setSessionEntityTypesVarargs(value: SchemaGoogleCloudDialogflowV2SessionEntityType*): Self = this.set("sessionEntityTypes", js.Array(value :_*))
    @scala.inline
    def setSessionEntityTypes(value: js.Array[SchemaGoogleCloudDialogflowV2SessionEntityType]): Self = this.set("sessionEntityTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSessionEntityTypes: Self = this.set("sessionEntityTypes", js.undefined)
    @scala.inline
    def setTimeZone(value: String): Self = this.set("timeZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeZone: Self = this.set("timeZone", js.undefined)
  }
  
}

