package typings.atJestEnvironment

import typings.atJestTypes.buildConfigMod.Path
import typings.std.Console
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Console extends js.Object {
  var console: Console
  var docblockPragmas: Record[String, String | js.Array[String]]
  var testPath: Path
}

object Anon_Console {
  @scala.inline
  def apply(console: Console, docblockPragmas: Record[String, String | js.Array[String]], testPath: Path): Anon_Console = {
    val __obj = js.Dynamic.literal(console = console, docblockPragmas = docblockPragmas, testPath = testPath)
  
    __obj.asInstanceOf[Anon_Console]
  }
}

