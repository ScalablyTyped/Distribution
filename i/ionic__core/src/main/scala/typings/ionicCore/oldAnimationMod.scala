package typings.ionicCore

import typings.ionicCore.oldAnimationAnimationInterfaceMod.Animation
import typings.ionicCore.oldAnimationAnimationInterfaceMod.AnimationBuilder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/utils/animation/old-animation", JSImport.Namespace)
@js.native
object oldAnimationMod extends js.Object {
  def create(): js.Promise[Animation] = js.native
  def create(animationBuilder: js.UndefOr[scala.Nothing], baseEl: js.Any): js.Promise[Animation] = js.native
  def create(animationBuilder: js.UndefOr[scala.Nothing], baseEl: js.Any, opts: js.Any): js.Promise[Animation] = js.native
  def create(animationBuilder: AnimationBuilder): js.Promise[Animation] = js.native
  def create(animationBuilder: AnimationBuilder, baseEl: js.Any): js.Promise[Animation] = js.native
  def create(animationBuilder: AnimationBuilder, baseEl: js.Any, opts: js.Any): js.Promise[Animation] = js.native
}

