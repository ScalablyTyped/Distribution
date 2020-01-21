package typings.halfred.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Link Object represents a hyperlink from the containing resource to a URI.
  *
  * @see https://tools.ietf.org/html/draft-kelly-json-hal-08#section-5
  */
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
  var deprecation: js.UndefOr[String] = js.undefined
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
  var href: String
  /**
    * The "hreflang" property is OPTIONAL.
    *
    * Its value is a string and is intended for indicating the language of
    * the target resource (as defined by [RFC5988]).
    *
    * @see https://tools.ietf.org/html/draft-kelly-json-hal-08#section-5.8
    */
  var hreflang: js.UndefOr[String] = js.undefined
  /**
    * The "name" property is OPTIONAL.
    *
    * Its value MAY be used as a secondary key for selecting Link Objects
    * which share the same relation type.
    *
    * @see https://tools.ietf.org/html/draft-kelly-json-hal-08#section-5.5
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The "profile" property is OPTIONAL.
    *
    * Its value is a string which is a URI that hints about the profile (as
    * defined by [I-D.wilde-profile-link]) of the target resource.
    *
    * @see https://tools.ietf.org/html/draft-kelly-json-hal-08#section-5.6
    */
  var profile: js.UndefOr[String] = js.undefined
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
  var templated: js.UndefOr[Boolean] = js.undefined
  /**
    * The "title" property is OPTIONAL.
    *
    * Its value is a string and is intended for labelling the link with a
    * human-readable identifier (as defined by [RFC5988]).
    *
    * @see https://tools.ietf.org/html/draft-kelly-json-hal-08#section-5.7
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * The "type" property is OPTIONAL.
    *
    * Its value is a string used as a hint to indicate the media type
    * expected when dereferencing the target resource.
    *
    * @see https://tools.ietf.org/html/draft-kelly-json-hal-08#section-5.3
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object Link {
  @scala.inline
  def apply(
    href: String,
    deprecation: String = null,
    hreflang: String = null,
    name: String = null,
    profile: String = null,
    templated: js.UndefOr[Boolean] = js.undefined,
    title: String = null,
    `type`: String = null
  ): Link = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    if (deprecation != null) __obj.updateDynamic("deprecation")(deprecation.asInstanceOf[js.Any])
    if (hreflang != null) __obj.updateDynamic("hreflang")(hreflang.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (profile != null) __obj.updateDynamic("profile")(profile.asInstanceOf[js.Any])
    if (!js.isUndefined(templated)) __obj.updateDynamic("templated")(templated.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Link]
  }
}

