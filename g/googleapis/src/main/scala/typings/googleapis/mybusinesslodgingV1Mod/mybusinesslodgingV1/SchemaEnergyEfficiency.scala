package typings.googleapis.mybusinesslodgingV1Mod.mybusinesslodgingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEnergyEfficiency extends StObject {
  
  /**
    * Carbon free energy sources. Property sources carbon-free electricity via at least one of the following methods: on-site clean energy generation, power purchase agreement(s) with clean energy generators, green power provided by electricity supplier, or purchases of Energy Attribute Certificates (such as Renewable Energy Certificates or Guarantees of Origin).
    */
  var carbonFreeEnergySources: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Carbon free energy sources exception.
    */
  var carbonFreeEnergySourcesException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Energy conservation program. The property tracks corporate-level Scope 1 and 2 GHG emissions, and Scope 3 emissions if available. The property has a commitment to implement initiatives that reduce GHG emissions year over year. The property has shown an absolute reduction in emissions for at least 2 years. Emissions are either verfied by a third-party and/or published in external communications.
    */
  var energyConservationProgram: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Energy conservation program exception.
    */
  var energyConservationProgramException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Energy efficient heating and cooling systems. The property doesn't use chlorofluorocarbon (CFC)-based refrigerants in heating, ventilating, and air-conditioning systems unless a third-party audit shows it's not economically feasible. The CFC-based refrigerants which are used should have a Global Warming Potential (GWP) ≤ 10. The property uses occupancy sensors on HVAC systems in back-of-house spaces, meeting rooms, and other low-traffic areas.
    */
  var energyEfficientHeatingAndCoolingSystems: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Energy efficient heating and cooling systems exception.
    */
  var energyEfficientHeatingAndCoolingSystemsException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Energy efficient lighting. At least 75% of the property's lighting is energy efficient, using lighting that is more than 45 lumens per watt – typically LED or CFL lightbulbs.
    */
  var energyEfficientLighting: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Energy efficient lighting exception.
    */
  var energyEfficientLightingException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Energy saving thermostats. The property installed energy-saving thermostats throughout the building to conserve energy when rooms or areas are not in use. Energy-saving thermostats are devices that control heating/cooling in the building by learning temperature preferences and automatically adjusting to energy-saving temperatures as the default. The thermostats are automatically set to a temperature between 68-78 degrees F (20-26 °C), depending on seasonality. In the winter, set the thermostat to 68°F (20°C) when the room is occupied, lowering room temperature when unoccupied. In the summer, set the thermostat to 78°F (26°C) when the room is occupied.
    */
  var energySavingThermostats: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Energy saving thermostats exception.
    */
  var energySavingThermostatsException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Green building design. True if BREEAM-* or LEED-* certified.
    */
  var greenBuildingDesign: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. Green building design exception.
    */
  var greenBuildingDesignException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Independent organization audits energy use. The property conducts an energy audit at least every 5 years, the results of which are either verified by a third-party and/or published in external communications. An energy audit is a detailed assessment of the facility which provides recommendations to existing operations and procedures to improve energy efficiency, available incentives or rebates,and opportunities for improvements through renovations or upgrades. Examples of organizations that conduct credible third party audits include: Engie Impact, DNV GL (EU), Dexma, and local utility providers (they often provide energy and water audits).
    */
  var independentOrganizationAuditsEnergyUse: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Independent organization audits energy use exception.
    */
  var independentOrganizationAuditsEnergyUseException: js.UndefOr[String | Null] = js.undefined
}
object SchemaEnergyEfficiency {
  
  inline def apply(): SchemaEnergyEfficiency = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEnergyEfficiency]
  }
  
  extension [Self <: SchemaEnergyEfficiency](x: Self) {
    
    inline def setCarbonFreeEnergySources(value: Boolean): Self = StObject.set(x, "carbonFreeEnergySources", value.asInstanceOf[js.Any])
    
    inline def setCarbonFreeEnergySourcesException(value: String): Self = StObject.set(x, "carbonFreeEnergySourcesException", value.asInstanceOf[js.Any])
    
    inline def setCarbonFreeEnergySourcesExceptionNull: Self = StObject.set(x, "carbonFreeEnergySourcesException", null)
    
    inline def setCarbonFreeEnergySourcesExceptionUndefined: Self = StObject.set(x, "carbonFreeEnergySourcesException", js.undefined)
    
    inline def setCarbonFreeEnergySourcesNull: Self = StObject.set(x, "carbonFreeEnergySources", null)
    
    inline def setCarbonFreeEnergySourcesUndefined: Self = StObject.set(x, "carbonFreeEnergySources", js.undefined)
    
    inline def setEnergyConservationProgram(value: Boolean): Self = StObject.set(x, "energyConservationProgram", value.asInstanceOf[js.Any])
    
    inline def setEnergyConservationProgramException(value: String): Self = StObject.set(x, "energyConservationProgramException", value.asInstanceOf[js.Any])
    
    inline def setEnergyConservationProgramExceptionNull: Self = StObject.set(x, "energyConservationProgramException", null)
    
    inline def setEnergyConservationProgramExceptionUndefined: Self = StObject.set(x, "energyConservationProgramException", js.undefined)
    
    inline def setEnergyConservationProgramNull: Self = StObject.set(x, "energyConservationProgram", null)
    
    inline def setEnergyConservationProgramUndefined: Self = StObject.set(x, "energyConservationProgram", js.undefined)
    
    inline def setEnergyEfficientHeatingAndCoolingSystems(value: Boolean): Self = StObject.set(x, "energyEfficientHeatingAndCoolingSystems", value.asInstanceOf[js.Any])
    
    inline def setEnergyEfficientHeatingAndCoolingSystemsException(value: String): Self = StObject.set(x, "energyEfficientHeatingAndCoolingSystemsException", value.asInstanceOf[js.Any])
    
    inline def setEnergyEfficientHeatingAndCoolingSystemsExceptionNull: Self = StObject.set(x, "energyEfficientHeatingAndCoolingSystemsException", null)
    
    inline def setEnergyEfficientHeatingAndCoolingSystemsExceptionUndefined: Self = StObject.set(x, "energyEfficientHeatingAndCoolingSystemsException", js.undefined)
    
    inline def setEnergyEfficientHeatingAndCoolingSystemsNull: Self = StObject.set(x, "energyEfficientHeatingAndCoolingSystems", null)
    
    inline def setEnergyEfficientHeatingAndCoolingSystemsUndefined: Self = StObject.set(x, "energyEfficientHeatingAndCoolingSystems", js.undefined)
    
    inline def setEnergyEfficientLighting(value: Boolean): Self = StObject.set(x, "energyEfficientLighting", value.asInstanceOf[js.Any])
    
    inline def setEnergyEfficientLightingException(value: String): Self = StObject.set(x, "energyEfficientLightingException", value.asInstanceOf[js.Any])
    
    inline def setEnergyEfficientLightingExceptionNull: Self = StObject.set(x, "energyEfficientLightingException", null)
    
    inline def setEnergyEfficientLightingExceptionUndefined: Self = StObject.set(x, "energyEfficientLightingException", js.undefined)
    
    inline def setEnergyEfficientLightingNull: Self = StObject.set(x, "energyEfficientLighting", null)
    
    inline def setEnergyEfficientLightingUndefined: Self = StObject.set(x, "energyEfficientLighting", js.undefined)
    
    inline def setEnergySavingThermostats(value: Boolean): Self = StObject.set(x, "energySavingThermostats", value.asInstanceOf[js.Any])
    
    inline def setEnergySavingThermostatsException(value: String): Self = StObject.set(x, "energySavingThermostatsException", value.asInstanceOf[js.Any])
    
    inline def setEnergySavingThermostatsExceptionNull: Self = StObject.set(x, "energySavingThermostatsException", null)
    
    inline def setEnergySavingThermostatsExceptionUndefined: Self = StObject.set(x, "energySavingThermostatsException", js.undefined)
    
    inline def setEnergySavingThermostatsNull: Self = StObject.set(x, "energySavingThermostats", null)
    
    inline def setEnergySavingThermostatsUndefined: Self = StObject.set(x, "energySavingThermostats", js.undefined)
    
    inline def setGreenBuildingDesign(value: Boolean): Self = StObject.set(x, "greenBuildingDesign", value.asInstanceOf[js.Any])
    
    inline def setGreenBuildingDesignException(value: String): Self = StObject.set(x, "greenBuildingDesignException", value.asInstanceOf[js.Any])
    
    inline def setGreenBuildingDesignExceptionNull: Self = StObject.set(x, "greenBuildingDesignException", null)
    
    inline def setGreenBuildingDesignExceptionUndefined: Self = StObject.set(x, "greenBuildingDesignException", js.undefined)
    
    inline def setGreenBuildingDesignNull: Self = StObject.set(x, "greenBuildingDesign", null)
    
    inline def setGreenBuildingDesignUndefined: Self = StObject.set(x, "greenBuildingDesign", js.undefined)
    
    inline def setIndependentOrganizationAuditsEnergyUse(value: Boolean): Self = StObject.set(x, "independentOrganizationAuditsEnergyUse", value.asInstanceOf[js.Any])
    
    inline def setIndependentOrganizationAuditsEnergyUseException(value: String): Self = StObject.set(x, "independentOrganizationAuditsEnergyUseException", value.asInstanceOf[js.Any])
    
    inline def setIndependentOrganizationAuditsEnergyUseExceptionNull: Self = StObject.set(x, "independentOrganizationAuditsEnergyUseException", null)
    
    inline def setIndependentOrganizationAuditsEnergyUseExceptionUndefined: Self = StObject.set(x, "independentOrganizationAuditsEnergyUseException", js.undefined)
    
    inline def setIndependentOrganizationAuditsEnergyUseNull: Self = StObject.set(x, "independentOrganizationAuditsEnergyUse", null)
    
    inline def setIndependentOrganizationAuditsEnergyUseUndefined: Self = StObject.set(x, "independentOrganizationAuditsEnergyUse", js.undefined)
  }
}
