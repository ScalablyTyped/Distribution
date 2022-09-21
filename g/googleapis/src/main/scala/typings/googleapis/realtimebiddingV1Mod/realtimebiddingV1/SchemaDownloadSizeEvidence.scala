package typings.googleapis.realtimebiddingV1Mod.realtimebiddingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDownloadSizeEvidence extends StObject {
  
  /**
    * Download size broken down by URLs with the top download size.
    */
  var topUrlDownloadSizeBreakdowns: js.UndefOr[js.Array[SchemaUrlDownloadSize]] = js.undefined
  
  /**
    * Total download size (in kilobytes) for all the resources in the creative.
    */
  var totalDownloadSizeKb: js.UndefOr[Double | Null] = js.undefined
}
object SchemaDownloadSizeEvidence {
  
  inline def apply(): SchemaDownloadSizeEvidence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDownloadSizeEvidence]
  }
  
  extension [Self <: SchemaDownloadSizeEvidence](x: Self) {
    
    inline def setTopUrlDownloadSizeBreakdowns(value: js.Array[SchemaUrlDownloadSize]): Self = StObject.set(x, "topUrlDownloadSizeBreakdowns", value.asInstanceOf[js.Any])
    
    inline def setTopUrlDownloadSizeBreakdownsUndefined: Self = StObject.set(x, "topUrlDownloadSizeBreakdowns", js.undefined)
    
    inline def setTopUrlDownloadSizeBreakdownsVarargs(value: SchemaUrlDownloadSize*): Self = StObject.set(x, "topUrlDownloadSizeBreakdowns", js.Array(value*))
    
    inline def setTotalDownloadSizeKb(value: Double): Self = StObject.set(x, "totalDownloadSizeKb", value.asInstanceOf[js.Any])
    
    inline def setTotalDownloadSizeKbNull: Self = StObject.set(x, "totalDownloadSizeKb", null)
    
    inline def setTotalDownloadSizeKbUndefined: Self = StObject.set(x, "totalDownloadSizeKb", js.undefined)
  }
}
