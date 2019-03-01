package typings
package inversifyLib.dtsInterfacesInterfacesMod.interfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metadata extends js.Object {
  var key: java.lang.String | scala.Double | js.Symbol
  var value: js.Any
}

object Metadata {
  @scala.inline
  def apply(key: java.lang.String | scala.Double | js.Symbol, value: js.Any): Metadata = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Metadata]
  }
}

