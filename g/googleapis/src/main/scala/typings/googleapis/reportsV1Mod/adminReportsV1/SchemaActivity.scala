package typings.googleapis.reportsV1Mod.adminReportsV1

import typings.googleapis.anon.ApplicationName
import typings.googleapis.anon.CallerType
import typings.googleapis.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for the activity resource.
  */
trait SchemaActivity extends StObject {
  
  /**
    * User doing the action.
    */
  var actor: js.UndefOr[CallerType] = js.undefined
  
  /**
    * ETag of the entry.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * Activity events.
    */
  var events: js.UndefOr[js.Array[Name]] = js.undefined
  
  /**
    * Unique identifier for each activity record.
    */
  var id: js.UndefOr[ApplicationName] = js.undefined
  
  /**
    * IP Address of the user doing the action.
    */
  var ipAddress: js.UndefOr[String] = js.undefined
  
  /**
    * Kind of resource this is.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Domain of source customer.
    */
  var ownerDomain: js.UndefOr[String] = js.undefined
}
object SchemaActivity {
  
  inline def apply(): SchemaActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaActivity]
  }
  
  extension [Self <: SchemaActivity](x: Self) {
    
    inline def setActor(value: CallerType): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    inline def setActorUndefined: Self = StObject.set(x, "actor", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setEvents(value: js.Array[Name]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setEventsVarargs(value: Name*): Self = StObject.set(x, "events", js.Array(value :_*))
    
    inline def setId(value: ApplicationName): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    inline def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setOwnerDomain(value: String): Self = StObject.set(x, "ownerDomain", value.asInstanceOf[js.Any])
    
    inline def setOwnerDomainUndefined: Self = StObject.set(x, "ownerDomain", js.undefined)
  }
}
