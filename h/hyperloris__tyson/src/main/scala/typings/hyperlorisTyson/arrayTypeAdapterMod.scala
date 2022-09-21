package typings.hyperlorisTyson

import typings.hyperlorisTyson.mod.Tyson
import typings.hyperlorisTyson.typeAdapterFactoryMod.TypeAdapterFactory
import typings.hyperlorisTyson.typeAdapterMod.TypeAdapter
import typings.hyperlorisTyson.typeTokenMod.TypeToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrayTypeAdapterMod {
  
  @JSImport("@hyperloris/tyson/dist/types/adapters/arrayTypeAdapter", "ArrayTypeAdapter")
  @js.native
  open class ArrayTypeAdapter protected () extends TypeAdapter[Any] {
    def this(tyson: Tyson, typeToken: TypeToken[Any]) = this()
    
    /* private */ var _typeToken: Any = js.native
    
    /* private */ var _tyson: Any = js.native
    
    /* private */ def convertSingleOrMultiTypeArray(isFrom: Any, inArray: Any): Any = js.native
  }
  /* static members */
  object ArrayTypeAdapter {
    
    @JSImport("@hyperloris/tyson/dist/types/adapters/arrayTypeAdapter", "ArrayTypeAdapter.FACTORY")
    @js.native
    val FACTORY: TypeAdapterFactory = js.native
  }
}
