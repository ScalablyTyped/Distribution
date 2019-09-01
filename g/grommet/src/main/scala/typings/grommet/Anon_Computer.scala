package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Computer extends js.Object {
  var computer: String
  var phone: String
  var tablet: String
}

object Anon_Computer {
  @scala.inline
  def apply(computer: String, phone: String, tablet: String): Anon_Computer = {
    val __obj = js.Dynamic.literal(computer = computer, phone = phone, tablet = tablet)
  
    __obj.asInstanceOf[Anon_Computer]
  }
}

