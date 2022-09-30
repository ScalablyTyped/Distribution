package typings.leafletDraw.mod

import typings.leafletDraw.mod.Localization.DrawLocal
import typings.leafletDraw.mod.^
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def drawLocal: DrawLocal = ^.asInstanceOf[js.Dynamic].selectDynamic("drawLocal").asInstanceOf[DrawLocal]

inline def drawVersion: String = ^.asInstanceOf[js.Dynamic].selectDynamic("drawVersion").asInstanceOf[String]

inline def map(element: String | HTMLElement, options: js.UndefOr[MapOptions]): DrawMap = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DrawMap]
