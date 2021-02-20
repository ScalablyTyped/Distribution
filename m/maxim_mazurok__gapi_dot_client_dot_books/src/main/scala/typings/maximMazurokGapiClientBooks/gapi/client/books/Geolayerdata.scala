package typings.maximMazurokGapiClientBooks.gapi.client.books

import typings.maximMazurokGapiClientBooks.anon.Boundary
import typings.maximMazurokGapiClientBooks.anon.Lang
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Geolayerdata extends StObject {
  
  var common: js.UndefOr[Lang] = js.native
  
  var geo: js.UndefOr[Boundary] = js.native
  
  var kind: js.UndefOr[String] = js.native
}
object Geolayerdata {
  
  @scala.inline
  def apply(): Geolayerdata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Geolayerdata]
  }
  
  @scala.inline
  implicit class GeolayerdataMutableBuilder[Self <: Geolayerdata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommon(value: Lang): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommonUndefined: Self = StObject.set(x, "common", js.undefined)
    
    @scala.inline
    def setGeo(value: Boundary): Self = StObject.set(x, "geo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeoUndefined: Self = StObject.set(x, "geo", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
