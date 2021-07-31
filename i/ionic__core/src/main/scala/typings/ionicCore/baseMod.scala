package typings.ionicCore

import typings.ionicCore.animationInterfaceMod.Animation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseMod {
  
  @JSImport("@ionic/core/dist/types/utils/menu-controller/animations/base", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def baseAnimation(isIos: Boolean): Animation = ^.asInstanceOf[js.Dynamic].applyDynamic("baseAnimation")(isIos.asInstanceOf[js.Any]).asInstanceOf[Animation]
}
