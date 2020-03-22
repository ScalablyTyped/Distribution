package typings.jestEnvironment.mod

import typings.jestTypes.configMod.Path
import typings.std.Console_
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  console  :std.Console,   docblockPragmas  :std.Record<string, string | std.Array<string>>,   testPath  :@jest/types.@jest/types.Config.Path}> */
trait EnvironmentContext extends js.Object {
  var console: js.UndefOr[Console_] = js.undefined
  var docblockPragmas: js.UndefOr[Record[String, String | js.Array[String]]] = js.undefined
  var testPath: js.UndefOr[Path] = js.undefined
}

object EnvironmentContext {
  @scala.inline
  def apply(
    console: Console_ = null,
    docblockPragmas: Record[String, String | js.Array[String]] = null,
    testPath: Path = null
  ): EnvironmentContext = {
    val __obj = js.Dynamic.literal()
    if (console != null) __obj.updateDynamic("console")(console.asInstanceOf[js.Any])
    if (docblockPragmas != null) __obj.updateDynamic("docblockPragmas")(docblockPragmas.asInstanceOf[js.Any])
    if (testPath != null) __obj.updateDynamic("testPath")(testPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentContext]
  }
}

