package typings.googleapis.v3p1beta1Mod.jobsV3p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Input only.  Create job request.
  */
trait SchemaCreateJobRequest extends StObject {
  
  /**
    * Required.  The Job to be created.
    */
  var job: js.UndefOr[SchemaJob] = js.undefined
}
object SchemaCreateJobRequest {
  
  inline def apply(): SchemaCreateJobRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateJobRequest]
  }
  
  extension [Self <: SchemaCreateJobRequest](x: Self) {
    
    inline def setJob(value: SchemaJob): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
    
    inline def setJobUndefined: Self = StObject.set(x, "job", js.undefined)
  }
}
