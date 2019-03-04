package typings
package magicDashStringLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Content extends js.Object {
  var content: magicDashStringLib.magicDashStringMod.MagicString
  var filename: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Content {
  @scala.inline
  def apply(content: magicDashStringLib.magicDashStringMod.MagicString, filename: java.lang.String = null): Anon_Content = {
    val __obj = js.Dynamic.literal(content = content)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    __obj.asInstanceOf[Anon_Content]
  }
}

