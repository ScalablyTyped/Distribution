package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRestrictItem extends StObject {
  
  var driveFollowUpRestrict: js.UndefOr[SchemaDriveFollowUpRestrict] = js.undefined
  
  var driveLocationRestrict: js.UndefOr[SchemaDriveLocationRestrict] = js.undefined
  
  /**
    * Drive Types.
    */
  var driveMimeTypeRestrict: js.UndefOr[SchemaDriveMimeTypeRestrict] = js.undefined
  
  var driveTimeSpanRestrict: js.UndefOr[SchemaDriveTimeSpanRestrict] = js.undefined
  
  /**
    * The search restrict (e.g. "after:2017-09-11 before:2017-09-12").
    */
  var searchOperator: js.UndefOr[String | Null] = js.undefined
}
object SchemaRestrictItem {
  
  inline def apply(): SchemaRestrictItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRestrictItem]
  }
  
  extension [Self <: SchemaRestrictItem](x: Self) {
    
    inline def setDriveFollowUpRestrict(value: SchemaDriveFollowUpRestrict): Self = StObject.set(x, "driveFollowUpRestrict", value.asInstanceOf[js.Any])
    
    inline def setDriveFollowUpRestrictUndefined: Self = StObject.set(x, "driveFollowUpRestrict", js.undefined)
    
    inline def setDriveLocationRestrict(value: SchemaDriveLocationRestrict): Self = StObject.set(x, "driveLocationRestrict", value.asInstanceOf[js.Any])
    
    inline def setDriveLocationRestrictUndefined: Self = StObject.set(x, "driveLocationRestrict", js.undefined)
    
    inline def setDriveMimeTypeRestrict(value: SchemaDriveMimeTypeRestrict): Self = StObject.set(x, "driveMimeTypeRestrict", value.asInstanceOf[js.Any])
    
    inline def setDriveMimeTypeRestrictUndefined: Self = StObject.set(x, "driveMimeTypeRestrict", js.undefined)
    
    inline def setDriveTimeSpanRestrict(value: SchemaDriveTimeSpanRestrict): Self = StObject.set(x, "driveTimeSpanRestrict", value.asInstanceOf[js.Any])
    
    inline def setDriveTimeSpanRestrictUndefined: Self = StObject.set(x, "driveTimeSpanRestrict", js.undefined)
    
    inline def setSearchOperator(value: String): Self = StObject.set(x, "searchOperator", value.asInstanceOf[js.Any])
    
    inline def setSearchOperatorNull: Self = StObject.set(x, "searchOperator", null)
    
    inline def setSearchOperatorUndefined: Self = StObject.set(x, "searchOperator", js.undefined)
  }
}
