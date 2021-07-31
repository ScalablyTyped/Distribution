package typings.jqueryui.JQueryUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExplodeEffect extends StObject {
  
  var pieces: js.UndefOr[Double] = js.undefined
}
object ExplodeEffect {
  
  @scala.inline
  def apply(): ExplodeEffect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExplodeEffect]
  }
  
  @scala.inline
  implicit class ExplodeEffectMutableBuilder[Self <: ExplodeEffect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPieces(value: Double): Self = StObject.set(x, "pieces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPiecesUndefined: Self = StObject.set(x, "pieces", js.undefined)
  }
}
