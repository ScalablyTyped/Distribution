package typings.js2xmlparser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsMod {
  
  @JSImport("js2xmlparser/lib/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isArray(`val`: Any): /* is std.Array<unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<unknown> */ Boolean]
  
  inline def isFunction(`val`: Any): /* is std.Function */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is std.Function */ Boolean]
  
  inline def isMap(`val`: Any): /* is std.Map<unknown, unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMap")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is std.Map<unknown, unknown> */ Boolean]
  
  inline def isNull(`val`: Any): /* is null */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNull")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is null */ Boolean]
  
  inline def isObject(`val`: Any): /* is std.Record<string, unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is std.Record<string, unknown> */ Boolean]
  
  inline def isSet(`val`: Any): /* is std.Set<unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSet")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is std.Set<unknown> */ Boolean]
  
  inline def isUndefined(`val`: Any): /* is undefined */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUndefined")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is undefined */ Boolean]
  
  inline def stringify(value: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any]).asInstanceOf[String]
}
