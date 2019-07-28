package typings.magicDashString

import typings.magicDashString.magicDashStringMod.MagicString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Content extends js.Object {
  var content: MagicString
  var filename: js.UndefOr[String] = js.undefined
}

object Anon_Content {
  @scala.inline
  def apply(content: MagicString, filename: String = null): Anon_Content = {
    val __obj = js.Dynamic.literal(content = content)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    __obj.asInstanceOf[Anon_Content]
  }
}

