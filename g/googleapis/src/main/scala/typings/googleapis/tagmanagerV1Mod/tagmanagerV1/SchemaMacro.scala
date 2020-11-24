package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a Google Tag Manager Macro.
  */
@js.native
trait SchemaMacro extends js.Object {
  
  /**
    * GTM Account ID.
    */
  var accountId: js.UndefOr[String] = js.native
  
  /**
    * GTM Container ID.
    */
  var containerId: js.UndefOr[String] = js.native
  
  /**
    * For mobile containers only: A list of rule IDs for disabling conditional
    * macros; the macro is enabled if one of the enabling rules is true while
    * all the disabling rules are false. Treated as an unordered set.
    */
  var disablingRuleId: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * For mobile containers only: A list of rule IDs for enabling conditional
    * macros; the macro is enabled if one of the enabling rules is true while
    * all the disabling rules are false. Treated as an unordered set.
    */
  var enablingRuleId: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The fingerprint of the GTM Macro as computed at storage time. This value
    * is recomputed whenever the macro is modified.
    */
  var fingerprint: js.UndefOr[String] = js.native
  
  /**
    * The Macro ID uniquely identifies the GTM Macro.
    */
  var macroId: js.UndefOr[String] = js.native
  
  /**
    * Macro display name.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * User notes on how to apply this macro in the container.
    */
  var notes: js.UndefOr[String] = js.native
  
  /**
    * The macro&#39;s parameters.
    */
  var parameter: js.UndefOr[js.Array[SchemaParameter]] = js.native
  
  /**
    * Parent folder id.
    */
  var parentFolderId: js.UndefOr[String] = js.native
  
  /**
    * The end timestamp in milliseconds to schedule a macro.
    */
  var scheduleEndMs: js.UndefOr[String] = js.native
  
  /**
    * The start timestamp in milliseconds to schedule a macro.
    */
  var scheduleStartMs: js.UndefOr[String] = js.native
  
  /**
    * GTM Macro Type.
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaMacro {
  
  @scala.inline
  def apply(): SchemaMacro = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMacro]
  }
  
  @scala.inline
  implicit class SchemaMacroOps[Self <: SchemaMacro] (val x: Self) extends AnyVal {
    
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
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    
    @scala.inline
    def setContainerId(value: String): Self = this.set("containerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerId: Self = this.set("containerId", js.undefined)
    
    @scala.inline
    def setDisablingRuleIdVarargs(value: String*): Self = this.set("disablingRuleId", js.Array(value :_*))
    
    @scala.inline
    def setDisablingRuleId(value: js.Array[String]): Self = this.set("disablingRuleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisablingRuleId: Self = this.set("disablingRuleId", js.undefined)
    
    @scala.inline
    def setEnablingRuleIdVarargs(value: String*): Self = this.set("enablingRuleId", js.Array(value :_*))
    
    @scala.inline
    def setEnablingRuleId(value: js.Array[String]): Self = this.set("enablingRuleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnablingRuleId: Self = this.set("enablingRuleId", js.undefined)
    
    @scala.inline
    def setFingerprint(value: String): Self = this.set("fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFingerprint: Self = this.set("fingerprint", js.undefined)
    
    @scala.inline
    def setMacroId(value: String): Self = this.set("macroId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMacroId: Self = this.set("macroId", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNotes(value: String): Self = this.set("notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotes: Self = this.set("notes", js.undefined)
    
    @scala.inline
    def setParameterVarargs(value: SchemaParameter*): Self = this.set("parameter", js.Array(value :_*))
    
    @scala.inline
    def setParameter(value: js.Array[SchemaParameter]): Self = this.set("parameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameter: Self = this.set("parameter", js.undefined)
    
    @scala.inline
    def setParentFolderId(value: String): Self = this.set("parentFolderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentFolderId: Self = this.set("parentFolderId", js.undefined)
    
    @scala.inline
    def setScheduleEndMs(value: String): Self = this.set("scheduleEndMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheduleEndMs: Self = this.set("scheduleEndMs", js.undefined)
    
    @scala.inline
    def setScheduleStartMs(value: String): Self = this.set("scheduleStartMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheduleStartMs: Self = this.set("scheduleStartMs", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
