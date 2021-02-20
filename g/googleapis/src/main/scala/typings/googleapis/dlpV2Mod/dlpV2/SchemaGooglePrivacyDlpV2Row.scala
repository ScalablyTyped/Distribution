package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaGooglePrivacyDlpV2Row extends StObject {
  
  var values: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2Value]] = js.native
}
object SchemaGooglePrivacyDlpV2Row {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2Row = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2Row]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2RowMutableBuilder[Self <: SchemaGooglePrivacyDlpV2Row] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValues(value: js.Array[SchemaGooglePrivacyDlpV2Value]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: SchemaGooglePrivacyDlpV2Value*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
