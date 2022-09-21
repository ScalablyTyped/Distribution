package typings.googleapis.loggingV2Mod.loggingV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceFoldersLocationsBucketsViewsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the policy: "projects/[PROJECT_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID]" For example:"projects/my-project/locations/global/buckets/my-bucket/views/my-view"
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceFoldersLocationsBucketsViewsGet {
  
  inline def apply(): ParamsResourceFoldersLocationsBucketsViewsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceFoldersLocationsBucketsViewsGet]
  }
  
  extension [Self <: ParamsResourceFoldersLocationsBucketsViewsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
