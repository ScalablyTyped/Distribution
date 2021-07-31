package typings.ionicCore

import typings.ionicCore.animationInterfaceMod.Animation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animationMod {
  
  @JSImport("@ionic/core/dist/types/utils/animation/animation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createAnimation(): Animation = ^.asInstanceOf[js.Dynamic].applyDynamic("createAnimation")().asInstanceOf[Animation]
  @scala.inline
  def createAnimation(animationId: String): Animation = ^.asInstanceOf[js.Dynamic].applyDynamic("createAnimation")(animationId.asInstanceOf[js.Any]).asInstanceOf[Animation]
}
