package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Change report associated with a particular service configuration.  It
  * contains a list of ConfigChanges based on the comparison between two
  * service configurations.
  */
trait SchemaChangeReport extends StObject {
  
  /**
    * List of changes between two service configurations. The changes will be
    * alphabetically sorted based on the identifier of each change. A
    * ConfigChange identifier is a dot separated path to the configuration.
    * Example:
    * visibility.rules[selector=&#39;LibraryService.CreateBook&#39;].restriction
    */
  var configChanges: js.UndefOr[js.Array[SchemaConfigChange]] = js.undefined
}
object SchemaChangeReport {
  
  @scala.inline
  def apply(): SchemaChangeReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChangeReport]
  }
  
  @scala.inline
  implicit class SchemaChangeReportMutableBuilder[Self <: SchemaChangeReport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigChanges(value: js.Array[SchemaConfigChange]): Self = StObject.set(x, "configChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigChangesUndefined: Self = StObject.set(x, "configChanges", js.undefined)
    
    @scala.inline
    def setConfigChangesVarargs(value: SchemaConfigChange*): Self = StObject.set(x, "configChanges", js.Array(value :_*))
  }
}
