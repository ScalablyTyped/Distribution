package typings.googleapis.tpuV1Mod.tpuV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A tensorflow version that a Node can be configured with.
  */
@js.native
trait SchemaTensorFlowVersion extends js.Object {
  /**
    * The resource name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * the tensorflow version.
    */
  var version: js.UndefOr[String] = js.native
}

object SchemaTensorFlowVersion {
  @scala.inline
  def apply(name: String = null, version: String = null): SchemaTensorFlowVersion = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTensorFlowVersion]
  }
}

