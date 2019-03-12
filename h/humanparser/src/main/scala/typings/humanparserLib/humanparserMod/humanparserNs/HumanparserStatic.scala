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
    getFullestName: java.lang.String => FullerNameOutput,
    parseAddress: java.lang.String => AddressOutput,
    parseName: java.lang.String => NameOutput
  ): HumanparserStatic = {
    val __obj = js.Dynamic.literal(getFullestName = js.Any.fromFunction1(getFullestName), parseAddress = js.Any.fromFunction1(parseAddress), parseName = js.Any.fromFunction1(parseName))
  
    __obj.asInstanceOf[HumanparserStatic]
  }
}

