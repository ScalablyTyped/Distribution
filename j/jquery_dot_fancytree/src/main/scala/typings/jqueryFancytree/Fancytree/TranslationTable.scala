package typings.jqueryFancytree.Fancytree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TranslationTable extends StObject {
  
  /**
    * "Load error!"
    */
  var loadError: js.UndefOr[String] = js.native
  
  /**
    * "Loading..."  // &#8230; would be escaped when escapeTitles is true
    */
  var loading: js.UndefOr[String] = js.native
  
  /**
    * "More..."
    */
  var moreData: js.UndefOr[String] = js.native
  
  /**
    * "No data."
    */
  var noData: js.UndefOr[String] = js.native
}
object TranslationTable {
  
  @scala.inline
  def apply(): TranslationTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TranslationTable]
  }
  
  @scala.inline
  implicit class TranslationTableMutableBuilder[Self <: TranslationTable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoadError(value: String): Self = StObject.set(x, "loadError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadErrorUndefined: Self = StObject.set(x, "loadError", js.undefined)
    
    @scala.inline
    def setLoading(value: String): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
    
    @scala.inline
    def setMoreData(value: String): Self = StObject.set(x, "moreData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoreDataUndefined: Self = StObject.set(x, "moreData", js.undefined)
    
    @scala.inline
    def setNoData(value: String): Self = StObject.set(x, "noData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoDataUndefined: Self = StObject.set(x, "noData", js.undefined)
  }
}
