package typings.kikBrowser

import typings.kikBrowser.anon.Username
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KikPickUsersOptions extends StObject {
  
  var filterSelf: js.UndefOr[Boolean] = js.undefined
  
  var filtered: js.UndefOr[js.Array[String]] = js.undefined
  
  var maxResults: js.UndefOr[Double] = js.undefined
  
  var minResults: js.UndefOr[Double] = js.undefined
  
  var preselected: js.UndefOr[js.Array[Username]] = js.undefined
}
object KikPickUsersOptions {
  
  inline def apply(): KikPickUsersOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KikPickUsersOptions]
  }
  
  extension [Self <: KikPickUsersOptions](x: Self) {
    
    inline def setFilterSelf(value: Boolean): Self = StObject.set(x, "filterSelf", value.asInstanceOf[js.Any])
    
    inline def setFilterSelfUndefined: Self = StObject.set(x, "filterSelf", js.undefined)
    
    inline def setFiltered(value: js.Array[String]): Self = StObject.set(x, "filtered", value.asInstanceOf[js.Any])
    
    inline def setFilteredUndefined: Self = StObject.set(x, "filtered", js.undefined)
    
    inline def setFilteredVarargs(value: String*): Self = StObject.set(x, "filtered", js.Array(value*))
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setMinResults(value: Double): Self = StObject.set(x, "minResults", value.asInstanceOf[js.Any])
    
    inline def setMinResultsUndefined: Self = StObject.set(x, "minResults", js.undefined)
    
    inline def setPreselected(value: js.Array[Username]): Self = StObject.set(x, "preselected", value.asInstanceOf[js.Any])
    
    inline def setPreselectedUndefined: Self = StObject.set(x, "preselected", js.undefined)
    
    inline def setPreselectedVarargs(value: Username*): Self = StObject.set(x, "preselected", js.Array(value*))
  }
}
