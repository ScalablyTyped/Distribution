package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A possible configuration for a Cloud Spanner instance. Configurations
  * define the geographic placement of nodes and their replication.
  */
@js.native
trait SchemaInstanceConfig extends StObject {
  
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
  implicit class SchemaInstanceConfigMutableBuilder[Self <: SchemaInstanceConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
