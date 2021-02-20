package typings.hafasClient.mod

import typings.hafasClient.hafasClientStrings.stop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A stop is a single small point or structure at which vehicles stop.
  * A stop always belongs to a station. It may for example be a sign, a basic shelter or a railway platform.
  */
@js.native
trait Stop extends StObject {
  
  var distance: js.UndefOr[Double] = js.native
  
  var entrances: js.UndefOr[js.Array[Location]] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var ids: js.UndefOr[Ids] = js.native
  
  var isMeta: js.UndefOr[Boolean] = js.native
  
  var lines: js.UndefOr[js.Array[Line]] = js.native
  
  var loadFactor: js.UndefOr[String] = js.native
  
  var location: js.UndefOr[Location] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var products: js.UndefOr[Products] = js.native
  
  var reisezentrumOpeningHours: js.UndefOr[ReisezentrumOpeningHours] = js.native
  
  var transitAuthority: js.UndefOr[String] = js.native
  
  var `type`: stop = js.native
}
object Stop {
  
  @scala.inline
  def apply(`type`: stop): Stop = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stop]
  }
  
  @scala.inline
  implicit class StopMutableBuilder[Self <: Stop] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
    
    @scala.inline
    def setEntrances(value: js.Array[Location]): Self = StObject.set(x, "entrances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntrancesUndefined: Self = StObject.set(x, "entrances", js.undefined)
    
    @scala.inline
    def setEntrancesVarargs(value: Location*): Self = StObject.set(x, "entrances", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIds(value: Ids): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
    
    @scala.inline
    def setIsMeta(value: Boolean): Self = StObject.set(x, "isMeta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMetaUndefined: Self = StObject.set(x, "isMeta", js.undefined)
    
    @scala.inline
    def setLines(value: js.Array[Line]): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinesUndefined: Self = StObject.set(x, "lines", js.undefined)
    
    @scala.inline
    def setLinesVarargs(value: Line*): Self = StObject.set(x, "lines", js.Array(value :_*))
    
    @scala.inline
    def setLoadFactor(value: String): Self = StObject.set(x, "loadFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadFactorUndefined: Self = StObject.set(x, "loadFactor", js.undefined)
    
    @scala.inline
    def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setProducts(value: Products): Self = StObject.set(x, "products", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductsUndefined: Self = StObject.set(x, "products", js.undefined)
    
    @scala.inline
    def setReisezentrumOpeningHours(value: ReisezentrumOpeningHours): Self = StObject.set(x, "reisezentrumOpeningHours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReisezentrumOpeningHoursUndefined: Self = StObject.set(x, "reisezentrumOpeningHours", js.undefined)
    
    @scala.inline
    def setTransitAuthority(value: String): Self = StObject.set(x, "transitAuthority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitAuthorityUndefined: Self = StObject.set(x, "transitAuthority", js.undefined)
    
    @scala.inline
    def setType(value: stop): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
