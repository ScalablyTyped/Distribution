package typings.hyperlorisTyson

import typings.hyperlorisTyson.distTypesReflectTypeTokenMod.TypeToken
import typings.hyperlorisTyson.distTypesTypeAdapterFactoryMod.TypeAdapterFactory
import typings.hyperlorisTyson.distTypesTypeAdapterMod.TypeAdapter
import typings.hyperlorisTyson.mod.Tyson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesAdaptersArrayTypeAdapterMod {
  
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
