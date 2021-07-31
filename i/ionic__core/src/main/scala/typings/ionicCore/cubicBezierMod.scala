package typings.ionicCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cubicBezierMod {
  
  @JSImport("@ionic/core/dist/types/utils/animation/cubic-bezier", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getTimeGivenProgression(
    p0: js.Array[Double],
    p1: js.Array[Double],
    p2: js.Array[Double],
    p3: js.Array[Double],
    progression: Double
  ): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTimeGivenProgression")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any], progression.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
}
