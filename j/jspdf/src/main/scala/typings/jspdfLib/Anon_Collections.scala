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
    f2: js.Function1[scala.Double, scala.Double],
    getCoordinateString: js.Function1[scala.Double, scala.Double],
    getCurrentPageInfo: js.Function0[js.Any],
    getFont: js.Function0[js.Any],
    getFontSize: js.Function0[scala.Double],
    getLineHeight: js.Function0[scala.Double],
    getNumberOfPages: js.Function0[scala.Double],
    getPageInfo: js.Function1[scala.Double, js.Any],
    getStyle: js.Function1[java.lang.String, js.Any],
    getVerticalCoordinateString: js.Function1[scala.Double, scala.Double],
    newAdditionalObject: js.Function0[js.Any],
    newObject: js.Function0[scala.Double],
    newObjectDeferred: js.Function0[scala.Double],
    newObjectDeferredBegin: js.Function1[scala.Double, scala.Unit],
    out: js.Function1[java.lang.String, scala.Unit],
    output: js.Function2[js.Any, js.Any, js.Any],
    pageSize: Anon_GetHeight,
    pages: js.Array[scala.Double],
    pdfEscape: js.Function2[java.lang.String, js.Any, js.Any],
    putStream: js.Function1[java.lang.String, scala.Unit],
    scaleFactor: scala.Double,
    write: js.Function1[java.lang.String, js.Any]
  ): Anon_Collections = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("collections")(collections)
    __obj.updateDynamic("events")(events)
    __obj.updateDynamic("f2")(f2)
    __obj.updateDynamic("getCoordinateString")(getCoordinateString)
    __obj.updateDynamic("getCurrentPageInfo")(getCurrentPageInfo)
    __obj.updateDynamic("getFont")(getFont)
    __obj.updateDynamic("getFontSize")(getFontSize)
    __obj.updateDynamic("getLineHeight")(getLineHeight)
    __obj.updateDynamic("getNumberOfPages")(getNumberOfPages)
    __obj.updateDynamic("getPageInfo")(getPageInfo)
    __obj.updateDynamic("getStyle")(getStyle)
    __obj.updateDynamic("getVerticalCoordinateString")(getVerticalCoordinateString)
    __obj.updateDynamic("newAdditionalObject")(newAdditionalObject)
    __obj.updateDynamic("newObject")(newObject)
    __obj.updateDynamic("newObjectDeferred")(newObjectDeferred)
    __obj.updateDynamic("newObjectDeferredBegin")(newObjectDeferredBegin)
    __obj.updateDynamic("out")(out)
    __obj.updateDynamic("output")(output)
    __obj.updateDynamic("pageSize")(pageSize)
    __obj.updateDynamic("pages")(pages)
    __obj.updateDynamic("pdfEscape")(pdfEscape)
    __obj.updateDynamic("putStream")(putStream)
    __obj.updateDynamic("scaleFactor")(scaleFactor)
    __obj.updateDynamic("write")(write)
    __obj.asInstanceOf[Anon_Collections]
  }
}

