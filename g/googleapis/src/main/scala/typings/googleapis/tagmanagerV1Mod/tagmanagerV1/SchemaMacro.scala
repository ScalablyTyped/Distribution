package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMacro extends StObject {
  
  /**
    * GTM Account ID.
    */
  var accountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * GTM Container ID.
    */
  var containerId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * For mobile containers only: A list of rule IDs for disabling conditional macros; the macro is enabled if one of the enabling rules is true while all the disabling rules are false. Treated as an unordered set. @mutable tagmanager.accounts.containers.macros.create @mutable tagmanager.accounts.containers.macros.update
    */
  var disablingRuleId: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * For mobile containers only: A list of rule IDs for enabling conditional macros; the macro is enabled if one of the enabling rules is true while all the disabling rules are false. Treated as an unordered set. @mutable tagmanager.accounts.containers.macros.create @mutable tagmanager.accounts.containers.macros.update
    */
  var enablingRuleId: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The fingerprint of the GTM Macro as computed at storage time. This value is recomputed whenever the macro is modified.
    */
  var fingerprint: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Macro ID uniquely identifies the GTM Macro.
    */
  var macroId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Macro display name. @mutable tagmanager.accounts.containers.macros.create @mutable tagmanager.accounts.containers.macros.update
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * User notes on how to apply this macro in the container. @mutable tagmanager.accounts.containers.macros.create @mutable tagmanager.accounts.containers.macros.update
    */
  var notes: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The macro's parameters. @mutable tagmanager.accounts.containers.macros.create @mutable tagmanager.accounts.containers.macros.update
    */
  var parameter: js.UndefOr[js.Array[SchemaParameter]] = js.undefined
  
  /**
    * Parent folder id.
    */
  var parentFolderId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The end timestamp in milliseconds to schedule a macro. @mutable tagmanager.accounts.containers.macros.create @mutable tagmanager.accounts.containers.macros.update
    */
  var scheduleEndMs: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The start timestamp in milliseconds to schedule a macro. @mutable tagmanager.accounts.containers.macros.create @mutable tagmanager.accounts.containers.macros.update
    */
  var scheduleStartMs: js.UndefOr[String | Null] = js.undefined
  
  /**
    * GTM Macro Type. @mutable tagmanager.accounts.containers.macros.create @mutable tagmanager.accounts.containers.macros.update
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaMacro {
  
  inline def apply(): SchemaMacro = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMacro]
  }
  
  extension [Self <: SchemaMacro](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdNull: Self = StObject.set(x, "accountId", null)
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
    
    inline def setContainerIdNull: Self = StObject.set(x, "containerId", null)
    
    inline def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
    
    inline def setDisablingRuleId(value: js.Array[String]): Self = StObject.set(x, "disablingRuleId", value.asInstanceOf[js.Any])
    
    inline def setDisablingRuleIdNull: Self = StObject.set(x, "disablingRuleId", null)
    
    inline def setDisablingRuleIdUndefined: Self = StObject.set(x, "disablingRuleId", js.undefined)
    
    inline def setDisablingRuleIdVarargs(value: String*): Self = StObject.set(x, "disablingRuleId", js.Array(value*))
    
    inline def setEnablingRuleId(value: js.Array[String]): Self = StObject.set(x, "enablingRuleId", value.asInstanceOf[js.Any])
    
    inline def setEnablingRuleIdNull: Self = StObject.set(x, "enablingRuleId", null)
    
    inline def setEnablingRuleIdUndefined: Self = StObject.set(x, "enablingRuleId", js.undefined)
    
    inline def setEnablingRuleIdVarargs(value: String*): Self = StObject.set(x, "enablingRuleId", js.Array(value*))
    
    inline def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    inline def setFingerprintNull: Self = StObject.set(x, "fingerprint", null)
    
    inline def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
    
    inline def setMacroId(value: String): Self = StObject.set(x, "macroId", value.asInstanceOf[js.Any])
    
    inline def setMacroIdNull: Self = StObject.set(x, "macroId", null)
    
    inline def setMacroIdUndefined: Self = StObject.set(x, "macroId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setNotesNull: Self = StObject.set(x, "notes", null)
    
    inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    inline def setParameter(value: js.Array[SchemaParameter]): Self = StObject.set(x, "parameter", value.asInstanceOf[js.Any])
    
    inline def setParameterUndefined: Self = StObject.set(x, "parameter", js.undefined)
    
    inline def setParameterVarargs(value: SchemaParameter*): Self = StObject.set(x, "parameter", js.Array(value*))
    
    inline def setParentFolderId(value: String): Self = StObject.set(x, "parentFolderId", value.asInstanceOf[js.Any])
    
    inline def setParentFolderIdNull: Self = StObject.set(x, "parentFolderId", null)
    
    inline def setParentFolderIdUndefined: Self = StObject.set(x, "parentFolderId", js.undefined)
    
    inline def setScheduleEndMs(value: String): Self = StObject.set(x, "scheduleEndMs", value.asInstanceOf[js.Any])
    
    inline def setScheduleEndMsNull: Self = StObject.set(x, "scheduleEndMs", null)
    
    inline def setScheduleEndMsUndefined: Self = StObject.set(x, "scheduleEndMs", js.undefined)
    
    inline def setScheduleStartMs(value: String): Self = StObject.set(x, "scheduleStartMs", value.asInstanceOf[js.Any])
    
    inline def setScheduleStartMsNull: Self = StObject.set(x, "scheduleStartMs", null)
    
    inline def setScheduleStartMsUndefined: Self = StObject.set(x, "scheduleStartMs", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
