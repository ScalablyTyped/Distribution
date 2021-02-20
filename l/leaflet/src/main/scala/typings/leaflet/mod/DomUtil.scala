package typings.leaflet.mod

import typings.leaflet.leafletBooleans.`false`
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DomUtil {
  
  @JSImport("leaflet", "DomUtil")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("leaflet", "DomUtil.TRANSFORM")
  @js.native
  def TRANSFORM: String = js.native
  @scala.inline
  def TRANSFORM_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRANSFORM")(x.asInstanceOf[js.Any])
  
  @JSImport("leaflet", "DomUtil.TRANSITION")
  @js.native
  def TRANSITION: String = js.native
  @scala.inline
  def TRANSITION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRANSITION")(x.asInstanceOf[js.Any])
  
  @JSImport("leaflet", "DomUtil.TRANSITION_END")
  @js.native
  def TRANSITION_END: String = js.native
  @scala.inline
  def TRANSITION_END_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRANSITION_END")(x.asInstanceOf[js.Any])
  
  @JSImport("leaflet", "DomUtil.addClass")
  @js.native
  def addClass(el: HTMLElement, name: String): Unit = js.native
  
  @JSImport("leaflet", "DomUtil.create")
  @js.native
  def create(tagName: String): HTMLElement = js.native
  @JSImport("leaflet", "DomUtil.create")
  @js.native
  def create(tagName: String, className: js.UndefOr[scala.Nothing], container: HTMLElement): HTMLElement = js.native
  @JSImport("leaflet", "DomUtil.create")
  @js.native
  def create(tagName: String, className: String): HTMLElement = js.native
  @JSImport("leaflet", "DomUtil.create")
  @js.native
  def create(tagName: String, className: String, container: HTMLElement): HTMLElement = js.native
  
  @JSImport("leaflet", "DomUtil.disableImageDrag")
  @js.native
  def disableImageDrag(): Unit = js.native
  
  @JSImport("leaflet", "DomUtil.disableTextSelection")
  @js.native
  def disableTextSelection(): Unit = js.native
  
  @JSImport("leaflet", "DomUtil.empty")
  @js.native
  def empty(el: HTMLElement): Unit = js.native
  
  @JSImport("leaflet", "DomUtil.enableImageDrag")
  @js.native
  def enableImageDrag(): Unit = js.native
  
  @JSImport("leaflet", "DomUtil.enableTextSelection")
  @js.native
  def enableTextSelection(): Unit = js.native
  
  /**
    * Get Element by its ID or with the given HTML-Element
    */
  @JSImport("leaflet", "DomUtil.get")
  @js.native
  def get(element: String): HTMLElement | Null = js.native
  @JSImport("leaflet", "DomUtil.get")
  @js.native
  def get(element: HTMLElement): HTMLElement | Null = js.native
  
  @JSImport("leaflet", "DomUtil.getClass")
  @js.native
  def getClass_(el: HTMLElement): String = js.native
  
  @JSImport("leaflet", "DomUtil.getPosition")
  @js.native
  def getPosition(el: HTMLElement): Point_ = js.native
  
  @JSImport("leaflet", "DomUtil.getStyle")
  @js.native
  def getStyle(el: HTMLElement, styleAttrib: String): String | Null = js.native
  
  @JSImport("leaflet", "DomUtil.hasClass")
  @js.native
  def hasClass(el: HTMLElement, name: String): Boolean = js.native
  
  @JSImport("leaflet", "DomUtil.preventOutline")
  @js.native
  def preventOutline(el: HTMLElement): Unit = js.native
  
  @JSImport("leaflet", "DomUtil.remove")
  @js.native
  def remove(el: HTMLElement): Unit = js.native
  
  @JSImport("leaflet", "DomUtil.removeClass")
  @js.native
  def removeClass(el: HTMLElement, name: String): Unit = js.native
  
  @JSImport("leaflet", "DomUtil.restoreOutline")
  @js.native
  def restoreOutline(): Unit = js.native
  
  @JSImport("leaflet", "DomUtil.setClass")
  @js.native
  def setClass(el: HTMLElement, name: String): Unit = js.native
  
  @JSImport("leaflet", "DomUtil.setOpacity")
  @js.native
  def setOpacity(el: HTMLElement, opacity: Double): Unit = js.native
  
  @JSImport("leaflet", "DomUtil.setPosition")
  @js.native
  def setPosition(el: HTMLElement, position: Point_): Unit = js.native
  
  @JSImport("leaflet", "DomUtil.setTransform")
  @js.native
  def setTransform(el: HTMLElement, offset: Point_): Unit = js.native
  @JSImport("leaflet", "DomUtil.setTransform")
  @js.native
  def setTransform(el: HTMLElement, offset: Point_, scale: Double): Unit = js.native
  
  @JSImport("leaflet", "DomUtil.testProp")
  @js.native
  def testProp(props: js.Array[String]): String | `false` = js.native
  
  @JSImport("leaflet", "DomUtil.toBack")
  @js.native
  def toBack(el: HTMLElement): Unit = js.native
  
  @JSImport("leaflet", "DomUtil.toFront")
  @js.native
  def toFront(el: HTMLElement): Unit = js.native
}
