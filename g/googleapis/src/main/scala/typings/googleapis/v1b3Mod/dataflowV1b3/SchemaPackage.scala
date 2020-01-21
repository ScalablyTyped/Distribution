package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The packages that must be installed in order for a worker to run the steps
  * of the Cloud Dataflow job that will be assigned to its worker pool.  This
  * is the mechanism by which the Cloud Dataflow SDK causes code to be loaded
  * onto the workers. For example, the Cloud Dataflow Java SDK might use this
  * to install jars containing the user&#39;s code and all of the various
  * dependencies (libraries, data files, etc.) required in order for that code
  * to run.
  */
@js.native
trait SchemaPackage extends js.Object {
  /**
    * The resource to read the package from. The supported resource type is:
    * Google Cloud Storage:    storage.googleapis.com/{bucket}
    * bucket.storage.googleapis.com/
    */
  var location: js.UndefOr[String] = js.native
  /**
    * The name of the package.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaPackage {
  @scala.inline
  def apply(location: String = null, name: String = null): SchemaPackage = {
    val __obj = js.Dynamic.literal()
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPackage]
  }
}

