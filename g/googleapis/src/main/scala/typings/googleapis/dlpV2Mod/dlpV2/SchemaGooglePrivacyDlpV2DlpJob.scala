package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Combines all of the information about a DLP job.
  */
trait SchemaGooglePrivacyDlpV2DlpJob extends StObject {
  
  /**
    * Time when the job was created.
    */
  var createTime: js.UndefOr[String] = js.undefined
  
  /**
    * Time when the job finished.
    */
  var endTime: js.UndefOr[String] = js.undefined
  
  /**
    * A stream of errors encountered running the job.
    */
  var errors: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2Error]] = js.undefined
  
  /**
    * Results from inspecting a data source.
    */
  var inspectDetails: js.UndefOr[SchemaGooglePrivacyDlpV2InspectDataSourceDetails] = js.undefined
  
  /**
    * If created by a job trigger, the resource name of the trigger that
    * instantiated the job.
    */
  var jobTriggerName: js.UndefOr[String] = js.undefined
  
  /**
    * The server-assigned name.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Results from analyzing risk of a data source.
    */
  var riskDetails: js.UndefOr[SchemaGooglePrivacyDlpV2AnalyzeDataSourceRiskDetails] = js.undefined
  
  /**
    * Time when the job started.
    */
  var startTime: js.UndefOr[String] = js.undefined
  
  /**
    * State of a job.
    */
  var state: js.UndefOr[String] = js.undefined
  
  /**
    * The type of job.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaGooglePrivacyDlpV2DlpJob {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2DlpJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2DlpJob]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2DlpJobMutableBuilder[Self <: SchemaGooglePrivacyDlpV2DlpJob] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setErrors(value: js.Array[SchemaGooglePrivacyDlpV2Error]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: SchemaGooglePrivacyDlpV2Error*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    @scala.inline
    def setInspectDetails(value: SchemaGooglePrivacyDlpV2InspectDataSourceDetails): Self = StObject.set(x, "inspectDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInspectDetailsUndefined: Self = StObject.set(x, "inspectDetails", js.undefined)
    
    @scala.inline
    def setJobTriggerName(value: String): Self = StObject.set(x, "jobTriggerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobTriggerNameUndefined: Self = StObject.set(x, "jobTriggerName", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRiskDetails(value: SchemaGooglePrivacyDlpV2AnalyzeDataSourceRiskDetails): Self = StObject.set(x, "riskDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRiskDetailsUndefined: Self = StObject.set(x, "riskDetails", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
