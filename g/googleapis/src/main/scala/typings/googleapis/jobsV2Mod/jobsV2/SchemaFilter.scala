package typings.googleapis.jobsV2Mod.jobsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Deprecated. Use BatchDeleteJobsRequest instead.  Input only.  Filter for
  * jobs to be deleted.
  */
trait SchemaFilter extends StObject {
  
  /**
    * Required.  The requisition ID (or posting ID) assigned by the client to
    * identify a job. This is intended for client identification and tracking
    * of listings. name takes precedence over this field The maximum number of
    * allowed characters is 225.
    */
  var requisitionId: js.UndefOr[String] = js.undefined
}
object SchemaFilter {
  
  inline def apply(): SchemaFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFilter]
  }
  
  extension [Self <: SchemaFilter](x: Self) {
    
    inline def setRequisitionId(value: String): Self = StObject.set(x, "requisitionId", value.asInstanceOf[js.Any])
    
    inline def setRequisitionIdUndefined: Self = StObject.set(x, "requisitionId", js.undefined)
  }
}
