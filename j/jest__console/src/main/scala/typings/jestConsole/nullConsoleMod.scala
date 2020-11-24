package typings.jestConsole

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jest/console/build/NullConsole", JSImport.Namespace)
@js.native
object nullConsoleMod extends js.Object {
  
  @js.native
  trait NullConsole
    extends typings.jestConsole.customConsoleMod.default {
    
    def assert(): Unit = js.native
    
    def debug(): Unit = js.native
    
    def error(): Unit = js.native
    
    def info(): Unit = js.native
    
    def log(): Unit = js.native
    
    def trace(): Unit = js.native
    
    def warn(): Unit = js.native
  }
  
  @js.native
  class default () extends NullConsole
}
