package typings.kosDashCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Namespace extends js.Object {
  var namespace: String | Null
  var `type`: String
}

object Anon_Namespace {
  @scala.inline
  def apply(`type`: String, namespace: String = null): Anon_Namespace = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Namespace]
  }
}

