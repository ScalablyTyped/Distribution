package typings.atHapiLab.atHapiLabMod

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
    val __obj = js.Dynamic.literal(describe = describe, experiment = experiment, suite = suite)
  
    __obj.asInstanceOf[ExperimentAlt]
  }
}

