package typings.hashIt

import typings.std.ArrayBufferLike
import typings.std.DocumentFragment
import typings.std.Map
import typings.std.Record
import typings.std.Set
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsTypesStringifyMod {
  
  @JSImport("hash-it/dist/cjs/types/stringify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def stringify(value: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stringify(value: Any, state: RecursiveState): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def stringifyArray(value: js.Array[Any], state: RecursiveState): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyArray")(value.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def stringifyArrayBufferFallback(buffer: ArrayBufferLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyArrayBufferFallback")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def stringifyArrayBufferModern(buffer: ArrayBufferLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyArrayBufferModern")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def stringifyArrayBufferNone(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyArrayBufferNone")().asInstanceOf[String]
  
  inline def stringifyDocumentFragment(fragment: DocumentFragment): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyDocumentFragment")(fragment.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def stringifyMap(map: Map[Any, Any], state: RecursiveState): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyMap")(map.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def stringifyObject(value: Record[String, Any], state: RecursiveState): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyObject")(value.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def stringifySet(set: Set[Any], state: RecursiveState): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifySet")(set.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait RecursiveState extends StObject {
    
    var cache: WeakMap[Any, Double]
    
    var id: Double
  }
  object RecursiveState {
    
    inline def apply(cache: WeakMap[Any, Double], id: Double): RecursiveState = {
      val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecursiveState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RecursiveState] (val x: Self) extends AnyVal {
      
      inline def setCache(value: WeakMap[Any, Double]): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
}
