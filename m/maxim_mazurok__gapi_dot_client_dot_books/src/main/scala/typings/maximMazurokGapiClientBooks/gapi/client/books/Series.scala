package typings.maximMazurokGapiClientBooks.gapi.client.books

import typings.maximMazurokGapiClientBooks.anon.BannerImageUrl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Series extends StObject {
  
  /** Resource type. */
  var kind: js.UndefOr[String] = js.undefined
  
  var series: js.UndefOr[js.Array[BannerImageUrl]] = js.undefined
}
object Series {
  
  @scala.inline
  def apply(): Series = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Series]
  }
  
  @scala.inline
  implicit class SeriesMutableBuilder[Self <: Series] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setSeries(value: js.Array[BannerImageUrl]): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    @scala.inline
    def setSeriesVarargs(value: BannerImageUrl*): Self = StObject.set(x, "series", js.Array(value :_*))
  }
}
