package typings.ionicAngular.anon

import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import typings.ionicCore.interfaceMod.RouterDirection
import typings.ionicCore.navInterfaceMod.NavDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Animation extends js.Object {
  
  var animation: NavDirection = js.native
  
  def animationBuilder(baseEl: js.Any): typings.ionicCore.animationInterfaceMod.Animation = js.native
  def animationBuilder(baseEl: js.Any, opts: js.Any): typings.ionicCore.animationInterfaceMod.Animation = js.native
  @JSName("animationBuilder")
  var animationBuilder_Original: AnimationBuilder = js.native
  
  var direction: RouterDirection = js.native
}
