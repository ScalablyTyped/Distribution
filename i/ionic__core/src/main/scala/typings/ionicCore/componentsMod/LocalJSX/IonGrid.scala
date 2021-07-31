package typings.ionicCore.componentsMod.LocalJSX

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonGrid extends StObject {
  
  /**
    * If `true`, the grid will have a fixed width based on the screen size.
    */
  var fixed: js.UndefOr[Boolean] = js.undefined
}
object IonGrid {
  
  @scala.inline
  def apply(): IonGrid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonGrid]
  }
  
  @scala.inline
  implicit class IonGridMutableBuilder[Self <: IonGrid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
  }
}
