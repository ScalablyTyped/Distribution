package typings
package json2mdLib.json2mdMod.json2mdNs.DefaultConvertersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImgInput extends js.Object {
  var source: java.lang.String
  var title: java.lang.String
}

object ImgInput {
  @scala.inline
  def apply(source: java.lang.String, title: java.lang.String): ImgInput = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("source")(source)
    __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[ImgInput]
  }
}

