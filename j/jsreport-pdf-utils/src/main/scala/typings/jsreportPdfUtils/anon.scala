package typings.jsreportPdfUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Contrent extends StObject {
    
    var contrent: String = js.native
    
    var encoding: String = js.native
    
    var password: String = js.native
  }
  object Contrent {
    
    @scala.inline
    def apply(contrent: String, encoding: String, password: String): Contrent = {
      val __obj = js.Dynamic.literal(contrent = contrent.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
      __obj.asInstanceOf[Contrent]
    }
    
    @scala.inline
    implicit class ContrentMutableBuilder[Self <: Contrent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContrent(value: String): Self = StObject.set(x, "contrent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    }
  }
}
