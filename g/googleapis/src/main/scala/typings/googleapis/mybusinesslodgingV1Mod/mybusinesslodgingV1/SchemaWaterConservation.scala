package typings.googleapis.mybusinesslodgingV1Mod.mybusinesslodgingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWaterConservation extends StObject {
  
  /**
    * Independent organization audits water use. The property conducts a water conservation audit every 5 years, the results of which are either verified by a third-party and/or published in external communications. A water conservation audit is a detailed assessment of the facility, providing recommendations to existing operations and procedures to improve water efficiency, available incentives or rebates, and opportunities for improvements through renovations or upgrades. Examples of organizations who conduct credible third party audits include: Engie Impact, and local utility providers (they often provide energy and water audits).
    */
  var independentOrganizationAuditsWaterUse: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Independent organization audits water use exception.
    */
  var independentOrganizationAuditsWaterUseException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Linen reuse program. The property offers a linen reuse program.
    */
  var linenReuseProgram: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Linen reuse program exception.
    */
  var linenReuseProgramException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Towel reuse program. The property offers a towel reuse program.
    */
  var towelReuseProgram: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Towel reuse program exception.
    */
  var towelReuseProgramException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Water saving showers. All of the property's guest rooms have shower heads that use no more than 2.0 gallons per minute (gpm).
    */
  var waterSavingShowers: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Water saving showers exception.
    */
  var waterSavingShowersException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Water saving sinks. All of the property's guest rooms have bathroom faucets that use a maximum of 1.5 gallons per minute (gpm), public restroom faucets do not exceed 0.5 gpm, and kitchen faucets (excluding faucets used exclusively for filling operations) do not exceed 2.2 gpm.
    */
  var waterSavingSinks: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Water saving sinks exception.
    */
  var waterSavingSinksException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Water saving toilets. All of the property's toilets use 1.6 gallons per flush, or less.
    */
  var waterSavingToilets: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Water saving toilets exception.
    */
  var waterSavingToiletsException: js.UndefOr[String | Null] = js.undefined
}
object SchemaWaterConservation {
  
  inline def apply(): SchemaWaterConservation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWaterConservation]
  }
  
  extension [Self <: SchemaWaterConservation](x: Self) {
    
    inline def setIndependentOrganizationAuditsWaterUse(value: Boolean): Self = StObject.set(x, "independentOrganizationAuditsWaterUse", value.asInstanceOf[js.Any])
    
    inline def setIndependentOrganizationAuditsWaterUseException(value: String): Self = StObject.set(x, "independentOrganizationAuditsWaterUseException", value.asInstanceOf[js.Any])
    
    inline def setIndependentOrganizationAuditsWaterUseExceptionNull: Self = StObject.set(x, "independentOrganizationAuditsWaterUseException", null)
    
    inline def setIndependentOrganizationAuditsWaterUseExceptionUndefined: Self = StObject.set(x, "independentOrganizationAuditsWaterUseException", js.undefined)
    
    inline def setIndependentOrganizationAuditsWaterUseNull: Self = StObject.set(x, "independentOrganizationAuditsWaterUse", null)
    
    inline def setIndependentOrganizationAuditsWaterUseUndefined: Self = StObject.set(x, "independentOrganizationAuditsWaterUse", js.undefined)
    
    inline def setLinenReuseProgram(value: Boolean): Self = StObject.set(x, "linenReuseProgram", value.asInstanceOf[js.Any])
    
    inline def setLinenReuseProgramException(value: String): Self = StObject.set(x, "linenReuseProgramException", value.asInstanceOf[js.Any])
    
    inline def setLinenReuseProgramExceptionNull: Self = StObject.set(x, "linenReuseProgramException", null)
    
    inline def setLinenReuseProgramExceptionUndefined: Self = StObject.set(x, "linenReuseProgramException", js.undefined)
    
    inline def setLinenReuseProgramNull: Self = StObject.set(x, "linenReuseProgram", null)
    
    inline def setLinenReuseProgramUndefined: Self = StObject.set(x, "linenReuseProgram", js.undefined)
    
    inline def setTowelReuseProgram(value: Boolean): Self = StObject.set(x, "towelReuseProgram", value.asInstanceOf[js.Any])
    
    inline def setTowelReuseProgramException(value: String): Self = StObject.set(x, "towelReuseProgramException", value.asInstanceOf[js.Any])
    
    inline def setTowelReuseProgramExceptionNull: Self = StObject.set(x, "towelReuseProgramException", null)
    
    inline def setTowelReuseProgramExceptionUndefined: Self = StObject.set(x, "towelReuseProgramException", js.undefined)
    
    inline def setTowelReuseProgramNull: Self = StObject.set(x, "towelReuseProgram", null)
    
    inline def setTowelReuseProgramUndefined: Self = StObject.set(x, "towelReuseProgram", js.undefined)
    
    inline def setWaterSavingShowers(value: Boolean): Self = StObject.set(x, "waterSavingShowers", value.asInstanceOf[js.Any])
    
    inline def setWaterSavingShowersException(value: String): Self = StObject.set(x, "waterSavingShowersException", value.asInstanceOf[js.Any])
    
    inline def setWaterSavingShowersExceptionNull: Self = StObject.set(x, "waterSavingShowersException", null)
    
    inline def setWaterSavingShowersExceptionUndefined: Self = StObject.set(x, "waterSavingShowersException", js.undefined)
    
    inline def setWaterSavingShowersNull: Self = StObject.set(x, "waterSavingShowers", null)
    
    inline def setWaterSavingShowersUndefined: Self = StObject.set(x, "waterSavingShowers", js.undefined)
    
    inline def setWaterSavingSinks(value: Boolean): Self = StObject.set(x, "waterSavingSinks", value.asInstanceOf[js.Any])
    
    inline def setWaterSavingSinksException(value: String): Self = StObject.set(x, "waterSavingSinksException", value.asInstanceOf[js.Any])
    
    inline def setWaterSavingSinksExceptionNull: Self = StObject.set(x, "waterSavingSinksException", null)
    
    inline def setWaterSavingSinksExceptionUndefined: Self = StObject.set(x, "waterSavingSinksException", js.undefined)
    
    inline def setWaterSavingSinksNull: Self = StObject.set(x, "waterSavingSinks", null)
    
    inline def setWaterSavingSinksUndefined: Self = StObject.set(x, "waterSavingSinks", js.undefined)
    
    inline def setWaterSavingToilets(value: Boolean): Self = StObject.set(x, "waterSavingToilets", value.asInstanceOf[js.Any])
    
    inline def setWaterSavingToiletsException(value: String): Self = StObject.set(x, "waterSavingToiletsException", value.asInstanceOf[js.Any])
    
    inline def setWaterSavingToiletsExceptionNull: Self = StObject.set(x, "waterSavingToiletsException", null)
    
    inline def setWaterSavingToiletsExceptionUndefined: Self = StObject.set(x, "waterSavingToiletsException", js.undefined)
    
    inline def setWaterSavingToiletsNull: Self = StObject.set(x, "waterSavingToilets", null)
    
    inline def setWaterSavingToiletsUndefined: Self = StObject.set(x, "waterSavingToilets", js.undefined)
  }
}
