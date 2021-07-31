package typings.jqueryNextId

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Prefix extends StObject {
    
    var prefix: String
    
    var separator: String
  }
  object Prefix {
    
    @scala.inline
    def apply(prefix: String, separator: String): Prefix = {
      val __obj = js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any], separator = separator.asInstanceOf[js.Any])
      __obj.asInstanceOf[Prefix]
    }
    
    @scala.inline
    implicit class PrefixMutableBuilder[Self <: Prefix] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    }
  }
}
