package typings.markdownDashIt.markdownDashItMod

import typings.markdownDashIt.libMod.MarkdownIt
import typings.markdownDashIt.libMod.Options
import typings.markdownDashIt.markdownDashItStrings.commonmark
import typings.markdownDashIt.markdownDashItStrings.default
import typings.markdownDashIt.markdownDashItStrings.zero
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("markdown-it", JSImport.Namespace)
@js.native
class Class () extends MarkdownIt {
  def this(options: Options) = this()
  def this(presetName: commonmark) = this()
  def this(presetName: default) = this()
  def this(presetName: zero) = this()
  def this(presetName: commonmark, options: Options) = this()
  def this(presetName: default, options: Options) = this()
  def this(presetName: zero, options: Options) = this()
}

