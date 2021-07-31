package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Data about the relative number of devices running a given configuration of
  * the Android platform.
  */
trait SchemaDistribution extends StObject {
  
  /**
    * Output only. The estimated fraction (0-1) of the total market with this
    * configuration.
    */
  var marketShare: js.UndefOr[Double] = js.undefined
  
  /**
    * Output only. The time this distribution was measured.
    */
  var measurementTime: js.UndefOr[String] = js.undefined
}
object SchemaDistribution {
  
  @scala.inline
  def apply(): SchemaDistribution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDistribution]
  }
  
  @scala.inline
  implicit class SchemaDistributionMutableBuilder[Self <: SchemaDistribution] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarketShare(value: Double): Self = StObject.set(x, "marketShare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarketShareUndefined: Self = StObject.set(x, "marketShare", js.undefined)
    
    @scala.inline
    def setMeasurementTime(value: String): Self = StObject.set(x, "measurementTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasurementTimeUndefined: Self = StObject.set(x, "measurementTime", js.undefined)
  }
}
