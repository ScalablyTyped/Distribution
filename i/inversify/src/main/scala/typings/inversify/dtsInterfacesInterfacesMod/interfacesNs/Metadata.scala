package typings.inversify.dtsInterfacesInterfacesMod.interfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metadata extends js.Object {
  var key: String | Double | js.Symbol
  var value: js.Any
}

object Metadata {
  @scala.inline
  def apply(key: String | Double | js.Symbol, value: js.Any): Metadata = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value)
  
    __obj.asInstanceOf[Metadata]
  }
}

