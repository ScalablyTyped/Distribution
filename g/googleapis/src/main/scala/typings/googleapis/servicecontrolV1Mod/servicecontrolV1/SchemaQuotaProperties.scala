package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the properties needed for quota operations.
  */
@js.native
trait SchemaQuotaProperties extends StObject {
  
  /**
    * Quota mode for this operation.
    */
  var quotaMode: js.UndefOr[String] = js.native
}
object SchemaQuotaProperties {
  
  @scala.inline
  def apply(): SchemaQuotaProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQuotaProperties]
  }
  
  @scala.inline
  implicit class SchemaQuotaPropertiesMutableBuilder[Self <: SchemaQuotaProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQuotaMode(value: String): Self = StObject.set(x, "quotaMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotaModeUndefined: Self = StObject.set(x, "quotaMode", js.undefined)
  }
}
