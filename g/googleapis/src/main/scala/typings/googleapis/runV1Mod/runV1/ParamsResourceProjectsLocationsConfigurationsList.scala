package typings.googleapis.runV1Mod.runV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsConfigurationsList
  extends StObject
     with StandardParameters {
  
  /**
    * Optional. Encoded string to continue paging.
    */
  var continue: js.UndefOr[String] = js.undefined
  
  /**
    * Allows to filter resources based on a specific value for a field name. Send this in a query string format. i.e. 'metadata.name%3Dlorem'. Not currently used by Cloud Run.
    */
  var fieldSelector: js.UndefOr[String] = js.undefined
  
  /**
    * Not currently used by Cloud Run.
    */
  var includeUninitialized: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Allows to filter resources based on a label. Supported operations are =, !=, exists, in, and notIn.
    */
  var labelSelector: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The maximum number of records that should be returned.
    */
  var limit: js.UndefOr[Double] = js.undefined
  
  /**
    * The namespace from which the configurations should be listed. For Cloud Run (fully managed), replace {namespace_id\} with the project ID or number.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * The baseline resource version from which the list or watch operation should start. Not currently used by Cloud Run.
    */
  var resourceVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Flag that indicates that the client expects to watch this resource as well. Not currently used by Cloud Run.
    */
  var watch: js.UndefOr[Boolean] = js.undefined
}
object ParamsResourceProjectsLocationsConfigurationsList {
  
  inline def apply(): ParamsResourceProjectsLocationsConfigurationsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsConfigurationsList]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsConfigurationsList](x: Self) {
    
    inline def setContinue(value: String): Self = StObject.set(x, "continue", value.asInstanceOf[js.Any])
    
    inline def setContinueUndefined: Self = StObject.set(x, "continue", js.undefined)
    
    inline def setFieldSelector(value: String): Self = StObject.set(x, "fieldSelector", value.asInstanceOf[js.Any])
    
    inline def setFieldSelectorUndefined: Self = StObject.set(x, "fieldSelector", js.undefined)
    
    inline def setIncludeUninitialized(value: Boolean): Self = StObject.set(x, "includeUninitialized", value.asInstanceOf[js.Any])
    
    inline def setIncludeUninitializedUndefined: Self = StObject.set(x, "includeUninitialized", js.undefined)
    
    inline def setLabelSelector(value: String): Self = StObject.set(x, "labelSelector", value.asInstanceOf[js.Any])
    
    inline def setLabelSelectorUndefined: Self = StObject.set(x, "labelSelector", js.undefined)
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setResourceVersion(value: String): Self = StObject.set(x, "resourceVersion", value.asInstanceOf[js.Any])
    
    inline def setResourceVersionUndefined: Self = StObject.set(x, "resourceVersion", js.undefined)
    
    inline def setWatch(value: Boolean): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
    
    inline def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
  }
}
