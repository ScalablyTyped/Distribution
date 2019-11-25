package typings.htmlDashWebpackDashPlugin.htmlDashWebpackDashPluginMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HtmlTagObject extends js.Object {
  /**
  	 * Attributes of the html tag
  	 * E.g. `{'disabled': true, 'value': 'demo'}`
  	 */
  var attributes: StringDictionary[String | Boolean]
  /**
  	 * Inner HTML The
  	 */
  var innerHTML: js.UndefOr[String] = js.undefined
  /**
  	 * The tag name e.g. `'div'`
  	 */
  var tagName: String
  /**
  	 * Wether this html must not contain innerHTML
  	 * @see https://www.w3.org/TR/html5/syntax.html#void-elements
  	 */
  var voidTag: Boolean
}

object HtmlTagObject {
  @scala.inline
  def apply(
    attributes: StringDictionary[String | Boolean],
    tagName: String,
    voidTag: Boolean,
    innerHTML: String = null
  ): HtmlTagObject = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any], voidTag = voidTag.asInstanceOf[js.Any])
    if (innerHTML != null) __obj.updateDynamic("innerHTML")(innerHTML.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlTagObject]
  }
}

