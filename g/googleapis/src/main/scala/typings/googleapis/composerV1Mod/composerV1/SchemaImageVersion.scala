package typings.googleapis.composerV1Mod.composerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ImageVersion information
  */
@js.native
trait SchemaImageVersion extends js.Object {
  /**
    * The string identifier of the ImageVersion, in the form:
    * &quot;composer-x.y.z-airflow-a.b(.c)&quot;
    */
  var imageVersionId: js.UndefOr[String] = js.native
  /**
    * Whether this is the default ImageVersion used by Composer during
    * environment creation if no input ImageVersion is specified.
    */
  var isDefault: js.UndefOr[Boolean] = js.native
  /**
    * supported python versions
    */
  var supportedPythonVersions: js.UndefOr[js.Array[String]] = js.native
}

object SchemaImageVersion {
  @scala.inline
  def apply(
    imageVersionId: String = null,
    isDefault: js.UndefOr[Boolean] = js.undefined,
    supportedPythonVersions: js.Array[String] = null
  ): SchemaImageVersion = {
    val __obj = js.Dynamic.literal()
    if (imageVersionId != null) __obj.updateDynamic("imageVersionId")(imageVersionId.asInstanceOf[js.Any])
    if (!js.isUndefined(isDefault)) __obj.updateDynamic("isDefault")(isDefault.get.asInstanceOf[js.Any])
    if (supportedPythonVersions != null) __obj.updateDynamic("supportedPythonVersions")(supportedPythonVersions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaImageVersion]
  }
}

