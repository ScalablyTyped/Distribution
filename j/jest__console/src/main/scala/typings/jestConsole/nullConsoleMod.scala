package typings.jestConsole

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nullConsoleMod {
  
  @JSImport("@jest/console/build/NullConsole", JSImport.Default)
  @js.native
  class default () extends NullConsole
  
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
}
