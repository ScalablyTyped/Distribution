package typings.ionicCore.componentsMod.Components

import typings.ionicCore.ionicCoreStrings.full
import typings.ionicCore.ionicCoreStrings.inset
import typings.ionicCore.ionicCoreStrings.ios
import typings.ionicCore.ionicCoreStrings.md
import typings.ionicCore.ionicCoreStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonList extends StObject {
  
  /**
    * If `ion-item-sliding` are used inside the list, this method closes any open sliding item.  Returns `true` if an actual `ion-item-sliding` is closed.
    */
  def closeSlidingItems(): js.Promise[Boolean]
  
  /**
    * If `true`, the list will have margin around it and rounded corners.
    */
  var inset: Boolean
  
  /**
    * How the bottom border should be displayed on all items.
    */
  var lines: js.UndefOr[full | inset | none] = js.undefined
  
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.undefined
}
object IonList {
  
  inline def apply(closeSlidingItems: () => js.Promise[Boolean], inset: Boolean): IonList = {
    val __obj = js.Dynamic.literal(closeSlidingItems = js.Any.fromFunction0(closeSlidingItems), inset = inset.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonList]
  }
  
  extension [Self <: IonList](x: Self) {
    
    inline def setCloseSlidingItems(value: () => js.Promise[Boolean]): Self = StObject.set(x, "closeSlidingItems", js.Any.fromFunction0(value))
    
    inline def setInset(value: Boolean): Self = StObject.set(x, "inset", value.asInstanceOf[js.Any])
    
    inline def setLines(value: full | inset | none): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    inline def setLinesUndefined: Self = StObject.set(x, "lines", js.undefined)
    
    inline def setMode(value: ios | md): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
