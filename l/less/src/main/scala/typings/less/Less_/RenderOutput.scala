package typings.less.Less_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderOutput extends js.Object {
  var css: String
  var imports: js.Array[String]
  var map: String
}

object RenderOutput {
  @scala.inline
  def apply(css: String, imports: js.Array[String], map: String): RenderOutput = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], imports = imports.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderOutput]
  }
}

