package typings.lottieWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AnimationEventCallback[T] = js.Function1[/* args */ T, scala.Unit]
  
  type AnimationSegment = js.Tuple2[scala.Double, scala.Double]
}
