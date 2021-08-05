package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

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
    * The built-in variables in the container that this version was taken from.
    */
  var builtInVariable: js.UndefOr[js.Array[SchemaBuiltInVariable]] = js.undefined
  
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
    * The custom templates in the container that this version was taken from.
    */
  var customTemplate: js.UndefOr[js.Array[SchemaCustomTemplate]] = js.undefined
  
  /**
    * A value of true indicates this container version has been deleted.
    */
  var deleted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Container version description.
    */
  var description: js.UndefOr[String] = js.undefined
  
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
    * Container version display name.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * GTM ContainerVersions&#39;s API relative path.
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * The tags in the container that this version was taken from.
    */
  var tag: js.UndefOr[js.Array[SchemaTag]] = js.undefined
  
  /**
    * Auto generated link to the tag manager UI
    */
  var tagManagerUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The triggers in the container that this version was taken from.
    */
  var trigger: js.UndefOr[js.Array[SchemaTrigger]] = js.undefined
  
  /**
    * The variables in the container that this version was taken from.
    */
  var variable: js.UndefOr[js.Array[SchemaVariable]] = js.undefined
  
  /**
    * The zones in the container that this version was taken from.
    */
  var zone: js.UndefOr[js.Array[SchemaZone]] = js.undefined
}
object SchemaContainerVersion {
  
  inline def apply(): SchemaContainerVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContainerVersion]
  }
  
  extension [Self <: SchemaContainerVersion](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setBuiltInVariable(value: js.Array[SchemaBuiltInVariable]): Self = StObject.set(x, "builtInVariable", value.asInstanceOf[js.Any])
    
    inline def setBuiltInVariableUndefined: Self = StObject.set(x, "builtInVariable", js.undefined)
    
    inline def setBuiltInVariableVarargs(value: SchemaBuiltInVariable*): Self = StObject.set(x, "builtInVariable", js.Array(value :_*))
    
    inline def setContainer(value: SchemaContainer): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
    
    inline def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setContainerVersionId(value: String): Self = StObject.set(x, "containerVersionId", value.asInstanceOf[js.Any])
    
    inline def setContainerVersionIdUndefined: Self = StObject.set(x, "containerVersionId", js.undefined)
    
    inline def setCustomTemplate(value: js.Array[SchemaCustomTemplate]): Self = StObject.set(x, "customTemplate", value.asInstanceOf[js.Any])
    
    inline def setCustomTemplateUndefined: Self = StObject.set(x, "customTemplate", js.undefined)
    
    inline def setCustomTemplateVarargs(value: SchemaCustomTemplate*): Self = StObject.set(x, "customTemplate", js.Array(value :_*))
    
    inline def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    inline def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
    
    inline def setFolder(value: js.Array[SchemaFolder]): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
    
    inline def setFolderUndefined: Self = StObject.set(x, "folder", js.undefined)
    
    inline def setFolderVarargs(value: SchemaFolder*): Self = StObject.set(x, "folder", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setTag(value: js.Array[SchemaTag]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagManagerUrl(value: String): Self = StObject.set(x, "tagManagerUrl", value.asInstanceOf[js.Any])
    
    inline def setTagManagerUrlUndefined: Self = StObject.set(x, "tagManagerUrl", js.undefined)
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    
    inline def setTagVarargs(value: SchemaTag*): Self = StObject.set(x, "tag", js.Array(value :_*))
    
    inline def setTrigger(value: js.Array[SchemaTrigger]): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    
    inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
    
    inline def setTriggerVarargs(value: SchemaTrigger*): Self = StObject.set(x, "trigger", js.Array(value :_*))
    
    inline def setVariable(value: js.Array[SchemaVariable]): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
    
    inline def setVariableUndefined: Self = StObject.set(x, "variable", js.undefined)
    
    inline def setVariableVarargs(value: SchemaVariable*): Self = StObject.set(x, "variable", js.Array(value :_*))
    
    inline def setZone(value: js.Array[SchemaZone]): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
    
    inline def setZoneVarargs(value: SchemaZone*): Self = StObject.set(x, "zone", js.Array(value :_*))
  }
}
