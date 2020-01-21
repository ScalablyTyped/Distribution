package typings.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The currently supported iOS devices.
  */
@js.native
trait SchemaIosDeviceCatalog extends js.Object {
  /**
    * The set of supported iOS device models.
    */
  var models: js.UndefOr[js.Array[SchemaIosModel]] = js.native
  /**
    * The set of supported runtime configurations.
    */
  var runtimeConfiguration: js.UndefOr[SchemaIosRuntimeConfiguration] = js.native
  /**
    * The set of supported iOS software versions.
    */
  var versions: js.UndefOr[js.Array[SchemaIosVersion]] = js.native
  /**
    * The set of supported Xcode versions.
    */
  var xcodeVersions: js.UndefOr[js.Array[SchemaXcodeVersion]] = js.native
}

object SchemaIosDeviceCatalog {
  @scala.inline
  def apply(
    models: js.Array[SchemaIosModel] = null,
    runtimeConfiguration: SchemaIosRuntimeConfiguration = null,
    versions: js.Array[SchemaIosVersion] = null,
    xcodeVersions: js.Array[SchemaXcodeVersion] = null
  ): SchemaIosDeviceCatalog = {
    val __obj = js.Dynamic.literal()
    if (models != null) __obj.updateDynamic("models")(models.asInstanceOf[js.Any])
    if (runtimeConfiguration != null) __obj.updateDynamic("runtimeConfiguration")(runtimeConfiguration.asInstanceOf[js.Any])
    if (versions != null) __obj.updateDynamic("versions")(versions.asInstanceOf[js.Any])
    if (xcodeVersions != null) __obj.updateDynamic("xcodeVersions")(xcodeVersions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaIosDeviceCatalog]
  }
}

