package typings.hapiAddress.mod.ip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * The required CIDR mode.
    * 
    * @default 'optional'
    */
  val cidr: js.UndefOr[Cidr] = js.native
  /**
    * The allowed versions.
    * 
    * @default ['ipv4', 'ipv6', 'ipvfuture']
    */
  val version: js.UndefOr[Version | js.Array[Version]] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setCidr(value: Cidr): Self = this.set("cidr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCidr: Self = this.set("cidr", js.undefined)
    @scala.inline
    def setVersionVarargs(value: Version*): Self = this.set("version", js.Array(value :_*))
    @scala.inline
    def setVersion(value: Version | js.Array[Version]): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

