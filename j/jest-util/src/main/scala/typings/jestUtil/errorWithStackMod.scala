package typings.jestUtil

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorWithStackMod {
  
  @JSImport("jest-util/build/ErrorWithStack", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with Error {
    def this(message: String, callsite: js.Function) = this()
    def this(message: Unit, callsite: js.Function) = this()
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  type ErrorWithStack = Error
}
