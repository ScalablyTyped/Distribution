package typings.handsontable

import typings.handsontable.coreMod.default
import typings.handsontable.handsontableStrings.time
import typings.handsontable.settingsMod.CellProperties
import typings.std.HTMLTableCellElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timeRendererTimeRendererMod {
  
  @JSImport("handsontable/renderers/timeRenderer/timeRenderer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("handsontable/renderers/timeRenderer/timeRenderer", "RENDERER_TYPE")
  @js.native
  val RENDERER_TYPE: time = js.native
  
  inline def timeRenderer(
    instance: default,
    TD: HTMLTableCellElement,
    row: Double,
    col: Double,
    prop: String,
    value: Any,
    cellProperties: CellProperties
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("timeRenderer")(instance.asInstanceOf[js.Any], TD.asInstanceOf[js.Any], row.asInstanceOf[js.Any], col.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any], cellProperties.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def timeRenderer(
    instance: default,
    TD: HTMLTableCellElement,
    row: Double,
    col: Double,
    prop: Double,
    value: Any,
    cellProperties: CellProperties
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("timeRenderer")(instance.asInstanceOf[js.Any], TD.asInstanceOf[js.Any], row.asInstanceOf[js.Any], col.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any], cellProperties.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
