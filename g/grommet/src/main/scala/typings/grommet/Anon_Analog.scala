package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Analog extends js.Object {
  var analog: Anon_Hour
  var digital: Anon_Text
}

object Anon_Analog {
  @scala.inline
  def apply(analog: Anon_Hour, digital: Anon_Text): Anon_Analog = {
    val __obj = js.Dynamic.literal(analog = analog, digital = digital)
  
    __obj.asInstanceOf[Anon_Analog]
  }
}

