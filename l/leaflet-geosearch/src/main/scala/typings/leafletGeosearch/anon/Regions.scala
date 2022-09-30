package typings.leafletGeosearch.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Regions extends StObject {
  
  var regions: StringDictionary[String]
  
  var statistical_groupings: js.Array[String]
}
object Regions {
  
  inline def apply(regions: StringDictionary[String], statistical_groupings: js.Array[String]): Regions = {
    val __obj = js.Dynamic.literal(regions = regions.asInstanceOf[js.Any], statistical_groupings = statistical_groupings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Regions]
  }
  
  extension [Self <: Regions](x: Self) {
    
    inline def setRegions(value: StringDictionary[String]): Self = StObject.set(x, "regions", value.asInstanceOf[js.Any])
    
    inline def setStatistical_groupings(value: js.Array[String]): Self = StObject.set(x, "statistical_groupings", value.asInstanceOf[js.Any])
    
    inline def setStatistical_groupingsVarargs(value: String*): Self = StObject.set(x, "statistical_groupings", js.Array(value*))
  }
}
