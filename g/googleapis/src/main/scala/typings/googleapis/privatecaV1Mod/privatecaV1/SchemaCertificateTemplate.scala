package typings.googleapis.privatecaV1Mod.privatecaV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCertificateTemplate extends StObject {
  
  /**
    * Output only. The time at which this CertificateTemplate was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. A human-readable description of scenarios this template is intended for.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Describes constraints on identities that may be appear in Certificates issued using this template. If this is omitted, then this template will not add restrictions on a certificate's identity.
    */
  var identityConstraints: js.UndefOr[SchemaCertificateIdentityConstraints] = js.undefined
  
  /**
    * Optional. Labels with user-defined metadata.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Output only. The resource name for this CertificateTemplate in the format `projects/x/locations/x/certificateTemplates/x`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Describes the set of X.509 extensions that may appear in a Certificate issued using this CertificateTemplate. If a certificate request sets extensions that don't appear in the passthrough_extensions, those extensions will be dropped. If the issuing CaPool's IssuancePolicy defines baseline_values that don't appear here, the certificate issuance request will fail. If this is omitted, then this template will not add restrictions on a certificate's X.509 extensions. These constraints do not apply to X.509 extensions set in this CertificateTemplate's predefined_values.
    */
  var passthroughExtensions: js.UndefOr[SchemaCertificateExtensionConstraints] = js.undefined
  
  /**
    * Optional. A set of X.509 values that will be applied to all issued certificates that use this template. If the certificate request includes conflicting values for the same properties, they will be overwritten by the values defined here. If the issuing CaPool's IssuancePolicy defines conflicting baseline_values for the same properties, the certificate issuance request will fail.
    */
  var predefinedValues: js.UndefOr[SchemaX509Parameters] = js.undefined
  
  /**
    * Output only. The time at which this CertificateTemplate was updated.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaCertificateTemplate {
  
  inline def apply(): SchemaCertificateTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCertificateTemplate]
  }
  
  extension [Self <: SchemaCertificateTemplate](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setIdentityConstraints(value: SchemaCertificateIdentityConstraints): Self = StObject.set(x, "identityConstraints", value.asInstanceOf[js.Any])
    
    inline def setIdentityConstraintsUndefined: Self = StObject.set(x, "identityConstraints", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPassthroughExtensions(value: SchemaCertificateExtensionConstraints): Self = StObject.set(x, "passthroughExtensions", value.asInstanceOf[js.Any])
    
    inline def setPassthroughExtensionsUndefined: Self = StObject.set(x, "passthroughExtensions", js.undefined)
    
    inline def setPredefinedValues(value: SchemaX509Parameters): Self = StObject.set(x, "predefinedValues", value.asInstanceOf[js.Any])
    
    inline def setPredefinedValuesUndefined: Self = StObject.set(x, "predefinedValues", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
