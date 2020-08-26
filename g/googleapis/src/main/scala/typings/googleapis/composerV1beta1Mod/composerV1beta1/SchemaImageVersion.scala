package typings.googleapis.composerV1beta1Mod.composerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Image Version information
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
  def apply(): SchemaImageVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImageVersion]
  }
  @scala.inline
  implicit class SchemaImageVersionOps[Self <: SchemaImageVersion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setImageVersionId(value: String): Self = this.set("imageVersionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageVersionId: Self = this.set("imageVersionId", js.undefined)
    @scala.inline
    def setIsDefault(value: Boolean): Self = this.set("isDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsDefault: Self = this.set("isDefault", js.undefined)
    @scala.inline
    def setSupportedPythonVersionsVarargs(value: String*): Self = this.set("supportedPythonVersions", js.Array(value :_*))
    @scala.inline
    def setSupportedPythonVersions(value: js.Array[String]): Self = this.set("supportedPythonVersions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportedPythonVersions: Self = this.set("supportedPythonVersions", js.undefined)
  }
  
}

