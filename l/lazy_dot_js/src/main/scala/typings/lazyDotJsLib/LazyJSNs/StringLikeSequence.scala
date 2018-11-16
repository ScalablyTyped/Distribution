package typings
package lazyDotJsLib.LazyJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StringLikeSequence
  extends SequenceBaser[java.lang.String] {
  def charAt(index: scala.Double): java.lang.String = js.native
  def charCodeAt(index: scala.Double): scala.Double = js.native
  def endsWith(suffix: java.lang.String): scala.Boolean = js.native
  def first(): java.lang.String = js.native
  def first(count: scala.Double): StringLikeSequence = js.native
  def indexOf(substring: java.lang.String): scala.Double = js.native
  def indexOf(substring: java.lang.String, startIndex: scala.Double): scala.Double = js.native
  def last(): java.lang.String = js.native
  def last(count: scala.Double): StringLikeSequence = js.native
  def lastIndexOf(substring: java.lang.String): scala.Double = js.native
  def lastIndexOf(substring: java.lang.String, startIndex: scala.Double): scala.Double = js.native
  def mapString(mapFn: MapStringCallback): StringLikeSequence = js.native
  def `match`(pattern: stdLib.RegExp): StringLikeSequence = js.native
  def reverse(): StringLikeSequence = js.native
  def split(delimiter: java.lang.String): StringLikeSequence = js.native
  def split(delimiter: stdLib.RegExp): StringLikeSequence = js.native
  def startsWith(prefix: java.lang.String): scala.Boolean = js.native
  def substring(start: scala.Double): StringLikeSequence = js.native
  def substring(start: scala.Double, stop: scala.Double): StringLikeSequence = js.native
  def toLowerCase(): StringLikeSequence = js.native
  def toUpperCase(): StringLikeSequence = js.native
}

