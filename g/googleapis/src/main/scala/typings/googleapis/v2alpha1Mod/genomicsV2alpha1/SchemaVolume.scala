package typings.googleapis.v2alpha1Mod.genomicsV2alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVolume extends StObject {
  
  /**
    * Configuration for a existing disk.
    */
  var existingDisk: js.UndefOr[SchemaExistingDisk] = js.undefined
  
  /**
    * Configuration for an NFS mount.
    */
  var nfsMount: js.UndefOr[SchemaNFSMount] = js.undefined
  
  /**
    * Configuration for a persistent disk.
    */
  var persistentDisk: js.UndefOr[SchemaPersistentDisk] = js.undefined
  
  /**
    * A user-supplied name for the volume. Used when mounting the volume into `Actions`. The name must contain only upper and lowercase alphanumeric characters and hyphens and cannot start with a hyphen.
    */
  var volume: js.UndefOr[String | Null] = js.undefined
}
object SchemaVolume {
  
  inline def apply(): SchemaVolume = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVolume]
  }
  
  extension [Self <: SchemaVolume](x: Self) {
    
    inline def setExistingDisk(value: SchemaExistingDisk): Self = StObject.set(x, "existingDisk", value.asInstanceOf[js.Any])
    
    inline def setExistingDiskUndefined: Self = StObject.set(x, "existingDisk", js.undefined)
    
    inline def setNfsMount(value: SchemaNFSMount): Self = StObject.set(x, "nfsMount", value.asInstanceOf[js.Any])
    
    inline def setNfsMountUndefined: Self = StObject.set(x, "nfsMount", js.undefined)
    
    inline def setPersistentDisk(value: SchemaPersistentDisk): Self = StObject.set(x, "persistentDisk", value.asInstanceOf[js.Any])
    
    inline def setPersistentDiskUndefined: Self = StObject.set(x, "persistentDisk", js.undefined)
    
    inline def setVolume(value: String): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
    
    inline def setVolumeNull: Self = StObject.set(x, "volume", null)
    
    inline def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
  }
}
