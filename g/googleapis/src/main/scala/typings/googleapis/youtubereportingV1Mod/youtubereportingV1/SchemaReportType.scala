package typings.googleapis.youtubereportingV1Mod.youtubereportingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A report type.
  */
@js.native
trait SchemaReportType extends StObject {
  
  /**
    * The date/time when this report type was/will be deprecated.
    */
  var deprecateTime: js.UndefOr[String] = js.native
  
  /**
    * The ID of the report type (max. 100 characters).
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The name of the report type (max. 100 characters).
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * True if this a system-managed report type; otherwise false. Reporting
    * jobs for system-managed report types are created automatically and can
    * thus not be used in the `CreateJob` method.
    */
  var systemManaged: js.UndefOr[Boolean] = js.native
}
object SchemaReportType {
  
  @scala.inline
  def apply(): SchemaReportType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReportType]
  }
  
  @scala.inline
  implicit class SchemaReportTypeMutableBuilder[Self <: SchemaReportType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeprecateTime(value: String): Self = StObject.set(x, "deprecateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeprecateTimeUndefined: Self = StObject.set(x, "deprecateTime", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSystemManaged(value: Boolean): Self = StObject.set(x, "systemManaged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemManagedUndefined: Self = StObject.set(x, "systemManaged", js.undefined)
  }
}
