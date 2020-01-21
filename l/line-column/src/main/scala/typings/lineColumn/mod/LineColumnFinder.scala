package typings.lineColumn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface defining the return type from the main `lineColumn` function.
  */
@js.native
trait LineColumnFinder extends js.Object {
  /**
    * Find line and column from index in the string.
    * @param index Index in the string. (0-origin)
    * @returns Found line number and column number or `null` if the given index is out of range.
    */
  def fromIndex(index: Double): LineColumnInfo | Null = js.native
  /**
    * Find index from line and column in the string.
    * @param line Line number in the string, an object containing line and column numbers or
    *              an array containing line and column numbers.
    * @param col Column number in the string.
    * @returns Found index in the string or `-1` if the given line or column is out of range.
    */
  def toIndex(line: Double): Double = js.native
  def toIndex(line: Double, col: Double): Double = js.native
  def toIndex(line: LineColumnArray): Double = js.native
  def toIndex(line: LineColumnArray, col: Double): Double = js.native
  def toIndex(line: LineColumnObject): Double = js.native
  def toIndex(line: LineColumnObject, col: Double): Double = js.native
}

