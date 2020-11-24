package typings.maximMazurokGapiClientCustomsearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CorrectedQuery extends js.Object {
  
  /** The corrected query. */
  var correctedQuery: js.UndefOr[String] = js.native
  
  /** The corrected query, formatted in HTML. */
  var htmlCorrectedQuery: js.UndefOr[String] = js.native
}
object CorrectedQuery {
  
  @scala.inline
  def apply(): CorrectedQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CorrectedQuery]
  }
  
  @scala.inline
  implicit class CorrectedQueryOps[Self <: CorrectedQuery] (val x: Self) extends AnyVal {
    
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
    def setCorrectedQuery(value: String): Self = this.set("correctedQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCorrectedQuery: Self = this.set("correctedQuery", js.undefined)
    
    @scala.inline
    def setHtmlCorrectedQuery(value: String): Self = this.set("htmlCorrectedQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtmlCorrectedQuery: Self = this.set("htmlCorrectedQuery", js.undefined)
  }
}
