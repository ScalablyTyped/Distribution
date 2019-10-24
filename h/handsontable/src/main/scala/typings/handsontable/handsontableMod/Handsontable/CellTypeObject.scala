package typings.handsontable.handsontableMod.Handsontable

import org.scalablytyped.runtime.Instantiable6
import org.scalablytyped.runtime.StringDictionary
import typings.handsontable.handsontableMod.Handsontable._editors.Base
import typings.handsontable.handsontableMod._Handsontable.Core
import typings.std.HTMLTableCellElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellTypeObject
  extends GridSettings
     with /**
  * Custom properties which will be accessible in `cellProperties`
  */
/* key */ StringDictionary[js.Any] {
  @JSName("editor")
  var editor_CellTypeObject: js.UndefOr[
    Instantiable6[
      /* hotInstance */ Core, 
      /* row */ Double, 
      /* col */ Double, 
      /* prop */ String | Double, 
      /* TD */ HTMLTableCellElement, 
      /* cellProperties */ CellProperties, 
      Base
    ]
  ] = js.undefined
  @JSName("renderer")
  var renderer_CellTypeObject: js.UndefOr[typings.handsontable.handsontableMod.Handsontable.renderers.Base] = js.undefined
  @JSName("validator")
  var validator_CellTypeObject: js.UndefOr[typings.handsontable.handsontableMod.Handsontable.validators.Base] = js.undefined
}

object CellTypeObject {
  @scala.inline
  def apply(
    GridSettings: GridSettings = null,
    StringDictionary: /**
    * Custom properties which will be accessible in `cellProperties`
    */
  /* key */ StringDictionary[js.Any] = null,
    editor: Instantiable6[
      /* hotInstance */ Core, 
      /* row */ Double, 
      /* col */ Double, 
      /* prop */ String | Double, 
      /* TD */ HTMLTableCellElement, 
      /* cellProperties */ CellProperties, 
      Base
    ] = null,
    renderer: (/* instance */ Core, /* TD */ HTMLTableCellElement, /* row */ Double, /* col */ Double, /* prop */ String | Double, /* value */ CellValue, /* cellProperties */ CellProperties) => HTMLTableCellElement | Unit = null,
    validator: typings.handsontable.handsontableMod.Handsontable.validators.Base = null
  ): CellTypeObject = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, GridSettings)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (editor != null) __obj.updateDynamic("editor")(editor)
    if (renderer != null) __obj.updateDynamic("renderer")(js.Any.fromFunction7(renderer))
    if (validator != null) __obj.updateDynamic("validator")(validator)
    __obj.asInstanceOf[CellTypeObject]
  }
}

