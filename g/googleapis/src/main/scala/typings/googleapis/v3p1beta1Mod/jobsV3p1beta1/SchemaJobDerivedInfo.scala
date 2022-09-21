package typings.googleapis.v3p1beta1Mod.jobsV3p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaJobDerivedInfo extends StObject {
  
  /**
    * Job categories derived from Job.title and Job.description.
    */
  var jobCategories: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Structured locations of the job, resolved from Job.addresses. locations are exactly matched to Job.addresses in the same order.
    */
  var locations: js.UndefOr[js.Array[SchemaLocation]] = js.undefined
}
object SchemaJobDerivedInfo {
  
  inline def apply(): SchemaJobDerivedInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJobDerivedInfo]
  }
  
  extension [Self <: SchemaJobDerivedInfo](x: Self) {
    
    inline def setJobCategories(value: js.Array[String]): Self = StObject.set(x, "jobCategories", value.asInstanceOf[js.Any])
    
    inline def setJobCategoriesNull: Self = StObject.set(x, "jobCategories", null)
    
    inline def setJobCategoriesUndefined: Self = StObject.set(x, "jobCategories", js.undefined)
    
    inline def setJobCategoriesVarargs(value: String*): Self = StObject.set(x, "jobCategories", js.Array(value*))
    
    inline def setLocations(value: js.Array[SchemaLocation]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    inline def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
    
    inline def setLocationsVarargs(value: SchemaLocation*): Self = StObject.set(x, "locations", js.Array(value*))
  }
}
