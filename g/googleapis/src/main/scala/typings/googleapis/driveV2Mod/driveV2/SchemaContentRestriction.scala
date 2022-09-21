package typings.googleapis.driveV2Mod.driveV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaContentRestriction extends StObject {
  
  /**
    * Whether the content of the file is read-only. If a file is read-only, a new revision of the file may not be added, comments may not be added or modified, and the title of the file may not be modified.
    */
  var readOnly: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Reason for why the content of the file is restricted. This is only mutable on requests that also set readOnly=true.
    */
  var reason: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The user who set the content restriction. Only populated if readOnly is true.
    */
  var restrictingUser: js.UndefOr[SchemaUser] = js.undefined
  
  /**
    * The time at which the content restriction was set (formatted RFC 3339 timestamp). Only populated if readOnly is true.
    */
  var restrictionDate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of the content restriction. Currently the only possible value is globalContentRestriction.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaContentRestriction {
  
  inline def apply(): SchemaContentRestriction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContentRestriction]
  }
  
  extension [Self <: SchemaContentRestriction](x: Self) {
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyNull: Self = StObject.set(x, "readOnly", null)
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonNull: Self = StObject.set(x, "reason", null)
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setRestrictingUser(value: SchemaUser): Self = StObject.set(x, "restrictingUser", value.asInstanceOf[js.Any])
    
    inline def setRestrictingUserUndefined: Self = StObject.set(x, "restrictingUser", js.undefined)
    
    inline def setRestrictionDate(value: String): Self = StObject.set(x, "restrictionDate", value.asInstanceOf[js.Any])
    
    inline def setRestrictionDateNull: Self = StObject.set(x, "restrictionDate", null)
    
    inline def setRestrictionDateUndefined: Self = StObject.set(x, "restrictionDate", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
