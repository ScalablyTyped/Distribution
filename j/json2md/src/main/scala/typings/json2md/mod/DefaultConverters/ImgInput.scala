package typings.json2md.mod.DefaultConverters

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImgInput extends js.Object {
  var source: String
  var title: String
}

object ImgInput {
  @scala.inline
  def apply(source: String, title: String): ImgInput = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImgInput]
  }
}

