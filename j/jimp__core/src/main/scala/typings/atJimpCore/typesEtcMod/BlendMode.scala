package typings.atJimpCore.typesEtcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlendMode extends js.Object {
  var mode: String
  var opacityDest: Double
  var opacitySource: Double
}

object BlendMode {
  @scala.inline
  def apply(mode: String, opacityDest: Double, opacitySource: Double): BlendMode = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], opacityDest = opacityDest.asInstanceOf[js.Any], opacitySource = opacitySource.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BlendMode]
  }
}

