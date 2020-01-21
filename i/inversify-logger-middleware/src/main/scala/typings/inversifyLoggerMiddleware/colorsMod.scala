package typings.inversifyLoggerMiddleware

import typings.chalk.mod.Chalk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-logger-middleware/dts/serializers/text/colors", JSImport.Namespace)
@js.native
object colorsMod extends js.Object {
  val green: Chalk with AnonSupportsColor = js.native
  val red: Chalk with AnonSupportsColor = js.native
  val yellow: Chalk with AnonSupportsColor = js.native
  @js.native
  object Chalk extends js.Object {
    val default: typings.chalk.mod.Chalk with typings.chalk.AnonSupportsColor = js.native
  }
  
}

