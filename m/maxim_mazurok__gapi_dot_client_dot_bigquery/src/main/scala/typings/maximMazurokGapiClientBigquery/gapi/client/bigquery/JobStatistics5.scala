package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobStatistics5 extends StObject {
  
  /** [Output-only] Number of logical bytes copied to the destination table. */
  var copied_logical_bytes: js.UndefOr[String] = js.undefined
  
  /** [Output-only] Number of rows copied to the destination table. */
  var copied_rows: js.UndefOr[String] = js.undefined
}
object JobStatistics5 {
  
  inline def apply(): JobStatistics5 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobStatistics5]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JobStatistics5] (val x: Self) extends AnyVal {
    
    inline def setCopied_logical_bytes(value: String): Self = StObject.set(x, "copied_logical_bytes", value.asInstanceOf[js.Any])
    
    inline def setCopied_logical_bytesUndefined: Self = StObject.set(x, "copied_logical_bytes", js.undefined)
    
    inline def setCopied_rows(value: String): Self = StObject.set(x, "copied_rows", value.asInstanceOf[js.Any])
    
    inline def setCopied_rowsUndefined: Self = StObject.set(x, "copied_rows", js.undefined)
  }
}
