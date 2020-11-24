package typings.markdownTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("markdown-table", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * Turns a given matrix of strings (an array of arrays of strings) into a table.
    * @example
    * import table from 'markdown-table'
    *
    * table([
    *   ['Branch', 'Commit'],
    *   ['master', '0123456789abcdef'],
    *   ['staging', 'fedcba9876543210']
    * ])
    * // | Branch  | Commit           |
    * // | ------- | ---------------- |
    * // | master  | 0123456789abcdef |
    * // | staging | fedcba9876543210 |
    *
    * @example
    * table(
    *   [
    *     ['Beep', 'No.', 'Boop'],
    *     ['beep', '1024', 'xyz'],
    *     ['boop', '3388450', 'tuv'],
    *     ['foo', '10106', 'qrstuv'],
    *     ['bar', '45', 'lmno']
    *   ],
    *   {align: ['l', 'c', 'r']}
    * )
    * // | Beep |   No.   |   Boop |
    * // | :--- | :-----: | -----: |
    * // | beep |   1024  |    xyz |
    * // | boop | 3388450 |    tuv |
    * // | foo  |  10106  | qrstuv |
    * // | bar  |    45   |   lmno |
    */
  def apply(table: js.Array[js.Array[String]]): String = js.native
  def apply(table: js.Array[js.Array[String]], options: Options): String = js.native
}
