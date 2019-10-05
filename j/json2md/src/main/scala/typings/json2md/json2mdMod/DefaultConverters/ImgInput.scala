package typings.json2md.json2mdMod.DefaultConverters

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
    val __obj = js.Dynamic.literal(source = source, title = title)
  
    __obj.asInstanceOf[ImgInput]
  }
}

