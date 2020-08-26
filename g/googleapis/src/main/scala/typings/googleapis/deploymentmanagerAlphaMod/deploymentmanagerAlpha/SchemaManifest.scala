package typings.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaManifest extends js.Object {
  /**
    * Output only. The YAML configuration for this manifest.
    */
  var config: js.UndefOr[SchemaConfigFile] = js.native
  /**
    * Output only. The fully-expanded configuration file, including any
    * templates and references.
    */
  var expandedConfig: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  /**
    * Output only. The imported files for this manifest.
    */
  var imports: js.UndefOr[js.Array[SchemaImportFile]] = js.native
  /**
    * Output only. Creation timestamp in RFC3339 text format.
    */
  var insertTime: js.UndefOr[String] = js.native
  /**
    * Output only. The YAML layout for this manifest.
    */
  var layout: js.UndefOr[String] = js.native
  /**
    * Output only.  The name of the manifest.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Output only. Self link for the manifest.
    */
  var selfLink: js.UndefOr[String] = js.native
}

object SchemaManifest {
  @scala.inline
  def apply(): SchemaManifest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManifest]
  }
  @scala.inline
  implicit class SchemaManifestOps[Self <: SchemaManifest] (val x: Self) extends AnyVal {
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
    def setConfig(value: SchemaConfigFile): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    @scala.inline
    def setExpandedConfig(value: String): Self = this.set("expandedConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandedConfig: Self = this.set("expandedConfig", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setImportsVarargs(value: SchemaImportFile*): Self = this.set("imports", js.Array(value :_*))
    @scala.inline
    def setImports(value: js.Array[SchemaImportFile]): Self = this.set("imports", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImports: Self = this.set("imports", js.undefined)
    @scala.inline
    def setInsertTime(value: String): Self = this.set("insertTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsertTime: Self = this.set("insertTime", js.undefined)
    @scala.inline
    def setLayout(value: String): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
  }
  
}

