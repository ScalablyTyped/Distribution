package typings
package linkifyjsLib.linkifyjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkifyOptions extends js.Object {
  /**
    * attributes
    * - Type: Object | Function (String href, String type)
    * - Default: null
    *
    * Object of attributes to add to each new link. Note: the class and target
    * attributes have dedicated options.
    *
    * Also accepts a function that takes the unformatted href, the link type
    * (e.g., 'url', 'email', etc.) and returns the object.
    */
  var attributes: js.UndefOr[
    PossiblyFuncOfHrefAndType[reactLib.reactMod.AnchorHTMLAttributes[stdLib.HTMLAnchorElement]] | scala.Null
  ] = js.undefined
  /**
    * className
    * - Type: String | Function (String href, String type) | Object
    * - Default: 'linkified' (may be removed in future releases)
    *
    * class attribute to use for newly created links.
    *
    * Accepts a function that takes the unformatted href value and link type
    * (e.g., 'url', 'email', etc.) and returns the string.
    *
    * Accepts an object where each key is the link type and each value is the
    * string or function to use for that type.
    */
  var className: js.UndefOr[PossiblyByType[PossiblyFuncOfHrefAndType[js.UndefOr[java.lang.String]]]] = js.undefined
  /**
    * defaultProtocol
    * - Type: String
    * - Default: 'http'
    * - Values: 'http', 'https', 'ftp', 'ftps', etc.
    *
    * Protocol that should be used in href attributes for URLs without a
    * protocol (e.g., github.com).
    */
  var defaultProtocol: js.UndefOr[java.lang.String] = js.undefined
  /**
    * events
    * - *element, jquery interfaces only*
    * - Type: Object | Function (String href, String type) | Object
    * - Default: null
    *
    * Add event listeners to newly created link elements. Takes a hash where
    * each key is an standard event name and the value is an event handler.
    *
    * Also accepts a function that takes the unformatted href and the link type
    * (e.g., 'url', 'email', etc.) and returns the hash.
    *
    * For React, specify events in the attributes option as standard React
    * events.
    *
    * See the React Event docs and the linkify-react event docs
    */
  var events: js.UndefOr[
    PossiblyFuncOfHrefAndType[org.scalablytyped.runtime.StringDictionary[EventHandler]] | scala.Null
  ] = js.undefined
  /**
    * format
    * - Type: Function (String value, String type) | Object
    * - Default: null
    *
    * Format the text displayed by a linkified entity. e.g., truncate a long
    * URL.
    *
    * Accepts an object where each key is the link type (e.g., 'url', 'email',
    * etc.) and each value is the formatting function to use for that type.
    *
    * NOTE: According to the linkifyjs implementation, `format` can be just a
    * string, but this is not mentioned in the docs, so we exclude it.
    */
  var format: js.UndefOr[
    PossiblyByType[
      js.Function2[/* value */ java.lang.String, /* type */ java.lang.String, java.lang.String]
    ]
  ] = js.undefined
  //
  /**
    * formatHref
    * - Type: Function (String href, String type) | Object
    * - Default: null
    *
    * Similar to format, except the result of this function will be used as the
    * href attribute of the new link.
    *
    * This is useful when finding hashtags, where you don’t necessarily want
    * the default to be a link to a named anchor.
    *
    * Accepts an object where each key is the link type (e.g., 'url', 'email',
    * etc.) and each value is the formatting function to use for that type.
    *
    * NOTE: According to the linkifyjs implementation, `formatHref` can be just
    * a string, but this is not mentioned in the docs, so we exclude it.
    */
  var formatHref: js.UndefOr[
    PossiblyByType[
      js.Function2[/* href */ java.lang.String, /* type */ java.lang.String, java.lang.String]
    ]
  ] = js.undefined
  /**
    * ignoreTags
    * - *element, html, and jquery interfaces only*
    * - Type: Array
    * - Default: []
    *
    * Prevent linkify from trying to parse links in the specified tags. This is
    * useful when running linkify on arbitrary HTML.
    */
  var ignoreTags: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * nl2br
    * - Type: Boolean
    * - Default: false
    *
    * If true, \n line breaks will automatically be converted to <br> tags.
    *
    */
  var nl2br: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * tagName
    * - Type: String | Function (String href, String type) | Object
    * - Default: a
    *
    * The tag name to use for each link. For cases where you can’t use anchor
    * tags.
    *
    * Accepts a function that takes the unformatted href, the link type (e.g.,
    * 'url', 'email', etc.) and returns the tag name.
    *
    * Accepts an object where each key is the link type and each value is the
    * tag name to use for that type.
    */
  var tagName: js.UndefOr[PossiblyByType[PossiblyFuncOfHrefAndType[java.lang.String]]] = js.undefined
  /**
    * target
    * - Type: String | Function (String href, String type) | Object
    * - Default: '_blank' for URLs, null for everything else
    *
    * target attribute for generated link.
    *
    * Accepts a function that takes the unformatted href, the link type (e.g.,
    * 'url', 'email', etc.) and returns the target
    *
    * Accepts an object where each key is the link type and each value is the
    * target to use for that type.
    */
  var target: js.UndefOr[
    PossiblyByType[PossiblyFuncOfHrefAndType[js.UndefOr[java.lang.String | scala.Null]]]
  ] = js.undefined
  /**
    * validate
    * - Type: Boolean | Function (String value, String type) | Object
    * - Default: null
    *
    * If option resolves to false, the given value will not show up as a link.
    *
    * Accepts a function that takes a discovered link and the link type (e.g.,
    * 'url', 'email', etc.) and returns true if the link should be converted
    * into an anchor tag, and false otherwise.
    *
    * Accepts an object where each key is the link type and each value is the
    * the validation option to use for that type
    */
  var validate: js.UndefOr[PossiblyByType[PossiblyFuncOfHrefAndType[scala.Boolean]]] = js.undefined
}

object LinkifyOptions {
  @scala.inline
  def apply(
    attributes: PossiblyFuncOfHrefAndType[reactLib.reactMod.AnchorHTMLAttributes[stdLib.HTMLAnchorElement]] = null,
    className: PossiblyByType[PossiblyFuncOfHrefAndType[js.UndefOr[java.lang.String]]] = null,
    defaultProtocol: java.lang.String = null,
    events: PossiblyFuncOfHrefAndType[org.scalablytyped.runtime.StringDictionary[EventHandler]] = null,
    format: PossiblyByType[
      js.Function2[/* value */ java.lang.String, /* type */ java.lang.String, java.lang.String]
    ] = null,
    formatHref: PossiblyByType[
      js.Function2[/* href */ java.lang.String, /* type */ java.lang.String, java.lang.String]
    ] = null,
    ignoreTags: js.Array[java.lang.String] = null,
    nl2br: js.UndefOr[scala.Boolean] = js.undefined,
    tagName: PossiblyByType[PossiblyFuncOfHrefAndType[java.lang.String]] = null,
    target: PossiblyByType[PossiblyFuncOfHrefAndType[js.UndefOr[java.lang.String | scala.Null]]] = null,
    validate: PossiblyByType[PossiblyFuncOfHrefAndType[scala.Boolean]] = null
  ): LinkifyOptions = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (defaultProtocol != null) __obj.updateDynamic("defaultProtocol")(defaultProtocol)
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (formatHref != null) __obj.updateDynamic("formatHref")(formatHref.asInstanceOf[js.Any])
    if (ignoreTags != null) __obj.updateDynamic("ignoreTags")(ignoreTags)
    if (!js.isUndefined(nl2br)) __obj.updateDynamic("nl2br")(nl2br)
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (validate != null) __obj.updateDynamic("validate")(validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkifyOptions]
  }
}

