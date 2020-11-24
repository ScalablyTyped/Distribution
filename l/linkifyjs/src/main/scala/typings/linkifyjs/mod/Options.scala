package typings.linkifyjs.mod

import typings.linkifyjs.anon.PartialRecordLinkEntityTy
import typings.linkifyjs.anon.PartialRecordLinkEntityTyEmail
import typings.linkifyjs.anon.PartialRecordLinkEntityTyHashtag
import typings.linkifyjs.anon.PartialRecordLinkEntityTyMention
import typings.linkifyjs.anon.PartialRecordLinkEntityTyUrl
import typings.linkifyjs.linkifyjsStrings.ftp
import typings.linkifyjs.linkifyjsStrings.ftps
import typings.linkifyjs.linkifyjsStrings.http
import typings.linkifyjs.linkifyjsStrings.https
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * Object of attributes to add to each new link. Note: the class and target
    * attributes have dedicated options.
    *
    * Also accepts a function that takes the unformatted href, the link type
    * (e.g., 'url', 'email', etc.) and returns the object.
    *
    * @default null
    */
  var attributes: js.UndefOr[
    (Record[String, String]) | (js.Function2[/* href */ String, /* type */ LinkEntityType, Record[String, String]]) | Null
  ] = js.native
  
  /**
    * class attribute to use for newly created links.
    *
    * Accepts a function that takes the unformatted href value and link type
    * (e.g., 'url', 'email', etc.) and returns the string.
    *
    * Accepts an object where each key is the link type and each value is the
    * string or function to use for that type.
    */
  var className: js.UndefOr[
    String | PartialRecordLinkEntityTy | (js.Function2[/* href */ String, /* type */ LinkEntityType, String])
  ] = js.native
  
  /**
    * Protocol that should be used in href attributes for URLs without a
    * protocol (e.g., github.com).
    *
    * @default 'http'
    */
  var defaultProtocol: js.UndefOr[http | https | ftp | ftps | String] = js.native
  
  /**
    * Format the text displayed by a linkified entity. e.g., truncate a long URL.
    *
    * Accepts an object where each key is the link type (e.g., 'url', 'email', etc.),
    * and each value is the formatting function to use for that type.
    *
    * @default null
    */
  var format: js.UndefOr[
    (js.Function2[/* value */ String, /* type */ LinkEntityType, String]) | PartialRecordLinkEntityTyEmail | Null
  ] = js.native
  
  /**
    * Similar to format, except the result of this function will be used as the
    * href attribute of the new link.
    *
    * This is useful when finding hashtags, where you don’t necessarily
    * want the default to be a link to a named anchor.
    *
    * Accepts an object where each key is the link type (e.g., 'url', 'email', etc.),
    * and each value is the formatting function to use for that type.
    *
    * @default null
    */
  var formatHref: js.UndefOr[
    (js.Function2[/* href */ String, /* type */ LinkEntityType, String]) | PartialRecordLinkEntityTyEmail | Null
  ] = js.native
  
  /**
    * If `true`, \n line breaks will automatically be converted to `<br>` tags.
    *
    * @default false
    */
  var nl2br: js.UndefOr[Boolean] = js.native
  
  /**
    * The tag name to use for each link.
    * For cases where you can’t use anchor tags.
    *
    * Accepts a function that takes the unformatted href,
    * the link type (e.g., 'url', 'email', etc.) and returns the tag name.
    *
    * Accepts an object where each key is the link type,
    * and each value is the tag name to use for that type.
    *
    * @default a
    */
  var tagName: js.UndefOr[
    String | (js.Function2[/* href */ String, /* type */ LinkEntityType, String]) | PartialRecordLinkEntityTyHashtag
  ] = js.native
  
  /**
    * target attribute for generated link.
    *
    * Accepts a function that takes the unformatted href,
    * the link type (e.g., 'url', 'email', etc.) and returns the target
    *
    * Accepts an object where each key is the link type,
    * and each value is the target to use for that type.
    *
    * @default { url: '_blank' }
    */
  var target: js.UndefOr[
    String | (js.Function2[/* href */ String, /* type */ LinkEntityType, String]) | PartialRecordLinkEntityTyMention
  ] = js.native
  
  /**
    * validate
    * - Type: Boolean | Function (String value, String type) | Object
    * - Default: null
    *
    * If option resolves to false, the given value will not show up as a link.
    *
    * Accepts a function that takes a discovered link,
    * and the link type (e.g., 'url', 'email', etc.),
    * and returns true if the link should be converted into an anchor tag,
    * and false otherwise.
    *
    * Accepts an object where each key is the link type and each value is the
    * the validation option to use for that type
    *
    * @default null
    */
  var validate: js.UndefOr[
    Boolean | (js.Function2[/* href */ String, /* type */ LinkEntityType, Boolean]) | PartialRecordLinkEntityTyUrl | Null
  ] = js.native
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
    def setAttributesFunction2(value: (/* href */ String, /* type */ LinkEntityType) => Record[String, String]): Self = this.set("attributes", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAttributes(
      value: (Record[String, String]) | (js.Function2[/* href */ String, /* type */ LinkEntityType, Record[String, String]])
    ): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    
    @scala.inline
    def setAttributesNull: Self = this.set("attributes", null)
    
    @scala.inline
    def setClassNameFunction2(value: (/* href */ String, /* type */ LinkEntityType) => String): Self = this.set("className", js.Any.fromFunction2(value))
    
    @scala.inline
    def setClassName(
      value: String | PartialRecordLinkEntityTy | (js.Function2[/* href */ String, /* type */ LinkEntityType, String])
    ): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setDefaultProtocol(value: http | https | ftp | ftps | String): Self = this.set("defaultProtocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultProtocol: Self = this.set("defaultProtocol", js.undefined)
    
    @scala.inline
    def setFormatFunction2(value: (/* value */ String, /* type */ LinkEntityType) => String): Self = this.set("format", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFormat(
      value: (js.Function2[/* value */ String, /* type */ LinkEntityType, String]) | PartialRecordLinkEntityTyEmail
    ): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setFormatNull: Self = this.set("format", null)
    
    @scala.inline
    def setFormatHrefFunction2(value: (/* href */ String, /* type */ LinkEntityType) => String): Self = this.set("formatHref", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFormatHref(
      value: (js.Function2[/* href */ String, /* type */ LinkEntityType, String]) | PartialRecordLinkEntityTyEmail
    ): Self = this.set("formatHref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatHref: Self = this.set("formatHref", js.undefined)
    
    @scala.inline
    def setFormatHrefNull: Self = this.set("formatHref", null)
    
    @scala.inline
    def setNl2br(value: Boolean): Self = this.set("nl2br", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNl2br: Self = this.set("nl2br", js.undefined)
    
    @scala.inline
    def setTagNameFunction2(value: (/* href */ String, /* type */ LinkEntityType) => String): Self = this.set("tagName", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTagName(
      value: String | (js.Function2[/* href */ String, /* type */ LinkEntityType, String]) | PartialRecordLinkEntityTyHashtag
    ): Self = this.set("tagName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagName: Self = this.set("tagName", js.undefined)
    
    @scala.inline
    def setTargetFunction2(value: (/* href */ String, /* type */ LinkEntityType) => String): Self = this.set("target", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTarget(
      value: String | (js.Function2[/* href */ String, /* type */ LinkEntityType, String]) | PartialRecordLinkEntityTyMention
    ): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setValidateFunction2(value: (/* href */ String, /* type */ LinkEntityType) => Boolean): Self = this.set("validate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setValidate(
      value: Boolean | (js.Function2[/* href */ String, /* type */ LinkEntityType, Boolean]) | PartialRecordLinkEntityTyUrl
    ): Self = this.set("validate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidate: Self = this.set("validate", js.undefined)
    
    @scala.inline
    def setValidateNull: Self = this.set("validate", null)
  }
}
