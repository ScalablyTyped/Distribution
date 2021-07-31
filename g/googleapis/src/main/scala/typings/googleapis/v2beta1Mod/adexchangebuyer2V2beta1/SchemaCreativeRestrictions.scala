package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents creative restrictions associated to Programmatic Guaranteed/
  * Preferred Deal in Ad Manager. This doesn&#39;t apply to Private Auction and
  * AdX Preferred Deals.
  */
trait SchemaCreativeRestrictions extends StObject {
  
  /**
    * The format of the environment that the creatives will be displayed in.
    */
  var creativeFormat: js.UndefOr[String] = js.undefined
  
  var creativeSpecifications: js.UndefOr[js.Array[SchemaCreativeSpecification]] = js.undefined
  
  /**
    * Skippable video ads allow viewers to skip ads after 5 seconds.
    */
  var skippableAdType: js.UndefOr[String] = js.undefined
}
object SchemaCreativeRestrictions {
  
  @scala.inline
  def apply(): SchemaCreativeRestrictions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreativeRestrictions]
  }
  
  @scala.inline
  implicit class SchemaCreativeRestrictionsMutableBuilder[Self <: SchemaCreativeRestrictions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreativeFormat(value: String): Self = StObject.set(x, "creativeFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativeFormatUndefined: Self = StObject.set(x, "creativeFormat", js.undefined)
    
    @scala.inline
    def setCreativeSpecifications(value: js.Array[SchemaCreativeSpecification]): Self = StObject.set(x, "creativeSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativeSpecificationsUndefined: Self = StObject.set(x, "creativeSpecifications", js.undefined)
    
    @scala.inline
    def setCreativeSpecificationsVarargs(value: SchemaCreativeSpecification*): Self = StObject.set(x, "creativeSpecifications", js.Array(value :_*))
    
    @scala.inline
    def setSkippableAdType(value: String): Self = StObject.set(x, "skippableAdType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkippableAdTypeUndefined: Self = StObject.set(x, "skippableAdType", js.undefined)
  }
}
