package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Details information about an error encountered during job execution or the
  * results of an unsuccessful activation of the JobTrigger. Output only field.
  */
@js.native
trait SchemaGooglePrivacyDlpV2Error extends StObject {
  
  var details: js.UndefOr[SchemaGoogleRpcStatus] = js.native
  
  /**
    * The times the error occurred.
    */
  var timestamps: js.UndefOr[js.Array[String]] = js.native
}
object SchemaGooglePrivacyDlpV2Error {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2Error = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2Error]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2ErrorMutableBuilder[Self <: SchemaGooglePrivacyDlpV2Error] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetails(value: SchemaGoogleRpcStatus): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    @scala.inline
    def setTimestamps(value: js.Array[String]): Self = StObject.set(x, "timestamps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampsUndefined: Self = StObject.set(x, "timestamps", js.undefined)
    
    @scala.inline
    def setTimestampsVarargs(value: String*): Self = StObject.set(x, "timestamps", js.Array(value :_*))
  }
}
