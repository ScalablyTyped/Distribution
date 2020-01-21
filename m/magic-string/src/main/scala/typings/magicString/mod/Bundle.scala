package typings.magicString.mod

import typings.magicString.AnonContent
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("magic-string", "Bundle")
@js.native
class Bundle () extends js.Object {
  def this(options: BundleOptions) = this()
  var indentExclusionRanges: ExclusionRange | js.Array[ExclusionRange] = js.native
  def addSource(source: AnonContent): Bundle = js.native
  def addSource(source: MagicString): Bundle = js.native
  def append(str: String): Bundle = js.native
  def append(str: String, options: BundleOptions): Bundle = js.native
  def generateDecodedMap(): DecodedSourceMap = js.native
  def generateDecodedMap(options: Partial[SourceMapOptions]): DecodedSourceMap = js.native
  def generateMap(): SourceMap = js.native
  def generateMap(options: Partial[SourceMapOptions]): SourceMap = js.native
  def getIndentString(): String = js.native
  def indent(): Bundle = js.native
  def indent(indentStr: String): Bundle = js.native
  def isEmpty(): Boolean = js.native
  def length(): Double = js.native
  def prepend(str: String): Bundle = js.native
  def trim(): Bundle = js.native
  def trim(charType: String): Bundle = js.native
  def trimEnd(): Bundle = js.native
  def trimEnd(charType: String): Bundle = js.native
  def trimLines(): Bundle = js.native
  def trimStart(): Bundle = js.native
  def trimStart(charType: String): Bundle = js.native
}

