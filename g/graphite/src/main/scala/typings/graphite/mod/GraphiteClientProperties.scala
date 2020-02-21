package typings.graphite.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphiteClientProperties extends js.Object {
  var carbon: js.Any
}

object GraphiteClientProperties {
  @scala.inline
  def apply(carbon: js.Any): GraphiteClientProperties = {
    val __obj = js.Dynamic.literal(carbon = carbon.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GraphiteClientProperties]
  }
}

