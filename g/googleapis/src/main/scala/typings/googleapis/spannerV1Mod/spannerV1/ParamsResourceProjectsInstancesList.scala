package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsInstancesList
  extends StObject
     with StandardParameters {
  
  /**
    * An expression for filtering the results of the request. Filter rules are case insensitive. The fields eligible for filtering are: * `name` * `display_name` * `labels.key` where key is the name of a label Some examples of using filters are: * `name:*` --\> The instance has a name. * `name:Howl` --\> The instance's name contains the string "howl". * `name:HOWL` --\> Equivalent to above. * `NAME:howl` --\> Equivalent to above. * `labels.env:*` --\> The instance has the label "env". * `labels.env:dev` --\> The instance has the label "env" and the value of the label contains the string "dev". * `name:howl labels.env:dev` --\> The instance's name contains "howl" and it has the label "env" with its value containing "dev".
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * Deadline used while retrieving metadata for instances. Instances whose metadata cannot be retrieved within this deadline will be added to unreachable in ListInstancesResponse.
    */
  var instanceDeadline: js.UndefOr[String] = js.undefined
  
  /**
    * Number of instances to be returned in the response. If 0 or less, defaults to the server's maximum allowed page size.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * If non-empty, `page_token` should contain a next_page_token from a previous ListInstancesResponse.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The name of the project for which a list of instances is requested. Values are of the form `projects/`.
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsInstancesList {
  
  inline def apply(): ParamsResourceProjectsInstancesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsInstancesList]
  }
  
  extension [Self <: ParamsResourceProjectsInstancesList](x: Self) {
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setInstanceDeadline(value: String): Self = StObject.set(x, "instanceDeadline", value.asInstanceOf[js.Any])
    
    inline def setInstanceDeadlineUndefined: Self = StObject.set(x, "instanceDeadline", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
