package typings.jestEnvironment

import typings.jestTypes.configMod.Path
import typings.std.Console_
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConsole extends js.Object {
  var console: Console_
  var docblockPragmas: Record[String, String | js.Array[String]]
  var testPath: Path
}

object AnonConsole {
  @scala.inline
  def apply(console: Console_, docblockPragmas: Record[String, String | js.Array[String]], testPath: Path): AnonConsole = {
    val __obj = js.Dynamic.literal(console = console.asInstanceOf[js.Any], docblockPragmas = docblockPragmas.asInstanceOf[js.Any], testPath = testPath.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonConsole]
  }
}

