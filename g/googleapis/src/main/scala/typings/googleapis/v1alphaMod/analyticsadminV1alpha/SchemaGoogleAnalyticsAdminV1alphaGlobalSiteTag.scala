package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAnalyticsAdminV1alphaGlobalSiteTag extends StObject {
  
  /**
    * Output only. Resource name for this GlobalSiteTag resource. Format: properties/{property_id\}/dataStreams/{stream_id\}/globalSiteTag Example: "properties/123/dataStreams/456/globalSiteTag"
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Immutable. JavaScript code snippet to be pasted as the first item into the head tag of every webpage to measure.
    */
  var snippet: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAnalyticsAdminV1alphaGlobalSiteTag {
  
  inline def apply(): SchemaGoogleAnalyticsAdminV1alphaGlobalSiteTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAnalyticsAdminV1alphaGlobalSiteTag]
  }
  
  extension [Self <: SchemaGoogleAnalyticsAdminV1alphaGlobalSiteTag](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSnippet(value: String): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    
    inline def setSnippetNull: Self = StObject.set(x, "snippet", null)
    
    inline def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
  }
}
