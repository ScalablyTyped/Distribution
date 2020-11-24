package typings.linkifyUrls.mod

import org.scalablytyped.runtime.StringDictionary
import typings.linkifyUrls.linkifyUrlsStrings.dom
import typings.linkifyUrls.linkifyUrlsStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
  		HTML attributes to add to the link.
  		*/
  val attributes: js.UndefOr[StringDictionary[String | Double | Boolean | js.Array[String]]] = js.native
  
  /**
  		Format of the generated content.
  		`'string'` will return it as a flat string like `'Visit <a href="https://example.com">https://example.com</a>'`.
  		`'dom'` will return it as a `DocumentFragment` ready to be appended in a DOM safely, like `DocumentFragment(TextNode('Visit '), HTMLAnchorElement('https://example.com'))`. This type only works in the browser.
  		*/
  val `type`: js.UndefOr[string | dom] = js.native
  
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
  val value: js.UndefOr[String | (js.Function1[/* url */ String, String])] = js.native
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
    def setAttributes(value: StringDictionary[String | Double | Boolean | js.Array[String]]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    
    @scala.inline
    def setType(value: string | dom): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setValueFunction1(value: /* url */ String => String): Self = this.set("value", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValue(value: String | (js.Function1[/* url */ String, String])): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
