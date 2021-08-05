package typings.jqueryNextId

import typings.jqueryNextId.anon.Prefix
import typings.jqueryNextId.mod.global.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  trait JQueryNextId extends StObject {
    
    def apply(): JQuery = js.native
    def apply(prefix: String): JQuery = js.native
    
    var defaults: Prefix = js.native
  }
  
  object global {
    
    trait JQuery extends StObject {
      
      def nextId(): JQuery
      def nextId(prefix: String): JQuery
      @JSName("nextId")
      var nextId_Original: JQueryNextId
    }
    object JQuery {
      
      inline def apply(nextId: JQueryNextId): JQuery = {
        val __obj = js.Dynamic.literal(nextId = nextId.asInstanceOf[js.Any])
        __obj.asInstanceOf[JQuery]
      }
      
      extension [Self <: JQuery](x: Self) {
        
        inline def setNextId(value: JQueryNextId): Self = StObject.set(x, "nextId", value.asInstanceOf[js.Any])
      }
    }
  }
}
