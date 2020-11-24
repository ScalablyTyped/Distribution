package typings.lazyJs.LazyJS

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StringLikeSequence extends SequenceBaser[String] {
  
  def charAt(index: Double): String = js.native
  
  def charCodeAt(index: Double): Double = js.native
  
  def endsWith(suffix: String): Boolean = js.native
  
  def first(): String = js.native
  def first(count: Double): StringLikeSequence = js.native
  
  def indexOf(substring: String): Double = js.native
  def indexOf(substring: String, startIndex: Double): Double = js.native
  
  def last(): String = js.native
  def last(count: Double): StringLikeSequence = js.native
  
  def lastIndexOf(substring: String): Double = js.native
  def lastIndexOf(substring: String, startIndex: Double): Double = js.native
  
  def mapString(mapFn: MapStringCallback): StringLikeSequence = js.native
  
  def `match`(pattern: RegExp): StringLikeSequence = js.native
  
  def reverse(): StringLikeSequence = js.native
  
  def split(delimiter: String): StringLikeSequence = js.native
  def split(delimiter: RegExp): StringLikeSequence = js.native
  
  def startsWith(prefix: String): Boolean = js.native
  
  def substring(start: Double): StringLikeSequence = js.native
  def substring(start: Double, stop: Double): StringLikeSequence = js.native
  
  def toLowerCase(): StringLikeSequence = js.native
  
  def toUpperCase(): StringLikeSequence = js.native
}
// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
@JSGlobal("LazyJS.StringLikeSequence")
@js.native
object StringLikeSequence extends js.Object
