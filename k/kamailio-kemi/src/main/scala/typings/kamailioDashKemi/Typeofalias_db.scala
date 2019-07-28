package typings.kamailioDashKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofalias_db extends js.Object {
  def lookup(stable: String): Double
  def lookup_ex(stable: String, sflags: String): Double
}

object Typeofalias_db {
  @scala.inline
  def apply(lookup: String => Double, lookup_ex: (String, String) => Double): Typeofalias_db = {
    val __obj = js.Dynamic.literal(lookup = js.Any.fromFunction1(lookup), lookup_ex = js.Any.fromFunction2(lookup_ex))
  
    __obj.asInstanceOf[Typeofalias_db]
  }
}

