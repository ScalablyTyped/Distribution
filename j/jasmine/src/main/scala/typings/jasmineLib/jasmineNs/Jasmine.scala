package typings
package jasmineLib.jasmineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Jasmine extends js.Object {
  var Spec: Spec
  var clock: Clock
  var util: Util
}

object Jasmine {
  @scala.inline
  def apply(Spec: Spec, clock: Clock, util: Util): Jasmine = {
    val __obj = js.Dynamic.literal(Spec = Spec, clock = clock, util = util)
  
    __obj.asInstanceOf[Jasmine]
  }
}

