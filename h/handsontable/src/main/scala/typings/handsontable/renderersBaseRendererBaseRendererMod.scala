package typings.handsontable

import typings.handsontable.coreMod.default
import typings.handsontable.handsontableStrings.base
import typings.handsontable.settingsMod.CellProperties
import typings.std.HTMLTableCellElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderersBaseRendererBaseRendererMod {
  
  @JSImport("handsontable/renderers/baseRenderer/baseRenderer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("handsontable/renderers/baseRenderer/baseRenderer", "RENDERER_TYPE")
  @js.native
  val RENDERER_TYPE: base = js.native
  
  inline def baseRenderer(
    instance: default,
    TD: HTMLTableCellElement,
    row: Double,
    col: Double,
    prop: String,
    value: Any,
    cellProperties: CellProperties
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("baseRenderer")(instance.asInstanceOf[js.Any], TD.asInstanceOf[js.Any], row.asInstanceOf[js.Any], col.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any], cellProperties.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def baseRenderer(
    instance: default,
    TD: HTMLTableCellElement,
    row: Double,
    col: Double,
    prop: Double,
    value: Any,
    cellProperties: CellProperties
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("baseRenderer")(instance.asInstanceOf[js.Any], TD.asInstanceOf[js.Any], row.asInstanceOf[js.Any], col.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any], cellProperties.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
