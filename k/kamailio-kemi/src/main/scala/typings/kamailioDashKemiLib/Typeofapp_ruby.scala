package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofapp_ruby extends js.Object {
  def run(func: java.lang.String): scala.Double
  def run_p1(func: java.lang.String, p1: java.lang.String): scala.Double
  def run_p2(func: java.lang.String, p1: java.lang.String, p2: java.lang.String): scala.Double
  def run_p3(func: java.lang.String, p1: java.lang.String, p2: java.lang.String, p3: java.lang.String): scala.Double
}

object Typeofapp_ruby {
  @scala.inline
  def apply(
    run: java.lang.String => scala.Double,
    run_p1: (java.lang.String, java.lang.String) => scala.Double,
    run_p2: (java.lang.String, java.lang.String, java.lang.String) => scala.Double,
    run_p3: (java.lang.String, java.lang.String, java.lang.String, java.lang.String) => scala.Double
  ): Typeofapp_ruby = {
    val __obj = js.Dynamic.literal(run = js.Any.fromFunction1(run), run_p1 = js.Any.fromFunction2(run_p1), run_p2 = js.Any.fromFunction3(run_p2), run_p3 = js.Any.fromFunction4(run_p3))
  
    __obj.asInstanceOf[Typeofapp_ruby]
  }
}

