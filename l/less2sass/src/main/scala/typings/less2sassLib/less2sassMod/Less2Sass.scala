package typings
package less2sassLib.less2sassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Less2Sass extends js.Object {
  def convert(file: java.lang.String): java.lang.String
}

object Less2Sass {
  @scala.inline
  def apply(convert: js.Function1[java.lang.String, java.lang.String]): Less2Sass = {
    val __obj = js.Dynamic.literal(convert = convert)
  
    __obj.asInstanceOf[Less2Sass]
  }
}

