package typings.isPlainObj

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("is-plain-obj", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Value](value: Any): /* is std.Record<std.PropertyKey, Value> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Record<std.PropertyKey, Value> */ Boolean]
}
