package typings.jose.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolvedKey extends StObject {
  
  /** Key resolved from the key resolver function. */
  var key: KeyLike | js.typedarray.Uint8Array
}
object ResolvedKey {
  
  inline def apply(key: KeyLike | js.typedarray.Uint8Array): ResolvedKey = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedKey]
  }
  
  extension [Self <: ResolvedKey](x: Self) {
    
    inline def setKey(value: KeyLike | js.typedarray.Uint8Array): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
