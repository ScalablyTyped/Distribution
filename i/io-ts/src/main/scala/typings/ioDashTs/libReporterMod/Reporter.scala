package typings.ioDashTs.libReporterMod

import typings.ioDashTs.ioDashTsMod.Validation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reporter[A] extends js.Object {
  def report(validation: Validation[_]): A
}

object Reporter {
  @scala.inline
  def apply[A](report: Validation[_] => A): Reporter[A] = {
    val __obj = js.Dynamic.literal(report = js.Any.fromFunction1(report))
  
    __obj.asInstanceOf[Reporter[A]]
  }
}

