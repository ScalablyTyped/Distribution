package typings.googleapis.dnsV1Mod.dnsV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaManagedZone extends StObject {
  
  var creationTime: js.UndefOr[String] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var dnsName: js.UndefOr[String] = js.native
  
  var dnssecConfig: js.UndefOr[SchemaManagedZoneDnsSecConfig] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dns#managedZone&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var nameServerSet: js.UndefOr[String] = js.native
  
  var nameServers: js.UndefOr[js.Array[String]] = js.native
  
  var privateVisibilityConfig: js.UndefOr[SchemaManagedZonePrivateVisibilityConfig] = js.native
  
  var visibility: js.UndefOr[String] = js.native
}
object SchemaManagedZone {
  
  @scala.inline
  def apply(): SchemaManagedZone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedZone]
  }
  
  @scala.inline
  implicit class SchemaManagedZoneMutableBuilder[Self <: SchemaManagedZone] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDnsName(value: String): Self = StObject.set(x, "dnsName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDnsNameUndefined: Self = StObject.set(x, "dnsName", js.undefined)
    
    @scala.inline
    def setDnssecConfig(value: SchemaManagedZoneDnsSecConfig): Self = StObject.set(x, "dnssecConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDnssecConfigUndefined: Self = StObject.set(x, "dnssecConfig", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameServerSet(value: String): Self = StObject.set(x, "nameServerSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameServerSetUndefined: Self = StObject.set(x, "nameServerSet", js.undefined)
    
    @scala.inline
    def setNameServers(value: js.Array[String]): Self = StObject.set(x, "nameServers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameServersUndefined: Self = StObject.set(x, "nameServers", js.undefined)
    
    @scala.inline
    def setNameServersVarargs(value: String*): Self = StObject.set(x, "nameServers", js.Array(value :_*))
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPrivateVisibilityConfig(value: SchemaManagedZonePrivateVisibilityConfig): Self = StObject.set(x, "privateVisibilityConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateVisibilityConfigUndefined: Self = StObject.set(x, "privateVisibilityConfig", js.undefined)
    
    @scala.inline
    def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
