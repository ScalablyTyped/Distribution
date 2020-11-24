package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FixableTotalByDigest extends js.Object {
  
  /** The number of fixable vulnerabilities associated with this resource. */
  var fixableCount: js.UndefOr[String] = js.native
  
  /** The affected resource. */
  var resource: js.UndefOr[Resource] = js.native
  
  /** The severity for this count. SEVERITY_UNSPECIFIED indicates total across all severities. */
  var severity: js.UndefOr[String] = js.native
  
  /** The total number of vulnerabilities associated with this resource. */
  var totalCount: js.UndefOr[String] = js.native
}
object FixableTotalByDigest {
  
  @scala.inline
  def apply(): FixableTotalByDigest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FixableTotalByDigest]
  }
  
  @scala.inline
  implicit class FixableTotalByDigestOps[Self <: FixableTotalByDigest] (val x: Self) extends AnyVal {
    
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
    def setFixableCount(value: String): Self = this.set("fixableCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixableCount: Self = this.set("fixableCount", js.undefined)
    
    @scala.inline
    def setResource(value: Resource): Self = this.set("resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
    
    @scala.inline
    def setSeverity(value: String): Self = this.set("severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeverity: Self = this.set("severity", js.undefined)
    
    @scala.inline
    def setTotalCount(value: String): Self = this.set("totalCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalCount: Self = this.set("totalCount", js.undefined)
  }
}
