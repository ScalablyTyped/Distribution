package typings.lernaAlias.mod

import typings.lernaAlias.lernaAliasBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * From which directory the lerna monorepo should be searched for
    * @default `process.cwd()`
    */
  var directory: js.UndefOr[String] = js.native
  /**
    * Optional array of `mainFields` that should be used to resolve package's entry point,
    * similar to https://webpack.js.org/configuration/resolve/#resolve-mainfields .
    * Using this takes precedence over default `sourceDirectory` option.
    */
  var mainFields: js.UndefOr[js.Array[String]] = js.native
  /**
    * Which directory should be considered as containing source files of a package.
    * If specified as false it will use package's root.
    * @default 'src'
    */
  var sourceDirectory: js.UndefOr[String | `false`] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setDirectory(value: String): Self = this.set("directory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectory: Self = this.set("directory", js.undefined)
    @scala.inline
    def setMainFieldsVarargs(value: String*): Self = this.set("mainFields", js.Array(value :_*))
    @scala.inline
    def setMainFields(value: js.Array[String]): Self = this.set("mainFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMainFields: Self = this.set("mainFields", js.undefined)
    @scala.inline
    def setSourceDirectory(value: String | `false`): Self = this.set("sourceDirectory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceDirectory: Self = this.set("sourceDirectory", js.undefined)
  }
  
}

