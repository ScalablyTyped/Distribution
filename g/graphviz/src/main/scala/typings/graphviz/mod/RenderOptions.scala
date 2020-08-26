package typings.graphviz.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderOptions extends js.Object {
  /**
    * edge options
    */
  var E: js.UndefOr[Options] = js.native
  /**
    * graph options
    */
  var G: js.UndefOr[Options] = js.native
  /**
    * node options
    */
  var N: js.UndefOr[Options] = js.native
  /**
    * Graphviz path
    * @default $PATH
    */
  var path: js.UndefOr[String] = js.native
  /**
    * graphviz output file type
    */
  var `type`: RenderType = js.native
  /**
    * Graphviz command to use
    * @default dot
    */
  var use: js.UndefOr[RenderEngine] = js.native
}

object RenderOptions {
  @scala.inline
  def apply(`type`: RenderType): RenderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderOptions]
  }
  @scala.inline
  implicit class RenderOptionsOps[Self <: RenderOptions] (val x: Self) extends AnyVal {
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
    def setType(value: RenderType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setE(value: Options): Self = this.set("E", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteE: Self = this.set("E", js.undefined)
    @scala.inline
    def setG(value: Options): Self = this.set("G", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteG: Self = this.set("G", js.undefined)
    @scala.inline
    def setN(value: Options): Self = this.set("N", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteN: Self = this.set("N", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setUse(value: RenderEngine): Self = this.set("use", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUse: Self = this.set("use", js.undefined)
  }
  
}

