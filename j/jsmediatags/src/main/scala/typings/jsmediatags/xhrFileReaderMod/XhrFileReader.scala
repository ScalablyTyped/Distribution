package typings.jsmediatags.xhrFileReaderMod

import typings.jsmediatags.typesMod.CallbackType
import typings.jsmediatags.typesMod.LoadCallbackType
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XhrFileReader
  extends typings.jsmediatags.mediaFileReaderMod.default {
  
  def _createXHRObject(): XMLHttpRequest = js.native
  
  def _fetchEntireFile(callbacks: LoadCallbackType): Unit = js.native
  
  def _fetchSizeWithGetRequest(callbacks: LoadCallbackType): Unit = js.native
  
  def _fetchSizeWithHeadRequest(callbacks: LoadCallbackType): Unit = js.native
  
  var _fileData: typings.jsmediatags.chunkedFileDataMod.default = js.native
  
  def _getResponseHeader(xhr: XMLHttpRequest, headerName: String): String | Null = js.native
  
  def _getXhrResponseContent(xhr: XMLHttpRequest): String = js.native
  
  def _hasResponseHeader(xhr: XMLHttpRequest, headerName: String): Boolean = js.native
  
  def _isWebWorker(): Boolean = js.native
  
  def _makeXHRRequest(method: String, range: js.Tuple2[Double, Double], callbacks: CallbackType): Unit = js.native
  def _makeXHRRequest(method: String, range: Null, callbacks: CallbackType): Unit = js.native
  
  def _parseContentLength(xhr: XMLHttpRequest): Double | Null = js.native
  
  def _parseContentRange(xhr: XMLHttpRequest): ContentRangeType | Null = js.native
  
  def _roundRangeToChunkMultiple(range: js.Tuple2[Double, Double]): js.Tuple2[Double, Double] = js.native
  
  def _setRequestHeader(xhr: XMLHttpRequest, headerName: String, headerValue: String): Unit = js.native
  
  var _url: String = js.native
}
