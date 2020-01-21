package typings.ionic.deployBuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeployBuild extends js.Object {
  var automation_id: Double
  var automation_name: String
  var caller_id: Double
  var commit: js.Any
  var created: String
  var environment_id: Double
  var environment_name: String
  var finished: String
  var id: String
  var job: js.Any
  var job_id: Double
  var native_config_id: Double
  var pending_channels: js.Array[String]
  var state: String
}

object DeployBuild {
  @scala.inline
  def apply(
    automation_id: Double,
    automation_name: String,
    caller_id: Double,
    commit: js.Any,
    created: String,
    environment_id: Double,
    environment_name: String,
    finished: String,
    id: String,
    job: js.Any,
    job_id: Double,
    native_config_id: Double,
    pending_channels: js.Array[String],
    state: String
  ): DeployBuild = {
    val __obj = js.Dynamic.literal(automation_id = automation_id.asInstanceOf[js.Any], automation_name = automation_name.asInstanceOf[js.Any], caller_id = caller_id.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], environment_id = environment_id.asInstanceOf[js.Any], environment_name = environment_name.asInstanceOf[js.Any], finished = finished.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], job = job.asInstanceOf[js.Any], job_id = job_id.asInstanceOf[js.Any], native_config_id = native_config_id.asInstanceOf[js.Any], pending_channels = pending_channels.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeployBuild]
  }
}

