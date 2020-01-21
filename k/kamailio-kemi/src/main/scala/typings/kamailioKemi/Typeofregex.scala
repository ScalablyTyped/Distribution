package typings.kamailioKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofregex extends js.Object {
  def pcre_match(string: String, regex: String): Double
  def pcre_match_group(string: String, num_pcre: Double): Double
}

object Typeofregex {
  @scala.inline
  def apply(pcre_match: (String, String) => Double, pcre_match_group: (String, Double) => Double): Typeofregex = {
    val __obj = js.Dynamic.literal(pcre_match = js.Any.fromFunction2(pcre_match), pcre_match_group = js.Any.fromFunction2(pcre_match_group))
  
    __obj.asInstanceOf[Typeofregex]
  }
}

