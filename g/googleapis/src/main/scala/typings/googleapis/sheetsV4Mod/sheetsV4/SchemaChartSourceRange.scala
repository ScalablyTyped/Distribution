package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Source ranges for a chart.
  */
trait SchemaChartSourceRange extends StObject {
  
  /**
    * The ranges of data for a series or domain. Exactly one dimension must
    * have a length of 1, and all sources in the list must have the same
    * dimension with length 1. The domain (if it exists) &amp; all series must
    * have the same number of source ranges. If using more than one source
    * range, then the source range at a given offset must be in order and
    * contiguous across the domain and series.  For example, these are valid
    * configurations:      domain sources: A1:A5     series1 sources: B1:B5
    * series2 sources: D6:D10      domain sources: A1:A5, C10:C12     series1
    * sources: B1:B5, D10:D12     series2 sources: C1:C5, E10:E12
    */
  var sources: js.UndefOr[js.Array[SchemaGridRange]] = js.undefined
}
object SchemaChartSourceRange {
  
  @scala.inline
  def apply(): SchemaChartSourceRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChartSourceRange]
  }
  
  @scala.inline
  implicit class SchemaChartSourceRangeMutableBuilder[Self <: SchemaChartSourceRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSources(value: js.Array[SchemaGridRange]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    @scala.inline
    def setSourcesVarargs(value: SchemaGridRange*): Self = StObject.set(x, "sources", js.Array(value :_*))
  }
}
