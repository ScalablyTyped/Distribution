package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2Finding extends StObject {
  
  /**
    * Timestamp when finding was detected.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The unique finding id.
    */
  var findingId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of content that might have been found. Provided if `excluded_types` is false.
    */
  var infoType: js.UndefOr[SchemaGooglePrivacyDlpV2InfoType] = js.undefined
  
  /**
    * Time the job started that produced this finding.
    */
  var jobCreateTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The job that stored the finding.
    */
  var jobName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The labels associated with this `Finding`. Label keys must be between 1 and 63 characters long and must conform to the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?`. Label values must be between 0 and 63 characters long and must conform to the regular expression `([a-z]([-a-z0-9]*[a-z0-9])?)?`. No more than 10 labels can be associated with a given finding. Examples: * `"environment" : "production"` * `"pipeline" : "etl"`
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Confidence of how likely it is that the `info_type` is correct.
    */
  var likelihood: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Where the content was found.
    */
  var location: js.UndefOr[SchemaGooglePrivacyDlpV2Location] = js.undefined
  
  /**
    * Resource name in format projects/{project\}/locations/{location\}/findings/{finding\} Populated only when viewing persisted findings.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The content that was found. Even if the content is not textual, it may be converted to a textual representation here. Provided if `include_quote` is true and the finding is less than or equal to 4096 bytes long. If the finding exceeds 4096 bytes in length, the quote may be omitted.
    */
  var quote: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Contains data parsed from quotes. Only populated if include_quote was set to true and a supported infoType was requested. Currently supported infoTypes: DATE, DATE_OF_BIRTH and TIME.
    */
  var quoteInfo: js.UndefOr[SchemaGooglePrivacyDlpV2QuoteInfo] = js.undefined
  
  /**
    * The job that stored the finding.
    */
  var resourceName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Job trigger name, if applicable, for this finding.
    */
  var triggerName: js.UndefOr[String | Null] = js.undefined
}
object SchemaGooglePrivacyDlpV2Finding {
  
  inline def apply(): SchemaGooglePrivacyDlpV2Finding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2Finding]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2Finding](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setFindingId(value: String): Self = StObject.set(x, "findingId", value.asInstanceOf[js.Any])
    
    inline def setFindingIdNull: Self = StObject.set(x, "findingId", null)
    
    inline def setFindingIdUndefined: Self = StObject.set(x, "findingId", js.undefined)
    
    inline def setInfoType(value: SchemaGooglePrivacyDlpV2InfoType): Self = StObject.set(x, "infoType", value.asInstanceOf[js.Any])
    
    inline def setInfoTypeUndefined: Self = StObject.set(x, "infoType", js.undefined)
    
    inline def setJobCreateTime(value: String): Self = StObject.set(x, "jobCreateTime", value.asInstanceOf[js.Any])
    
    inline def setJobCreateTimeNull: Self = StObject.set(x, "jobCreateTime", null)
    
    inline def setJobCreateTimeUndefined: Self = StObject.set(x, "jobCreateTime", js.undefined)
    
    inline def setJobName(value: String): Self = StObject.set(x, "jobName", value.asInstanceOf[js.Any])
    
    inline def setJobNameNull: Self = StObject.set(x, "jobName", null)
    
    inline def setJobNameUndefined: Self = StObject.set(x, "jobName", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLikelihood(value: String): Self = StObject.set(x, "likelihood", value.asInstanceOf[js.Any])
    
    inline def setLikelihoodNull: Self = StObject.set(x, "likelihood", null)
    
    inline def setLikelihoodUndefined: Self = StObject.set(x, "likelihood", js.undefined)
    
    inline def setLocation(value: SchemaGooglePrivacyDlpV2Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setQuote(value: String): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
    
    inline def setQuoteInfo(value: SchemaGooglePrivacyDlpV2QuoteInfo): Self = StObject.set(x, "quoteInfo", value.asInstanceOf[js.Any])
    
    inline def setQuoteInfoUndefined: Self = StObject.set(x, "quoteInfo", js.undefined)
    
    inline def setQuoteNull: Self = StObject.set(x, "quote", null)
    
    inline def setQuoteUndefined: Self = StObject.set(x, "quote", js.undefined)
    
    inline def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameNull: Self = StObject.set(x, "resourceName", null)
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
    
    inline def setTriggerName(value: String): Self = StObject.set(x, "triggerName", value.asInstanceOf[js.Any])
    
    inline def setTriggerNameNull: Self = StObject.set(x, "triggerName", null)
    
    inline def setTriggerNameUndefined: Self = StObject.set(x, "triggerName", js.undefined)
  }
}
