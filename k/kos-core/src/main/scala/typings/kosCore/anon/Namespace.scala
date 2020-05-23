package typings.kosCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Namespace extends js.Object {
  var namespace: String | Null
  var `type`: String
}

object Namespace {
  @scala.inline
  def apply(`type`: String, namespace: String = null): Namespace = {
    val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Namespace]
  }
}

