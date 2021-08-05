package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes the data disk used by a workflow job.
  */
trait SchemaDisk extends StObject {
  
  /**
    * Disk storage type, as defined by Google Compute Engine.  This must be a
    * disk type appropriate to the project and zone in which the workers will
    * run.  If unknown or unspecified, the service will attempt to choose a
    * reasonable default.  For example, the standard persistent disk type is a
    * resource name typically ending in &quot;pd-standard&quot;.  If SSD
    * persistent disks are available, the resource name typically ends with
    * &quot;pd-ssd&quot;.  The actual valid values are defined the Google
    * Compute Engine API, not by the Cloud Dataflow API; consult the Google
    * Compute Engine documentation for more information about determining the
    * set of available disk types for a particular project and zone.  Google
    * Compute Engine Disk types are local to a particular project in a
    * particular zone, and so the resource name will typically look something
    * like this:
    * compute.googleapis.com/projects/project-id/zones/zone/diskTypes/pd-standard
    */
  var diskType: js.UndefOr[String] = js.undefined
  
  /**
    * Directory in a VM where disk is mounted.
    */
  var mountPoint: js.UndefOr[String] = js.undefined
  
  /**
    * Size of disk in GB.  If zero or unspecified, the service will attempt to
    * choose a reasonable default.
    */
  var sizeGb: js.UndefOr[Double] = js.undefined
}
object SchemaDisk {
  
  inline def apply(): SchemaDisk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDisk]
  }
  
  extension [Self <: SchemaDisk](x: Self) {
    
    inline def setDiskType(value: String): Self = StObject.set(x, "diskType", value.asInstanceOf[js.Any])
    
    inline def setDiskTypeUndefined: Self = StObject.set(x, "diskType", js.undefined)
    
    inline def setMountPoint(value: String): Self = StObject.set(x, "mountPoint", value.asInstanceOf[js.Any])
    
    inline def setMountPointUndefined: Self = StObject.set(x, "mountPoint", js.undefined)
    
    inline def setSizeGb(value: Double): Self = StObject.set(x, "sizeGb", value.asInstanceOf[js.Any])
    
    inline def setSizeGbUndefined: Self = StObject.set(x, "sizeGb", js.undefined)
  }
}
