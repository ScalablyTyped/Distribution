package typings.jestDashCli.buildInitTypesMod

import typings.atJestTypes.buildConfigMod.InitialOptions
import typings.std.Partial
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectPackageJson extends js.Object {
  var jest: js.UndefOr[Partial[InitialOptions]] = js.undefined
  var scripts: js.UndefOr[Record[String, String]] = js.undefined
}

object ProjectPackageJson {
  @scala.inline
  def apply(jest: Partial[InitialOptions] = null, scripts: Record[String, String] = null): ProjectPackageJson = {
    val __obj = js.Dynamic.literal()
    if (jest != null) __obj.updateDynamic("jest")(jest.asInstanceOf[js.Any])
    if (scripts != null) __obj.updateDynamic("scripts")(scripts.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectPackageJson]
  }
}

