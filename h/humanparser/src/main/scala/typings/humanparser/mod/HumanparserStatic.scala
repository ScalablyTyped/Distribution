package typings.humanparser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HumanparserStatic extends js.Object {
  def getFullestName(name: String): FullerNameOutput = js.native
  def parseAddress(address: String): AddressOutput = js.native
  def parseName(name: String): NameOutput = js.native
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
  @scala.inline
  implicit class HumanparserStaticOps[Self <: HumanparserStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetFullestName(value: String => FullerNameOutput): Self = this.set("getFullestName", js.Any.fromFunction1(value))
    @scala.inline
    def setParseAddress(value: String => AddressOutput): Self = this.set("parseAddress", js.Any.fromFunction1(value))
    @scala.inline
    def setParseName(value: String => NameOutput): Self = this.set("parseName", js.Any.fromFunction1(value))
  }
  
}

