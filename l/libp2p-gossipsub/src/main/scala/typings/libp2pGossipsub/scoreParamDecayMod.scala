package typings.libp2pGossipsub

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scoreParamDecayMod {
  
  @JSImport("libp2p-gossipsub/src/score/score-param-decay", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def scoreParameterDecay(decay: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("scoreParameterDecay")(decay.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def scoreParameterDecayWithBase(decay: Double, base: Double, decayToZero: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("scoreParameterDecayWithBase")(decay.asInstanceOf[js.Any], base.asInstanceOf[js.Any], decayToZero.asInstanceOf[js.Any])).asInstanceOf[Double]
}
