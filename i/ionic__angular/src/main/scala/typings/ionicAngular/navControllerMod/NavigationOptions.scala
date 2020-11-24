package typings.ionicAngular.navControllerMod

import typings.angularRouter.mod.NavigationBehaviorOptions
import typings.angularRouter.mod.UrlCreationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationOptions
  extends UrlCreationOptions
     with NavigationBehaviorOptions
     with AnimationOptions
object NavigationOptions {
  
  @scala.inline
  def apply(): NavigationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationOptions]
  }
}
