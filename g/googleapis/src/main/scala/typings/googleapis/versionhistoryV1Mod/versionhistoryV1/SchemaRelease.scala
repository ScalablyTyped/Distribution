package typings.googleapis.versionhistoryV1Mod.versionhistoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRelease extends StObject {
  
  /**
    * Rollout fraction. This fraction indicates the fraction of people that should receive this version in this release. If the fraction is not specified in ReleaseManager, the API will assume fraction is 1.
    */
  var fraction: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Rollout fraction group. Only fractions with the same fraction_group are statistically comparable: there may be non-fractional differences between different fraction groups.
    */
  var fractionGroup: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Release name. Format is "{product\}/platforms/{platform\}/channels/{channel\}/versions/{version\}/releases/{release\}"
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Timestamp interval of when the release was live. If end_time is unspecified, the release is currently live.
    */
  var serving: js.UndefOr[SchemaInterval] = js.undefined
  
  /**
    * String containing just the version number. e.g. "84.0.4147.38"
    */
  var version: js.UndefOr[String | Null] = js.undefined
}
object SchemaRelease {
  
  inline def apply(): SchemaRelease = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRelease]
  }
  
  extension [Self <: SchemaRelease](x: Self) {
    
    inline def setFraction(value: Double): Self = StObject.set(x, "fraction", value.asInstanceOf[js.Any])
    
    inline def setFractionGroup(value: String): Self = StObject.set(x, "fractionGroup", value.asInstanceOf[js.Any])
    
    inline def setFractionGroupNull: Self = StObject.set(x, "fractionGroup", null)
    
    inline def setFractionGroupUndefined: Self = StObject.set(x, "fractionGroup", js.undefined)
    
    inline def setFractionNull: Self = StObject.set(x, "fraction", null)
    
    inline def setFractionUndefined: Self = StObject.set(x, "fraction", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setServing(value: SchemaInterval): Self = StObject.set(x, "serving", value.asInstanceOf[js.Any])
    
    inline def setServingUndefined: Self = StObject.set(x, "serving", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
