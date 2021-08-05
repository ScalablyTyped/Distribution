package typings.googleapis.containerV1Mod.containerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SetLoggingServiceRequest sets the logging service of a cluster.
  */
trait SchemaSetLoggingServiceRequest extends StObject {
  
  /**
    * Deprecated. The name of the cluster to upgrade. This field has been
    * deprecated and replaced by the name field.
    */
  var clusterId: js.UndefOr[String] = js.undefined
  
  /**
    * The logging service the cluster should use to write metrics. Currently
    * available options:  * &quot;logging.googleapis.com&quot; - the Google
    * Cloud Logging service * &quot;none&quot; - no metrics will be exported
    * from the cluster
    */
  var loggingService: js.UndefOr[String] = js.undefined
  
  /**
    * The name (project, location, cluster) of the cluster to set logging.
    * Specified in the format &#39;projects/x/locations/x/clusters/ *&#39;.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Deprecated. The Google Developers Console [project ID or project
    * number](https://support.google.com/cloud/answer/6158840). This field has
    * been deprecated and replaced by the name field.
    */
  var projectId: js.UndefOr[String] = js.undefined
  
  /**
    * Deprecated. The name of the Google Compute Engine
    * [zone](/compute/docs/zones#available) in which the cluster resides. This
    * field has been deprecated and replaced by the name field.
    */
  var zone: js.UndefOr[String] = js.undefined
}
object SchemaSetLoggingServiceRequest {
  
  inline def apply(): SchemaSetLoggingServiceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSetLoggingServiceRequest]
  }
  
  extension [Self <: SchemaSetLoggingServiceRequest](x: Self) {
    
    inline def setClusterId(value: String): Self = StObject.set(x, "clusterId", value.asInstanceOf[js.Any])
    
    inline def setClusterIdUndefined: Self = StObject.set(x, "clusterId", js.undefined)
    
    inline def setLoggingService(value: String): Self = StObject.set(x, "loggingService", value.asInstanceOf[js.Any])
    
    inline def setLoggingServiceUndefined: Self = StObject.set(x, "loggingService", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
