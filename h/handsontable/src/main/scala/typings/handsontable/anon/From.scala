package typings.handsontable.anon

import typings.handsontable.commonMod.SimpleCellCoords
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait From extends StObject {
  
  var from: SimpleCellCoords
  
  var to: SimpleCellCoords
}
object From {
  
  inline def apply(from: SimpleCellCoords, to: SimpleCellCoords): From = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[From]
  }
  
  extension [Self <: From](x: Self) {
    
    inline def setFrom(value: SimpleCellCoords): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setTo(value: SimpleCellCoords): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
