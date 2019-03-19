package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dofile extends js.Object {
  def dofile(script: java.lang.String): scala.Double
  def dostring(script: java.lang.String): scala.Double
  def run(func: java.lang.String): scala.Double
  def run_p1(func: java.lang.String, p1: java.lang.String): scala.Double
  def run_p2(func: java.lang.String, p1: java.lang.String, p2: java.lang.String): scala.Double
  def run_p3(func: java.lang.String, p1: java.lang.String, p2: java.lang.String, p3: java.lang.String): scala.Double
  def runstring(script: java.lang.String): scala.Double
}

object Anon_Dofile {
  @scala.inline
  def apply(
    dofile: java.lang.String => scala.Double,
    dostring: java.lang.String => scala.Double,
    run: java.lang.String => scala.Double,
    run_p1: (java.lang.String, java.lang.String) => scala.Double,
    run_p2: (java.lang.String, java.lang.String, java.lang.String) => scala.Double,
    run_p3: (java.lang.String, java.lang.String, java.lang.String, java.lang.String) => scala.Double,
    runstring: java.lang.String => scala.Double
  ): Anon_Dofile = {
    val __obj = js.Dynamic.literal(dofile = js.Any.fromFunction1(dofile), dostring = js.Any.fromFunction1(dostring), run = js.Any.fromFunction1(run), run_p1 = js.Any.fromFunction2(run_p1), run_p2 = js.Any.fromFunction3(run_p2), run_p3 = js.Any.fromFunction4(run_p3), runstring = js.Any.fromFunction1(runstring))
  
    __obj.asInstanceOf[Anon_Dofile]
  }
}

