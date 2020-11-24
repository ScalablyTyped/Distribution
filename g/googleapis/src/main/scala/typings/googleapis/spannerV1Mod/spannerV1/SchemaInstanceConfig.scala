package typings.googleapis.spannerV1Mod.spannerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A possible configuration for a Cloud Spanner instance. Configurations
  * define the geographic placement of nodes and their replication.
  */
@js.native
trait SchemaInstanceConfig extends js.Object {
  
  /**
    * The name of this instance configuration as it appears in UIs.
    */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * A unique identifier for the instance configuration.  Values are of the
    * form `projects/&lt;project&gt;/instanceConfigs/a-z*`
    */
  var name: js.UndefOr[String] = js.native
}
object SchemaInstanceConfig {
  
  @scala.inline
  def apply(): SchemaInstanceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceConfig]
  }
  
  @scala.inline
  implicit class SchemaInstanceConfigOps[Self <: SchemaInstanceConfig] (val x: Self) extends AnyVal {
    
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
