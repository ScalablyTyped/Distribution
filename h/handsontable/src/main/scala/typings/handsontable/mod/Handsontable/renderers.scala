package typings.handsontable.mod.Handsontable

import typings.handsontable.mod._Handsontable.Core
import typings.std.HTMLTableCellElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("handsontable", "Handsontable.renderers")
@js.native
object renderers extends js.Object {
  
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
