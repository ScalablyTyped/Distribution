package typings.hyperlorisTyson

import typings.hyperlorisTyson.mod.Tyson
import typings.hyperlorisTyson.typeAdapterMod.TypeAdapter
import typings.hyperlorisTyson.typeTokenMod.TypeToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typeAdapterFactoryMod {
  
  @js.native
  trait TypeAdapterFactory extends StObject {
    
    def create[T](tyson: Tyson, typeToken: TypeToken[T]): js.UndefOr[TypeAdapter[T]] = js.native
  }
  object TypeAdapterFactory {
    
    @scala.inline
    def apply(create: (Tyson, TypeToken[js.Any]) => js.UndefOr[TypeAdapter[js.Any]]): TypeAdapterFactory = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create))
      __obj.asInstanceOf[TypeAdapterFactory]
    }
    
    @scala.inline
    implicit class TypeAdapterFactoryMutableBuilder[Self <: TypeAdapterFactory] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreate(value: (Tyson, TypeToken[js.Any]) => js.UndefOr[TypeAdapter[js.Any]]): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
    }
  }
}
