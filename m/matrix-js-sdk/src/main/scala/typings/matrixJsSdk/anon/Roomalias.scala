package typings.matrixJsSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Roomalias extends StObject {
  
  var room_alias: js.UndefOr[String] = js.undefined
  
  var room_id: String
}
object Roomalias {
  
  inline def apply(room_id: String): Roomalias = {
    val __obj = js.Dynamic.literal(room_id = room_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Roomalias]
  }
  
  extension [Self <: Roomalias](x: Self) {
    
    inline def setRoom_alias(value: String): Self = StObject.set(x, "room_alias", value.asInstanceOf[js.Any])
    
    inline def setRoom_aliasUndefined: Self = StObject.set(x, "room_alias", js.undefined)
    
    inline def setRoom_id(value: String): Self = StObject.set(x, "room_id", value.asInstanceOf[js.Any])
  }
}
