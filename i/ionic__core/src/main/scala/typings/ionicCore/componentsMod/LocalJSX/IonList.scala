package typings.ionicCore.componentsMod.LocalJSX

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
    * If `true`, the list will have margin around it and rounded corners.
    */
  var inset: js.UndefOr[Boolean] = js.undefined
  
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
  
  @scala.inline
  def apply(): IonList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonList]
  }
  
  @scala.inline
  implicit class IonListMutableBuilder[Self <: IonList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInset(value: Boolean): Self = StObject.set(x, "inset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsetUndefined: Self = StObject.set(x, "inset", js.undefined)
    
    @scala.inline
    def setLines(value: full | inset | none): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinesUndefined: Self = StObject.set(x, "lines", js.undefined)
    
    @scala.inline
    def setMode(value: ios | md): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
