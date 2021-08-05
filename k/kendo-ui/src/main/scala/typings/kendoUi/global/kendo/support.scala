package typings.kendoUi.global.kendo

import typings.kendoUi.anon.AppMode
import typings.kendoUi.anon.Edge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object support {
  
  @JSGlobal("kendo.support")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("kendo.support.browser")
  @js.native
  def browser: Edge = js.native
  inline def browser_=(x: Edge): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("browser")(x.asInstanceOf[js.Any])
  
  @JSGlobal("kendo.support.devicePixelRatio")
  @js.native
  def devicePixelRatio: Double = js.native
  inline def devicePixelRatio_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("devicePixelRatio")(x.asInstanceOf[js.Any])
  
  @JSGlobal("kendo.support.hasHW3D")
  @js.native
  def hasHW3D: Boolean = js.native
  inline def hasHW3D_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hasHW3D")(x.asInstanceOf[js.Any])
  
  @JSGlobal("kendo.support.hasNativeScrolling")
  @js.native
  def hasNativeScrolling: Boolean = js.native
  inline def hasNativeScrolling_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hasNativeScrolling")(x.asInstanceOf[js.Any])
  
  @JSGlobal("kendo.support.mobileOS")
  @js.native
  def mobileOS: AppMode = js.native
  inline def mobileOS_=(x: AppMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mobileOS")(x.asInstanceOf[js.Any])
  
  @JSGlobal("kendo.support.placeholder")
  @js.native
  def placeholder: Boolean = js.native
  inline def placeholder_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(x.asInstanceOf[js.Any])
  
  @JSGlobal("kendo.support.pointers")
  @js.native
  def pointers: Boolean = js.native
  inline def pointers_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointers")(x.asInstanceOf[js.Any])
  
  inline def scrollbar(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("scrollbar")().asInstanceOf[Double]
  
  @JSGlobal("kendo.support.touch")
  @js.native
  def touch: Boolean = js.native
  inline def touch_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("touch")(x.asInstanceOf[js.Any])
  
  @JSGlobal("kendo.support.zoomLevel")
  @js.native
  def zoomLevel: Double = js.native
  inline def zoomLevel_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("zoomLevel")(x.asInstanceOf[js.Any])
}
