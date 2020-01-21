package typings.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The currently supported Android devices.
  */
@js.native
trait SchemaAndroidDeviceCatalog extends js.Object {
  /**
    * The set of supported Android device models.
    */
  var models: js.UndefOr[js.Array[SchemaAndroidModel]] = js.native
  /**
    * The set of supported runtime configurations.
    */
  var runtimeConfiguration: js.UndefOr[SchemaAndroidRuntimeConfiguration] = js.native
  /**
    * The set of supported Android OS versions.
    */
  var versions: js.UndefOr[js.Array[SchemaAndroidVersion]] = js.native
}

object SchemaAndroidDeviceCatalog {
  @scala.inline
  def apply(
    models: js.Array[SchemaAndroidModel] = null,
    runtimeConfiguration: SchemaAndroidRuntimeConfiguration = null,
    versions: js.Array[SchemaAndroidVersion] = null
  ): SchemaAndroidDeviceCatalog = {
    val __obj = js.Dynamic.literal()
    if (models != null) __obj.updateDynamic("models")(models.asInstanceOf[js.Any])
    if (runtimeConfiguration != null) __obj.updateDynamic("runtimeConfiguration")(runtimeConfiguration.asInstanceOf[js.Any])
    if (versions != null) __obj.updateDynamic("versions")(versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAndroidDeviceCatalog]
  }
}

