package typings.haxballHeadlessBrowser

import typings.haxballHeadlessBrowser.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoomConfigObject extends StObject {
  
  var geo: js.UndefOr[Code] = js.undefined
  
  var maxPlayers: js.UndefOr[Double] = js.undefined
  
  var noPlayer: js.UndefOr[Boolean] = js.undefined
  
  var password: js.UndefOr[String] = js.undefined
  
  var playerName: js.UndefOr[String] = js.undefined
  
  var public: js.UndefOr[Boolean] = js.undefined
  
  var roomName: js.UndefOr[String] = js.undefined
  
  var token: js.UndefOr[String] = js.undefined
}
object RoomConfigObject {
  
  inline def apply(): RoomConfigObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoomConfigObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RoomConfigObject] (val x: Self) extends AnyVal {
    
    inline def setGeo(value: Code): Self = StObject.set(x, "geo", value.asInstanceOf[js.Any])
    
    inline def setGeoUndefined: Self = StObject.set(x, "geo", js.undefined)
    
    inline def setMaxPlayers(value: Double): Self = StObject.set(x, "maxPlayers", value.asInstanceOf[js.Any])
    
    inline def setMaxPlayersUndefined: Self = StObject.set(x, "maxPlayers", js.undefined)
    
    inline def setNoPlayer(value: Boolean): Self = StObject.set(x, "noPlayer", value.asInstanceOf[js.Any])
    
    inline def setNoPlayerUndefined: Self = StObject.set(x, "noPlayer", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setPlayerName(value: String): Self = StObject.set(x, "playerName", value.asInstanceOf[js.Any])
    
    inline def setPlayerNameUndefined: Self = StObject.set(x, "playerName", js.undefined)
    
    inline def setPublic(value: Boolean): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
    
    inline def setPublicUndefined: Self = StObject.set(x, "public", js.undefined)
    
    inline def setRoomName(value: String): Self = StObject.set(x, "roomName", value.asInstanceOf[js.Any])
    
    inline def setRoomNameUndefined: Self = StObject.set(x, "roomName", js.undefined)
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}
