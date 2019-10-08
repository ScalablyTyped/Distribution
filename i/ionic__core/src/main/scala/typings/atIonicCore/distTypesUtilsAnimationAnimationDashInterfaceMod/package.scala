package typings.atIonicCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypesUtilsAnimationAnimationDashInterfaceMod {
  import typings.atIonicCore.atIonicCoreNumbers.`0`
  import typings.atIonicCore.atIonicCoreNumbers.`1`
  import typings.std.Record

  type AnimationKeyFrames = js.Array[AnimationKeyFrame]
  type AnimationLifecycle = js.Function2[/* currentStep */ `0` | `1`, /* animation */ Animation, Unit]
  type AnimationStyles = Record[String, js.Any]
}
