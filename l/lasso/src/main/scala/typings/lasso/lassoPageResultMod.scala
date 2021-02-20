package typings.lasso

import typings.lasso.lassoContextMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lassoPageResultMod {
  
  @js.native
  trait LassoPageResult extends StObject {
    
    def addFile(filePath: String, contentType: String, isAsync: Boolean, slot: js.Any): Unit = js.native
    
    def addUrl(url: String, slot: js.Any, contentType: String, isAsync: Boolean): Unit = js.native
    
    def deserialize(reader: js.Any, callback: js.Any): Unit = js.native
    
    def getBodyHtml(): String = js.native
    def getBodyHtml(data: js.Any): String = js.native
    
    def getCSSFiles(): js.Array[_] = js.native
    
    def getCSSUrls(): js.Array[_] = js.native
    
    def getFileByAsyncBundleName(bundleName: String): js.Any = js.native
    
    def getFileByBundleName(bundleName: String): js.Any = js.native
    
    def getFilePathsByContentType(args: js.Any*): Unit = js.native
    
    def getHeadHtml(): String = js.native
    def getHeadHtml(data: js.Any): String = js.native
    
    def getHtmlBySlot(): js.Any = js.native
    
    def getHtmlForSlot(slotName: String): js.Any = js.native
    def getHtmlForSlot(slotName: String, data: js.Any): js.Any = js.native
    
    def getInlineCodeFingerprints(): js.Array[String] = js.native
    
    def getJavaScriptFiles(): js.Array[_] = js.native
    
    def getJavaScriptUrls(): js.Array[_] = js.native
    
    def getOutputFiles(): js.Array[_] = js.native
    
    def getOutputFilesWithInfo(args: js.Any*): Unit = js.native
    
    def getSlotHtml(slotName: String): js.Any = js.native
    def getSlotHtml(slotName: String, data: js.Any): js.Any = js.native
    
    def getUrlByAsyncBundleName(bundleName: String): js.Any = js.native
    
    def getUrlByBundleName(bundleName: String): js.Any = js.native
    
    def getUrlsForSlot(slot: js.Any): js.Any = js.native
    
    def htmlSlotsToJSON(indentation: js.Any): js.Any = js.native
    
    def registerBundle(bundle: js.Any, async: js.Any, lassoContext: default): Unit = js.native
    
    def registerResource(resource: js.Any): Unit = js.native
    
    def serialize(lassoPageResult: LassoPageResult): js.Any = js.native
    
    def setHtmlBySlot(htmlBySlot: js.Any): Unit = js.native
    
    def setInlineCodeFingerprints(inlineCodeFingerprints: js.Array[String]): Unit = js.native
    
    def toJSON(): js.Any = js.native
  }
}
