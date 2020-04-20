package typings.gun

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlias extends js.Object {
  var alias: String
  var auth: js.Any
  var epub: String
  var pub: String
}

object AnonAlias {
  @scala.inline
  def apply(alias: String, auth: js.Any, epub: String, pub: String): AnonAlias = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], auth = auth.asInstanceOf[js.Any], epub = epub.asInstanceOf[js.Any], pub = pub.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlias]
  }
}

