package typings.markdownIt.mod

import typings.markdownIt.libMod.MarkdownIt
import typings.markdownIt.libMod.Options
import typings.markdownIt.libMod.PresetName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("markdown-it", JSImport.Namespace)
@js.native
class Class () extends MarkdownIt {
  def this(options: Options) = this()
  def this(presetName: PresetName) = this()
  def this(presetName: PresetName, options: Options) = this()
}

