package typings.googleapis.storageV1beta2Mod.storageV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceBucketsList
  extends StObject
     with StandardParameters {
  
  /**
    * Maximum number of buckets to return.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * A previously-returned page token representing part of the larger set of results to view.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * A valid API project identifier.
    */
  var project: js.UndefOr[String] = js.undefined
  
  /**
    * Set of properties to return. Defaults to noAcl.
    */
  var projection: js.UndefOr[String] = js.undefined
}
object ParamsResourceBucketsList {
  
  inline def apply(): ParamsResourceBucketsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBucketsList]
  }
  
  extension [Self <: ParamsResourceBucketsList](x: Self) {
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setProjection(value: String): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
  }
}
