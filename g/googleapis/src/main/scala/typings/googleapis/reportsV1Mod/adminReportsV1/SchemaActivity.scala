package typings.googleapis.reportsV1Mod.adminReportsV1

import typings.googleapis.anon.ApplicationName
import typings.googleapis.anon.CallerType
import typings.googleapis.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaActivity extends StObject {
  
  /**
    * User doing the action.
    */
  var actor: js.UndefOr[CallerType | Null] = js.undefined
  
  /**
    * ETag of the entry.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Activity events in the report.
    */
  var events: js.UndefOr[js.Array[Name] | Null] = js.undefined
  
  /**
    * Unique identifier for each activity record.
    */
  var id: js.UndefOr[ApplicationName | Null] = js.undefined
  
  /**
    * IP address of the user doing the action. This is the Internet Protocol (IP) address of the user when logging into Google Workspace, which may or may not reflect the user's physical location. For example, the IP address can be the user's proxy server's address or a virtual private network (VPN) address. The API supports IPv4 and IPv6.
    */
  var ipAddress: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of API resource. For an activity report, the value is `audit#activity`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This is the domain that is affected by the report's event. For example domain of Admin console or the Drive application's document owner.
    */
  var ownerDomain: js.UndefOr[String | Null] = js.undefined
}
object SchemaActivity {
  
  inline def apply(): SchemaActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaActivity]
  }
  
  extension [Self <: SchemaActivity](x: Self) {
    
    inline def setActor(value: CallerType): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    inline def setActorNull: Self = StObject.set(x, "actor", null)
    
    inline def setActorUndefined: Self = StObject.set(x, "actor", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setEvents(value: js.Array[Name]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsNull: Self = StObject.set(x, "events", null)
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setEventsVarargs(value: Name*): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setId(value: ApplicationName): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    inline def setIpAddressNull: Self = StObject.set(x, "ipAddress", null)
    
    inline def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setOwnerDomain(value: String): Self = StObject.set(x, "ownerDomain", value.asInstanceOf[js.Any])
    
    inline def setOwnerDomainNull: Self = StObject.set(x, "ownerDomain", null)
    
    inline def setOwnerDomainUndefined: Self = StObject.set(x, "ownerDomain", js.undefined)
  }
}
