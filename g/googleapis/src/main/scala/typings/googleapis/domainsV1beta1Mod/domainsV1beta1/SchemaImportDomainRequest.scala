package typings.googleapis.domainsV1beta1Mod.domainsV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaImportDomainRequest extends StObject {
  
  /**
    * Required. The domain name. Unicode domain names must be expressed in Punycode format.
    */
  var domainName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Set of labels associated with the `Registration`.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
}
object SchemaImportDomainRequest {
  
  inline def apply(): SchemaImportDomainRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImportDomainRequest]
  }
  
  extension [Self <: SchemaImportDomainRequest](x: Self) {
    
    inline def setDomainName(value: String): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
    
    inline def setDomainNameNull: Self = StObject.set(x, "domainName", null)
    
    inline def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
  }
}
