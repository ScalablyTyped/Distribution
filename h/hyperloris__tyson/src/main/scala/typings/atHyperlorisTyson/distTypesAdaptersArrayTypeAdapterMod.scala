package typings.atHyperlorisTyson

import typings.atHyperlorisTyson.atHyperlorisTysonMod.Tyson
import typings.atHyperlorisTyson.distTypesReflectTypeTokenMod.TypeToken
import typings.atHyperlorisTyson.distTypesTypeAdapterFactoryMod.TypeAdapterFactory
import typings.atHyperlorisTyson.distTypesTypeAdapterMod.TypeAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@hyperloris/tyson/dist/types/adapters/arrayTypeAdapter", JSImport.Namespace)
@js.native
object distTypesAdaptersArrayTypeAdapterMod extends js.Object {
  @js.native
  class ArrayTypeAdapter protected ()
    extends TypeAdapter[js.Any] {
    def this(tyson: Tyson, typeToken: TypeToken[_]) = this()
    var _typeToken: js.Any = js.native
    var _tyson: js.Any = js.native
    /* private */ def convertSingleOrMultiTypeArray(isFrom: js.Any, inArray: js.Any): js.Any = js.native
  }
  
  /* static members */
  @js.native
  object ArrayTypeAdapter extends js.Object {
    val FACTORY: TypeAdapterFactory = js.native
  }
  
}

