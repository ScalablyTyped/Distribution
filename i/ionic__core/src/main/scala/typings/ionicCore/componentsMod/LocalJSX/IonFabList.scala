package typings.ionicCore.componentsMod.LocalJSX

import typings.ionicCore.ionicCoreStrings.bottom
import typings.ionicCore.ionicCoreStrings.end
import typings.ionicCore.ionicCoreStrings.start
import typings.ionicCore.ionicCoreStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IonFabList extends StObject {
  
  /**
    * If `true`, the fab list will show all fab buttons in the list.
    */
  var activated: js.UndefOr[Boolean] = js.native
  
  /**
    * The side the fab list will show on relative to the main fab button.
    */
  var side: js.UndefOr[start | end | top | bottom] = js.native
}
object IonFabList {
  
  @scala.inline
  def apply(): IonFabList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonFabList]
  }
  
  @scala.inline
  implicit class IonFabListMutableBuilder[Self <: IonFabList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivated(value: Boolean): Self = StObject.set(x, "activated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivatedUndefined: Self = StObject.set(x, "activated", js.undefined)
    
    @scala.inline
    def setSide(value: start | end | top | bottom): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSideUndefined: Self = StObject.set(x, "side", js.undefined)
  }
}
