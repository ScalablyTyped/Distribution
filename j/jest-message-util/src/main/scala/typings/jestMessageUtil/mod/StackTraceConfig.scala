package typings.jestMessageUtil.mod

import typings.jestTypes.configMod.Glob
import typings.jestTypes.configMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@jest/types.@jest/types.Config.ProjectConfig, 'rootDir' | 'testMatch'> */
@js.native
trait StackTraceConfig extends js.Object {
  var rootDir: Path = js.native
  var testMatch: js.Array[Glob] = js.native
}

object StackTraceConfig {
  @scala.inline
  def apply(rootDir: Path, testMatch: js.Array[Glob]): StackTraceConfig = {
    val __obj = js.Dynamic.literal(rootDir = rootDir.asInstanceOf[js.Any], testMatch = testMatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackTraceConfig]
  }
  @scala.inline
  implicit class StackTraceConfigOps[Self <: StackTraceConfig] (val x: Self) extends AnyVal {
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
    def setRootDir(value: Path): Self = this.set("rootDir", value.asInstanceOf[js.Any])
    @scala.inline
    def setTestMatchVarargs(value: Glob*): Self = this.set("testMatch", js.Array(value :_*))
    @scala.inline
    def setTestMatch(value: js.Array[Glob]): Self = this.set("testMatch", value.asInstanceOf[js.Any])
  }
  
}

