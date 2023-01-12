package typings.lesgo.anon

import typings.lesgo.utilsPrepSQLParamsMod.SQLValue
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2`[T /* <: Record[String, SQLValue] */] extends StObject {
  
  var key: /* keyof T */ String
}
object `2` {
  
  inline def apply[T /* <: Record[String, SQLValue] */](key: /* keyof T */ String): `2`[T] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[`2`[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `2`[?], T /* <: Record[String, SQLValue] */] (val x: Self & `2`[T]) extends AnyVal {
    
    inline def setKey(value: /* keyof T */ String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
