package typings.ionicReact.anon

import typings.ionicReact.createControllerComponentMod.OverlayBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Create[OptionsType /* <: js.Object */, OverlayType /* <: OverlayBase */] extends js.Object {
  
  def create(options: OptionsType): js.Promise[OverlayType] = js.native
}
object Create {
  
  @scala.inline
  def apply[OptionsType /* <: js.Object */, OverlayType /* <: OverlayBase */](create: OptionsType => js.Promise[OverlayType]): Create[OptionsType, OverlayType] = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[Create[OptionsType, OverlayType]]
  }
  
  @scala.inline
  implicit class CreateOps[Self <: Create[_, _], OptionsType /* <: js.Object */, OverlayType /* <: OverlayBase */] (val x: Self with (Create[OptionsType, OverlayType])) extends AnyVal {
    
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
    def setCreate(value: OptionsType => js.Promise[OverlayType]): Self = this.set("create", js.Any.fromFunction1(value))
  }
}
