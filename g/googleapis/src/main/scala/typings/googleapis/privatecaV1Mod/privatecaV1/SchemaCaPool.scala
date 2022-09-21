package typings.googleapis.privatecaV1Mod.privatecaV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCaPool extends StObject {
  
  /**
    * Optional. The IssuancePolicy to control how Certificates will be issued from this CaPool.
    */
  var issuancePolicy: js.UndefOr[SchemaIssuancePolicy] = js.undefined
  
  /**
    * Optional. Labels with user-defined metadata.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Output only. The resource name for this CaPool in the format `projects/x/locations/x/caPools/x`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The PublishingOptions to follow when issuing Certificates from any CertificateAuthority in this CaPool.
    */
  var publishingOptions: js.UndefOr[SchemaPublishingOptions] = js.undefined
  
  /**
    * Required. Immutable. The Tier of this CaPool.
    */
  var tier: js.UndefOr[String | Null] = js.undefined
}
object SchemaCaPool {
  
  inline def apply(): SchemaCaPool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCaPool]
  }
  
  extension [Self <: SchemaCaPool](x: Self) {
    
    inline def setIssuancePolicy(value: SchemaIssuancePolicy): Self = StObject.set(x, "issuancePolicy", value.asInstanceOf[js.Any])
    
    inline def setIssuancePolicyUndefined: Self = StObject.set(x, "issuancePolicy", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPublishingOptions(value: SchemaPublishingOptions): Self = StObject.set(x, "publishingOptions", value.asInstanceOf[js.Any])
    
    inline def setPublishingOptionsUndefined: Self = StObject.set(x, "publishingOptions", js.undefined)
    
    inline def setTier(value: String): Self = StObject.set(x, "tier", value.asInstanceOf[js.Any])
    
    inline def setTierNull: Self = StObject.set(x, "tier", null)
    
    inline def setTierUndefined: Self = StObject.set(x, "tier", js.undefined)
  }
}
