package typings
package jspdfLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Collections extends js.Object {
  var collections: js.Any
  var events: js.Any
  var pageSize: Anon_GetHeight
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

object Anon_Collections {
  @scala.inline
  def apply(
    collections: js.Any,
    events: js.Any,
    f2: scala.Double => scala.Double,
    getCoordinateString: scala.Double => scala.Double,
    getCurrentPageInfo: () => js.Any,
    getFont: () => js.Any,
    getFontSize: () => scala.Double,
    getLineHeight: () => scala.Double,
    getNumberOfPages: () => scala.Double,
    getPageInfo: scala.Double => js.Any,
    getStyle: java.lang.String => js.Any,
    getVerticalCoordinateString: scala.Double => scala.Double,
    newAdditionalObject: () => js.Any,
    newObject: () => scala.Double,
    newObjectDeferred: () => scala.Double,
    newObjectDeferredBegin: scala.Double => scala.Unit,
    out: java.lang.String => scala.Unit,
    output: (js.Any, js.Any) => js.Any,
    pageSize: Anon_GetHeight,
    pages: js.Array[scala.Double],
    pdfEscape: (java.lang.String, js.Any) => js.Any,
    putStream: java.lang.String => scala.Unit,
    scaleFactor: scala.Double,
    write: java.lang.String => js.Any
  ): Anon_Collections = {
    val __obj = js.Dynamic.literal(collections = collections, events = events, f2 = js.Any.fromFunction1(f2), getCoordinateString = js.Any.fromFunction1(getCoordinateString), getCurrentPageInfo = js.Any.fromFunction0(getCurrentPageInfo), getFont = js.Any.fromFunction0(getFont), getFontSize = js.Any.fromFunction0(getFontSize), getLineHeight = js.Any.fromFunction0(getLineHeight), getNumberOfPages = js.Any.fromFunction0(getNumberOfPages), getPageInfo = js.Any.fromFunction1(getPageInfo), getStyle = js.Any.fromFunction1(getStyle), getVerticalCoordinateString = js.Any.fromFunction1(getVerticalCoordinateString), newAdditionalObject = js.Any.fromFunction0(newAdditionalObject), newObject = js.Any.fromFunction0(newObject), newObjectDeferred = js.Any.fromFunction0(newObjectDeferred), newObjectDeferredBegin = js.Any.fromFunction1(newObjectDeferredBegin), out = js.Any.fromFunction1(out), output = js.Any.fromFunction2(output), pageSize = pageSize, pages = pages, pdfEscape = js.Any.fromFunction2(pdfEscape), putStream = js.Any.fromFunction1(putStream), scaleFactor = scaleFactor, write = js.Any.fromFunction1(write))
  
    __obj.asInstanceOf[Anon_Collections]
  }
}

