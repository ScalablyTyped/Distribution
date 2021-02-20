package typings.hyperlorisTyson

import typings.hyperlorisTyson.typeAdapterFactoryMod.TypeAdapterFactory
import typings.hyperlorisTyson.typeAdapterMod.TypeAdapter
import typings.hyperlorisTyson.typeTokenMod.ClassType
import typings.hyperlorisTyson.typeTokenMod.TypeToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typeAdaptersMod {
  
  @JSImport("@hyperloris/tyson/dist/types/adapters/typeAdapters", "TypeAdapters")
  @js.native
  class TypeAdapters () extends StObject
  /* static members */
  object TypeAdapters {
    
    @JSImport("@hyperloris/tyson/dist/types/adapters/typeAdapters", "TypeAdapters")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@hyperloris/tyson/dist/types/adapters/typeAdapters", "TypeAdapters.BOOLEAN_FACTORY")
    @js.native
    def BOOLEAN_FACTORY: TypeAdapterFactory = js.native
    @scala.inline
    def BOOLEAN_FACTORY_=(x: TypeAdapterFactory): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BOOLEAN_FACTORY")(x.asInstanceOf[js.Any])
    
    @JSImport("@hyperloris/tyson/dist/types/adapters/typeAdapters", "TypeAdapters.DATE_FACTORY")
    @js.native
    def DATE_FACTORY: TypeAdapterFactory = js.native
    @scala.inline
    def DATE_FACTORY_=(x: TypeAdapterFactory): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DATE_FACTORY")(x.asInstanceOf[js.Any])
    
    @JSImport("@hyperloris/tyson/dist/types/adapters/typeAdapters", "TypeAdapters.NUMBER_FACTORY")
    @js.native
    def NUMBER_FACTORY: TypeAdapterFactory = js.native
    @scala.inline
    def NUMBER_FACTORY_=(x: TypeAdapterFactory): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NUMBER_FACTORY")(x.asInstanceOf[js.Any])
    
    @JSImport("@hyperloris/tyson/dist/types/adapters/typeAdapters", "TypeAdapters.STRING_FACTORY")
    @js.native
    def STRING_FACTORY: TypeAdapterFactory = js.native
    @scala.inline
    def STRING_FACTORY_=(x: TypeAdapterFactory): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STRING_FACTORY")(x.asInstanceOf[js.Any])
    
    @JSImport("@hyperloris/tyson/dist/types/adapters/typeAdapters", "TypeAdapters.newFactory")
    @js.native
    def newFactory[TT](`type`: ClassType[TT], typeAdapter: TypeAdapter[TT]): TypeAdapterFactory = js.native
    @JSImport("@hyperloris/tyson/dist/types/adapters/typeAdapters", "TypeAdapters.newFactory")
    @js.native
    def newFactory[TT](`type`: TypeToken[TT], typeAdapter: TypeAdapter[TT]): TypeAdapterFactory = js.native
  }
}
