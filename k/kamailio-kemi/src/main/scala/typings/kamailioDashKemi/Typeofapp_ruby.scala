package typings.kamailioDashKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofapp_ruby extends js.Object {
  def run(func: String): Double
  def run_p1(func: String, p1: String): Double
  def run_p2(func: String, p1: String, p2: String): Double
  def run_p3(func: String, p1: String, p2: String, p3: String): Double
}

object Typeofapp_ruby {
  @scala.inline
  def apply(
    run: String => Double,
    run_p1: (String, String) => Double,
    run_p2: (String, String, String) => Double,
    run_p3: (String, String, String, String) => Double
  ): Typeofapp_ruby = {
    val __obj = js.Dynamic.literal(run = js.Any.fromFunction1(run), run_p1 = js.Any.fromFunction2(run_p1), run_p2 = js.Any.fromFunction3(run_p2), run_p3 = js.Any.fromFunction4(run_p3))
  
    __obj.asInstanceOf[Typeofapp_ruby]
  }
}

