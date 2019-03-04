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
    val __obj = js.Dynamic.literal(css = css, imports = imports, map = map)
  
    __obj.asInstanceOf[RenderOutput]
  }
}

