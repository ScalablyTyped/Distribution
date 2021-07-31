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
  
  @scala.inline
  def apply(): KikPickUsersOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KikPickUsersOptions]
  }
  
  @scala.inline
  implicit class KikPickUsersOptionsMutableBuilder[Self <: KikPickUsersOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilterSelf(value: Boolean): Self = StObject.set(x, "filterSelf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterSelfUndefined: Self = StObject.set(x, "filterSelf", js.undefined)
    
    @scala.inline
    def setFiltered(value: js.Array[String]): Self = StObject.set(x, "filtered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilteredUndefined: Self = StObject.set(x, "filtered", js.undefined)
    
    @scala.inline
    def setFilteredVarargs(value: String*): Self = StObject.set(x, "filtered", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setMinResults(value: Double): Self = StObject.set(x, "minResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinResultsUndefined: Self = StObject.set(x, "minResults", js.undefined)
    
    @scala.inline
    def setPreselected(value: js.Array[Username]): Self = StObject.set(x, "preselected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreselectedUndefined: Self = StObject.set(x, "preselected", js.undefined)
    
    @scala.inline
    def setPreselectedVarargs(value: Username*): Self = StObject.set(x, "preselected", js.Array(value :_*))
  }
}
