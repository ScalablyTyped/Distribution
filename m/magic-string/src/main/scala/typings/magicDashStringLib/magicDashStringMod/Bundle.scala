package typings
package magicDashStringLib.magicDashStringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("magic-string", "Bundle")
@js.native
class Bundle () extends js.Object {
  def this(options: BundleOptions) = this()
  var indentExclusionRanges: ExclusionRange | js.Array[ExclusionRange] = js.native
  def addSource(source: magicDashStringLib.Anon_Filename): Bundle = js.native
  def addSource(source: MagicString): Bundle = js.native
  def append(str: java.lang.String): Bundle = js.native
  def append(str: java.lang.String, options: BundleOptions): Bundle = js.native
  def generateDecodedMap(): DecodedSourceMap = js.native
  def generateDecodedMap(options: stdLib.Partial[SourceMapOptions]): DecodedSourceMap = js.native
  def generateMap(): SourceMap = js.native
  def generateMap(options: stdLib.Partial[SourceMapOptions]): SourceMap = js.native
  def getIndentString(): java.lang.String = js.native
  def indent(): Bundle = js.native
  def indent(indentStr: java.lang.String): Bundle = js.native
  def isEmpty(): scala.Boolean = js.native
  def length(): scala.Double = js.native
  def prepend(str: java.lang.String): Bundle = js.native
  def trim(): Bundle = js.native
  def trim(charType: java.lang.String): Bundle = js.native
  def trimEnd(): Bundle = js.native
  def trimEnd(charType: java.lang.String): Bundle = js.native
  def trimLines(): Bundle = js.native
  def trimStart(): Bundle = js.native
  def trimStart(charType: java.lang.String): Bundle = js.native
}

