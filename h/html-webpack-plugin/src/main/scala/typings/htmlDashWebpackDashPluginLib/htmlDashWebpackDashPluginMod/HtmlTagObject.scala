package typings
package htmlDashWebpackDashPluginLib.htmlDashWebpackDashPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HtmlTagObject extends js.Object {
  /**
  	 * Attributes of the html tag
  	 * E.g. `{'disabled': true, 'value': 'demo'}`
  	 */
  var attributes: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Boolean]
  /**
  	 * Inner HTML The
  	 */
  var innerHTML: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * The tag name e.g. `'div'`
  	 */
  var tagName: java.lang.String
  /**
  	 * Wether this html must not contain innerHTML
  	 * @see https://www.w3.org/TR/html5/syntax.html#void-elements
  	 */
  var voidTag: scala.Boolean
}

object HtmlTagObject {
  @scala.inline
  def apply(
    attributes: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Boolean],
    tagName: java.lang.String,
    voidTag: scala.Boolean,
    innerHTML: java.lang.String = null
  ): HtmlTagObject = {
    val __obj = js.Dynamic.literal(attributes = attributes, tagName = tagName, voidTag = voidTag)
    if (innerHTML != null) __obj.updateDynamic("innerHTML")(innerHTML)
    __obj.asInstanceOf[HtmlTagObject]
  }
}

