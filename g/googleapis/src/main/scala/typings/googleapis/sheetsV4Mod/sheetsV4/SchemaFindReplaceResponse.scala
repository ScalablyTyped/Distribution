package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The result of the find/replace.
  */
@js.native
trait SchemaFindReplaceResponse extends js.Object {
  
  /**
    * The number of formula cells changed.
    */
  var formulasChanged: js.UndefOr[Double] = js.native
  
  /**
    * The number of occurrences (possibly multiple within a cell) changed. For
    * example, if replacing `&quot;e&quot;` with `&quot;o&quot;` in
    * `&quot;Google Sheets&quot;`, this would be `&quot;3&quot;` because
    * `&quot;Google Sheets&quot;` -&gt; `&quot;Googlo Shoots&quot;`.
    */
  var occurrencesChanged: js.UndefOr[Double] = js.native
  
  /**
    * The number of rows changed.
    */
  var rowsChanged: js.UndefOr[Double] = js.native
  
  /**
    * The number of sheets changed.
    */
  var sheetsChanged: js.UndefOr[Double] = js.native
  
  /**
    * The number of non-formula cells changed.
    */
  var valuesChanged: js.UndefOr[Double] = js.native
}
object SchemaFindReplaceResponse {
  
  @scala.inline
  def apply(): SchemaFindReplaceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFindReplaceResponse]
  }
  
  @scala.inline
  implicit class SchemaFindReplaceResponseOps[Self <: SchemaFindReplaceResponse] (val x: Self) extends AnyVal {
    
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
    def setFormulasChanged(value: Double): Self = this.set("formulasChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormulasChanged: Self = this.set("formulasChanged", js.undefined)
    
    @scala.inline
    def setOccurrencesChanged(value: Double): Self = this.set("occurrencesChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOccurrencesChanged: Self = this.set("occurrencesChanged", js.undefined)
    
    @scala.inline
    def setRowsChanged(value: Double): Self = this.set("rowsChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowsChanged: Self = this.set("rowsChanged", js.undefined)
    
    @scala.inline
    def setSheetsChanged(value: Double): Self = this.set("sheetsChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSheetsChanged: Self = this.set("sheetsChanged", js.undefined)
    
    @scala.inline
    def setValuesChanged(value: Double): Self = this.set("valuesChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValuesChanged: Self = this.set("valuesChanged", js.undefined)
  }
}
