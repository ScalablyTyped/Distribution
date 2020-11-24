package typings.ionicCore.componentsMod.LocalJSX

import typings.ionicCore.ionicCoreStrings.bottom
import typings.ionicCore.ionicCoreStrings.end
import typings.ionicCore.ionicCoreStrings.start
import typings.ionicCore.ionicCoreStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IonFabList extends js.Object {
  
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
  implicit class IonFabListOps[Self <: IonFabList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActivated(value: Boolean): Self = this.set("activated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivated: Self = this.set("activated", js.undefined)
    
    @scala.inline
    def setSide(value: start | end | top | bottom): Self = this.set("side", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSide: Self = this.set("side", js.undefined)
  }
}
