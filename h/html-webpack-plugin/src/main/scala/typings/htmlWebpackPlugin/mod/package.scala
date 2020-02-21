package typings.htmlWebpackPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /** @deprecated use Options */
  type Config = typings.htmlWebpackPlugin.mod.Options
  /** @deprecated use MinifyOptions */
  type MinifyConfig = typings.htmlWebpackPlugin.mod.MinifyOptions
  type MinifyOptions = typings.htmlMinifier.mod.Options
  type TemplateFunction = js.Function1[/* param */ js.Object, java.lang.String]
}
