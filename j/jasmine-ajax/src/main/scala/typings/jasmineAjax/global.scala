package typings.jasmineAjax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("MockAjax")
  @js.native
  open class MockAjax protected ()
    extends StObject
       with typings.jasmineAjax.MockAjax {
    def this(globals: Any) = this()
  }
  
  object jasmine {
    
    @JSGlobal("jasmine.Ajax")
    @js.native
    val Ajax: typings.jasmineAjax.MockAjax = js.native
  }
}
