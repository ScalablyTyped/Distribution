package typings.jqueryFancytree.Fancytree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TranslationTable extends StObject {
  
  /**
    * "Load error!"
    */
  var loadError: js.UndefOr[String] = js.undefined
  
  /**
    * "Loading..."  // &#8230; would be escaped when escapeTitles is true
    */
  var loading: js.UndefOr[String] = js.undefined
  
  /**
    * "More..."
    */
  var moreData: js.UndefOr[String] = js.undefined
  
  /**
    * "No data."
    */
  var noData: js.UndefOr[String] = js.undefined
}
object TranslationTable {
  
  inline def apply(): TranslationTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TranslationTable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TranslationTable] (val x: Self) extends AnyVal {
    
    inline def setLoadError(value: String): Self = StObject.set(x, "loadError", value.asInstanceOf[js.Any])
    
    inline def setLoadErrorUndefined: Self = StObject.set(x, "loadError", js.undefined)
    
    inline def setLoading(value: String): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
    
    inline def setMoreData(value: String): Self = StObject.set(x, "moreData", value.asInstanceOf[js.Any])
    
    inline def setMoreDataUndefined: Self = StObject.set(x, "moreData", js.undefined)
    
    inline def setNoData(value: String): Self = StObject.set(x, "noData", value.asInstanceOf[js.Any])
    
    inline def setNoDataUndefined: Self = StObject.set(x, "noData", js.undefined)
  }
}
