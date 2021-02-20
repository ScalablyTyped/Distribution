package typings.hyperlorisTyson

import typings.hyperlorisTyson.mod.Tyson
import typings.hyperlorisTyson.typeAdapterFactoryMod.TypeAdapterFactory
import typings.hyperlorisTyson.typeAdapterMod.TypeAdapter
import typings.hyperlorisTyson.typeTokenMod.TypeToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objectTypeAdapterMod {
  
  @JSImport("@hyperloris/tyson/dist/types/adapters/objectTypeAdapter", "ObjectTypeAdapter")
  @js.native
  class ObjectTypeAdapter protected ()
    extends TypeAdapter[js.Any] {
    def this(tyson: Tyson, typeToken: TypeToken[_]) = this()
    
    var _jsonPropertyMetadataMap: js.Any = js.native
    
    var _typeToken: js.Any = js.native
    
    var _tyson: js.Any = js.native
    
    /**
      * This method extracts all the metadata of the class and saves them in a map.
      * In this way the reflection operations are performed only once when the adapter is created.
      */
    /* private */ def loadMetadata(): js.Any = js.native
  }
  /* static members */
  object ObjectTypeAdapter {
    
    @JSImport("@hyperloris/tyson/dist/types/adapters/objectTypeAdapter", "ObjectTypeAdapter.FACTORY")
    @js.native
    val FACTORY: TypeAdapterFactory = js.native
  }
}
