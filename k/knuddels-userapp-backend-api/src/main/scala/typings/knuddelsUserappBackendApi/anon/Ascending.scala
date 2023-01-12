package typings.knuddelsUserappBackendApi.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ascending extends StObject {
  
  var ascending: js.UndefOr[Boolean] = js.undefined
  
  var labelMapping: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var sortIndex: js.UndefOr[Double] = js.undefined
}
object Ascending {
  
  inline def apply(): Ascending = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ascending]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ascending] (val x: Self) extends AnyVal {
    
    inline def setAscending(value: Boolean): Self = StObject.set(x, "ascending", value.asInstanceOf[js.Any])
    
    inline def setAscendingUndefined: Self = StObject.set(x, "ascending", js.undefined)
    
    inline def setLabelMapping(value: StringDictionary[String]): Self = StObject.set(x, "labelMapping", value.asInstanceOf[js.Any])
    
    inline def setLabelMappingUndefined: Self = StObject.set(x, "labelMapping", js.undefined)
    
    inline def setSortIndex(value: Double): Self = StObject.set(x, "sortIndex", value.asInstanceOf[js.Any])
    
    inline def setSortIndexUndefined: Self = StObject.set(x, "sortIndex", js.undefined)
  }
}
