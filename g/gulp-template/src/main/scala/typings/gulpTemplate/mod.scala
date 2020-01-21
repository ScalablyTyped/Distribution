package typings.gulpTemplate

import typings.lodash.mod.TemplateOptions
import typings.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gulp-template", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(data: js.Any, options: TemplateOptions): Transform = js.native
  def precompile(options: TemplateOptions): Transform = js.native
}

