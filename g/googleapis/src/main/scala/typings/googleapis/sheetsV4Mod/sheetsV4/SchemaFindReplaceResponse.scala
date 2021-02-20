package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The result of the find/replace.
  */
@js.native
trait SchemaFindReplaceResponse extends StObject {
  
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
  implicit class SchemaFindReplaceResponseMutableBuilder[Self <: SchemaFindReplaceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormulasChanged(value: Double): Self = StObject.set(x, "formulasChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormulasChangedUndefined: Self = StObject.set(x, "formulasChanged", js.undefined)
    
    @scala.inline
    def setOccurrencesChanged(value: Double): Self = StObject.set(x, "occurrencesChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOccurrencesChangedUndefined: Self = StObject.set(x, "occurrencesChanged", js.undefined)
    
    @scala.inline
    def setRowsChanged(value: Double): Self = StObject.set(x, "rowsChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsChangedUndefined: Self = StObject.set(x, "rowsChanged", js.undefined)
    
    @scala.inline
    def setSheetsChanged(value: Double): Self = StObject.set(x, "sheetsChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSheetsChangedUndefined: Self = StObject.set(x, "sheetsChanged", js.undefined)
    
    @scala.inline
    def setValuesChanged(value: Double): Self = StObject.set(x, "valuesChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesChangedUndefined: Self = StObject.set(x, "valuesChanged", js.undefined)
  }
}
