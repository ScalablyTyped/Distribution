package typings.googleapis.doubleclickbidmanagerV1Mod.doubleclickbidmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to fetch stored inventory sources, campaigns, insertion orders,
  * line items, TrueView ad groups and ads.
  */
@js.native
trait SchemaDownloadRequest extends StObject {
  
  /**
    * File types that will be returned.  Acceptable values are:   -
    * &quot;AD&quot;  - &quot;AD_GROUP&quot;  - &quot;CAMPAIGN&quot;  -
    * &quot;INSERTION_ORDER&quot;  - &quot;LINE_ITEM&quot;  -
    * &quot;INVENTORY_SOURCE&quot;
    */
  var fileTypes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The IDs of the specified filter type. This is used to filter entities to
    * fetch. At least one ID must be specified.
    */
  var filterIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Filter type used to filter entities to fetch.
    */
  var filterType: js.UndefOr[String] = js.native
  
  /**
    * SDF Version (column names, types, order) in which the entities will be
    * returned. Default to 3.1.
    */
  var version: js.UndefOr[String] = js.native
}
object SchemaDownloadRequest {
  
  @scala.inline
  def apply(): SchemaDownloadRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDownloadRequest]
  }
  
  @scala.inline
  implicit class SchemaDownloadRequestMutableBuilder[Self <: SchemaDownloadRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileTypes(value: js.Array[String]): Self = StObject.set(x, "fileTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileTypesUndefined: Self = StObject.set(x, "fileTypes", js.undefined)
    
    @scala.inline
    def setFileTypesVarargs(value: String*): Self = StObject.set(x, "fileTypes", js.Array(value :_*))
    
    @scala.inline
    def setFilterIds(value: js.Array[String]): Self = StObject.set(x, "filterIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterIdsUndefined: Self = StObject.set(x, "filterIds", js.undefined)
    
    @scala.inline
    def setFilterIdsVarargs(value: String*): Self = StObject.set(x, "filterIds", js.Array(value :_*))
    
    @scala.inline
    def setFilterType(value: String): Self = StObject.set(x, "filterType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterTypeUndefined: Self = StObject.set(x, "filterType", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
