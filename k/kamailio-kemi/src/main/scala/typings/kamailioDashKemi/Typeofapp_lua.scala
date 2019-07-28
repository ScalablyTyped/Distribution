package typings.kamailioDashKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofapp_lua extends js.Object {
  def dofile(script: String): Double
  def dostring(script: String): Double
  def run(func: String): Double
  def run_p1(func: String, p1: String): Double
  def run_p2(func: String, p1: String, p2: String): Double
  def run_p3(func: String, p1: String, p2: String, p3: String): Double
  def runstring(script: String): Double
}

object Typeofapp_lua {
  @scala.inline
  def apply(
    dofile: String => Double,
    dostring: String => Double,
    run: String => Double,
    run_p1: (String, String) => Double,
    run_p2: (String, String, String) => Double,
    run_p3: (String, String, String, String) => Double,
    runstring: String => Double
  ): Typeofapp_lua = {
    val __obj = js.Dynamic.literal(dofile = js.Any.fromFunction1(dofile), dostring = js.Any.fromFunction1(dostring), run = js.Any.fromFunction1(run), run_p1 = js.Any.fromFunction2(run_p1), run_p2 = js.Any.fromFunction3(run_p2), run_p3 = js.Any.fromFunction4(run_p3), runstring = js.Any.fromFunction1(runstring))
  
    __obj.asInstanceOf[Typeofapp_lua]
  }
}

