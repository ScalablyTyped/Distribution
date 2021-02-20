package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The set of columns&#39; values that share the same ldiversity value
  */
@js.native
trait SchemaGooglePrivacyDlpV2KAnonymityEquivalenceClass extends StObject {
  
  /**
    * Size of the equivalence class, for example number of rows with the above
    * set of values.
    */
  var equivalenceClassSize: js.UndefOr[String] = js.native
  
  /**
    * Set of values defining the equivalence class. One value per
    * quasi-identifier column in the original KAnonymity metric message. The
    * order is always the same as the original request.
    */
  var quasiIdsValues: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2Value]] = js.native
}
object SchemaGooglePrivacyDlpV2KAnonymityEquivalenceClass {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2KAnonymityEquivalenceClass = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2KAnonymityEquivalenceClass]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2KAnonymityEquivalenceClassMutableBuilder[Self <: SchemaGooglePrivacyDlpV2KAnonymityEquivalenceClass] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEquivalenceClassSize(value: String): Self = StObject.set(x, "equivalenceClassSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEquivalenceClassSizeUndefined: Self = StObject.set(x, "equivalenceClassSize", js.undefined)
    
    @scala.inline
    def setQuasiIdsValues(value: js.Array[SchemaGooglePrivacyDlpV2Value]): Self = StObject.set(x, "quasiIdsValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuasiIdsValuesUndefined: Self = StObject.set(x, "quasiIdsValues", js.undefined)
    
    @scala.inline
    def setQuasiIdsValuesVarargs(value: SchemaGooglePrivacyDlpV2Value*): Self = StObject.set(x, "quasiIdsValues", js.Array(value :_*))
  }
}
