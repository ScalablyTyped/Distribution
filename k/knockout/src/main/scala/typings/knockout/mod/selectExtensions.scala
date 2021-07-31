package typings.knockout.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectExtensions {
  
  @JSImport("knockout", "selectExtensions")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def readValue(element: HTMLElement): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("readValue")(element.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def writeValue(element: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("writeValue")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def writeValue(element: HTMLElement, value: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeValue")(element.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def writeValue(element: HTMLElement, value: js.Any, allowUnset: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeValue")(element.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allowUnset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def writeValue(element: HTMLElement, value: Unit, allowUnset: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeValue")(element.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allowUnset.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
