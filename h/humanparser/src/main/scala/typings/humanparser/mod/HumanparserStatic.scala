package typings.humanparser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HumanparserStatic extends js.Object {
  def getFullestName(name: String): FullerNameOutput
  def parseAddress(address: String): AddressOutput
  def parseName(name: String): NameOutput
}

object HumanparserStatic {
  @scala.inline
  def apply(
    getFullestName: String => FullerNameOutput,
    parseAddress: String => AddressOutput,
    parseName: String => NameOutput
  ): HumanparserStatic = {
    val __obj = js.Dynamic.literal(getFullestName = js.Any.fromFunction1(getFullestName), parseAddress = js.Any.fromFunction1(parseAddress), parseName = js.Any.fromFunction1(parseName))
  
    __obj.asInstanceOf[HumanparserStatic]
  }
}

