package typings.haxballHeadlessBrowser

import typings.haxballHeadlessBrowser.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlayerObject extends StObject {
  
  var admin: Boolean
  
  var auth: String
  
  var conn: String
  
  var id: Double
  
  var name: String
  
  var position: X
  
  var team: TeamID
}
object PlayerObject {
  
  inline def apply(admin: Boolean, auth: String, conn: String, id: Double, name: String, position: X, team: TeamID): PlayerObject = {
    val __obj = js.Dynamic.literal(admin = admin.asInstanceOf[js.Any], auth = auth.asInstanceOf[js.Any], conn = conn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], team = team.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayerObject]
  }
  
  extension [Self <: PlayerObject](x: Self) {
    
    inline def setAdmin(value: Boolean): Self = StObject.set(x, "admin", value.asInstanceOf[js.Any])
    
    inline def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setConn(value: String): Self = StObject.set(x, "conn", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: X): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setTeam(value: TeamID): Self = StObject.set(x, "team", value.asInstanceOf[js.Any])
  }
}
