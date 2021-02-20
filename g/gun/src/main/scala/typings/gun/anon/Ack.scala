package typings.gun.anon

import typings.gun.gunNumbers.`2`
import typings.gun.mod.Gun.CryptoKeyPair
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ack extends StObject {
  
  var ack: `2` = js.native
  
  var get: String = js.native
  
  def on(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [unknown, unknown, unknown] is not an array type */ args: js.Tuple3[_, _, _]
  ): js.Any = js.native
  
  var put: Alias = js.native
  
  var sea: CryptoKeyPair = js.native
  
  var soul: String = js.native
}
object Ack {
  
  @scala.inline
  def apply(
    ack: `2`,
    get: String,
    on: js.Tuple3[_, _, _] => js.Any,
    put: Alias,
    sea: CryptoKeyPair,
    soul: String
  ): Ack = {
    val __obj = js.Dynamic.literal(ack = ack.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], on = js.Any.fromFunction1(on), put = put.asInstanceOf[js.Any], sea = sea.asInstanceOf[js.Any], soul = soul.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ack]
  }
  
  @scala.inline
  implicit class AckMutableBuilder[Self <: Ack] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAck(value: `2`): Self = StObject.set(x, "ack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGet(value: String): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOn(value: js.Tuple3[_, _, _] => js.Any): Self = StObject.set(x, "on", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPut(value: Alias): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSea(value: CryptoKeyPair): Self = StObject.set(x, "sea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoul(value: String): Self = StObject.set(x, "soul", value.asInstanceOf[js.Any])
  }
}
