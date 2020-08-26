package typings.joi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmailOptions extends js.Object {
  /**
    * Numerical threshold at which an email address is considered invalid
    */
  var errorLevel: js.UndefOr[Double | Boolean] = js.native
  /**
    * Number of atoms required for the domain. Be careful since some domains, such as io, directly allow email.
    */
  var minDomainAtoms: js.UndefOr[Double] = js.native
  /**
    * Specifies a list of acceptable TLDs.
    */
  var tldWhitelist: js.UndefOr[js.Array[String] | js.Object] = js.native
}

object EmailOptions {
  @scala.inline
  def apply(): EmailOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmailOptions]
  }
  @scala.inline
  implicit class EmailOptionsOps[Self <: EmailOptions] (val x: Self) extends AnyVal {
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
    def setErrorLevel(value: Double | Boolean): Self = this.set("errorLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorLevel: Self = this.set("errorLevel", js.undefined)
    @scala.inline
    def setMinDomainAtoms(value: Double): Self = this.set("minDomainAtoms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinDomainAtoms: Self = this.set("minDomainAtoms", js.undefined)
    @scala.inline
    def setTldWhitelistVarargs(value: String*): Self = this.set("tldWhitelist", js.Array(value :_*))
    @scala.inline
    def setTldWhitelist(value: js.Array[String] | js.Object): Self = this.set("tldWhitelist", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTldWhitelist: Self = this.set("tldWhitelist", js.undefined)
  }
  
}

