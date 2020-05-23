package typings.jestMessageUtil.anon

import typings.jestTypes.configMod.Glob
import typings.jestTypes.configMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@jest/types.@jest/types.Config.ProjectConfig, 'rootDir' | 'testMatch'> */
trait PickProjectConfigrootDirt extends js.Object {
  var rootDir: Path
  var testMatch: js.Array[Glob]
}

object PickProjectConfigrootDirt {
  @scala.inline
  def apply(rootDir: Path, testMatch: js.Array[Glob]): PickProjectConfigrootDirt = {
    val __obj = js.Dynamic.literal(rootDir = rootDir.asInstanceOf[js.Any], testMatch = testMatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickProjectConfigrootDirt]
  }
}

