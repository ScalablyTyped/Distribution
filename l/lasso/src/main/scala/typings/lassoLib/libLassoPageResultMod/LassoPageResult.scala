package typings
package lassoLib.libLassoPageResultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LassoPageResult extends js.Object {
  def addFile(filePath: java.lang.String, contentType: java.lang.String, isAsync: scala.Boolean, slot: js.Any): scala.Unit = js.native
  def addUrl(url: java.lang.String, slot: js.Any, contentType: java.lang.String, isAsync: scala.Boolean): scala.Unit = js.native
  def deserialize(reader: js.Any, callback: js.Any): scala.Unit = js.native
  def getBodyHtml(): java.lang.String = js.native
  def getBodyHtml(data: js.Any): java.lang.String = js.native
  def getCSSFiles(): js.Array[_] = js.native
  def getCSSUrls(): js.Array[_] = js.native
  def getFileByAsyncBundleName(bundleName: java.lang.String): js.Any = js.native
  def getFileByBundleName(bundleName: java.lang.String): js.Any = js.native
  def getFilePathsByContentType(args: js.Any*): scala.Unit = js.native
  def getHeadHtml(): java.lang.String = js.native
  def getHeadHtml(data: js.Any): java.lang.String = js.native
  def getHtmlBySlot(): js.Any = js.native
  def getHtmlForSlot(slotName: java.lang.String): js.Any = js.native
  def getHtmlForSlot(slotName: java.lang.String, data: js.Any): js.Any = js.native
  def getInlineCodeFingerprints(): js.Array[java.lang.String] = js.native
  def getJavaScriptFiles(): js.Array[_] = js.native
  def getJavaScriptUrls(): js.Array[_] = js.native
  def getOutputFiles(): js.Array[_] = js.native
  def getOutputFilesWithInfo(args: js.Any*): scala.Unit = js.native
  def getSlotHtml(slotName: java.lang.String): js.Any = js.native
  def getSlotHtml(slotName: java.lang.String, data: js.Any): js.Any = js.native
  def getUrlByAsyncBundleName(bundleName: java.lang.String): js.Any = js.native
  def getUrlByBundleName(bundleName: java.lang.String): js.Any = js.native
  def getUrlsForSlot(slot: js.Any): js.Any = js.native
  def htmlSlotsToJSON(indentation: js.Any): js.Any = js.native
  def registerBundle(bundle: js.Any, async: js.Any, lassoContext: lassoLib.libLassoContextMod.default): scala.Unit = js.native
  def registerResource(resource: js.Any): scala.Unit = js.native
  def serialize(lassoPageResult: LassoPageResult): js.Any = js.native
  def setHtmlBySlot(htmlBySlot: js.Any): scala.Unit = js.native
  def setInlineCodeFingerprints(inlineCodeFingerprints: js.Array[java.lang.String]): scala.Unit = js.native
  def toJSON(): js.Any = js.native
}

