package typings.hapiAccept.mod.parseAll

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var charsets: js.Array[String]
  var encodings: js.Array[String]
  var languages: js.Array[String]
  var mediaTypes: js.Array[String]
}

object Result {
  @scala.inline
  def apply(
    charsets: js.Array[String],
    encodings: js.Array[String],
    languages: js.Array[String],
    mediaTypes: js.Array[String]
  ): Result = {
    val __obj = js.Dynamic.literal(charsets = charsets.asInstanceOf[js.Any], encodings = encodings.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any], mediaTypes = mediaTypes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Result]
  }
}

