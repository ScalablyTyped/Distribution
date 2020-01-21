package typings.magicString.mod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MagicString extends js.Object {
  var indentExclusionRanges: ExclusionRange | js.Array[ExclusionRange] = js.native
  var original: String = js.native
  def addSourcemapLocation(char: Double): Unit = js.native
  def append(content: String): MagicString = js.native
  def appendLeft(index: Double, content: String): MagicString = js.native
  def appendRight(index: Double, content: String): MagicString = js.native
  def generateDecodedMap(): DecodedSourceMap = js.native
  def generateDecodedMap(options: Partial[SourceMapOptions]): DecodedSourceMap = js.native
  def generateMap(): SourceMap = js.native
  def generateMap(options: Partial[SourceMapOptions]): SourceMap = js.native
  def getIndentString(): String = js.native
  def indent(): MagicString = js.native
  def indent(indentStr: String): MagicString = js.native
  def indent(indentStr: String, options: IndentOptions): MagicString = js.native
  def indent(options: IndentOptions): MagicString = js.native
  def isEmpty(): Boolean = js.native
  def lastChar(): String = js.native
  def lastLine(): String = js.native
  def length(): Double = js.native
  def move(start: Double, end: Double, index: Double): MagicString = js.native
  def overwrite(start: Double, end: Double, content: String): MagicString = js.native
  def overwrite(start: Double, end: Double, content: String, options: Boolean): MagicString = js.native
  def overwrite(start: Double, end: Double, content: String, options: OverwriteOptions): MagicString = js.native
  def prepend(content: String): MagicString = js.native
  def prependLeft(index: Double, content: String): MagicString = js.native
  def prependRight(index: Double, content: String): MagicString = js.native
  def remove(start: Double, end: Double): MagicString = js.native
  def slice(start: Double, end: Double): String = js.native
  def snip(start: Double, end: Double): MagicString = js.native
  def trim(): MagicString = js.native
  def trim(charType: String): MagicString = js.native
  def trimEnd(): MagicString = js.native
  def trimEnd(charType: String): MagicString = js.native
  def trimLines(): MagicString = js.native
  def trimStart(): MagicString = js.native
  def trimStart(charType: String): MagicString = js.native
}

