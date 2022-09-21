package typings.googleapis.genomicsV1alpha2Mod.genomicsV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePipelinesList
  extends StObject
     with StandardParameters {
  
  /**
    * Pipelines with names that match this prefix should be returned. If unspecified, all pipelines in the project, up to `pageSize`, will be returned.
    */
  var namePrefix: js.UndefOr[String] = js.undefined
  
  /**
    * Number of pipelines to return at once. Defaults to 256, and max is 2048.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Token to use to indicate where to start getting results. If unspecified, returns the first page of results.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The name of the project to search for pipelines. Caller must have READ access to this project.
    */
  var projectId: js.UndefOr[String] = js.undefined
}
object ParamsResourcePipelinesList {
  
  inline def apply(): ParamsResourcePipelinesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePipelinesList]
  }
  
  extension [Self <: ParamsResourcePipelinesList](x: Self) {
    
    inline def setNamePrefix(value: String): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
    
    inline def setNamePrefixUndefined: Self = StObject.set(x, "namePrefix", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
