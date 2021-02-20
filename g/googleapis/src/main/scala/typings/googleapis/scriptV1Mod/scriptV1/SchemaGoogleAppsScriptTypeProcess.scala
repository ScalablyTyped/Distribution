package typings.googleapis.scriptV1Mod.scriptV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Representation of a single script process execution that was started from
  * the script editor, a trigger, an application, or using the Apps Script API.
  * This is distinct from the `Operation` resource, which only represents
  * executions started via the Apps Script API.
  */
@js.native
trait SchemaGoogleAppsScriptTypeProcess extends StObject {
  
  /**
    * Duration the execution spent executing.
    */
  var duration: js.UndefOr[String] = js.native
  
  /**
    * Name of the function the started the execution.
    */
  var functionName: js.UndefOr[String] = js.native
  
  /**
    * The executions status.
    */
  var processStatus: js.UndefOr[String] = js.native
  
  /**
    * The executions type.
    */
  var processType: js.UndefOr[String] = js.native
  
  /**
    * Name of the script being executed.
    */
  var projectName: js.UndefOr[String] = js.native
  
  /**
    * Time the execution started.
    */
  var startTime: js.UndefOr[String] = js.native
  
  /**
    * The executing users access level to the script.
    */
  var userAccessLevel: js.UndefOr[String] = js.native
}
object SchemaGoogleAppsScriptTypeProcess {
  
  @scala.inline
  def apply(): SchemaGoogleAppsScriptTypeProcess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsScriptTypeProcess]
  }
  
  @scala.inline
  implicit class SchemaGoogleAppsScriptTypeProcessMutableBuilder[Self <: SchemaGoogleAppsScriptTypeProcess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setFunctionName(value: String): Self = StObject.set(x, "functionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionNameUndefined: Self = StObject.set(x, "functionName", js.undefined)
    
    @scala.inline
    def setProcessStatus(value: String): Self = StObject.set(x, "processStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessStatusUndefined: Self = StObject.set(x, "processStatus", js.undefined)
    
    @scala.inline
    def setProcessType(value: String): Self = StObject.set(x, "processType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessTypeUndefined: Self = StObject.set(x, "processType", js.undefined)
    
    @scala.inline
    def setProjectName(value: String): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectNameUndefined: Self = StObject.set(x, "projectName", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    @scala.inline
    def setUserAccessLevel(value: String): Self = StObject.set(x, "userAccessLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserAccessLevelUndefined: Self = StObject.set(x, "userAccessLevel", js.undefined)
  }
}
