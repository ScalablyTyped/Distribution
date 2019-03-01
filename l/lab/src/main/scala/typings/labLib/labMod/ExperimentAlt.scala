package typings
package labLib.labMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExperimentAlt extends js.Object {
  var describe: SkipOnlyExperiment
  var experiment: SkipOnlyExperiment
  var suite: SkipOnlyExperiment
}

object ExperimentAlt {
  @scala.inline
  def apply(describe: SkipOnlyExperiment, experiment: SkipOnlyExperiment, suite: SkipOnlyExperiment): ExperimentAlt = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("describe")(describe)
    __obj.updateDynamic("experiment")(experiment)
    __obj.updateDynamic("suite")(suite)
    __obj.asInstanceOf[ExperimentAlt]
  }
}

