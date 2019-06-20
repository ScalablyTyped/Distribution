package typings
package linkifyDashUrlsLib.linkifyDashUrlsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		HTML attributes to add to the link.
  		*/
  val attributes: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | js.Array[java.lang.String]]
  ] = js.undefined
  /**
  		Format of the generated content.
  		`'string'` will return it as a flat string like `'Visit <a href="https://example.com">https://example.com</a>'`.
  		`'dom'` will return it as a `DocumentFragment` ready to be appended in a DOM safely, like `DocumentFragment(TextNode('Visit '), HTMLAnchorElement('https://example.com'))`. This type only works in the browser.
  		*/
  val `type`: js.UndefOr[
    linkifyDashUrlsLib.linkifyDashUrlsLibStrings.string | linkifyDashUrlsLib.linkifyDashUrlsLibStrings.dom
  ] = js.undefined
  /**
  		Set a custom HTML value for the link.
  		Default: The URL.
  		@example
  		```
  		linkifyUrls('See https://sindresorhus.com/foo', {
  			value: url => new URL(url).pathname
  		});
  		//=> 'See <a href="https://sindresorhus.com/foo">/foo</a>'
  		```
  		*/
  val value: js.UndefOr[java.lang.String | (js.Function1[/* url */ java.lang.String, java.lang.String])] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    attributes: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | js.Array[java.lang.String]] = null,
    `type`: linkifyDashUrlsLib.linkifyDashUrlsLibStrings.string | linkifyDashUrlsLib.linkifyDashUrlsLibStrings.dom = null,
    value: java.lang.String | (js.Function1[/* url */ java.lang.String, java.lang.String]) = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

