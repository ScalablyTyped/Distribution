package typings.jestConsole

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/console/build/NullConsole", JSImport.Namespace)
@js.native
object nullConsoleMod extends js.Object {
  @js.native
  trait NullConsole
    extends typings.jestConsole.customConsoleMod.default {
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

