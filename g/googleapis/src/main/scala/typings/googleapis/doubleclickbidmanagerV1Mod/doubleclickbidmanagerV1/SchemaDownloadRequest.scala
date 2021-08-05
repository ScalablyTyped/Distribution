package typings.googleapis.doubleclickbidmanagerV1Mod.doubleclickbidmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to fetch stored inventory sources, campaigns, insertion orders,
  * line items, TrueView ad groups and ads.
  */
trait SchemaDownloadRequest extends StObject {
  
  /**
    * File types that will be returned.  Acceptable values are:   -
    * &quot;AD&quot;  - &quot;AD_GROUP&quot;  - &quot;CAMPAIGN&quot;  -
    * &quot;INSERTION_ORDER&quot;  - &quot;LINE_ITEM&quot;  -
    * &quot;INVENTORY_SOURCE&quot;
    */
  var fileTypes: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The IDs of the specified filter type. This is used to filter entities to
    * fetch. At least one ID must be specified.
    */
  var filterIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Filter type used to filter entities to fetch.
    */
  var filterType: js.UndefOr[String] = js.undefined
  
  /**
    * SDF Version (column names, types, order) in which the entities will be
    * returned. Default to 3.1.
    */
  var version: js.UndefOr[String] = js.undefined
}
object SchemaDownloadRequest {
  
  inline def apply(): SchemaDownloadRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDownloadRequest]
  }
  
  extension [Self <: SchemaDownloadRequest](x: Self) {
    
    inline def setFileTypes(value: js.Array[String]): Self = StObject.set(x, "fileTypes", value.asInstanceOf[js.Any])
    
    inline def setFileTypesUndefined: Self = StObject.set(x, "fileTypes", js.undefined)
    
    inline def setFileTypesVarargs(value: String*): Self = StObject.set(x, "fileTypes", js.Array(value :_*))
    
    inline def setFilterIds(value: js.Array[String]): Self = StObject.set(x, "filterIds", value.asInstanceOf[js.Any])
    
    inline def setFilterIdsUndefined: Self = StObject.set(x, "filterIds", js.undefined)
    
    inline def setFilterIdsVarargs(value: String*): Self = StObject.set(x, "filterIds", js.Array(value :_*))
    
    inline def setFilterType(value: String): Self = StObject.set(x, "filterType", value.asInstanceOf[js.Any])
    
    inline def setFilterTypeUndefined: Self = StObject.set(x, "filterType", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
