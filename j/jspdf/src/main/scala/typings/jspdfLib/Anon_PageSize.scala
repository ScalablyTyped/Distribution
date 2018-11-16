package typings
package jspdfLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_PageSize extends js.Object {
  var collections: js.Any
  var events: js.Any
  var pageSize: Anon_GetWidth
  var pages: js.Array[scala.Double]
  var scaleFactor: scala.Double
  def f2(number: scala.Double): scala.Double
  def getCoordinateString(value: scala.Double): scala.Double
  def getCurrentPageInfo(): js.Any
  def getFont(): js.Any
  def getFontSize(): scala.Double
  def getLineHeight(): scala.Double
  def getNumberOfPages(): scala.Double
  def getPageInfo(pageNumberOneBased: scala.Double): js.Any
  def getStyle(style: java.lang.String): js.Any
  def getVerticalCoordinateString(value: scala.Double): scala.Double
  def newAdditionalObject(): js.Any
  def newObject(): scala.Double
  def newObjectDeferred(): scala.Double
  def newObjectDeferredBegin(oid: scala.Double): scala.Unit
  def out(string: java.lang.String): scala.Unit
  def output(`type`: js.Any, options: js.Any): js.Any
  def pdfEscape(text: java.lang.String, flags: js.Any): js.Any
  def putStream(str: java.lang.String): scala.Unit
  def write(string1: java.lang.String): js.Any
}

