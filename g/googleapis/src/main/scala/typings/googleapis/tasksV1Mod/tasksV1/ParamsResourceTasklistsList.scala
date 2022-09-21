package typings.googleapis.tasksV1Mod.tasksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceTasklistsList
  extends StObject
     with StandardParameters {
  
  /**
    * Maximum number of task lists returned on one page. Optional. The default is 20 (max allowed: 100).
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * Token specifying the result page to return. Optional.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}
object ParamsResourceTasklistsList {
  
  inline def apply(): ParamsResourceTasklistsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTasklistsList]
  }
  
  extension [Self <: ParamsResourceTasklistsList](x: Self) {
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
