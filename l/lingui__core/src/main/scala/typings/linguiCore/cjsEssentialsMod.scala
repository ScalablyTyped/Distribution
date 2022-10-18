package typings.linguiCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsEssentialsMod {
  
  @JSImport("@lingui/core/cjs/essentials", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isEmpty(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isFunction(f: Any): /* is std.Function */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(f.asInstanceOf[js.Any]).asInstanceOf[/* is std.Function */ Boolean]
  
  inline def isString(s: Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(s.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
}
