package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The domain of a waterfall chart.
  */
@js.native
trait SchemaWaterfallChartDomain extends StObject {
  
  /**
    * The data of the WaterfallChartDomain.
    */
  var data: js.UndefOr[SchemaChartData] = js.native
  
  /**
    * True to reverse the order of the domain values (horizontal axis).
    */
  var reversed: js.UndefOr[Boolean] = js.native
}
object SchemaWaterfallChartDomain {
  
  @scala.inline
  def apply(): SchemaWaterfallChartDomain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWaterfallChartDomain]
  }
  
  @scala.inline
  implicit class SchemaWaterfallChartDomainMutableBuilder[Self <: SchemaWaterfallChartDomain] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: SchemaChartData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
  }
}
