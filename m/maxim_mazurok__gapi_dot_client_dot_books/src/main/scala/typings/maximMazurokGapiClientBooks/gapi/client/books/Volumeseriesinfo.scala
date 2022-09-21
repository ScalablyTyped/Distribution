package typings.maximMazurokGapiClientBooks.gapi.client.books

import typings.maximMazurokGapiClientBooks.anon.Issue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Volumeseriesinfo extends StObject {
  
  /** The display number string. This should be used only for display purposes and the actual sequence should be inferred from the below orderNumber. */
  var bookDisplayNumber: js.UndefOr[String] = js.undefined
  
  /** Resource type. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Short book title in the context of the series. */
  var shortSeriesBookTitle: js.UndefOr[String] = js.undefined
  
  var volumeSeries: js.UndefOr[js.Array[Issue]] = js.undefined
}
object Volumeseriesinfo {
  
  inline def apply(): Volumeseriesinfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Volumeseriesinfo]
  }
  
  extension [Self <: Volumeseriesinfo](x: Self) {
    
    inline def setBookDisplayNumber(value: String): Self = StObject.set(x, "bookDisplayNumber", value.asInstanceOf[js.Any])
    
    inline def setBookDisplayNumberUndefined: Self = StObject.set(x, "bookDisplayNumber", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setShortSeriesBookTitle(value: String): Self = StObject.set(x, "shortSeriesBookTitle", value.asInstanceOf[js.Any])
    
    inline def setShortSeriesBookTitleUndefined: Self = StObject.set(x, "shortSeriesBookTitle", js.undefined)
    
    inline def setVolumeSeries(value: js.Array[Issue]): Self = StObject.set(x, "volumeSeries", value.asInstanceOf[js.Any])
    
    inline def setVolumeSeriesUndefined: Self = StObject.set(x, "volumeSeries", js.undefined)
    
    inline def setVolumeSeriesVarargs(value: Issue*): Self = StObject.set(x, "volumeSeries", js.Array(value*))
  }
}
