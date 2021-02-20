package typings.handsontable.mod.Handsontable

import typings.std.HTMLTableCellElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderers {
  
  type Autocomplete = Base
  
  type Base = js.Function7[
    /* instance */ typings.handsontable.mod._Handsontable.Core, 
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
