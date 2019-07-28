package typings.handsontable.handsontableMod.HandsontableNs

import typings.handsontable.handsontableMod.HandsontableNs.CellProperties
import typings.handsontable.handsontableMod.HandsontableNs.CellValue
import typings.handsontable.handsontableMod.underscoreHandsontableNs.Core
import typings.std.HTMLTableCellElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object renderersNs {
  type Autocomplete = Base
  type Base = js.Function7[
    /* instance */ Core, 
    /* TD */ HTMLTableCellElement, 
    /* row */ Double, 
    /* col */ Double, 
    /* prop */ String | Double, 
    /* value */ CellValue, 
    /* cellProperties */ CellProperties, 
    HTMLTableCellElement | Unit
  ]
  type Checkbox = Base
  type Html = Base
  type Numeric = Base
  type Password = Base
  type Text = Base
}
