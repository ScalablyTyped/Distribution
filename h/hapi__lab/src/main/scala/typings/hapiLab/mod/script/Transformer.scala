package typings.hapiLab.mod.script

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transformer extends js.Object {
  val ext: String
  def transform(content: String, filename: String): String
}

object Transformer {
  @scala.inline
  def apply(ext: String, transform: (String, String) => String): Transformer = {
    val __obj = js.Dynamic.literal(ext = ext.asInstanceOf[js.Any], transform = js.Any.fromFunction2(transform))
    __obj.asInstanceOf[Transformer]
  }
}

