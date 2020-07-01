package typings.marked.mod.Tokens

import typings.marked.markedStrings.heading
import typings.marked.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Heading extends Token {
  var depth: Double
  var raw: String
  var text: String
  var `type`: heading
}

object Heading {
  @scala.inline
  def apply(depth: Double, raw: String, text: String, `type`: heading): Heading = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Heading]
  }
}

