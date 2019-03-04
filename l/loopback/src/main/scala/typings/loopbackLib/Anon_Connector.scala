package typings
package loopbackLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Connector extends js.Object {
  var connector: js.Any
  var properties: js.UndefOr[js.Any] = js.undefined
}

object Anon_Connector {
  @scala.inline
  def apply(connector: js.Any, properties: js.Any = null): Anon_Connector = {
    val __obj = js.Dynamic.literal(connector = connector)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    __obj.asInstanceOf[Anon_Connector]
  }
}

