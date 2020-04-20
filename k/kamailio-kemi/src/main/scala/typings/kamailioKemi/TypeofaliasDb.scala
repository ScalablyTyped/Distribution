package typings.kamailioKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofaliasDb extends js.Object {
  def lookup(stable: String): Double
  def lookup_ex(stable: String, sflags: String): Double
}

object TypeofaliasDb {
  @scala.inline
  def apply(lookup: String => Double, lookup_ex: (String, String) => Double): TypeofaliasDb = {
    val __obj = js.Dynamic.literal(lookup = js.Any.fromFunction1(lookup), lookup_ex = js.Any.fromFunction2(lookup_ex))
    __obj.asInstanceOf[TypeofaliasDb]
  }
}

