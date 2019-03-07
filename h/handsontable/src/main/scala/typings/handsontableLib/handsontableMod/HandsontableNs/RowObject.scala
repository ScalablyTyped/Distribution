package typings
package handsontableLib.handsontableMod.HandsontableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A row object, one of the two ways to supply data to the table, the alternative being an array of values.
  * Row objects can have any data assigned to them, not just column data, and can define a `__children` array for nested rows.
  */
trait RowObject
  extends /* prop */ org.scalablytyped.runtime.StringDictionary[js.Any]

object RowObject {
  @scala.inline
  def apply(StringDictionary: /* prop */ org.scalablytyped.runtime.StringDictionary[js.Any] = null): RowObject = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[RowObject]
  }
}

