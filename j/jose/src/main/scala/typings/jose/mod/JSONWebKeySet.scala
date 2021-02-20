package typings.jose.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSONWebKeySet extends StObject {
  
  var keys: js.Array[JSONWebKey] = js.native
}
object JSONWebKeySet {
  
  @scala.inline
  def apply(keys: js.Array[JSONWebKey]): JSONWebKeySet = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONWebKeySet]
  }
  
  @scala.inline
  implicit class JSONWebKeySetMutableBuilder[Self <: JSONWebKeySet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeys(value: js.Array[JSONWebKey]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeysVarargs(value: JSONWebKey*): Self = StObject.set(x, "keys", js.Array(value :_*))
  }
}
