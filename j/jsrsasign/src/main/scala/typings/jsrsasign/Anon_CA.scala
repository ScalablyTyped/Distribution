package typings.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CA extends js.Object {
  var cA: Boolean
  var pathLen: Double
}

trait Anon_Ca extends js.Object {
  var ca: Boolean
  var critical: Boolean
}

object Anon_CA {
  @scala.inline
  def apply(cA: Boolean, pathLen: Double): Anon_CA = {
    val __obj = js.Dynamic.literal(cA = cA, pathLen = pathLen)
  
    __obj.asInstanceOf[Anon_CA]
  }
}

object Anon_Ca {
  @scala.inline
  def apply(ca: Boolean, critical: Boolean): Anon_Ca = {
    val __obj = js.Dynamic.literal(ca = ca, critical = critical)
  
    __obj.asInstanceOf[Anon_Ca]
  }
}

