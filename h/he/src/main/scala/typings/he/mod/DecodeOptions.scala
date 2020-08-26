package typings.he.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecodeOptions extends js.Object {
  /**
    * The default value for the isAttributeValue option is false. This means
    * that decode() will decode the string as if it were used in a text
    * context in an HTML document. HTML has different rules for parsing
    * character references in attribute values — set this option to true to
    * treat the input string as if it were used as an attribute value.
    */
  var isAttributeValue: js.UndefOr[Boolean] = js.native
  /**
    * The default value for the strict option is false. This means that
    * decode() will decode any HTML text content you feed it, even if it
    * contains any entities that cause parse errors. To throw an error when
    * such invalid HTML is encountered, set the strict option to true. This
    * option makes it possible to use he as part of HTML parsers and HTML
    * validators.
    */
  var strict: js.UndefOr[Boolean] = js.native
}

object DecodeOptions {
  @scala.inline
  def apply(): DecodeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DecodeOptions]
  }
  @scala.inline
  implicit class DecodeOptionsOps[Self <: DecodeOptions] (val x: Self) extends AnyVal {
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
    def setIsAttributeValue(value: Boolean): Self = this.set("isAttributeValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsAttributeValue: Self = this.set("isAttributeValue", js.undefined)
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
  }
  
}

