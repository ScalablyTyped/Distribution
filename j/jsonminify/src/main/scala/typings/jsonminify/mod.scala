package typings.jsonminify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * minifies blocks of JSON-like content into valid JSON by removing all whitespace and comments.
    */
  inline def apply(json: String): String = ^.asInstanceOf[js.Dynamic].apply(json.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("jsonminify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object global {
    
    trait JSON extends StObject {
      
      /**
        * minifies blocks of JSON-like content into valid JSON by removing all whitespace and comments.
        */
      def minify(json: String): String
    }
    object JSON {
      
      inline def apply(minify: String => String): JSON = {
        val __obj = js.Dynamic.literal(minify = js.Any.fromFunction1(minify))
        __obj.asInstanceOf[JSON]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: JSON] (val x: Self) extends AnyVal {
        
        inline def setMinify(value: String => String): Self = StObject.set(x, "minify", js.Any.fromFunction1(value))
      }
    }
  }
}
