package typings.jqueryNextId

import typings.jqueryNextId.anon.Prefix
import typings.jqueryNextId.mod.global.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  trait JQueryNextId extends StObject {
    
    def apply(): JQuery = js.native
    def apply(prefix: String): JQuery = js.native
    
    var defaults: Prefix = js.native
  }
  
  object global {
    
    @js.native
    trait JQuery extends StObject {
      
      def nextId(): JQuery = js.native
      def nextId(prefix: String): JQuery = js.native
      @JSName("nextId")
      var nextId_Original: JQueryNextId = js.native
    }
  }
}
