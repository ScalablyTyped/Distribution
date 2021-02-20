package typings.linkifyUrls

import org.scalablytyped.runtime.StringDictionary
import typings.linkifyUrls.linkifyUrlsStrings.dom
import typings.linkifyUrls.linkifyUrlsStrings.string
import typings.std.DocumentFragment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("linkify-urls", JSImport.Namespace)
  @js.native
  def apply(string: String): String = js.native
  @JSImport("linkify-urls", JSImport.Namespace)
  @js.native
  def apply(string: String, options: Options): String = js.native
  /**
  Linkify URLs in a string.
  @param string - String with URLs to linkify.
  @example
  ```
  import linkifyUrls = require('linkify-urls');
  linkifyUrls('See https://sindresorhus.com', {
  	attributes: {
  		class: 'unicorn',
  		one: 1,
  		foo: true,
  		multiple: ['a', 'b']
  	}
  });
  //=> 'See <a href="https://sindresorhus.com" class="unicorn" one="1" foo multiple="a b">https://sindresorhus.com</a>'
  // In the browser
  const fragment = linkifyUrls('See https://sindresorhus.com', {
  	type: 'dom',
  	attributes: {
  		class: 'unicorn',
  	}
  });
  document.body.appendChild(fragment);
  ```
  */
  @JSImport("linkify-urls", JSImport.Namespace)
  @js.native
  def apply(string: String, options: TypeDomOptions): DocumentFragment = js.native
  
  @js.native
  trait Options extends StObject {
    
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
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: StringDictionary[String | Double | Boolean | js.Array[String]]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      @scala.inline
      def setType(value: string | dom): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValue(value: String | (js.Function1[/* url */ String, String])): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueFunction1(value: /* url */ String => String): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait TypeDomOptions extends Options {
    
    @JSName("type")
    val type_TypeDomOptions: dom = js.native
  }
  object TypeDomOptions {
    
    @scala.inline
    def apply(`type`: dom): TypeDomOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeDomOptions]
    }
    
    @scala.inline
    implicit class TypeDomOptionsMutableBuilder[Self <: TypeDomOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: dom): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
