package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes the data disk used by a workflow job.
  */
@js.native
trait SchemaDisk extends js.Object {
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
  var diskType: js.UndefOr[String] = js.native
  /**
    * Directory in a VM where disk is mounted.
    */
  var mountPoint: js.UndefOr[String] = js.native
  /**
    * Size of disk in GB.  If zero or unspecified, the service will attempt to
    * choose a reasonable default.
    */
  var sizeGb: js.UndefOr[Double] = js.native
}

object SchemaDisk {
  @scala.inline
  def apply(diskType: String = null, mountPoint: String = null, sizeGb: Int | Double = null): SchemaDisk = {
    val __obj = js.Dynamic.literal()
    if (diskType != null) __obj.updateDynamic("diskType")(diskType.asInstanceOf[js.Any])
    if (mountPoint != null) __obj.updateDynamic("mountPoint")(mountPoint.asInstanceOf[js.Any])
    if (sizeGb != null) __obj.updateDynamic("sizeGb")(sizeGb.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDisk]
  }
}

