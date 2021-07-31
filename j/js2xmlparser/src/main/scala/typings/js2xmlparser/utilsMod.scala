package typings.js2xmlparser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("js2xmlparser/lib/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def isArray(`val`: js.Any): /* is std.Array<unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<unknown> */ Boolean]
  
  @scala.inline
  def isFunction(`val`: js.Any): /* is std.Function */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is std.Function */ Boolean]
  
  @scala.inline
  def isMap(`val`: js.Any): /* is std.Map<unknown, unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMap")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is std.Map<unknown, unknown> */ Boolean]
  
  @scala.inline
  def isNull(`val`: js.Any): /* is null */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNull")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is null */ Boolean]
  
  @scala.inline
  def isObject(`val`: js.Any): /* is std.Record<string, unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is std.Record<string, unknown> */ Boolean]
  
  @scala.inline
  def isSet(`val`: js.Any): /* is std.Set<unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSet")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is std.Set<unknown> */ Boolean]
  
  @scala.inline
  def isUndefined(`val`: js.Any): /* is undefined */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUndefined")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is undefined */ Boolean]
  
  @scala.inline
  def stringify(value: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any]).asInstanceOf[String]
}
