package typings.jestTransform.typesMod

import typings.node.vmMod.Script
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransformResult extends js.Object {
  var mapCoverage: Boolean = js.native
  var script: Script = js.native
  var sourceMapPath: String | Null = js.native
}

object TransformResult {
  @scala.inline
  def apply(mapCoverage: Boolean, script: Script): TransformResult = {
    val __obj = js.Dynamic.literal(mapCoverage = mapCoverage.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformResult]
  }
  @scala.inline
  implicit class TransformResultOps[Self <: TransformResult] (val x: Self) extends AnyVal {
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
    def setMapCoverage(value: Boolean): Self = this.set("mapCoverage", value.asInstanceOf[js.Any])
    @scala.inline
    def setScript(value: Script): Self = this.set("script", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceMapPath(value: String): Self = this.set("sourceMapPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceMapPathNull: Self = this.set("sourceMapPath", null)
  }
  
}

