package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a Google Tag Manager Variable.
  */
@js.native
trait SchemaVariable extends StObject {
  
  /**
    * GTM Account ID.
    */
  var accountId: js.UndefOr[String] = js.native
  
  /**
    * GTM Container ID.
    */
  var containerId: js.UndefOr[String] = js.native
  
  /**
    * For mobile containers only: A list of trigger IDs for disabling
    * conditional variables; the variable is enabled if one of the enabling
    * trigger is true while all the disabling trigger are false. Treated as an
    * unordered set.
    */
  var disablingTriggerId: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * For mobile containers only: A list of trigger IDs for enabling
    * conditional variables; the variable is enabled if one of the enabling
    * triggers is true while all the disabling triggers are false. Treated as
    * an unordered set.
    */
  var enablingTriggerId: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The fingerprint of the GTM Variable as computed at storage time. This
    * value is recomputed whenever the variable is modified.
    */
  var fingerprint: js.UndefOr[String] = js.native
  
  /**
    * Option to convert a variable value to other value.
    */
  var formatValue: js.UndefOr[SchemaVariableFormatValue] = js.native
  
  /**
    * Variable display name.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * User notes on how to apply this variable in the container.
    */
  var notes: js.UndefOr[String] = js.native
  
  /**
    * The variable&#39;s parameters.
    */
  var parameter: js.UndefOr[js.Array[SchemaParameter]] = js.native
  
  /**
    * Parent folder id.
    */
  var parentFolderId: js.UndefOr[String] = js.native
  
  /**
    * GTM Variable&#39;s API relative path.
    */
  var path: js.UndefOr[String] = js.native
  
  /**
    * The end timestamp in milliseconds to schedule a variable.
    */
  var scheduleEndMs: js.UndefOr[String] = js.native
  
  /**
    * The start timestamp in milliseconds to schedule a variable.
    */
  var scheduleStartMs: js.UndefOr[String] = js.native
  
  /**
    * Auto generated link to the tag manager UI
    */
  var tagManagerUrl: js.UndefOr[String] = js.native
  
  /**
    * GTM Variable Type.
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * The Variable ID uniquely identifies the GTM Variable.
    */
  var variableId: js.UndefOr[String] = js.native
  
  /**
    * GTM Workspace ID.
    */
  var workspaceId: js.UndefOr[String] = js.native
}
object SchemaVariable {
  
  @scala.inline
  def apply(): SchemaVariable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVariable]
  }
  
  @scala.inline
  implicit class SchemaVariableMutableBuilder[Self <: SchemaVariable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
    
    @scala.inline
    def setDisablingTriggerId(value: js.Array[String]): Self = StObject.set(x, "disablingTriggerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisablingTriggerIdUndefined: Self = StObject.set(x, "disablingTriggerId", js.undefined)
    
    @scala.inline
    def setDisablingTriggerIdVarargs(value: String*): Self = StObject.set(x, "disablingTriggerId", js.Array(value :_*))
    
    @scala.inline
    def setEnablingTriggerId(value: js.Array[String]): Self = StObject.set(x, "enablingTriggerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnablingTriggerIdUndefined: Self = StObject.set(x, "enablingTriggerId", js.undefined)
    
    @scala.inline
    def setEnablingTriggerIdVarargs(value: String*): Self = StObject.set(x, "enablingTriggerId", js.Array(value :_*))
    
    @scala.inline
    def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
    
    @scala.inline
    def setFormatValue(value: SchemaVariableFormatValue): Self = StObject.set(x, "formatValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatValueUndefined: Self = StObject.set(x, "formatValue", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    @scala.inline
    def setParameter(value: js.Array[SchemaParameter]): Self = StObject.set(x, "parameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterUndefined: Self = StObject.set(x, "parameter", js.undefined)
    
    @scala.inline
    def setParameterVarargs(value: SchemaParameter*): Self = StObject.set(x, "parameter", js.Array(value :_*))
    
    @scala.inline
    def setParentFolderId(value: String): Self = StObject.set(x, "parentFolderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentFolderIdUndefined: Self = StObject.set(x, "parentFolderId", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setScheduleEndMs(value: String): Self = StObject.set(x, "scheduleEndMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleEndMsUndefined: Self = StObject.set(x, "scheduleEndMs", js.undefined)
    
    @scala.inline
    def setScheduleStartMs(value: String): Self = StObject.set(x, "scheduleStartMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleStartMsUndefined: Self = StObject.set(x, "scheduleStartMs", js.undefined)
    
    @scala.inline
    def setTagManagerUrl(value: String): Self = StObject.set(x, "tagManagerUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagManagerUrlUndefined: Self = StObject.set(x, "tagManagerUrl", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setVariableId(value: String): Self = StObject.set(x, "variableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariableIdUndefined: Self = StObject.set(x, "variableId", js.undefined)
    
    @scala.inline
    def setWorkspaceId(value: String): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkspaceIdUndefined: Self = StObject.set(x, "workspaceId", js.undefined)
  }
}
