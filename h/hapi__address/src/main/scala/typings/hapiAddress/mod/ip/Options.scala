package typings.hapiAddress.mod.ip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * The required CIDR mode.
    * 
    * @default 'optional'
    */
  val cidr: js.UndefOr[Cidr] = js.undefined
  /**
    * The allowed versions.
    * 
    * @default ['ipv4', 'ipv6', 'ipvfuture']
    */
  val version: js.UndefOr[Version | js.Array[Version]] = js.undefined
}

object Options {
  @scala.inline
  def apply(cidr: Cidr = null, version: Version | js.Array[Version] = null): Options = {
    val __obj = js.Dynamic.literal()
    if (cidr != null) __obj.updateDynamic("cidr")(cidr.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

