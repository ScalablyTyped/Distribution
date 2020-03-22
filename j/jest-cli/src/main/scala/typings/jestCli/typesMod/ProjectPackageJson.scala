package typings.jestCli.typesMod

import typings.jestCli.PartialInitialOptions
import typings.jestCli.jestCliStrings.commonjs
import typings.jestCli.jestCliStrings.module
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectPackageJson extends js.Object {
  var jest: js.UndefOr[PartialInitialOptions] = js.undefined
  var scripts: js.UndefOr[Record[String, String]] = js.undefined
  var `type`: js.UndefOr[commonjs | module] = js.undefined
}

object ProjectPackageJson {
  @scala.inline
  def apply(
    jest: PartialInitialOptions = null,
    scripts: Record[String, String] = null,
    `type`: commonjs | module = null
  ): ProjectPackageJson = {
    val __obj = js.Dynamic.literal()
    if (jest != null) __obj.updateDynamic("jest")(jest.asInstanceOf[js.Any])
    if (scripts != null) __obj.updateDynamic("scripts")(scripts.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectPackageJson]
  }
}

