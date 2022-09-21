package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapMessages extends StObject {
  
  var tileTitle: js.UndefOr[String] = js.undefined
}
object MapMessages {
  
  inline def apply(): MapMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapMessages]
  }
  
  extension [Self <: MapMessages](x: Self) {
    
    inline def setTileTitle(value: String): Self = StObject.set(x, "tileTitle", value.asInstanceOf[js.Any])
    
    inline def setTileTitleUndefined: Self = StObject.set(x, "tileTitle", js.undefined)
  }
}
