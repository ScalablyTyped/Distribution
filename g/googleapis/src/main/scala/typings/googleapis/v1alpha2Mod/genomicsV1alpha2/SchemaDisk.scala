package typings.googleapis.v1alpha2Mod.genomicsV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Google Compute Engine disk resource specification.
  */
trait SchemaDisk extends StObject {
  
  /**
    * Deprecated. Disks created by the Pipelines API will be deleted at the end
    * of the pipeline run, regardless of what this field is set to.
    */
  var autoDelete: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Required at create time and cannot be overridden at run time. Specifies
    * the path in the docker container where files on this disk should be
    * located. For example, if `mountPoint` is `/mnt/disk`, and the parameter
    * has `localPath` `inputs/file.txt`, the docker container can access the
    * data at `/mnt/disk/inputs/file.txt`.
    */
  var mountPoint: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The name of the disk that can be used in the pipeline
    * parameters. Must be 1 - 63 characters. The name &quot;boot&quot; is
    * reserved for system use.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies how a sourced-base persistent disk will be mounted. See
    * https://cloud.google.com/compute/docs/disks/persistent-disks#use_multi_instances
    * for more details. Can only be set at create time.
    */
  var readOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The size of the disk. Defaults to 500 (GB). This field is not applicable
    * for local SSD.
    */
  var sizeGb: js.UndefOr[Double] = js.undefined
  
  /**
    * The full or partial URL of the persistent disk to attach. See
    * https://cloud.google.com/compute/docs/reference/latest/instances#resource
    * and
    * https://cloud.google.com/compute/docs/disks/persistent-disks#snapshots
    * for more details.
    */
  var source: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The type of the disk to create.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaDisk {
  
  inline def apply(): SchemaDisk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDisk]
  }
  
  extension [Self <: SchemaDisk](x: Self) {
    
    inline def setAutoDelete(value: Boolean): Self = StObject.set(x, "autoDelete", value.asInstanceOf[js.Any])
    
    inline def setAutoDeleteUndefined: Self = StObject.set(x, "autoDelete", js.undefined)
    
    inline def setMountPoint(value: String): Self = StObject.set(x, "mountPoint", value.asInstanceOf[js.Any])
    
    inline def setMountPointUndefined: Self = StObject.set(x, "mountPoint", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setSizeGb(value: Double): Self = StObject.set(x, "sizeGb", value.asInstanceOf[js.Any])
    
    inline def setSizeGbUndefined: Self = StObject.set(x, "sizeGb", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
