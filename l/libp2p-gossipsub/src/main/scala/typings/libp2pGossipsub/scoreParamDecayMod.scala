package typings.libp2pGossipsub

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libp2p-gossipsub/src/score/score-param-decay", JSImport.Namespace)
@js.native
object scoreParamDecayMod extends js.Object {
  
  def scoreParameterDecay(decay: Double): Double = js.native
  
  def scoreParameterDecayWithBase(decay: Double, base: Double, decayToZero: Double): Double = js.native
}
