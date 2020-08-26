package typings.jointjs.mod.dia.Paper

import org.scalablytyped.runtime.StringDictionary
import typings.jointjs.jointjsStrings.dot
import typings.jointjs.jointjsStrings.doubleMesh
import typings.jointjs.jointjsStrings.fixedDot
import typings.jointjs.jointjsStrings.mesh
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridOptions extends js.Object {
  var args: js.UndefOr[js.Array[StringDictionary[_]] | StringDictionary[js.Any]] = js.native
  var color: js.UndefOr[String] = js.native
  var name: js.UndefOr[dot | fixedDot | mesh | doubleMesh] = js.native
  var thickness: js.UndefOr[Double] = js.native
}

object GridOptions {
  @scala.inline
  def apply(): GridOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridOptions]
  }
  @scala.inline
  implicit class GridOptionsOps[Self <: GridOptions] (val x: Self) extends AnyVal {
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
    def setArgsVarargs(value: StringDictionary[js.Any]*): Self = this.set("args", js.Array(value :_*))
    @scala.inline
    def setArgs(value: js.Array[StringDictionary[_]] | StringDictionary[js.Any]): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setName(value: dot | fixedDot | mesh | doubleMesh): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setThickness(value: Double): Self = this.set("thickness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThickness: Self = this.set("thickness", js.undefined)
  }
  
}

