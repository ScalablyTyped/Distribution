package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Change report associated with a particular service configuration.  It
  * contains a list of ConfigChanges based on the comparison between two
  * service configurations.
  */
@js.native
trait SchemaChangeReport extends js.Object {
  /**
    * List of changes between two service configurations. The changes will be
    * alphabetically sorted based on the identifier of each change. A
    * ConfigChange identifier is a dot separated path to the configuration.
    * Example:
    * visibility.rules[selector=&#39;LibraryService.CreateBook&#39;].restriction
    */
  var configChanges: js.UndefOr[js.Array[SchemaConfigChange]] = js.native
}

object SchemaChangeReport {
  @scala.inline
  def apply(): SchemaChangeReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChangeReport]
  }
  @scala.inline
  implicit class SchemaChangeReportOps[Self <: SchemaChangeReport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConfigChangesVarargs(value: SchemaConfigChange*): Self = this.set("configChanges", js.Array(value :_*))
    @scala.inline
    def setConfigChanges(value: js.Array[SchemaConfigChange]): Self = this.set("configChanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigChanges: Self = this.set("configChanges", js.undefined)
  }
  
}

