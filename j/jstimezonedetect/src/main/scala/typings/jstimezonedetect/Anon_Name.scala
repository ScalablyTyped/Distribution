package typings.jstimezonedetect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  def name(): String
}

object Anon_Name {
  @scala.inline
  def apply(name: () => String): Anon_Name = {
    val __obj = js.Dynamic.literal(name = js.Any.fromFunction0(name))
  
    __obj.asInstanceOf[Anon_Name]
  }
}

