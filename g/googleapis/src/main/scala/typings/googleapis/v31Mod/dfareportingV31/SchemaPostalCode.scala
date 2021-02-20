package typings.googleapis.v31Mod.dfareportingV31

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information about a postal code that can be targeted by ads.
  */
@js.native
trait SchemaPostalCode extends StObject {
  
  /**
    * Postal code. This is equivalent to the id field.
    */
  var code: js.UndefOr[String] = js.native
  
  /**
    * Country code of the country to which this postal code belongs.
    */
  var countryCode: js.UndefOr[String] = js.native
  
  /**
    * DART ID of the country to which this postal code belongs.
    */
  var countryDartId: js.UndefOr[String] = js.native
  
  /**
    * ID of this postal code.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#postalCode&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaPostalCode {
  
  @scala.inline
  def apply(): SchemaPostalCode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPostalCode]
  }
  
  @scala.inline
  implicit class SchemaPostalCodeMutableBuilder[Self <: SchemaPostalCode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
    
    @scala.inline
    def setCountryDartId(value: String): Self = StObject.set(x, "countryDartId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryDartIdUndefined: Self = StObject.set(x, "countryDartId", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
