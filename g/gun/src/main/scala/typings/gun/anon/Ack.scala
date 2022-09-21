package typings.gun.anon

import typings.gun.gunNumbers.`2`
import typings.gun.mod.Gun.CryptoKeyPair
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ack extends StObject {
  
  var ack: `2`
  
  var get: String
  
  def on(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [unknown, unknown, unknown] is not an array type */ args: js.Tuple3[Any, Any, Any]
  ): Any
  
  var put: Alias
  
  var sea: CryptoKeyPair
  
  var soul: String
}
object Ack {
  
  inline def apply(get: String, on: js.Tuple3[Any, Any, Any] => Any, put: Alias, sea: CryptoKeyPair, soul: String): Ack = {
    val __obj = js.Dynamic.literal(ack = 2, get = get.asInstanceOf[js.Any], on = js.Any.fromFunction1(on), put = put.asInstanceOf[js.Any], sea = sea.asInstanceOf[js.Any], soul = soul.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ack]
  }
  
  extension [Self <: Ack](x: Self) {
    
    inline def setAck(value: `2`): Self = StObject.set(x, "ack", value.asInstanceOf[js.Any])
    
    inline def setGet(value: String): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setOn(value: js.Tuple3[Any, Any, Any] => Any): Self = StObject.set(x, "on", js.Any.fromFunction1(value))
    
    inline def setPut(value: Alias): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
    
    inline def setSea(value: CryptoKeyPair): Self = StObject.set(x, "sea", value.asInstanceOf[js.Any])
    
    inline def setSoul(value: String): Self = StObject.set(x, "soul", value.asInstanceOf[js.Any])
  }
}
