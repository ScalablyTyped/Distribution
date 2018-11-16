package typings
package markdownDashItLib.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarkdownItConstructor
  extends ScalablyTyped.runtime.Instantiable0[MarkdownIt]
     with ScalablyTyped.runtime.Instantiable1[
      markdownDashItLib.markdownDashItLibStrings.commonmark | markdownDashItLib.markdownDashItLibStrings.zero | markdownDashItLib.markdownDashItLibStrings.default | (/* options */ markdownDashItLib.libMod.MarkdownItNs.Options), 
      MarkdownIt
    ]
     with ScalablyTyped.runtime.Instantiable2[
      markdownDashItLib.markdownDashItLibStrings.commonmark | markdownDashItLib.markdownDashItLibStrings.zero | markdownDashItLib.markdownDashItLibStrings.default, 
      /* options */ markdownDashItLib.libMod.MarkdownItNs.Options, 
      MarkdownIt
    ] {
  def apply(): MarkdownIt = js.native
  def apply(options: markdownDashItLib.libMod.MarkdownItNs.Options): MarkdownIt = js.native
  def apply(presetName: markdownDashItLib.markdownDashItLibStrings.commonmark): MarkdownIt = js.native
  def apply(
    presetName: markdownDashItLib.markdownDashItLibStrings.commonmark,
    options: markdownDashItLib.libMod.MarkdownItNs.Options
  ): MarkdownIt = js.native
  def apply(presetName: markdownDashItLib.markdownDashItLibStrings.default): MarkdownIt = js.native
  def apply(
    presetName: markdownDashItLib.markdownDashItLibStrings.default,
    options: markdownDashItLib.libMod.MarkdownItNs.Options
  ): MarkdownIt = js.native
  def apply(presetName: markdownDashItLib.markdownDashItLibStrings.zero): MarkdownIt = js.native
  def apply(
    presetName: markdownDashItLib.markdownDashItLibStrings.zero,
    options: markdownDashItLib.libMod.MarkdownItNs.Options
  ): MarkdownIt = js.native
}

