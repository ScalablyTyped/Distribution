package typings.jsonminify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * minifies blocks of JSON-like content into valid JSON by removing all whitespace and comments.
    */
  @JSImport("jsonminify", JSImport.Namespace)
  @js.native
  def apply(json: String): String = js.native
  
  object global {
    
    @js.native
    trait JSON extends StObject {
      
      /**
        * minifies blocks of JSON-like content into valid JSON by removing all whitespace and comments.
        */
      def minify(json: String): String = js.native
    }
    object JSON {
      
      @scala.inline
      def apply(minify: String => String): JSON = {
        val __obj = js.Dynamic.literal(minify = js.Any.fromFunction1(minify))
        __obj.asInstanceOf[JSON]
      }
      
      @scala.inline
      implicit class JSONMutableBuilder[Self <: JSON] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMinify(value: String => String): Self = StObject.set(x, "minify", js.Any.fromFunction1(value))
      }
    }
  }
}
