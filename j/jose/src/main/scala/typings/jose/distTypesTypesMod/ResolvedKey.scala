package typings.jose.distTypesTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolvedKey[T /* <: KeyLike */] extends StObject {
  
  /** Key resolved from the key resolver function. */
  var key: T | js.typedarray.Uint8Array
}
object ResolvedKey {
  
  inline def apply[T /* <: KeyLike */](key: T | js.typedarray.Uint8Array): ResolvedKey[T] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedKey[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResolvedKey[?], T /* <: KeyLike */] (val x: Self & ResolvedKey[T]) extends AnyVal {
    
    inline def setKey(value: T | js.typedarray.Uint8Array): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
