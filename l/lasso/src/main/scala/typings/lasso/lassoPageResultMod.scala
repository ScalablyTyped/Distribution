package typings.lasso

import typings.lasso.lassoContextMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lassoPageResultMod {
  
  @js.native
  trait LassoPageResult extends StObject {
    
    def addFile(filePath: String, contentType: String, isAsync: Boolean, slot: Any): Unit = js.native
    
    def addUrl(url: String, slot: Any, contentType: String, isAsync: Boolean): Unit = js.native
    
    def deserialize(reader: Any, callback: Any): Unit = js.native
    
    def getBodyHtml(): String = js.native
    def getBodyHtml(data: Any): String = js.native
    
    def getCSSFiles(): js.Array[Any] = js.native
    
    def getCSSUrls(): js.Array[Any] = js.native
    
    def getFileByAsyncBundleName(bundleName: String): Any = js.native
    
    def getFileByBundleName(bundleName: String): Any = js.native
    
    def getFilePathsByContentType(args: Any*): Unit = js.native
    
    def getHeadHtml(): String = js.native
    def getHeadHtml(data: Any): String = js.native
    
    def getHtmlBySlot(): Any = js.native
    
    def getHtmlForSlot(slotName: String): Any = js.native
    def getHtmlForSlot(slotName: String, data: Any): Any = js.native
    
    def getInlineCodeFingerprints(): js.Array[String] = js.native
    
    def getJavaScriptFiles(): js.Array[Any] = js.native
    
    def getJavaScriptUrls(): js.Array[Any] = js.native
    
    def getOutputFiles(): js.Array[Any] = js.native
    
    def getOutputFilesWithInfo(args: Any*): Unit = js.native
    
    def getSlotHtml(slotName: String): Any = js.native
    def getSlotHtml(slotName: String, data: Any): Any = js.native
    
    def getUrlByAsyncBundleName(bundleName: String): Any = js.native
    
    def getUrlByBundleName(bundleName: String): Any = js.native
    
    def getUrlsForSlot(slot: Any): Any = js.native
    
    def htmlSlotsToJSON(indentation: Any): Any = js.native
    
    def registerBundle(bundle: Any, async: Any, lassoContext: default): Unit = js.native
    
    def registerResource(resource: Any): Unit = js.native
    
    def serialize(lassoPageResult: LassoPageResult): Any = js.native
    
    def setHtmlBySlot(htmlBySlot: Any): Unit = js.native
    
    def setInlineCodeFingerprints(inlineCodeFingerprints: js.Array[String]): Unit = js.native
    
    def toJSON(): Any = js.native
  }
}
