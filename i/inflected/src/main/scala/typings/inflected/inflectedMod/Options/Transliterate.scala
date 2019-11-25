package typings.inflected.inflectedMod.Options

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transliterate extends js.Object {
  var locale: String
  var replacement: String
}

object Transliterate {
  @scala.inline
  def apply(locale: String, replacement: String): Transliterate = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], replacement = replacement.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Transliterate]
  }
}

