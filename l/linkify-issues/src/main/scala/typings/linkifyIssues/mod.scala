package typings.linkifyIssues

import org.scalablytyped.runtime.StringDictionary
import typings.linkifyIssues.linkifyIssuesStrings.dom
import typings.linkifyIssues.linkifyIssuesStrings.string
import typings.std.DocumentFragment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("linkify-issues", JSImport.Namespace)
  @js.native
  def apply(string: String): String = js.native
  @JSImport("linkify-issues", JSImport.Namespace)
  @js.native
  def apply(string: String, options: Options): String = js.native
  /**
  Linkify GitHub issue references.
  @param string - String with issue references to linkify.
  @example
  ```
  import linkifyIssues = require('linkify-issues');
  linkifyIssues('Fixes #143 and avajs/ava#1023', {
  	user: 'sindresorhus',
  	repository: 'dofle',
  	attributes: {
  		class: 'unicorn',
  		multiple: ['a', 'b'],
  		number: 1,
  		exclude: false,
  		include: true
  	}
  });
  //=> 'Fixes <a href="https://github.com/sindresorhus/dofle/issues/143" class="unicorn" multiple="a b" number="1" include>#143</a> and <a href="https://github.com/avajs/ava/issues/1023" class="unicorn" multiple="a b" number="1" include>avajs/ava#1023</a>'
  const fragment = linkifyUrls('See #143', {
  	user: 'sindresorhus',
  	repository: 'dofle',
  	type: 'dom',
  	attributes: {
  		class: 'unicorn',
  	}
  });
  document.body.appendChild(fragment);
  ```
  */
  @JSImport("linkify-issues", JSImport.Namespace)
  @js.native
  def apply(string: String, options: TypeDomOptions): DocumentFragment = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
    		HTML attributes to add to the link.
    		*/
    var attributes: js.UndefOr[StringDictionary[String | Double | Boolean | js.Array[String]]] = js.native
    
    /**
    		Base URL.
    		@default 'https://github.com'
    		*/
    var baseUrl: js.UndefOr[String] = js.native
    
    /**
    		GitHub repository.
    		*/
    var repository: String = js.native
    
    /**
    		Format of the generated content.
    		`'string'` will return it as a flat string like `'See <a href="https://github.com/sindresorhus/dofle/issue/143">#143</a>'`.
    		`'dom'` will return it as a `DocumentFragment` ready to be appended in a DOM safely, like `DocumentFragment(TextNode('See '), HTMLAnchorElement('#143'))`. This type only works in the browser.
    		@default 'string'
    		*/
    var `type`: js.UndefOr[string | dom] = js.native
    
    /**
    		GitHub user.
    		*/
    var user: String = js.native
  }
  object Options {
    
    @scala.inline
    def apply(repository: String, user: String): Options = {
      val __obj = js.Dynamic.literal(repository = repository.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: StringDictionary[String | Double | Boolean | js.Array[String]]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      @scala.inline
      def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      @scala.inline
      def setRepository(value: String): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: string | dom): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeDomOptions extends Options {
    
    @JSName("type")
    var type_TypeDomOptions: dom = js.native
  }
  object TypeDomOptions {
    
    @scala.inline
    def apply(repository: String, `type`: dom, user: String): TypeDomOptions = {
      val __obj = js.Dynamic.literal(repository = repository.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
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
