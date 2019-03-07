package typings
package handsontableLib.handsontableMod.HandsontableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellTypeObject
  extends GridSettings
     with /**
  * Custom properties which will be accessible in `cellProperties`
  */
/* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  @JSName("editor")
  var editor_CellTypeObject: js.UndefOr[
    org.scalablytyped.runtime.Instantiable6[
      /* hotInstance */ handsontableLib.handsontableMod.underscoreHandsontableNs.Core, 
      /* row */ scala.Double, 
      /* col */ scala.Double, 
      /* prop */ java.lang.String | scala.Double, 
      /* TD */ stdLib.HTMLTableCellElement, 
      /* cellProperties */ CellProperties, 
      handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs.Base
    ]
  ] = js.undefined
  @JSName("renderer")
  var renderer_CellTypeObject: js.UndefOr[handsontableLib.handsontableMod.HandsontableNs.renderersNs.Base] = js.undefined
  @JSName("validator")
  var validator_CellTypeObject: js.UndefOr[handsontableLib.handsontableMod.HandsontableNs.validatorsNs.Base] = js.undefined
}

object CellTypeObject {
  @scala.inline
  def apply(
    GridSettings: GridSettings = null,
    StringDictionary: /**
    * Custom properties which will be accessible in `cellProperties`
    */
  /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    editor: org.scalablytyped.runtime.Instantiable6[
      /* hotInstance */ handsontableLib.handsontableMod.underscoreHandsontableNs.Core, 
      /* row */ scala.Double, 
      /* col */ scala.Double, 
      /* prop */ java.lang.String | scala.Double, 
      /* TD */ stdLib.HTMLTableCellElement, 
      /* cellProperties */ CellProperties, 
      handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs.Base
    ] = null,
    renderer: handsontableLib.handsontableMod.HandsontableNs.renderersNs.Base = null,
    validator: handsontableLib.handsontableMod.HandsontableNs.validatorsNs.Base = null
  ): CellTypeObject = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, GridSettings)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (editor != null) __obj.updateDynamic("editor")(editor)
    if (renderer != null) __obj.updateDynamic("renderer")(renderer)
    if (validator != null) __obj.updateDynamic("validator")(validator)
    __obj.asInstanceOf[CellTypeObject]
  }
}

