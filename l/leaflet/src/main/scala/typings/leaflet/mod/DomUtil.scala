package typings.leaflet.mod

import typings.leaflet.leafletBooleans.`false`
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DomUtil {
  
  @JSImport("leaflet", "DomUtil")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("leaflet", "DomUtil.TRANSFORM")
  @js.native
  def TRANSFORM: String = js.native
  inline def TRANSFORM_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRANSFORM")(x.asInstanceOf[js.Any])
  
  @JSImport("leaflet", "DomUtil.TRANSITION")
  @js.native
  def TRANSITION: String = js.native
  inline def TRANSITION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRANSITION")(x.asInstanceOf[js.Any])
  
  @JSImport("leaflet", "DomUtil.TRANSITION_END")
  @js.native
  def TRANSITION_END: String = js.native
  inline def TRANSITION_END_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRANSITION_END")(x.asInstanceOf[js.Any])
  
  inline def addClass(el: HTMLElement, name: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addClass")(el.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def create(tagName: String): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  inline def create(tagName: String, className: String): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  inline def create(tagName: String, className: String, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  inline def create(tagName: String, className: Unit, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  
  inline def disableImageDrag(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableImageDrag")().asInstanceOf[Unit]
  
  inline def disableTextSelection(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableTextSelection")().asInstanceOf[Unit]
  
  inline def empty(el: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def enableImageDrag(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableImageDrag")().asInstanceOf[Unit]
  
  inline def enableTextSelection(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableTextSelection")().asInstanceOf[Unit]
  
  /**
    * Get Element by its ID or with the given HTML-Element
    */
  inline def get(element: String): HTMLElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(element.asInstanceOf[js.Any]).asInstanceOf[HTMLElement | Null]
  inline def get(element: HTMLElement): HTMLElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(element.asInstanceOf[js.Any]).asInstanceOf[HTMLElement | Null]
  
  inline def getClass_(el: HTMLElement): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getClass")(el.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getPosition(el: HTMLElement): Point_ = ^.asInstanceOf[js.Dynamic].applyDynamic("getPosition")(el.asInstanceOf[js.Any]).asInstanceOf[Point_]
  
  inline def getStyle(el: HTMLElement, styleAttrib: String): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getStyle")(el.asInstanceOf[js.Any], styleAttrib.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  inline def hasClass(el: HTMLElement, name: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasClass")(el.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def preventOutline(el: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("preventOutline")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def remove(el: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def removeClass(el: HTMLElement, name: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeClass")(el.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def restoreOutline(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("restoreOutline")().asInstanceOf[Unit]
  
  inline def setClass(el: HTMLElement, name: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setClass")(el.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setOpacity(el: HTMLElement, opacity: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setOpacity")(el.asInstanceOf[js.Any], opacity.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setPosition(el: HTMLElement, position: Point_): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setPosition")(el.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setTransform(el: HTMLElement, offset: Point_): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setTransform")(el.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setTransform(el: HTMLElement, offset: Point_, scale: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setTransform")(el.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def testProp(props: js.Array[String]): String | `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("testProp")(props.asInstanceOf[js.Any]).asInstanceOf[String | `false`]
  
  inline def toBack(el: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("toBack")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def toFront(el: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("toFront")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
