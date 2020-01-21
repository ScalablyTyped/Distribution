package typings.lab.mod

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
    val __obj = js.Dynamic.literal(describe = describe.asInstanceOf[js.Any], experiment = experiment.asInstanceOf[js.Any], suite = suite.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExperimentAlt]
  }
}

