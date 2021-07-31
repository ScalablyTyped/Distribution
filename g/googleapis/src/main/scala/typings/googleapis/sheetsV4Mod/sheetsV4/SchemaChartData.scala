package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The data included in a domain or series.
  */
trait SchemaChartData extends StObject {
  
  /**
    * The source ranges of the data.
    */
  var sourceRange: js.UndefOr[SchemaChartSourceRange] = js.undefined
}
object SchemaChartData {
  
  @scala.inline
  def apply(): SchemaChartData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChartData]
  }
  
  @scala.inline
  implicit class SchemaChartDataMutableBuilder[Self <: SchemaChartData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSourceRange(value: SchemaChartSourceRange): Self = StObject.set(x, "sourceRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceRangeUndefined: Self = StObject.set(x, "sourceRange", js.undefined)
  }
}
