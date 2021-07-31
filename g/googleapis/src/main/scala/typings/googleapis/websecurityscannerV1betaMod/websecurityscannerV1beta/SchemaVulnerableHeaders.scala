package typings.googleapis.websecurityscannerV1betaMod.websecurityscannerV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about vulnerable or missing HTTP Headers.
  */
trait SchemaVulnerableHeaders extends StObject {
  
  /**
    * List of vulnerable headers.
    */
  var headers: js.UndefOr[js.Array[SchemaHeader]] = js.undefined
  
  /**
    * List of missing headers.
    */
  var missingHeaders: js.UndefOr[js.Array[SchemaHeader]] = js.undefined
}
object SchemaVulnerableHeaders {
  
  @scala.inline
  def apply(): SchemaVulnerableHeaders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVulnerableHeaders]
  }
  
  @scala.inline
  implicit class SchemaVulnerableHeadersMutableBuilder[Self <: SchemaVulnerableHeaders] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: js.Array[SchemaHeader]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setHeadersVarargs(value: SchemaHeader*): Self = StObject.set(x, "headers", js.Array(value :_*))
    
    @scala.inline
    def setMissingHeaders(value: js.Array[SchemaHeader]): Self = StObject.set(x, "missingHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMissingHeadersUndefined: Self = StObject.set(x, "missingHeaders", js.undefined)
    
    @scala.inline
    def setMissingHeadersVarargs(value: SchemaHeader*): Self = StObject.set(x, "missingHeaders", js.Array(value :_*))
  }
}
