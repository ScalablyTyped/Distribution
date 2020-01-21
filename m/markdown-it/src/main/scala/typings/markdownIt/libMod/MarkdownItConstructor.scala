package typings.markdownIt.libMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.markdownIt.markdownItStrings.commonmark
import typings.markdownIt.markdownItStrings.default
import typings.markdownIt.markdownItStrings.zero
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarkdownItConstructor
  extends Instantiable0[MarkdownIt]
     with Instantiable1[commonmark | default | zero | (/* options */ Options), MarkdownIt]
     with Instantiable2[commonmark | default | zero, /* options */ Options, MarkdownIt] {
  def apply(): MarkdownIt = js.native
  def apply(options: Options): MarkdownIt = js.native
  def apply(presetName: commonmark): MarkdownIt = js.native
  def apply(presetName: commonmark, options: Options): MarkdownIt = js.native
  def apply(presetName: default): MarkdownIt = js.native
  def apply(presetName: default, options: Options): MarkdownIt = js.native
  def apply(presetName: zero): MarkdownIt = js.native
  def apply(presetName: zero, options: Options): MarkdownIt = js.native
}

