package typings.guacamoleClient.anon

import typings.guacamoleClient.clientMod.Client.ExportLayer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined guacamole-client.guacamole-client/lib/Client.Client.ExportLayerBase & {  x :number,   y :number,   z :number,   alpha :number,   matrix :unknown,   parent :unknown} */
@js.native
trait ExportLayerBasexnumberynu extends ExportLayer {
  var alpha: Double = js.native
  var height: Double = js.native
  var matrix: js.Any = js.native
  var parent: js.Any = js.native
  var url: js.UndefOr[String] = js.native
  var width: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
  var z: Double = js.native
}

object ExportLayerBasexnumberynu {
  @scala.inline
  def apply(
    alpha: Double,
    height: Double,
    matrix: js.Any,
    parent: js.Any,
    width: Double,
    x: Double,
    y: Double,
    z: Double
  ): ExportLayerBasexnumberynu = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], matrix = matrix.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportLayerBasexnumberynu]
  }
  @scala.inline
  implicit class ExportLayerBasexnumberynuOps[Self <: ExportLayerBasexnumberynu] (val x: Self) extends AnyVal {
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
    def setAlpha(value: Double): Self = this.set("alpha", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setMatrix(value: js.Any): Self = this.set("matrix", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def setZ(value: Double): Self = this.set("z", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

