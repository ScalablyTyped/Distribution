package typings
package kosDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Namespace extends js.Object {
  var namespace: java.lang.String | scala.Null
  var `type`: java.lang.String
}

object Anon_Namespace {
  @scala.inline
  def apply(`type`: java.lang.String, namespace: java.lang.String = null): Anon_Namespace = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (namespace != null) __obj.updateDynamic("namespace")(namespace)
    __obj.asInstanceOf[Anon_Namespace]
  }
}

