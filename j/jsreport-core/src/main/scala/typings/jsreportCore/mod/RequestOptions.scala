package typings.jsreportCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Template | NamedTemplate
trait RequestOptions extends StObject {
  
  var preview: js.UndefOr[Boolean] = js.undefined
  
  /** defines the name of the report being to be generated */
  var reportName: js.UndefOr[String] = js.undefined
  
  /** sets the request timeout in milliseconds */
  var timeout: js.UndefOr[Double] = js.undefined
}
object RequestOptions {
  
  inline def apply(): RequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestOptions] (val x: Self) extends AnyVal {
    
    inline def setPreview(value: Boolean): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
    
    inline def setPreviewUndefined: Self = StObject.set(x, "preview", js.undefined)
    
    inline def setReportName(value: String): Self = StObject.set(x, "reportName", value.asInstanceOf[js.Any])
    
    inline def setReportNameUndefined: Self = StObject.set(x, "reportName", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
