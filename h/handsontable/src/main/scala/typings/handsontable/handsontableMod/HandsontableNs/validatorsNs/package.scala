package typings.handsontable.handsontableMod.HandsontableNs

import typings.handsontable.handsontableMod.HandsontableNs.CellProperties
import typings.handsontable.handsontableMod.HandsontableNs.CellValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object validatorsNs {
  type Autocomplete = Base
  type Base = js.ThisFunction2[
    /* this */ CellProperties, 
    /* value */ CellValue, 
    /* callback */ js.Function1[/* valid */ Boolean, Unit], 
    Unit
  ]
  type Date = Base
  type Numeric = Base
  type Time = Base
}
