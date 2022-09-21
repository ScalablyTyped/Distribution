package typings.googleapis.runV1Mod.runV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTrafficTarget extends StObject {
  
  /**
    * ConfigurationName of a configuration to whose latest revision we will send this portion of traffic. When the "status.latestReadyRevisionName" of the referenced configuration changes, we will automatically migrate traffic from the prior "latest ready" revision to the new one. This field is never set in Route's status, only its spec. This is mutually exclusive with RevisionName. Cloud Run currently supports a single ConfigurationName.
    */
  var configurationName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. LatestRevision may be provided to indicate that the latest ready Revision of the Configuration should be used for this traffic target. When provided LatestRevision must be true if RevisionName is empty; it must be false when RevisionName is non-empty.
    */
  var latestRevision: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Percent specifies percent of the traffic to this Revision or Configuration. This defaults to zero if unspecified.
    */
  var percent: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * RevisionName of a specific revision to which to send this portion of traffic. This is mutually exclusive with ConfigurationName.
    */
  var revisionName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Tag is used to expose a dedicated url for referencing this target exclusively.
    */
  var tag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. URL displays the URL for accessing tagged traffic targets. URL is displayed in status, and is disallowed on spec. URL must contain a scheme (e.g. https://) and a hostname, but may not contain anything else (e.g. basic auth, url path, etc.)
    */
  var url: js.UndefOr[String | Null] = js.undefined
}
object SchemaTrafficTarget {
  
  inline def apply(): SchemaTrafficTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTrafficTarget]
  }
  
  extension [Self <: SchemaTrafficTarget](x: Self) {
    
    inline def setConfigurationName(value: String): Self = StObject.set(x, "configurationName", value.asInstanceOf[js.Any])
    
    inline def setConfigurationNameNull: Self = StObject.set(x, "configurationName", null)
    
    inline def setConfigurationNameUndefined: Self = StObject.set(x, "configurationName", js.undefined)
    
    inline def setLatestRevision(value: Boolean): Self = StObject.set(x, "latestRevision", value.asInstanceOf[js.Any])
    
    inline def setLatestRevisionNull: Self = StObject.set(x, "latestRevision", null)
    
    inline def setLatestRevisionUndefined: Self = StObject.set(x, "latestRevision", js.undefined)
    
    inline def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
    
    inline def setPercentNull: Self = StObject.set(x, "percent", null)
    
    inline def setPercentUndefined: Self = StObject.set(x, "percent", js.undefined)
    
    inline def setRevisionName(value: String): Self = StObject.set(x, "revisionName", value.asInstanceOf[js.Any])
    
    inline def setRevisionNameNull: Self = StObject.set(x, "revisionName", null)
    
    inline def setRevisionNameUndefined: Self = StObject.set(x, "revisionName", js.undefined)
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagNull: Self = StObject.set(x, "tag", null)
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
