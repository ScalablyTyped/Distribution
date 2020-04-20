package typings.jasmine.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Jasmine extends js.Object {
  var Spec: typings.jasmine.jasmine.Spec
  var clock: Clock_
  var util: Util
}

object Jasmine {
  @scala.inline
  def apply(Spec: Spec, clock: Clock_, util: Util): Jasmine = {
    val __obj = js.Dynamic.literal(Spec = Spec.asInstanceOf[js.Any], clock = clock.asInstanceOf[js.Any], util = util.asInstanceOf[js.Any])
    __obj.asInstanceOf[Jasmine]
  }
}

