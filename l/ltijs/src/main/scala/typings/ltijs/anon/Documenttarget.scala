package typings.ltijs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Documenttarget extends js.Object {
  var document_target: String
  var locale: String
  var return_url: String
}

object Documenttarget {
  @scala.inline
  def apply(document_target: String, locale: String, return_url: String): Documenttarget = {
    val __obj = js.Dynamic.literal(document_target = document_target.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], return_url = return_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Documenttarget]
  }
}

