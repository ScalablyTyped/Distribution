package typings.hyperlorisTyson

import typings.hyperlorisTyson.distTypesReflectTypeTokenMod.TypeToken
import typings.hyperlorisTyson.distTypesTypeAdapterFactoryMod.TypeAdapterFactory
import typings.hyperlorisTyson.distTypesTypeAdapterMod.TypeAdapter
import typings.hyperlorisTyson.mod.Tyson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesAdaptersObjectTypeAdapterMod {
  
  @JSImport("@hyperloris/tyson/dist/types/adapters/objectTypeAdapter", "ObjectTypeAdapter")
  @js.native
  open class ObjectTypeAdapter protected () extends TypeAdapter[Any] {
    def this(tyson: Tyson, typeToken: TypeToken[Any]) = this()
    
    /* private */ var _jsonPropertyMetadataMap: Any = js.native
    
    /* private */ var _typeToken: Any = js.native
    
    /* private */ var _tyson: Any = js.native
    
    /**
      * This method extracts all the metadata of the class and saves them in a map.
      * In this way the reflection operations are performed only once when the adapter is created.
      */
    /* private */ def loadMetadata(): Any = js.native
  }
  /* static members */
  object ObjectTypeAdapter {
    
    @JSImport("@hyperloris/tyson/dist/types/adapters/objectTypeAdapter", "ObjectTypeAdapter.FACTORY")
    @js.native
    val FACTORY: TypeAdapterFactory = js.native
  }
}
