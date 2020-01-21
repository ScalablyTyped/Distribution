package typings.ionicCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object transitionMod {
  type IonicAnimationInterface = js.Function2[
    /* navEl */ typings.std.HTMLElement, 
    /* opts */ typings.ionicCore.transitionMod.TransitionOptions, 
    typings.ionicCore.animationInterfaceMod.Animation | js.Promise[typings.ionicCore.animationInterfaceMod.Animation]
  ]
}
