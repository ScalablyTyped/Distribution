package typings.handsontable

import typings.handsontable.coreMod.default
import typings.handsontable.settingsMod.CellProperties
import typings.std.HTMLTableCellElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderersBaseMod {
  
  type BaseRenderer = js.Function7[
    /* instance */ default, 
    /* TD */ HTMLTableCellElement, 
    /* row */ Double, 
    /* col */ Double, 
    /* prop */ String | Double, 
    /* value */ Any, 
    /* cellProperties */ CellProperties, 
    Unit
  ]
}
