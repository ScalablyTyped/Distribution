package typings.leafletDraw

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def drawLocal: typings.leafletDraw.mod.Localization.DrawLocal = typings.leafletDraw.mod.^.asInstanceOf[js.Dynamic].selectDynamic("drawLocal").asInstanceOf[typings.leafletDraw.mod.Localization.DrawLocal]
  
  @scala.inline
  def drawVersion: java.lang.String = typings.leafletDraw.mod.^.asInstanceOf[js.Dynamic].selectDynamic("drawVersion").asInstanceOf[java.lang.String]
  
  @scala.inline
  def map(
    element: java.lang.String | typings.std.HTMLElement,
    options: js.UndefOr[typings.leafletDraw.mod.MapOptions]
  ): typings.leafletDraw.mod.DrawMap = (typings.leafletDraw.mod.^.asInstanceOf[js.Dynamic].applyDynamic("map")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.leafletDraw.mod.DrawMap]
}
