package typings
package lessLib.LessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderOutput extends js.Object {
  var css: java.lang.String
  var imports: js.Array[java.lang.String]
  var map: java.lang.String
}

object RenderOutput {
  @scala.inline
  def apply(css: java.lang.String, imports: js.Array[java.lang.String], map: java.lang.String): RenderOutput = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("css")(css)
    __obj.updateDynamic("imports")(imports)
    __obj.updateDynamic("map")(map)
    __obj.asInstanceOf[RenderOutput]
  }
}

