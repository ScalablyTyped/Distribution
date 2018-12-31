package typings
package leafletLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "DomUtil")
@js.native
object DomUtilNs extends js.Object {
  var TRANSFORM: java.lang.String = js.native
  var TRANSITION: java.lang.String = js.native
  var TRANSITION_END: java.lang.String = js.native
  def addClass(el: stdLib.HTMLElement, name: java.lang.String): scala.Unit = js.native
  def create(tagName: java.lang.String): stdLib.HTMLElement = js.native
  def create(tagName: java.lang.String, className: java.lang.String): stdLib.HTMLElement = js.native
  def create(tagName: java.lang.String, className: java.lang.String, container: stdLib.HTMLElement): stdLib.HTMLElement = js.native
  def disableImageDrag(): scala.Unit = js.native
  def disableTextSelection(): scala.Unit = js.native
  def empty(el: stdLib.HTMLElement): scala.Unit = js.native
  def enableImageDrag(): scala.Unit = js.native
  def enableTextSelection(): scala.Unit = js.native
  /**
    * Get Element by its ID or with the given HTML-Element
    */
  def get(element: java.lang.String): stdLib.HTMLElement | scala.Null = js.native
  def get(element: stdLib.HTMLElement): stdLib.HTMLElement | scala.Null = js.native
  def getClass(el: stdLib.HTMLElement): java.lang.String = js.native
  def getPosition(el: stdLib.HTMLElement): leafletLib.leafletMod.Point = js.native
  def getStyle(el: stdLib.HTMLElement, styleAttrib: java.lang.String): java.lang.String | scala.Null = js.native
  def hasClass(el: stdLib.HTMLElement, name: java.lang.String): scala.Boolean = js.native
  def preventOutline(el: stdLib.HTMLElement): scala.Unit = js.native
  def remove(el: stdLib.HTMLElement): scala.Unit = js.native
  def removeClass(el: stdLib.HTMLElement, name: java.lang.String): scala.Unit = js.native
  def restoreOutline(): scala.Unit = js.native
  def setClass(el: stdLib.HTMLElement, name: java.lang.String): scala.Unit = js.native
  def setOpacity(el: stdLib.HTMLElement, opacity: scala.Double): scala.Unit = js.native
  def setPosition(el: stdLib.HTMLElement, position: leafletLib.leafletMod.Point): scala.Unit = js.native
  def setTransform(el: stdLib.HTMLElement, offset: leafletLib.leafletMod.Point): scala.Unit = js.native
  def setTransform(el: stdLib.HTMLElement, offset: leafletLib.leafletMod.Point, scale: scala.Double): scala.Unit = js.native
  def testProp(props: js.Array[java.lang.String]): java.lang.String | leafletLib.leafletLibNumbers.`false` = js.native
  def toBack(el: stdLib.HTMLElement): scala.Unit = js.native
  def toFront(el: stdLib.HTMLElement): scala.Unit = js.native
}

