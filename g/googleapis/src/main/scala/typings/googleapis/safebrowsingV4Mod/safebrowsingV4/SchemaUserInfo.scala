package typings.googleapis.safebrowsingV4Mod.safebrowsingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Details about the user that encountered the threat.
  */
trait SchemaUserInfo extends StObject {
  
  /**
    * The UN M.49 region code associated with the user&#39;s location.
    */
  var regionCode: js.UndefOr[String] = js.undefined
  
  /**
    * Unique user identifier defined by the client.
    */
  var userId: js.UndefOr[String] = js.undefined
}
object SchemaUserInfo {
  
  @scala.inline
  def apply(): SchemaUserInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserInfo]
  }
  
  @scala.inline
  implicit class SchemaUserInfoMutableBuilder[Self <: SchemaUserInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRegionCode(value: String): Self = StObject.set(x, "regionCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionCodeUndefined: Self = StObject.set(x, "regionCode", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
