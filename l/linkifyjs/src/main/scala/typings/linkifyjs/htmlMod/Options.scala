package typings.linkifyjs.htmlMod

import typings.linkifyjs.PartialGlobalEventHandler
import typings.linkifyjs.PartialRecordLinkEntityTy
import typings.linkifyjs.PartialRecordLinkEntityTyEmail
import typings.linkifyjs.PartialRecordLinkEntityTyHashtag
import typings.linkifyjs.PartialRecordLinkEntityTyMention
import typings.linkifyjs.linkifyjsStrings.ftp
import typings.linkifyjs.linkifyjsStrings.ftps
import typings.linkifyjs.linkifyjsStrings.http
import typings.linkifyjs.linkifyjsStrings.https
import typings.linkifyjs.mod.LinkEntityType
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends typings.linkifyjs.mod.Options {
  /**
    * Add event listeners to newly created link elements.
    * Takes a hash where each key is an standard event name and the value is an event handler.
    *
    * Also accepts a function that takes the unformatted href and the link type (e.g., 'url', 'email', etc.) and returns the hash.
    *
    * @default null
    */
  var events: js.UndefOr[
    PartialGlobalEventHandler | (js.Function2[/* href */ String, /* type */ LinkEntityType, PartialGlobalEventHandler])
  ] = js.undefined
  /**
    *  Prevent linkify from trying to parse links in the specified tags.
    *
    *  This is useful when running linkify on arbitrary HTML.
    *
    *  @default []
    */
  var ignoreTags: js.UndefOr[js.Array[String]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    attributes: (Record[String, String]) | (js.Function2[/* href */ String, /* type */ LinkEntityType, Record[String, String]]) = null,
    className: String | PartialRecordLinkEntityTy | (js.Function2[/* href */ String, /* type */ LinkEntityType, String]) = null,
    defaultProtocol: http | https | ftp | ftps | String = null,
    events: PartialGlobalEventHandler | (js.Function2[/* href */ String, /* type */ LinkEntityType, PartialGlobalEventHandler]) = null,
    format: (js.Function2[/* value */ String, /* type */ LinkEntityType, String]) | PartialRecordLinkEntityTyEmail = null,
    formatHref: (js.Function2[/* href */ String, /* type */ LinkEntityType, String]) | PartialRecordLinkEntityTyEmail = null,
    ignoreTags: js.Array[String] = null,
    nl2br: js.UndefOr[Boolean] = js.undefined,
    tagName: String | (js.Function2[/* href */ String, /* type */ LinkEntityType, String]) | PartialRecordLinkEntityTyHashtag = null,
    target: String | (js.Function2[/* href */ String, /* type */ LinkEntityType, String]) | PartialRecordLinkEntityTyHashtag = null,
    validate: Boolean | (js.Function2[/* href */ String, /* type */ LinkEntityType, Boolean]) | PartialRecordLinkEntityTyMention = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (defaultProtocol != null) __obj.updateDynamic("defaultProtocol")(defaultProtocol.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (formatHref != null) __obj.updateDynamic("formatHref")(formatHref.asInstanceOf[js.Any])
    if (ignoreTags != null) __obj.updateDynamic("ignoreTags")(ignoreTags.asInstanceOf[js.Any])
    if (!js.isUndefined(nl2br)) __obj.updateDynamic("nl2br")(nl2br.asInstanceOf[js.Any])
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (validate != null) __obj.updateDynamic("validate")(validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

