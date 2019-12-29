package typings.markdownDashIt.libMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.markdownDashIt.markdownDashItStrings.commonmark
import typings.markdownDashIt.markdownDashItStrings.default
import typings.markdownDashIt.markdownDashItStrings.zero
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarkdownItConstructor
  extends Instantiable0[MarkdownIt]
     with Instantiable1[commonmark | zero | default | (/* options */ Options), MarkdownIt]
     with Instantiable2[commonmark | zero | default, /* options */ Options, MarkdownIt] {
  def apply(): MarkdownIt = js.native
  def apply(options: Options): MarkdownIt = js.native
  def apply(presetName: commonmark): MarkdownIt = js.native
  def apply(presetName: commonmark, options: Options): MarkdownIt = js.native
  def apply(presetName: default): MarkdownIt = js.native
  def apply(presetName: default, options: Options): MarkdownIt = js.native
  def apply(presetName: zero): MarkdownIt = js.native
  def apply(presetName: zero, options: Options): MarkdownIt = js.native
}

