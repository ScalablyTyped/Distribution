package typings.googleapis.websecurityscannerV1alphaMod.websecurityscannerV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about vulnerable or missing HTTP Headers.
  */
@js.native
trait SchemaVulnerableHeaders extends js.Object {
  
  /**
    * List of vulnerable headers.
    */
  var headers: js.UndefOr[js.Array[SchemaHeader]] = js.native
  
  /**
    * List of missing headers.
    */
  var missingHeaders: js.UndefOr[js.Array[SchemaHeader]] = js.native
}
object SchemaVulnerableHeaders {
  
  @scala.inline
  def apply(): SchemaVulnerableHeaders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVulnerableHeaders]
  }
  
  @scala.inline
  implicit class SchemaVulnerableHeadersOps[Self <: SchemaVulnerableHeaders] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHeadersVarargs(value: SchemaHeader*): Self = this.set("headers", js.Array(value :_*))
    
    @scala.inline
    def setHeaders(value: js.Array[SchemaHeader]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setMissingHeadersVarargs(value: SchemaHeader*): Self = this.set("missingHeaders", js.Array(value :_*))
    
    @scala.inline
    def setMissingHeaders(value: js.Array[SchemaHeader]): Self = this.set("missingHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMissingHeaders: Self = this.set("missingHeaders", js.undefined)
  }
}
