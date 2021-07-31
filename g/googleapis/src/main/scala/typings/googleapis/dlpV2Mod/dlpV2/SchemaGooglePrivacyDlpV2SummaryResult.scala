package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A collection that informs the user the number of times a particular
  * `TransformationResultCode` and error details occurred.
  */
trait SchemaGooglePrivacyDlpV2SummaryResult extends StObject {
  
  var code: js.UndefOr[String] = js.undefined
  
  var count: js.UndefOr[String] = js.undefined
  
  /**
    * A place for warnings or errors to show up if a transformation didn&#39;t
    * work as expected.
    */
  var details: js.UndefOr[String] = js.undefined
}
object SchemaGooglePrivacyDlpV2SummaryResult {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2SummaryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2SummaryResult]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2SummaryResultMutableBuilder[Self <: SchemaGooglePrivacyDlpV2SummaryResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
  }
}
