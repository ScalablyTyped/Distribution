package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsNotesList
  extends StObject
     with StandardParameters {
  
  /**
    * The filter expression.
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * Number of notes to return in the list. Must be positive. Max allowed page size is 1000. If not specified, page size defaults to 20.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Token to provide to skip to a particular spot in the list.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The name of the project to list notes for in the form of `projects/[PROJECT_ID]`.
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsNotesList {
  
  inline def apply(): ParamsResourceProjectsNotesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsNotesList]
  }
  
  extension [Self <: ParamsResourceProjectsNotesList](x: Self) {
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
