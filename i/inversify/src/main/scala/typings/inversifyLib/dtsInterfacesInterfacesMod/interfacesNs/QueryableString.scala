package typings
package inversifyLib.dtsInterfacesInterfacesMod.interfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryableString extends js.Object {
  def contains(searchString: java.lang.String): scala.Boolean
  def endsWith(searchString: java.lang.String): scala.Boolean
  def equals(compareString: java.lang.String): scala.Boolean
  def startsWith(searchString: java.lang.String): scala.Boolean
  def value(): java.lang.String
}

object QueryableString {
  @scala.inline
  def apply(
    contains: js.Function1[java.lang.String, scala.Boolean],
    endsWith: js.Function1[java.lang.String, scala.Boolean],
    equals: js.Function1[java.lang.String, scala.Boolean],
    startsWith: js.Function1[java.lang.String, scala.Boolean],
    value: js.Function0[java.lang.String]
  ): QueryableString = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("contains")(contains)
    __obj.updateDynamic("endsWith")(endsWith)
    __obj.updateDynamic("equals")(equals)
    __obj.updateDynamic("startsWith")(startsWith)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[QueryableString]
  }
}

