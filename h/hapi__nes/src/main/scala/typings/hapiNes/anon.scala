package typings.hapiNes

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.hapiNes.clientMod.Client
import typings.hapiNes.clientMod.Client.ClientOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Code extends StObject {
    
    var code: Double = js.native
    
    var explanation: String = js.native
    
    var reason: String = js.native
    
    var wasClean: Boolean = js.native
  }
  object Code {
    
    @scala.inline
    def apply(code: Double, explanation: String, reason: String, wasClean: Boolean): Code = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], explanation = explanation.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], wasClean = wasClean.asInstanceOf[js.Any])
      __obj.asInstanceOf[Code]
    }
    
    @scala.inline
    implicit class CodeMutableBuilder[Self <: Code] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExplanation(value: String): Self = StObject.set(x, "explanation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWasClean(value: Boolean): Self = StObject.set(x, "wasClean", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Instantiable
    extends Instantiable1[/* url */ String, Client]
       with Instantiable2[/* url */ String, /* options */ ClientOptions, Client]
}
