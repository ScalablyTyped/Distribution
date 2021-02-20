package typings.googleapis.doubleclickbidmanagerV1Mod.doubleclickbidmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a report.
  */
@js.native
trait SchemaReport extends StObject {
  
  /**
    * Key used to identify a report.
    */
  var key: js.UndefOr[SchemaReportKey] = js.native
  
  /**
    * Report metadata.
    */
  var metadata: js.UndefOr[SchemaReportMetadata] = js.native
  
  /**
    * Report parameters.
    */
  var params: js.UndefOr[SchemaParameters] = js.native
}
object SchemaReport {
  
  @scala.inline
  def apply(): SchemaReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReport]
  }
  
  @scala.inline
  implicit class SchemaReportMutableBuilder[Self <: SchemaReport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: SchemaReportKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setMetadata(value: SchemaReportMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setParams(value: SchemaParameters): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
  }
}
