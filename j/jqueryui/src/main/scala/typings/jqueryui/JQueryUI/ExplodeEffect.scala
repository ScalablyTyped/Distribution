package typings.jqueryui.JQueryUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExplodeEffect extends StObject {
  
  var pieces: js.UndefOr[Double] = js.undefined
}
object ExplodeEffect {
  
  inline def apply(): ExplodeEffect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExplodeEffect]
  }
  
  extension [Self <: ExplodeEffect](x: Self) {
    
    inline def setPieces(value: Double): Self = StObject.set(x, "pieces", value.asInstanceOf[js.Any])
    
    inline def setPiecesUndefined: Self = StObject.set(x, "pieces", js.undefined)
  }
}
