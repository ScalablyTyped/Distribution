package typings.hyperlorisTyson

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typeAdapterMod {
  
  @JSImport("@hyperloris/tyson/dist/types/typeAdapter", "TypeAdapter")
  @js.native
  abstract class TypeAdapter[T] () extends StObject {
    
    /* protected */ def _fromJson(json: js.Any): T | js.Array[T] = js.native
    
    /* protected */ def _toJson(src: T): js.Any = js.native
    
    def fromJson(json: js.Any): js.UndefOr[T | js.Array[T]] = js.native
    
    def toJson(src: T): js.Any = js.native
  }
}
