package typings.googlemaps.google.maps.adsense

import typings.googlemaps.google.maps.ControlPosition
import typings.googlemaps.google.maps.MVCObject
import typings.googlemaps.google.maps.Map
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdUnit extends MVCObject {
  def getBackgroundColor(): String = js.native
  def getBorderColor(): String = js.native
  def getChannelNumber(): String = js.native
  def getContainer(): Element = js.native
  def getFormat(): AdFormat = js.native
  def getMap(): Map[Element] = js.native
  def getPosition(): ControlPosition = js.native
  def getPublisherId(): String = js.native
  def getTextColor(): String = js.native
  def getTitleColor(): String = js.native
  def getUrlColor(): String = js.native
  def setBackgroundColor(backgroundColor: String): Unit = js.native
  def setBorderColor(borderColor: String): Unit = js.native
  def setChannelNumber(channelNumber: String): Unit = js.native
  def setFormat(format: AdFormat): Unit = js.native
  def setMap(): Unit = js.native
  def setMap(map: Map[Element]): Unit = js.native
  def setPosition(position: ControlPosition): Unit = js.native
  def setTextColor(textColor: String): Unit = js.native
  def setTitleColor(titleColor: String): Unit = js.native
  def setUrlColor(urlColor: String): Unit = js.native
}

