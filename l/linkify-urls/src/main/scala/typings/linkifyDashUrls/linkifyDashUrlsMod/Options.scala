package typings.linkifyDashUrls.linkifyDashUrlsMod

import org.scalablytyped.runtime.StringDictionary
import typings.linkifyDashUrls.linkifyDashUrlsStrings.dom
import typings.linkifyDashUrls.linkifyDashUrlsStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		HTML attributes to add to the link.
  		*/
  val attributes: js.UndefOr[StringDictionary[String | Double | Boolean | js.Array[String]]] = js.undefined
  /**
  		Format of the generated content.
  		`'string'` will return it as a flat string like `'Visit <a href="https://example.com">https://example.com</a>'`.
  		`'dom'` will return it as a `DocumentFragment` ready to be appended in a DOM safely, like `DocumentFragment(TextNode('Visit '), HTMLAnchorElement('https://example.com'))`. This type only works in the browser.
  		*/
  val `type`: js.UndefOr[string | dom] = js.undefined
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
  val value: js.UndefOr[String | (js.Function1[/* url */ String, String])] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    attributes: StringDictionary[String | Double | Boolean | js.Array[String]] = null,
    `type`: string | dom = null,
    value: String | (js.Function1[/* url */ String, String]) = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

