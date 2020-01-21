package typings.handsontable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Handsontable {
  type Bucket = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof handsontable.handsontable.Handsontable.Hooks.Events ]: std.Array<handsontable.handsontable.Handsontable.Hooks.Events[P]>}
    */ typings.handsontable.handsontableStrings.Bucket with typings.handsontable.mod.Handsontable.Hooks.Events
  /**
    * A cell change represented by `[row, column, prevValue, nextValue]`.
    */
  type CellChange = js.Tuple4[
    scala.Double, 
    java.lang.String | scala.Double, 
    typings.handsontable.mod.Handsontable.CellValue, 
    typings.handsontable.mod.Handsontable.CellValue
  ]
  // These types represent default known values, but users can extend with their own, leading to the need for assertions.
  // Using type arguments (ex `GridSettings<CellValue, CellType, SourceData>`) would solve this and provide very strict
  // type-checking, but adds a lot of noise for no benefit in the most common use cases.
  /**
    * A cell value, which can be anything to support custom cell data types, but by default is `string | number | boolean | undefined`.
    */
  type CellValue = js.Any
  /**
    * A row object, one of the two ways to supply data to the table, the alternative being an array of values.
    * Row objects can have any data assigned to them, not just column data, and can define a `__children` array for nested rows.
    */
  type RowObject = org.scalablytyped.runtime.StringDictionary[js.Any]
  /**
    * A single row of source data, which can be represented as an array of values, or an object with key/value pairs.
    */
  type SourceRowData = typings.handsontable.mod.Handsontable.RowObject | js.Array[typings.handsontable.mod.Handsontable.CellValue]
}
