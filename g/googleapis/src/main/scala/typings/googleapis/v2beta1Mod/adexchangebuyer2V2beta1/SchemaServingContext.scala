package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The serving context for this restriction.
  */
trait SchemaServingContext extends StObject {
  
  /**
    * Matches all contexts.
    */
  var all: js.UndefOr[String] = js.undefined
  
  /**
    * Matches impressions for a particular app type.
    */
  var appType: js.UndefOr[SchemaAppContext] = js.undefined
  
  /**
    * Matches impressions for a particular auction type.
    */
  var auctionType: js.UndefOr[SchemaAuctionContext] = js.undefined
  
  /**
    * Matches impressions coming from users *or* publishers in a specific
    * location.
    */
  var location: js.UndefOr[SchemaLocationContext] = js.undefined
  
  /**
    * Matches impressions coming from a particular platform.
    */
  var platform: js.UndefOr[SchemaPlatformContext] = js.undefined
  
  /**
    * Matches impressions for a particular security type.
    */
  var securityType: js.UndefOr[SchemaSecurityContext] = js.undefined
}
object SchemaServingContext {
  
  @scala.inline
  def apply(): SchemaServingContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServingContext]
  }
  
  @scala.inline
  implicit class SchemaServingContextMutableBuilder[Self <: SchemaServingContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAll(value: String): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
    
    @scala.inline
    def setAppType(value: SchemaAppContext): Self = StObject.set(x, "appType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppTypeUndefined: Self = StObject.set(x, "appType", js.undefined)
    
    @scala.inline
    def setAuctionType(value: SchemaAuctionContext): Self = StObject.set(x, "auctionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuctionTypeUndefined: Self = StObject.set(x, "auctionType", js.undefined)
    
    @scala.inline
    def setLocation(value: SchemaLocationContext): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setPlatform(value: SchemaPlatformContext): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    @scala.inline
    def setSecurityType(value: SchemaSecurityContext): Self = StObject.set(x, "securityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityTypeUndefined: Self = StObject.set(x, "securityType", js.undefined)
  }
}
