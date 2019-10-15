package typings.handsontable.handsontableMod.Handsontable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object search {
  import typings.handsontable.handsontableMod.Handsontable
  import typings.handsontable.handsontableMod.Handsontable.CellProperties
  import typings.handsontable.handsontableMod.Handsontable.CellValue

  type SearchCallback = js.Function5[
    /* instance */ Handsontable, 
    /* row */ Double, 
    /* column */ Double, 
    /* value */ CellValue, 
    /* result */ Boolean, 
    Unit
  ]
  type SearchQueryMethod = js.Function3[
    /* queryStr */ String, 
    /* value */ CellValue, 
    /* cellProperties */ CellProperties, 
    Boolean
  ]
}
