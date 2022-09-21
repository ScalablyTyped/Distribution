package typings.knockout.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectExtensions {
  
  @JSImport("knockout", "selectExtensions")
  @js.native
  val ^ : js.Any = js.native
  
  inline def readValue(element: HTMLElement): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("readValue")(element.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def writeValue(element: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("writeValue")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def writeValue(element: HTMLElement, value: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeValue")(element.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeValue(element: HTMLElement, value: Any, allowUnset: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeValue")(element.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allowUnset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeValue(element: HTMLElement, value: Unit, allowUnset: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeValue")(element.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allowUnset.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
