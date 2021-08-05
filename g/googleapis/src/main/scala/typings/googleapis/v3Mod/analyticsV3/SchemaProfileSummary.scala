package typings.googleapis.v3Mod.analyticsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for an Analytics ProfileSummary. ProfileSummary returns basic
  * information (i.e., summary) for a profile.
  */
trait SchemaProfileSummary extends StObject {
  
  /**
    * View (profile) ID.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Resource type for Analytics ProfileSummary.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * View (profile) name.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether this view (profile) is starred or not.
    */
  var starred: js.UndefOr[Boolean] = js.undefined
  
  /**
    * View (Profile) type. Supported types: WEB or APP.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaProfileSummary {
  
  inline def apply(): SchemaProfileSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProfileSummary]
  }
  
  extension [Self <: SchemaProfileSummary](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStarred(value: Boolean): Self = StObject.set(x, "starred", value.asInstanceOf[js.Any])
    
    inline def setStarredUndefined: Self = StObject.set(x, "starred", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
