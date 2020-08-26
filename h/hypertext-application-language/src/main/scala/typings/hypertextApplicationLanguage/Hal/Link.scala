package typings.hypertextApplicationLanguage.Hal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describe a HAL Link object
  *
  * https://tools.ietf.org/html/draft-kelly-json-hal-06#section-5
  */
@js.native
trait Link extends js.Object {
  var deprecation: js.UndefOr[String] = js.native
  var href: String = js.native
  var hreflang: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var profile: js.UndefOr[String] = js.native
  var templated: js.UndefOr[Boolean] = js.native
  var title: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object Link {
  @scala.inline
  def apply(href: String): Link = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    __obj.asInstanceOf[Link]
  }
  @scala.inline
  implicit class LinkOps[Self <: Link] (val x: Self) extends AnyVal {
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
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeprecation(value: String): Self = this.set("deprecation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeprecation: Self = this.set("deprecation", js.undefined)
    @scala.inline
    def setHreflang(value: String): Self = this.set("hreflang", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHreflang: Self = this.set("hreflang", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setProfile(value: String): Self = this.set("profile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfile: Self = this.set("profile", js.undefined)
    @scala.inline
    def setTemplated(value: Boolean): Self = this.set("templated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplated: Self = this.set("templated", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

