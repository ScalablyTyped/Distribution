package typings.karmaJsonPreprocessor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Default global variable name is by default `__json__`,
  * but you can override it with your own name in karma configuration:
  */
@js.native
trait JsonPreprocessorOptions extends js.Object {
  /**
    * @default ''
    */
  var stripPrefix: js.UndefOr[String] = js.native
  /**
    * @default '__json__'
    */
  var varName: js.UndefOr[String] = js.native
}

object JsonPreprocessorOptions {
  @scala.inline
  def apply(): JsonPreprocessorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsonPreprocessorOptions]
  }
  @scala.inline
  implicit class JsonPreprocessorOptionsOps[Self <: JsonPreprocessorOptions] (val x: Self) extends AnyVal {
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
    def setStripPrefix(value: String): Self = this.set("stripPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStripPrefix: Self = this.set("stripPrefix", js.undefined)
    @scala.inline
    def setVarName(value: String): Self = this.set("varName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVarName: Self = this.set("varName", js.undefined)
  }
  
}

