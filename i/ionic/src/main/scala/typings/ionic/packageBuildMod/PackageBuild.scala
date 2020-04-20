package typings.ionic.packageBuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PackageBuild extends js.Object {
  var automation_id: Double
  var automation_name: String
  var build_type: String
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
  var native_config_name: String
  var platform: String
  var profile_tag: String
  var stack: js.Any
  var state: String
}

object PackageBuild {
  @scala.inline
  def apply(
    automation_id: Double,
    automation_name: String,
    build_type: String,
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
    native_config_name: String,
    platform: String,
    profile_tag: String,
    stack: js.Any,
    state: String
  ): PackageBuild = {
    val __obj = js.Dynamic.literal(automation_id = automation_id.asInstanceOf[js.Any], automation_name = automation_name.asInstanceOf[js.Any], build_type = build_type.asInstanceOf[js.Any], caller_id = caller_id.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], environment_id = environment_id.asInstanceOf[js.Any], environment_name = environment_name.asInstanceOf[js.Any], finished = finished.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], job = job.asInstanceOf[js.Any], job_id = job_id.asInstanceOf[js.Any], native_config_id = native_config_id.asInstanceOf[js.Any], native_config_name = native_config_name.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], profile_tag = profile_tag.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageBuild]
  }
}

