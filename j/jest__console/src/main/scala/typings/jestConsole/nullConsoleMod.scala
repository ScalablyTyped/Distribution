package typings.jestConsole

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/console/build/NullConsole", JSImport.Namespace)
@js.native
object nullConsoleMod extends js.Object {
  @js.native
  trait NullConsole
    extends typings.jestConsole.customConsoleMod.default
  
  @js.native
  class default () extends NullConsole
  
}

