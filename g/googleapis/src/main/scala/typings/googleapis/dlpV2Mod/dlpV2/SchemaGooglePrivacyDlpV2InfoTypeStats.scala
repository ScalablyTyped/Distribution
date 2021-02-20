package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Statistics regarding a specific InfoType.
  */
@js.native
trait SchemaGooglePrivacyDlpV2InfoTypeStats extends StObject {
  
  /**
    * Number of findings for this infoType.
    */
  var count: js.UndefOr[String] = js.native
  
  /**
    * The type of finding this stat is for.
    */
  var infoType: js.UndefOr[SchemaGooglePrivacyDlpV2InfoType] = js.native
}
object SchemaGooglePrivacyDlpV2InfoTypeStats {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2InfoTypeStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2InfoTypeStats]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2InfoTypeStatsMutableBuilder[Self <: SchemaGooglePrivacyDlpV2InfoTypeStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setInfoType(value: SchemaGooglePrivacyDlpV2InfoType): Self = StObject.set(x, "infoType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoTypeUndefined: Self = StObject.set(x, "infoType", js.undefined)
  }
}
