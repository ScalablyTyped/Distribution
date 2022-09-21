package typings.googleapis.v1beta1Mod.accessapprovalV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAccessLocations extends StObject {
  
  /**
    * The &quot;home office&quot; location of the principal. A two-letter country code (ISO 3166-1 alpha-2), such as &quot;US&quot;, &quot;DE&quot; or &quot;GB&quot; or a region code. In some limited situations Google systems may refer refer to a region code instead of a country code. Possible Region Codes: &lt;ol&gt;   &lt;li&gt;ASI: Asia&lt;/li&gt;   &lt;li&gt;EUR: Europe&lt;/li&gt;   &lt;li&gt;OCE: Oceania&lt;/li&gt;   &lt;li&gt;AFR: Africa&lt;/li&gt;   &lt;li&gt;NAM: North America&lt;/li&gt;   &lt;li&gt;SAM: South America&lt;/li&gt;   &lt;li&gt;ANT: Antarctica&lt;/li&gt;   &lt;li&gt;ANY: Any location&lt;/li&gt; &lt;/ol&gt;
    */
  var principalOfficeCountry: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Physical location of the principal at the time of the access. A two-letter country code (ISO 3166-1 alpha-2), such as &quot;US&quot;, &quot;DE&quot; or &quot;GB&quot; or a region code. In some limited situations Google systems may refer refer to a region code instead of a country code. Possible Region Codes: &lt;ol&gt;   &lt;li&gt;ASI: Asia&lt;/li&gt;   &lt;li&gt;EUR: Europe&lt;/li&gt;   &lt;li&gt;OCE: Oceania&lt;/li&gt;   &lt;li&gt;AFR: Africa&lt;/li&gt;   &lt;li&gt;NAM: North America&lt;/li&gt;   &lt;li&gt;SAM: South America&lt;/li&gt;   &lt;li&gt;ANT: Antarctica&lt;/li&gt;   &lt;li&gt;ANY: Any location&lt;/li&gt; &lt;/ol&gt;
    */
  var principalPhysicalLocationCountry: js.UndefOr[String | Null] = js.undefined
}
object SchemaAccessLocations {
  
  inline def apply(): SchemaAccessLocations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccessLocations]
  }
  
  extension [Self <: SchemaAccessLocations](x: Self) {
    
    inline def setPrincipalOfficeCountry(value: String): Self = StObject.set(x, "principalOfficeCountry", value.asInstanceOf[js.Any])
    
    inline def setPrincipalOfficeCountryNull: Self = StObject.set(x, "principalOfficeCountry", null)
    
    inline def setPrincipalOfficeCountryUndefined: Self = StObject.set(x, "principalOfficeCountry", js.undefined)
    
    inline def setPrincipalPhysicalLocationCountry(value: String): Self = StObject.set(x, "principalPhysicalLocationCountry", value.asInstanceOf[js.Any])
    
    inline def setPrincipalPhysicalLocationCountryNull: Self = StObject.set(x, "principalPhysicalLocationCountry", null)
    
    inline def setPrincipalPhysicalLocationCountryUndefined: Self = StObject.set(x, "principalPhysicalLocationCountry", js.undefined)
  }
}
