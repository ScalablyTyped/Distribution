package typings.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _URI extends js.Object {
  var extension: String
  var folder: String
  var name: String
  var path: String
  var `type`: String
  var uri: String
  def toURI(string: String): String
}

object _URI {
  @scala.inline
  def apply(
    extension: String,
    folder: String,
    name: String,
    path: String,
    toURI: String => String,
    `type`: String,
    uri: String
  ): _URI = {
    val __obj = js.Dynamic.literal(extension = extension.asInstanceOf[js.Any], folder = folder.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], toURI = js.Any.fromFunction1(toURI), uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_URI]
  }
}

