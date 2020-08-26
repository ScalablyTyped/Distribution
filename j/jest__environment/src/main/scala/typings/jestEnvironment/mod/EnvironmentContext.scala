package typings.jestEnvironment.mod

import typings.jestTypes.configMod.Path
import typings.std.Console
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  console :std.Console,   docblockPragmas :std.Record<string, string | std.Array<string>>,   testPath :@jest/types.@jest/types.Config.Path}> */
@js.native
trait EnvironmentContext extends js.Object {
  var console: js.UndefOr[Console] = js.native
  var docblockPragmas: js.UndefOr[Record[String, String | js.Array[String]]] = js.native
  var testPath: js.UndefOr[Path] = js.native
}

object EnvironmentContext {
  @scala.inline
  def apply(): EnvironmentContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvironmentContext]
  }
  @scala.inline
  implicit class EnvironmentContextOps[Self <: EnvironmentContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConsole(value: Console): Self = this.set("console", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConsole: Self = this.set("console", js.undefined)
    @scala.inline
    def setDocblockPragmas(value: Record[String, String | js.Array[String]]): Self = this.set("docblockPragmas", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocblockPragmas: Self = this.set("docblockPragmas", js.undefined)
    @scala.inline
    def setTestPath(value: Path): Self = this.set("testPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTestPath: Self = this.set("testPath", js.undefined)
  }
  
}

