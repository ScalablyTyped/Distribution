package typings
package magicDashStringLib.magicDashStringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MagicString extends js.Object {
  var indentExclusionRanges: ExclusionRange | js.Array[ExclusionRange] = js.native
  var original: java.lang.String = js.native
  def addSourcemapLocation(char: scala.Double): scala.Unit = js.native
  def append(content: java.lang.String): MagicString = js.native
  def appendLeft(index: scala.Double, content: java.lang.String): MagicString = js.native
  def appendRight(index: scala.Double, content: java.lang.String): MagicString = js.native
  def generateDecodedMap(): DecodedSourceMap = js.native
  def generateDecodedMap(options: stdLib.Partial[SourceMapOptions]): DecodedSourceMap = js.native
  def generateMap(): SourceMap = js.native
  def generateMap(options: stdLib.Partial[SourceMapOptions]): SourceMap = js.native
  def getIndentString(): java.lang.String = js.native
  def indent(): MagicString = js.native
  def indent(indentStr: java.lang.String): MagicString = js.native
  def indent(indentStr: java.lang.String, options: IndentOptions): MagicString = js.native
  def indent(options: IndentOptions): MagicString = js.native
  def isEmpty(): scala.Boolean = js.native
  def lastChar(): java.lang.String = js.native
  def lastLine(): java.lang.String = js.native
  def length(): scala.Double = js.native
  def move(start: scala.Double, end: scala.Double, index: scala.Double): MagicString = js.native
  def overwrite(start: scala.Double, end: scala.Double, content: java.lang.String): MagicString = js.native
  def overwrite(start: scala.Double, end: scala.Double, content: java.lang.String, options: OverwriteOptions): MagicString = js.native
  def overwrite(start: scala.Double, end: scala.Double, content: java.lang.String, options: scala.Boolean): MagicString = js.native
  def prepend(content: java.lang.String): MagicString = js.native
  def prependLeft(index: scala.Double, content: java.lang.String): MagicString = js.native
  def prependRight(index: scala.Double, content: java.lang.String): MagicString = js.native
  def remove(start: scala.Double, end: scala.Double): MagicString = js.native
  def slice(start: scala.Double, end: scala.Double): java.lang.String = js.native
  def snip(start: scala.Double, end: scala.Double): MagicString = js.native
  def trim(): MagicString = js.native
  def trim(charType: java.lang.String): MagicString = js.native
  def trimEnd(): MagicString = js.native
  def trimEnd(charType: java.lang.String): MagicString = js.native
  def trimLines(): MagicString = js.native
  def trimStart(): MagicString = js.native
  def trimStart(charType: java.lang.String): MagicString = js.native
}

