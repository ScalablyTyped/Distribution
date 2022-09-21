package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLaunchFlexTemplateResponse extends StObject {
  
  /**
    * The job that was launched, if the request was not a dry run and the job was successfully launched.
    */
  var job: js.UndefOr[SchemaJob] = js.undefined
}
object SchemaLaunchFlexTemplateResponse {
  
  inline def apply(): SchemaLaunchFlexTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLaunchFlexTemplateResponse]
  }
  
  extension [Self <: SchemaLaunchFlexTemplateResponse](x: Self) {
    
    inline def setJob(value: SchemaJob): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
    
    inline def setJobUndefined: Self = StObject.set(x, "job", js.undefined)
  }
}
