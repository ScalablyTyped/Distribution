package typings.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GcRule extends StObject {
  
  /** Delete cells that would be deleted by every nested rule. */
  var intersection: js.UndefOr[Intersection] = js.undefined
  
  /** Delete cells in a column older than the given age. Values must be at least one millisecond, and will be truncated to microsecond granularity. */
  var maxAge: js.UndefOr[String] = js.undefined
  
  /** Delete all cells in a column except the most recent N. */
  var maxNumVersions: js.UndefOr[Double] = js.undefined
  
  /** Delete cells that would be deleted by any nested rule. */
  var union: js.UndefOr[Union] = js.undefined
}
object GcRule {
  
  inline def apply(): GcRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GcRule]
  }
  
  extension [Self <: GcRule](x: Self) {
    
    inline def setIntersection(value: Intersection): Self = StObject.set(x, "intersection", value.asInstanceOf[js.Any])
    
    inline def setIntersectionUndefined: Self = StObject.set(x, "intersection", js.undefined)
    
    inline def setMaxAge(value: String): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
    
    inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
    
    inline def setMaxNumVersions(value: Double): Self = StObject.set(x, "maxNumVersions", value.asInstanceOf[js.Any])
    
    inline def setMaxNumVersionsUndefined: Self = StObject.set(x, "maxNumVersions", js.undefined)
    
    inline def setUnion(value: Union): Self = StObject.set(x, "union", value.asInstanceOf[js.Any])
    
    inline def setUnionUndefined: Self = StObject.set(x, "union", js.undefined)
  }
}
