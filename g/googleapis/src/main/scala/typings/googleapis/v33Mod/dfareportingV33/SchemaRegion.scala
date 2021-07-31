package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information about a region that can be targeted by ads.
  */
trait SchemaRegion extends StObject {
  
  /**
    * Country code of the country to which this region belongs.
    */
  var countryCode: js.UndefOr[String] = js.undefined
  
  /**
    * DART ID of the country to which this region belongs.
    */
  var countryDartId: js.UndefOr[String] = js.undefined
  
  /**
    * DART ID of this region.
    */
  var dartId: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#region&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Name of this region.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Region code.
    */
  var regionCode: js.UndefOr[String] = js.undefined
}
object SchemaRegion {
  
  @scala.inline
  def apply(): SchemaRegion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegion]
  }
  
  @scala.inline
  implicit class SchemaRegionMutableBuilder[Self <: SchemaRegion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
    
    @scala.inline
    def setCountryDartId(value: String): Self = StObject.set(x, "countryDartId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryDartIdUndefined: Self = StObject.set(x, "countryDartId", js.undefined)
    
    @scala.inline
    def setDartId(value: String): Self = StObject.set(x, "dartId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDartIdUndefined: Self = StObject.set(x, "dartId", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRegionCode(value: String): Self = StObject.set(x, "regionCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionCodeUndefined: Self = StObject.set(x, "regionCode", js.undefined)
  }
}
