package typings.googleapis.fusiontablesV1Mod.fusiontablesV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import typings.googleapis.anon.Body
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceTableImportrows
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The delimiter used to separate cell values. This can only consist of a
    * single character. Default is ','.
    */
  var delimiter: js.UndefOr[String] = js.undefined
  
  /**
    * The encoding of the content. Default is UTF-8. Use 'auto-detect' if you
    * are unsure of the encoding.
    */
  var encoding: js.UndefOr[String] = js.undefined
  
  /**
    * The index of the last line from which to start importing, exclusive.
    * Thus, the number of imported lines is endLine - startLine. If this
    * parameter is not provided, the file will be imported until the last line
    * of the file. If endLine is negative, then the imported content will
    * exclude the last endLine lines. That is, if endline is negative, no line
    * will be imported whose index is greater than N + endLine where N is the
    * number of lines in the file, and the number of imported lines will be N +
    * endLine - startLine.
    */
  var endLine: js.UndefOr[Double] = js.undefined
  
  /**
    * Whether the CSV must have the same number of values for each row. If
    * false, rows with fewer values will be padded with empty values. Default
    * is true.
    */
  var isStrict: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Media metadata
    */
  var media: js.UndefOr[Body] = js.undefined
  
  /**
    * The index of the first line from which to start importing, inclusive.
    * Default is 0.
    */
  var startLine: js.UndefOr[Double] = js.undefined
  
  /**
    * The table into which new rows are being imported.
    */
  var tableId: js.UndefOr[String] = js.undefined
}
object ParamsResourceTableImportrows {
  
  @scala.inline
  def apply(): ParamsResourceTableImportrows = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTableImportrows]
  }
  
  @scala.inline
  implicit class ParamsResourceTableImportrowsMutableBuilder[Self <: ParamsResourceTableImportrows] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
    
    @scala.inline
    def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    @scala.inline
    def setEndLine(value: Double): Self = StObject.set(x, "endLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndLineUndefined: Self = StObject.set(x, "endLine", js.undefined)
    
    @scala.inline
    def setIsStrict(value: Boolean): Self = StObject.set(x, "isStrict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsStrictUndefined: Self = StObject.set(x, "isStrict", js.undefined)
    
    @scala.inline
    def setMedia(value: Body): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    @scala.inline
    def setStartLine(value: Double): Self = StObject.set(x, "startLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartLineUndefined: Self = StObject.set(x, "startLine", js.undefined)
    
    @scala.inline
    def setTableId(value: String): Self = StObject.set(x, "tableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableIdUndefined: Self = StObject.set(x, "tableId", js.undefined)
  }
}
