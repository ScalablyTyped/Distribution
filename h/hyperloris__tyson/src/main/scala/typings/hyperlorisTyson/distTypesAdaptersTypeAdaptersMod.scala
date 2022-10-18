package typings.hyperlorisTyson

import typings.hyperlorisTyson.distTypesReflectTypeTokenMod.ClassType
import typings.hyperlorisTyson.distTypesReflectTypeTokenMod.TypeToken
import typings.hyperlorisTyson.distTypesTypeAdapterFactoryMod.TypeAdapterFactory
import typings.hyperlorisTyson.distTypesTypeAdapterMod.TypeAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesAdaptersTypeAdaptersMod {
  
  @JSImport("@hyperloris/tyson/dist/types/adapters/typeAdapters", "TypeAdapters")
  @js.native
  open class TypeAdapters () extends StObject
  /* static members */
  object TypeAdapters {
    
    @JSImport("@hyperloris/tyson/dist/types/adapters/typeAdapters", "TypeAdapters")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@hyperloris/tyson/dist/types/adapters/typeAdapters", "TypeAdapters.BOOLEAN_FACTORY")
    @js.native
    def BOOLEAN_FACTORY: TypeAdapterFactory = js.native
    inline def BOOLEAN_FACTORY_=(x: TypeAdapterFactory): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BOOLEAN_FACTORY")(x.asInstanceOf[js.Any])
    
    @JSImport("@hyperloris/tyson/dist/types/adapters/typeAdapters", "TypeAdapters.DATE_FACTORY")
    @js.native
    def DATE_FACTORY: TypeAdapterFactory = js.native
    inline def DATE_FACTORY_=(x: TypeAdapterFactory): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DATE_FACTORY")(x.asInstanceOf[js.Any])
    
    @JSImport("@hyperloris/tyson/dist/types/adapters/typeAdapters", "TypeAdapters.NUMBER_FACTORY")
    @js.native
    def NUMBER_FACTORY: TypeAdapterFactory = js.native
    inline def NUMBER_FACTORY_=(x: TypeAdapterFactory): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NUMBER_FACTORY")(x.asInstanceOf[js.Any])
    
    @JSImport("@hyperloris/tyson/dist/types/adapters/typeAdapters", "TypeAdapters.STRING_FACTORY")
    @js.native
    def STRING_FACTORY: TypeAdapterFactory = js.native
    inline def STRING_FACTORY_=(x: TypeAdapterFactory): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STRING_FACTORY")(x.asInstanceOf[js.Any])
    
    inline def newFactory[TT](`type`: ClassType[TT], typeAdapter: TypeAdapter[TT]): TypeAdapterFactory = (^.asInstanceOf[js.Dynamic].applyDynamic("newFactory")(`type`.asInstanceOf[js.Any], typeAdapter.asInstanceOf[js.Any])).asInstanceOf[TypeAdapterFactory]
    inline def newFactory[TT](`type`: TypeToken[TT], typeAdapter: TypeAdapter[TT]): TypeAdapterFactory = (^.asInstanceOf[js.Dynamic].applyDynamic("newFactory")(`type`.asInstanceOf[js.Any], typeAdapter.asInstanceOf[js.Any])).asInstanceOf[TypeAdapterFactory]
  }
}
