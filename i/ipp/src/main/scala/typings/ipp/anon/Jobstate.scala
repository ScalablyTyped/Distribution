package typings.ipp.anon

import typings.ipp.mod.JobState
import typings.ipp.mod.JobStateReasons
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Jobstate extends js.Object {
  var `job-id`: Double
  var `job-state`: JobState
  var `job-state-message`: js.UndefOr[String] = js.undefined
  var `job-state-reasons`: js.Array[JobStateReasons]
  var `job-uri`: String
  var `number-of-intervening-jobs`: js.UndefOr[Double] = js.undefined
}

object Jobstate {
  @scala.inline
  def apply(
    `job-id`: Double,
    `job-state`: JobState,
    `job-state-reasons`: js.Array[JobStateReasons],
    `job-uri`: String,
    `job-state-message`: String = null,
    `number-of-intervening-jobs`: js.UndefOr[Double] = js.undefined
  ): Jobstate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("job-id")(`job-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("job-state")(`job-state`.asInstanceOf[js.Any])
    __obj.updateDynamic("job-state-reasons")(`job-state-reasons`.asInstanceOf[js.Any])
    __obj.updateDynamic("job-uri")(`job-uri`.asInstanceOf[js.Any])
    if (`job-state-message` != null) __obj.updateDynamic("job-state-message")(`job-state-message`.asInstanceOf[js.Any])
    if (!js.isUndefined(`number-of-intervening-jobs`)) __obj.updateDynamic("number-of-intervening-jobs")(`number-of-intervening-jobs`.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Jobstate]
  }
}

