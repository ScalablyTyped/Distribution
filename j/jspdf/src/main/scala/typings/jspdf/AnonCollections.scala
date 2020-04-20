package typings.jspdf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCollections extends js.Object {
  var collections: js.Any
  var events: js.Any
  var pageSize: AnonGetHeight
  var pages: js.Array[Double]
  var scaleFactor: Double
  def f2(number: Double): Double
  def getCoordinateString(value: Double): Double
  def getCurrentPageInfo(): js.Any
  def getFont(): js.Any
  def getFontSize(): Double
  def getLineHeight(): Double
  def getNumberOfPages(): Double
  def getPageInfo(pageNumberOneBased: Double): js.Any
  def getStyle(style: String): js.Any
  def getVerticalCoordinateString(value: Double): Double
  def newAdditionalObject(): js.Any
  def newObject(): Double
  def newObjectDeferred(): Double
  def newObjectDeferredBegin(oid: Double): Unit
  def out(string: String): Unit
  def output(`type`: js.Any, options: js.Any): js.Any
  def pdfEscape(text: String, flags: js.Any): js.Any
  def putStream(str: String): Unit
  def write(string1: String): js.Any
}

object AnonCollections {
  @scala.inline
  def apply(
    collections: js.Any,
    events: js.Any,
    f2: Double => Double,
    getCoordinateString: Double => Double,
    getCurrentPageInfo: () => js.Any,
    getFont: () => js.Any,
    getFontSize: () => Double,
    getLineHeight: () => Double,
    getNumberOfPages: () => Double,
    getPageInfo: Double => js.Any,
    getStyle: String => js.Any,
    getVerticalCoordinateString: Double => Double,
    newAdditionalObject: () => js.Any,
    newObject: () => Double,
    newObjectDeferred: () => Double,
    newObjectDeferredBegin: Double => Unit,
    out: String => Unit,
    output: (js.Any, js.Any) => js.Any,
    pageSize: AnonGetHeight,
    pages: js.Array[Double],
    pdfEscape: (String, js.Any) => js.Any,
    putStream: String => Unit,
    scaleFactor: Double,
    write: String => js.Any
  ): AnonCollections = {
    val __obj = js.Dynamic.literal(collections = collections.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], f2 = js.Any.fromFunction1(f2), getCoordinateString = js.Any.fromFunction1(getCoordinateString), getCurrentPageInfo = js.Any.fromFunction0(getCurrentPageInfo), getFont = js.Any.fromFunction0(getFont), getFontSize = js.Any.fromFunction0(getFontSize), getLineHeight = js.Any.fromFunction0(getLineHeight), getNumberOfPages = js.Any.fromFunction0(getNumberOfPages), getPageInfo = js.Any.fromFunction1(getPageInfo), getStyle = js.Any.fromFunction1(getStyle), getVerticalCoordinateString = js.Any.fromFunction1(getVerticalCoordinateString), newAdditionalObject = js.Any.fromFunction0(newAdditionalObject), newObject = js.Any.fromFunction0(newObject), newObjectDeferred = js.Any.fromFunction0(newObjectDeferred), newObjectDeferredBegin = js.Any.fromFunction1(newObjectDeferredBegin), out = js.Any.fromFunction1(out), output = js.Any.fromFunction2(output), pageSize = pageSize.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], pdfEscape = js.Any.fromFunction2(pdfEscape), putStream = js.Any.fromFunction1(putStream), scaleFactor = scaleFactor.asInstanceOf[js.Any], write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[AnonCollections]
  }
}

