package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a Google Tag Manager Container Version.
  */
trait SchemaContainerVersion extends StObject {
  
  /**
    * GTM Account ID.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * The container that this version was taken from.
    */
  var container: js.UndefOr[SchemaContainer] = js.undefined
  
  /**
    * GTM Container ID.
    */
  var containerId: js.UndefOr[String] = js.undefined
  
  /**
    * The Container Version ID uniquely identifies the GTM Container Version.
    */
  var containerVersionId: js.UndefOr[String] = js.undefined
  
  /**
    * A value of true indicates this container version has been deleted.
    */
  var deleted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The fingerprint of the GTM Container Version as computed at storage time.
    * This value is recomputed whenever the container version is modified.
    */
  var fingerprint: js.UndefOr[String] = js.undefined
  
  /**
    * The folders in the container that this version was taken from.
    */
  var folder: js.UndefOr[js.Array[SchemaFolder]] = js.undefined
  
  /**
    * The macros in the container that this version was taken from.
    */
  var `macro`: js.UndefOr[js.Array[SchemaMacro]] = js.undefined
  
  /**
    * Container version display name.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * User notes on how to apply this container version in the container.
    */
  var notes: js.UndefOr[String] = js.undefined
  
  /**
    * The rules in the container that this version was taken from.
    */
  var rule: js.UndefOr[js.Array[SchemaRule]] = js.undefined
  
  /**
    * The tags in the container that this version was taken from.
    */
  var tag: js.UndefOr[js.Array[SchemaTag]] = js.undefined
  
  /**
    * The triggers in the container that this version was taken from.
    */
  var trigger: js.UndefOr[js.Array[SchemaTrigger]] = js.undefined
  
  /**
    * The variables in the container that this version was taken from.
    */
  var variable: js.UndefOr[js.Array[SchemaVariable]] = js.undefined
}
object SchemaContainerVersion {
  
  @scala.inline
  def apply(): SchemaContainerVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContainerVersion]
  }
  
  @scala.inline
  implicit class SchemaContainerVersionMutableBuilder[Self <: SchemaContainerVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setContainer(value: SchemaContainer): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setContainerVersionId(value: String): Self = StObject.set(x, "containerVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerVersionIdUndefined: Self = StObject.set(x, "containerVersionId", js.undefined)
    
    @scala.inline
    def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    @scala.inline
    def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
    
    @scala.inline
    def setFolder(value: js.Array[SchemaFolder]): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFolderUndefined: Self = StObject.set(x, "folder", js.undefined)
    
    @scala.inline
    def setFolderVarargs(value: SchemaFolder*): Self = StObject.set(x, "folder", js.Array(value :_*))
    
    @scala.inline
    def setMacro(value: js.Array[SchemaMacro]): Self = StObject.set(x, "macro", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMacroUndefined: Self = StObject.set(x, "macro", js.undefined)
    
    @scala.inline
    def setMacroVarargs(value: SchemaMacro*): Self = StObject.set(x, "macro", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    @scala.inline
    def setRule(value: js.Array[SchemaRule]): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
    
    @scala.inline
    def setRuleVarargs(value: SchemaRule*): Self = StObject.set(x, "rule", js.Array(value :_*))
    
    @scala.inline
    def setTag(value: js.Array[SchemaTag]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    
    @scala.inline
    def setTagVarargs(value: SchemaTag*): Self = StObject.set(x, "tag", js.Array(value :_*))
    
    @scala.inline
    def setTrigger(value: js.Array[SchemaTrigger]): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
    
    @scala.inline
    def setTriggerVarargs(value: SchemaTrigger*): Self = StObject.set(x, "trigger", js.Array(value :_*))
    
    @scala.inline
    def setVariable(value: js.Array[SchemaVariable]): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariableUndefined: Self = StObject.set(x, "variable", js.undefined)
    
    @scala.inline
    def setVariableVarargs(value: SchemaVariable*): Self = StObject.set(x, "variable", js.Array(value :_*))
  }
}
