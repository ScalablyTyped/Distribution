package typings
package googlemapsLib.googleNs.mapsNs.adsenseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.adsense.AdUnit")
@js.native
class AdUnit protected ()
  extends googlemapsLib.googleNs.mapsNs.MVCObject {
  def this(container: stdLib.Element, opts: AdUnitOptions) = this()
  def getBackgroundColor(): java.lang.String = js.native
  def getBorderColor(): java.lang.String = js.native
  def getChannelNumber(): java.lang.String = js.native
  def getContainer(): stdLib.Element = js.native
  def getFormat(): AdFormat = js.native
  def getMap(): googlemapsLib.googleNs.mapsNs.Map = js.native
  def getPosition(): googlemapsLib.googleNs.mapsNs.ControlPosition = js.native
  def getPublisherId(): java.lang.String = js.native
  def getTextColor(): java.lang.String = js.native
  def getTitleColor(): java.lang.String = js.native
  def getUrlColor(): java.lang.String = js.native
  def setBackgroundColor(backgroundColor: java.lang.String): scala.Unit = js.native
  def setBorderColor(borderColor: java.lang.String): scala.Unit = js.native
  def setChannelNumber(channelNumber: java.lang.String): scala.Unit = js.native
  def setFormat(format: AdFormat): scala.Unit = js.native
  def setMap(): scala.Unit = js.native
  def setMap(map: googlemapsLib.googleNs.mapsNs.Map): scala.Unit = js.native
  def setPosition(position: googlemapsLib.googleNs.mapsNs.ControlPosition): scala.Unit = js.native
  def setTextColor(textColor: java.lang.String): scala.Unit = js.native
  def setTitleColor(titleColor: java.lang.String): scala.Unit = js.native
  def setUrlColor(urlColor: java.lang.String): scala.Unit = js.native
}

