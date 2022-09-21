package typings.googleapis.networkservicesV1Mod.networkservicesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEndpointMatcher extends StObject {
  
  /**
    * The matcher is based on node metadata presented by xDS clients.
    */
  var metadataLabelMatcher: js.UndefOr[SchemaEndpointMatcherMetadataLabelMatcher] = js.undefined
}
object SchemaEndpointMatcher {
  
  inline def apply(): SchemaEndpointMatcher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEndpointMatcher]
  }
  
  extension [Self <: SchemaEndpointMatcher](x: Self) {
    
    inline def setMetadataLabelMatcher(value: SchemaEndpointMatcherMetadataLabelMatcher): Self = StObject.set(x, "metadataLabelMatcher", value.asInstanceOf[js.Any])
    
    inline def setMetadataLabelMatcherUndefined: Self = StObject.set(x, "metadataLabelMatcher", js.undefined)
  }
}
