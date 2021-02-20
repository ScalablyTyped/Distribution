package typings.libp2pGossipsub

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scoreParamDecayMod {
  
  @JSImport("libp2p-gossipsub/src/score/score-param-decay", "scoreParameterDecay")
  @js.native
  def scoreParameterDecay(decay: Double): Double = js.native
  
  @JSImport("libp2p-gossipsub/src/score/score-param-decay", "scoreParameterDecayWithBase")
  @js.native
  def scoreParameterDecayWithBase(decay: Double, base: Double, decayToZero: Double): Double = js.native
}
