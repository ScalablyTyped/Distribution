package typings.lernaAlias.mod

import typings.lernaAlias.lernaAliasBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * From which directory the lerna monorepo should be searched for
    * @default `process.cwd()`
    */
  var directory: js.UndefOr[String] = js.undefined
  /**
    * Optional array of `mainFields` that should be used to resolve package's entry point,
    * similar to https://webpack.js.org/configuration/resolve/#resolve-mainfields .
    * Using this takes precedence over default `sourceDirectory` option.
    */
  var mainFields: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Which directory should be considered as containing source files of a package.
    * If specified as false it will use package's root.
    * @default 'src'
    */
  var sourceDirectory: js.UndefOr[String | `false`] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    directory: String = null,
    mainFields: js.Array[String] = null,
    sourceDirectory: String | `false` = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (directory != null) __obj.updateDynamic("directory")(directory.asInstanceOf[js.Any])
    if (mainFields != null) __obj.updateDynamic("mainFields")(mainFields.asInstanceOf[js.Any])
    if (sourceDirectory != null) __obj.updateDynamic("sourceDirectory")(sourceDirectory.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

