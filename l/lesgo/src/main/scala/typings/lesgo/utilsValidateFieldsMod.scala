package typings.lesgo

import typings.lesgo.lesgoStrings.`enum`
import typings.lesgo.lesgoStrings.`object`
import typings.lesgo.lesgoStrings.array
import typings.lesgo.lesgoStrings.decimal
import typings.lesgo.lesgoStrings.email
import typings.lesgo.lesgoStrings.number
import typings.lesgo.lesgoStrings.string
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsValidateFieldsMod {
  
  @JSImport("lesgo/utils/validateFields", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TParams /* <: Record[String, Any] */](
    params: Partial[Record[/* keyof TParams */ String, Any]],
    validFields: js.Array[Validation[String]]
  ): Partial[Record[/* keyof TParams */ String, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], validFields.asInstanceOf[js.Any])).asInstanceOf[Partial[Record[/* keyof TParams */ String, Any]]]
  
  trait Validation[T] extends StObject {
    
    var key: T
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var `type`: string | `object` | number | decimal | email | array | `enum` | String
  }
  object Validation {
    
    inline def apply[T](key: T, `type`: string | `object` | number | decimal | email | array | `enum` | String): Validation[T] = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Validation[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Validation[?], T] (val x: Self & Validation[T]) extends AnyVal {
      
      inline def setKey(value: T): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setType(value: string | `object` | number | decimal | email | array | `enum` | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
