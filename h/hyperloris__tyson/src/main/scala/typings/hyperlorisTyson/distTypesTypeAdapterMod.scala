package typings.hyperlorisTyson

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTypeAdapterMod {
  
  /* note: abstract class */ @JSImport("@hyperloris/tyson/dist/types/typeAdapter", "TypeAdapter")
  @js.native
  open class TypeAdapter[T] () extends StObject {
    
    /* protected */ def _fromJson(json: Any): T | js.Array[T] = js.native
    
    /* protected */ def _toJson(src: T): Any = js.native
    
    def fromJson(json: Any): js.UndefOr[T | js.Array[T]] = js.native
    
    def toJson(src: T): Any = js.native
  }
}
