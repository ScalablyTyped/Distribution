package typings.googleapis.networkservicesV1beta1Mod.networkservicesV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMetadataLabelMatcher extends StObject {
  
  /**
    * Specifies how matching should be done. Supported values are: MATCH_ANY: At least one of the Labels specified in the matcher should match the metadata presented by xDS client. MATCH_ALL: The metadata presented by the xDS client should contain all of the labels specified here. The selection is determined based on the best match. For example, suppose there are three EndpointPolicy resources P1, P2 and P3 and if P1 has a the matcher as MATCH_ANY , P2 has MATCH_ALL , and P3 has MATCH_ALL . If a client with label connects, the config from P1 will be selected. If a client with label connects, the config from P2 will be selected. If a client with label connects, the config from P3 will be selected. If there is more than one best match, (for example, if a config P4 with selector exists and if a client with label connects), an error will be thrown.
    */
  var metadataLabelMatchCriteria: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of label value pairs that must match labels in the provided metadata based on filterMatchCriteria This list can have at most 64 entries. The list can be empty if the match criteria is MATCH_ANY, to specify a wildcard match (i.e this matches any client).
    */
  var metadataLabels: js.UndefOr[js.Array[SchemaMetadataLabels]] = js.undefined
}
object SchemaMetadataLabelMatcher {
  
  inline def apply(): SchemaMetadataLabelMatcher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetadataLabelMatcher]
  }
  
  extension [Self <: SchemaMetadataLabelMatcher](x: Self) {
    
    inline def setMetadataLabelMatchCriteria(value: String): Self = StObject.set(x, "metadataLabelMatchCriteria", value.asInstanceOf[js.Any])
    
    inline def setMetadataLabelMatchCriteriaNull: Self = StObject.set(x, "metadataLabelMatchCriteria", null)
    
    inline def setMetadataLabelMatchCriteriaUndefined: Self = StObject.set(x, "metadataLabelMatchCriteria", js.undefined)
    
    inline def setMetadataLabels(value: js.Array[SchemaMetadataLabels]): Self = StObject.set(x, "metadataLabels", value.asInstanceOf[js.Any])
    
    inline def setMetadataLabelsUndefined: Self = StObject.set(x, "metadataLabels", js.undefined)
    
    inline def setMetadataLabelsVarargs(value: SchemaMetadataLabels*): Self = StObject.set(x, "metadataLabels", js.Array(value*))
  }
}
