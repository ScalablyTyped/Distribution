package typings.loremDashIpsum.loremDashIpsumMod

import typings.loremDashIpsum.typesSrcLibGeneratorMod.IGeneratorOptions
import typings.loremDashIpsum.typesSrcLibLoremIpsumMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lorem-ipsum", "LoremIpsum")
@js.native
class LoremIpsum () extends default {
  def this(options: IGeneratorOptions) = this()
  def this(options: IGeneratorOptions, format: String) = this()
  def this(options: IGeneratorOptions, format: String, suffix: String) = this()
}

@JSImport("lorem-ipsum", "loremIpsum")
@js.native
object loremIpsum extends js.Object {
  def apply(): String = js.native
  def apply(
    hasCountFormatParagraphLowerBoundParagraphUpperBoundRandomSentenceLowerBoundSentenceUpperBoundUnitsWordsSuffix: ILoremIpsumParams
  ): String = js.native
}

