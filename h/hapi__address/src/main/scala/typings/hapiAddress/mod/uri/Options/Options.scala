package typings.hapiAddress.mod.uri.Options

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends Query {
  /**
    * Allow relative URIs.
    * 
    * @default false
    */
  val allowRelative: js.UndefOr[Boolean] = js.native
  /**
    * Capture domain segment ($1).
    * 
    * @default false
    */
  val domain: js.UndefOr[Boolean] = js.native
  /**
    * The allowed URI schemes.
    */
  val scheme: js.UndefOr[Scheme | js.Array[Scheme]] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: typings.hapiAddress.mod.uri.Options.Options] (val x: Self) extends AnyVal {
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
    def setAllowRelative(value: Boolean): Self = this.set("allowRelative", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowRelative: Self = this.set("allowRelative", js.undefined)
    @scala.inline
    def setDomain(value: Boolean): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    @scala.inline
    def setSchemeVarargs(value: Scheme*): Self = this.set("scheme", js.Array(value :_*))
    @scala.inline
    def setScheme(value: Scheme | js.Array[Scheme]): Self = this.set("scheme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScheme: Self = this.set("scheme", js.undefined)
  }
  
}

