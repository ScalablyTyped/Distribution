package typings.googleapis.notebooksV1Mod.notebooksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUpgradeHistoryEntry extends StObject {
  
  /**
    * Action. Rolloback or Upgrade.
    */
  var action: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The container image before this instance upgrade.
    */
  var containerImage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time that this instance upgrade history entry is created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The framework of this notebook instance.
    */
  var framework: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The snapshot of the boot disk of this notebook instance before upgrade.
    */
  var snapshot: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The state of this instance upgrade history entry.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Target VM Image. Format: ainotebooks-vm/project/image-name/name.
    */
  var targetImage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Target VM Version, like m63.
    */
  var targetVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The version of the notebook instance before this upgrade.
    */
  var version: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The VM image before this instance upgrade.
    */
  var vmImage: js.UndefOr[String | Null] = js.undefined
}
object SchemaUpgradeHistoryEntry {
  
  inline def apply(): SchemaUpgradeHistoryEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpgradeHistoryEntry]
  }
  
  extension [Self <: SchemaUpgradeHistoryEntry](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionNull: Self = StObject.set(x, "action", null)
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setContainerImage(value: String): Self = StObject.set(x, "containerImage", value.asInstanceOf[js.Any])
    
    inline def setContainerImageNull: Self = StObject.set(x, "containerImage", null)
    
    inline def setContainerImageUndefined: Self = StObject.set(x, "containerImage", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setFramework(value: String): Self = StObject.set(x, "framework", value.asInstanceOf[js.Any])
    
    inline def setFrameworkNull: Self = StObject.set(x, "framework", null)
    
    inline def setFrameworkUndefined: Self = StObject.set(x, "framework", js.undefined)
    
    inline def setSnapshot(value: String): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    
    inline def setSnapshotNull: Self = StObject.set(x, "snapshot", null)
    
    inline def setSnapshotUndefined: Self = StObject.set(x, "snapshot", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTargetImage(value: String): Self = StObject.set(x, "targetImage", value.asInstanceOf[js.Any])
    
    inline def setTargetImageNull: Self = StObject.set(x, "targetImage", null)
    
    inline def setTargetImageUndefined: Self = StObject.set(x, "targetImage", js.undefined)
    
    inline def setTargetVersion(value: String): Self = StObject.set(x, "targetVersion", value.asInstanceOf[js.Any])
    
    inline def setTargetVersionNull: Self = StObject.set(x, "targetVersion", null)
    
    inline def setTargetVersionUndefined: Self = StObject.set(x, "targetVersion", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setVmImage(value: String): Self = StObject.set(x, "vmImage", value.asInstanceOf[js.Any])
    
    inline def setVmImageNull: Self = StObject.set(x, "vmImage", null)
    
    inline def setVmImageUndefined: Self = StObject.set(x, "vmImage", js.undefined)
  }
}
