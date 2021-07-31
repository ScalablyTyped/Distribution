package typings.grommet.anon

import typings.grommet.dataChartMod.GranularityType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Granularity extends StObject {
  
  var granularity: js.UndefOr[GranularityType] = js.undefined
  
  var property: js.UndefOr[String] = js.undefined
}
object Granularity {
  
  @scala.inline
  def apply(): Granularity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Granularity]
  }
  
  @scala.inline
  implicit class GranularityMutableBuilder[Self <: Granularity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGranularity(value: GranularityType): Self = StObject.set(x, "granularity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGranularityUndefined: Self = StObject.set(x, "granularity", js.undefined)
    
    @scala.inline
    def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
  }
}
