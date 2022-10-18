package typings.linkifyIssues

import typings.linkifyIssues.linkifyIssuesStrings.dom
import typings.linkifyIssues.linkifyIssuesStrings.string
import typings.stringifyAttributes.mod.HTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("linkify-issues", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(string.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def default(string: String, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(string.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait Options extends StObject {
    
    /**
    	HTML attributes to add to the link.
    	*/
    val attributes: js.UndefOr[HTMLAttributes] = js.undefined
    
    /**
    	The base URL.
    	@default 'https://github.com'
    	*/
    val baseUrl: js.UndefOr[String] = js.undefined
    
    /**
    	GitHub repository.
    	*/
    val repository: String
    
    /**
    	The format of the generated content.
    	`'string'` will return it as a flat string like `'See <a href="https://github.com/sindresorhus/dofle/issue/143">#143</a>'`.
    	`'dom'` will return it as a `DocumentFragment` ready to be appended in a DOM safely, like `DocumentFragment(TextNode('See '), HTMLAnchorElement('#143'))`. This type only works in the browser.
    	@default 'string'
    	*/
    val `type`: js.UndefOr[string | dom] = js.undefined
    
    /**
    	GitHub user.
    	*/
    val user: String
  }
  object Options {
    
    inline def apply(repository: String, user: String): Options = {
      val __obj = js.Dynamic.literal(repository = repository.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAttributes(value: HTMLAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      inline def setRepository(value: String): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
      
      inline def setType(value: string | dom): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypeDomOptions
    extends StObject
       with Options {
    
    @JSName("type")
    val type_TypeDomOptions: dom
  }
  object TypeDomOptions {
    
    inline def apply(repository: String, user: String): TypeDomOptions = {
      val __obj = js.Dynamic.literal(repository = repository.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("dom")
      __obj.asInstanceOf[TypeDomOptions]
    }
    
    extension [Self <: TypeDomOptions](x: Self) {
      
      inline def setType(value: dom): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
