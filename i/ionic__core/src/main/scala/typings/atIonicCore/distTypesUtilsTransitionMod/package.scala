package typings.atIonicCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypesUtilsTransitionMod {
  import typings.atIonicCore.distTypesUtilsAnimationAnimationDashInterfaceMod.Animation
  import typings.std.HTMLElement

  type IonicAnimationInterface = js.Function2[
    /* navEl */ HTMLElement, 
    /* opts */ TransitionOptions, 
    Animation | js.Promise[Animation]
  ]
}
