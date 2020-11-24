package typings.halfred.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Link Object represents a hyperlink from the containing resource to a URI.
  *
  * @see https://tools.ietf.org/html/draft-kelly-json-hal-08#section-5
  */
@js.native
trait Link extends js.Object {
  
  /**
    * The "deprecation" property is OPTIONAL.
    * 
    * Its presence indicates that the link is to be deprecated (i.e.
    * removed) at a future date.  Its value is a URL that SHOULD provide
    * further information about the deprecation.
    *
    * A client SHOULD provide some notification (for example, by logging a
    * warning message) whenever it traverses over a link that has this
    * property.  The notification SHOULD include the deprecation property's
    * value so that a client manitainer can easily find information about
    * the deprecation.
    *
    * @see https://tools.ietf.org/html/draft-kelly-json-hal-08#section-5.4
    */
  var deprecation: js.UndefOr[String] = js.native
  
  /**
    * The "href" property is REQUIRED.
    *
    * Its value is either a URI [RFC3986] or a URI Template [RFC6570].
    *
    * If the value is a URI Template then the Link Object SHOULD have a
    * "templated" attribute whose value is true.
    *
    * @see https://tools.ietf.org/html/draft-kelly-json-hal-08#section-5.1
    */
  var href: String = js.native
  
  /**
    * The "hreflang" property is OPTIONAL.
    *
    * Its value is a string and is intended for indicating the language of
    * the target resource (as defined by [RFC5988]).
    *
    * @see https://tools.ietf.org/html/draft-kelly-json-hal-08#section-5.8
    */
  var hreflang: js.UndefOr[String] = js.native
  
  /**
    * The "name" property is OPTIONAL.
    *
    * Its value MAY be used as a secondary key for selecting Link Objects
    * which share the same relation type.
    *
    * @see https://tools.ietf.org/html/draft-kelly-json-hal-08#section-5.5
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The "profile" property is OPTIONAL.
    *
    * Its value is a string which is a URI that hints about the profile (as
    * defined by [I-D.wilde-profile-link]) of the target resource.
    *
    * @see https://tools.ietf.org/html/draft-kelly-json-hal-08#section-5.6
    */
  var profile: js.UndefOr[String] = js.native
  
  /**
    * The "templated" property is OPTIONAL.
    *
    * Its value is boolean and SHOULD be true when the Link Object's "href"
    * property is a URI Template.
    *
    * Its value SHOULD be considered false if it is undefined or any other
    * value than true.
    *
    * @see https://tools.ietf.org/html/draft-kelly-json-hal-08#section-5.2
    */
  var templated: js.UndefOr[Boolean] = js.native
  
  /**
    * The "title" property is OPTIONAL.
    *
    * Its value is a string and is intended for labelling the link with a
    * human-readable identifier (as defined by [RFC5988]).
    *
    * @see https://tools.ietf.org/html/draft-kelly-json-hal-08#section-5.7
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * The "type" property is OPTIONAL.
    *
    * Its value is a string used as a hint to indicate the media type
    * expected when dereferencing the target resource.
    *
    * @see https://tools.ietf.org/html/draft-kelly-json-hal-08#section-5.3
    */
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
