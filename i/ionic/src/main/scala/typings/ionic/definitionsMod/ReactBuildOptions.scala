package typings.ionic.definitionsMod

import typings.ionic.ionicStrings.react
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactBuildOptions extends BuildOptions[react] {
  var ci: js.UndefOr[Boolean] = js.native
  var inlineRuntimeChunk: js.UndefOr[Boolean] = js.native
  var publicUrl: js.UndefOr[String] = js.native
  var sourceMap: js.UndefOr[Boolean] = js.native
}

object ReactBuildOptions {
  @scala.inline
  def apply(`--`: js.Array[String], engine: String, `type`: react): ReactBuildOptions = {
    val __obj = js.Dynamic.literal(engine = engine.asInstanceOf[js.Any])
    __obj.updateDynamic("--")(`--`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactBuildOptions]
  }
  @scala.inline
  implicit class ReactBuildOptionsOps[Self <: ReactBuildOptions] (val x: Self) extends AnyVal {
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
    def setCi(value: Boolean): Self = this.set("ci", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCi: Self = this.set("ci", js.undefined)
    @scala.inline
    def setInlineRuntimeChunk(value: Boolean): Self = this.set("inlineRuntimeChunk", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInlineRuntimeChunk: Self = this.set("inlineRuntimeChunk", js.undefined)
    @scala.inline
    def setPublicUrl(value: String): Self = this.set("publicUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublicUrl: Self = this.set("publicUrl", js.undefined)
    @scala.inline
    def setSourceMap(value: Boolean): Self = this.set("sourceMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceMap: Self = this.set("sourceMap", js.undefined)
  }
  
}

