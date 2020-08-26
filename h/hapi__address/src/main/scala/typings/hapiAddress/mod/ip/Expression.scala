package typings.hapiAddress.mod.ip

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Expression extends js.Object {
  /**
    * The CIDR mode.
    */
  var cidr: Cidr = js.native
  /**
    * The raw regular expression string.
    */
  var raw: String = js.native
  /**
    * The regular expression.
    */
  var regex: RegExp = js.native
  /**
    * The array of versions allowed.
    */
  var versions: js.Array[Version] = js.native
}

object Expression {
  @scala.inline
  def apply(cidr: Cidr, raw: String, regex: RegExp, versions: js.Array[Version]): Expression = {
    val __obj = js.Dynamic.literal(cidr = cidr.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], regex = regex.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  implicit class ExpressionOps[Self <: Expression] (val x: Self) extends AnyVal {
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
    def setRaw(value: String): Self = this.set("raw", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegex(value: RegExp): Self = this.set("regex", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersionsVarargs(value: Version*): Self = this.set("versions", js.Array(value :_*))
    @scala.inline
    def setVersions(value: js.Array[Version]): Self = this.set("versions", value.asInstanceOf[js.Any])
  }
  
}

