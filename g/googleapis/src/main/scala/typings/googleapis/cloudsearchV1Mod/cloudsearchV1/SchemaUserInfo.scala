package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUserInfo extends StObject {
  
  /**
    * Describes how updater_count_to_show should be used.
    */
  var updaterCountDisplayType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The number of updaters for clients to show depending on UpdaterCountDisplayType.
    */
  var updaterCountToShow: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The email of the updater for clients to show used for Gmail items.
    */
  var updaterToShowEmail: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The gaia id of the updater for clients to show used for Gmail items. If the updater is an external user, the email field below should be populated.
    */
  var updaterToShowGaiaId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The updater for clients to show used for Dynamite Chat items.
    */
  var updaterToShowUserId: js.UndefOr[SchemaUserId] = js.undefined
}
object SchemaUserInfo {
  
  inline def apply(): SchemaUserInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserInfo]
  }
  
  extension [Self <: SchemaUserInfo](x: Self) {
    
    inline def setUpdaterCountDisplayType(value: String): Self = StObject.set(x, "updaterCountDisplayType", value.asInstanceOf[js.Any])
    
    inline def setUpdaterCountDisplayTypeNull: Self = StObject.set(x, "updaterCountDisplayType", null)
    
    inline def setUpdaterCountDisplayTypeUndefined: Self = StObject.set(x, "updaterCountDisplayType", js.undefined)
    
    inline def setUpdaterCountToShow(value: Double): Self = StObject.set(x, "updaterCountToShow", value.asInstanceOf[js.Any])
    
    inline def setUpdaterCountToShowNull: Self = StObject.set(x, "updaterCountToShow", null)
    
    inline def setUpdaterCountToShowUndefined: Self = StObject.set(x, "updaterCountToShow", js.undefined)
    
    inline def setUpdaterToShowEmail(value: String): Self = StObject.set(x, "updaterToShowEmail", value.asInstanceOf[js.Any])
    
    inline def setUpdaterToShowEmailNull: Self = StObject.set(x, "updaterToShowEmail", null)
    
    inline def setUpdaterToShowEmailUndefined: Self = StObject.set(x, "updaterToShowEmail", js.undefined)
    
    inline def setUpdaterToShowGaiaId(value: String): Self = StObject.set(x, "updaterToShowGaiaId", value.asInstanceOf[js.Any])
    
    inline def setUpdaterToShowGaiaIdNull: Self = StObject.set(x, "updaterToShowGaiaId", null)
    
    inline def setUpdaterToShowGaiaIdUndefined: Self = StObject.set(x, "updaterToShowGaiaId", js.undefined)
    
    inline def setUpdaterToShowUserId(value: SchemaUserId): Self = StObject.set(x, "updaterToShowUserId", value.asInstanceOf[js.Any])
    
    inline def setUpdaterToShowUserIdUndefined: Self = StObject.set(x, "updaterToShowUserId", js.undefined)
  }
}
