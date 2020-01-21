package typings.ionicCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object animationInterfaceMod {
  type AnimationKeyFrames = js.Array[typings.ionicCore.animationInterfaceMod.AnimationKeyFrame]
  type AnimationLifecycle = js.Function2[
    /* currentStep */ typings.ionicCore.ionicCoreNumbers.`0` | typings.ionicCore.ionicCoreNumbers.`1`, 
    /* animation */ typings.ionicCore.animationInterfaceMod.Animation, 
    scala.Unit
  ]
  type AnimationStyles = typings.std.Record[java.lang.String, js.Any]
}
