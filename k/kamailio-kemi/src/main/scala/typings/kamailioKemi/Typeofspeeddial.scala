package typings.kamailioKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofspeeddial extends js.Object {
  def lookup(stable: String): Double
  def lookup_owner(stable: String, sowner: String): Double
}

object Typeofspeeddial {
  @scala.inline
  def apply(lookup: String => Double, lookup_owner: (String, String) => Double): Typeofspeeddial = {
    val __obj = js.Dynamic.literal(lookup = js.Any.fromFunction1(lookup), lookup_owner = js.Any.fromFunction2(lookup_owner))
  
    __obj.asInstanceOf[Typeofspeeddial]
  }
}

