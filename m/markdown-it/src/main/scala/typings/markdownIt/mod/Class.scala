package typings.markdownIt.mod

import typings.markdownIt.libMod.MarkdownIt
import typings.markdownIt.libMod.Options
import typings.markdownIt.markdownItStrings.commonmark
import typings.markdownIt.markdownItStrings.default
import typings.markdownIt.markdownItStrings.zero
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

