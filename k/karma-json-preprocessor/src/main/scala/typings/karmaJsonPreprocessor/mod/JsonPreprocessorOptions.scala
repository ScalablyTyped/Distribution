package typings.karmaJsonPreprocessor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Default global variable name is by default `__json__`,
  * but you can override it with your own name in karma configuration:
  */
trait JsonPreprocessorOptions extends js.Object {
  /**
    * @default ''
    */
  var stripPrefix: js.UndefOr[String] = js.undefined
  /**
    * @default '__json__'
    */
  var varName: js.UndefOr[String] = js.undefined
}

object JsonPreprocessorOptions {
  @scala.inline
  def apply(stripPrefix: String = null, varName: String = null): JsonPreprocessorOptions = {
    val __obj = js.Dynamic.literal()
    if (stripPrefix != null) __obj.updateDynamic("stripPrefix")(stripPrefix.asInstanceOf[js.Any])
    if (varName != null) __obj.updateDynamic("varName")(varName.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonPreprocessorOptions]
  }
}

