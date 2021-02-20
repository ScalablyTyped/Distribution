package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Universal Ad ID as per the VAST 4.0 spec. Applicable to the following
  * creative types: INSTREAM_AUDIO, INSTREAM_VIDEO and VPAID.
  */
@js.native
trait SchemaUniversalAdId extends StObject {
  
  /**
    * Registry used for the Ad ID value.
    */
  var registry: js.UndefOr[String] = js.native
  
  /**
    * ID value for this creative. Only alphanumeric characters and the
    * following symbols are valid: &quot;_/\-&quot;. Maximum length is 64
    * characters. Read only when registry is DCM.
    */
  var value: js.UndefOr[String] = js.native
}
object SchemaUniversalAdId {
  
  @scala.inline
  def apply(): SchemaUniversalAdId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUniversalAdId]
  }
  
  @scala.inline
  implicit class SchemaUniversalAdIdMutableBuilder[Self <: SchemaUniversalAdId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRegistry(value: String): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistryUndefined: Self = StObject.set(x, "registry", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
