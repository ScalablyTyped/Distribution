package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a Google Tag Manager Macro.
  */
trait SchemaMacro extends StObject {
  
  /**
    * GTM Account ID.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * GTM Container ID.
    */
  var containerId: js.UndefOr[String] = js.undefined
  
  /**
    * For mobile containers only: A list of rule IDs for disabling conditional
    * macros; the macro is enabled if one of the enabling rules is true while
    * all the disabling rules are false. Treated as an unordered set.
    */
  var disablingRuleId: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * For mobile containers only: A list of rule IDs for enabling conditional
    * macros; the macro is enabled if one of the enabling rules is true while
    * all the disabling rules are false. Treated as an unordered set.
    */
  var enablingRuleId: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The fingerprint of the GTM Macro as computed at storage time. This value
    * is recomputed whenever the macro is modified.
    */
  var fingerprint: js.UndefOr[String] = js.undefined
  
  /**
    * The Macro ID uniquely identifies the GTM Macro.
    */
  var macroId: js.UndefOr[String] = js.undefined
  
  /**
    * Macro display name.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * User notes on how to apply this macro in the container.
    */
  var notes: js.UndefOr[String] = js.undefined
  
  /**
    * The macro&#39;s parameters.
    */
  var parameter: js.UndefOr[js.Array[SchemaParameter]] = js.undefined
  
  /**
    * Parent folder id.
    */
  var parentFolderId: js.UndefOr[String] = js.undefined
  
  /**
    * The end timestamp in milliseconds to schedule a macro.
    */
  var scheduleEndMs: js.UndefOr[String] = js.undefined
  
  /**
    * The start timestamp in milliseconds to schedule a macro.
    */
  var scheduleStartMs: js.UndefOr[String] = js.undefined
  
  /**
    * GTM Macro Type.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaMacro {
  
  inline def apply(): SchemaMacro = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMacro]
  }
  
  extension [Self <: SchemaMacro](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
    
    inline def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
    
    inline def setDisablingRuleId(value: js.Array[String]): Self = StObject.set(x, "disablingRuleId", value.asInstanceOf[js.Any])
    
    inline def setDisablingRuleIdUndefined: Self = StObject.set(x, "disablingRuleId", js.undefined)
    
    inline def setDisablingRuleIdVarargs(value: String*): Self = StObject.set(x, "disablingRuleId", js.Array(value :_*))
    
    inline def setEnablingRuleId(value: js.Array[String]): Self = StObject.set(x, "enablingRuleId", value.asInstanceOf[js.Any])
    
    inline def setEnablingRuleIdUndefined: Self = StObject.set(x, "enablingRuleId", js.undefined)
    
    inline def setEnablingRuleIdVarargs(value: String*): Self = StObject.set(x, "enablingRuleId", js.Array(value :_*))
    
    inline def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    inline def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
    
    inline def setMacroId(value: String): Self = StObject.set(x, "macroId", value.asInstanceOf[js.Any])
    
    inline def setMacroIdUndefined: Self = StObject.set(x, "macroId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    inline def setParameter(value: js.Array[SchemaParameter]): Self = StObject.set(x, "parameter", value.asInstanceOf[js.Any])
    
    inline def setParameterUndefined: Self = StObject.set(x, "parameter", js.undefined)
    
    inline def setParameterVarargs(value: SchemaParameter*): Self = StObject.set(x, "parameter", js.Array(value :_*))
    
    inline def setParentFolderId(value: String): Self = StObject.set(x, "parentFolderId", value.asInstanceOf[js.Any])
    
    inline def setParentFolderIdUndefined: Self = StObject.set(x, "parentFolderId", js.undefined)
    
    inline def setScheduleEndMs(value: String): Self = StObject.set(x, "scheduleEndMs", value.asInstanceOf[js.Any])
    
    inline def setScheduleEndMsUndefined: Self = StObject.set(x, "scheduleEndMs", js.undefined)
    
    inline def setScheduleStartMs(value: String): Self = StObject.set(x, "scheduleStartMs", value.asInstanceOf[js.Any])
    
    inline def setScheduleStartMsUndefined: Self = StObject.set(x, "scheduleStartMs", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
