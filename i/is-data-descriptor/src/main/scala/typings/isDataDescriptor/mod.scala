package typings.isDataDescriptor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(obj: Any): /* is std.PropertyDescriptor */ Boolean = ^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any]).asInstanceOf[/* is std.PropertyDescriptor */ Boolean]
  inline def apply[ObjectType /* <: js.Object */](obj: ObjectType, key: /* keyof ObjectType */ String): Boolean = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("is-data-descriptor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
