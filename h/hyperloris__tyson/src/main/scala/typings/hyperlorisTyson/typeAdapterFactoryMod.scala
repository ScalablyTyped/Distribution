package typings.hyperlorisTyson

import typings.hyperlorisTyson.mod.Tyson
import typings.hyperlorisTyson.typeAdapterMod.TypeAdapter
import typings.hyperlorisTyson.typeTokenMod.TypeToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typeAdapterFactoryMod {
  
  trait TypeAdapterFactory extends StObject {
    
    def create[T](tyson: Tyson, typeToken: TypeToken[T]): js.UndefOr[TypeAdapter[T]]
  }
  object TypeAdapterFactory {
    
    inline def apply(create: (Tyson, TypeToken[js.Any]) => js.UndefOr[TypeAdapter[js.Any]]): TypeAdapterFactory = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create))
      __obj.asInstanceOf[TypeAdapterFactory]
    }
    
    extension [Self <: TypeAdapterFactory](x: Self) {
      
      inline def setCreate(value: (Tyson, TypeToken[js.Any]) => js.UndefOr[TypeAdapter[js.Any]]): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
    }
  }
}
