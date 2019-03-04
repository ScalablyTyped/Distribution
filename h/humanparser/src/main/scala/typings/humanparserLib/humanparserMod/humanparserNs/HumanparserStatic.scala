package typings
package humanparserLib.humanparserMod.humanparserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HumanparserStatic extends js.Object {
  def getFullestName(name: java.lang.String): FullerNameOutput
  def parseAddress(address: java.lang.String): AddressOutput
  def parseName(name: java.lang.String): NameOutput
}

object HumanparserStatic {
  @scala.inline
  def apply(
    getFullestName: js.Function1[java.lang.String, FullerNameOutput],
    parseAddress: js.Function1[java.lang.String, AddressOutput],
    parseName: js.Function1[java.lang.String, NameOutput]
  ): HumanparserStatic = {
    val __obj = js.Dynamic.literal(getFullestName = getFullestName, parseAddress = parseAddress, parseName = parseName)
  
    __obj.asInstanceOf[HumanparserStatic]
  }
}

