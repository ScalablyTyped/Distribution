package typings.knuddelsUserappsApi.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ascending extends StObject {
  
  var ascending: js.UndefOr[Boolean] = js.native
  
  var labelMapping: js.UndefOr[StringDictionary[String]] = js.native
  
  var sortIndex: js.UndefOr[Double] = js.native
}
object Ascending {
  
  @scala.inline
  def apply(): Ascending = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ascending]
  }
  
  @scala.inline
  implicit class AscendingMutableBuilder[Self <: Ascending] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAscending(value: Boolean): Self = StObject.set(x, "ascending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAscendingUndefined: Self = StObject.set(x, "ascending", js.undefined)
    
    @scala.inline
    def setLabelMapping(value: StringDictionary[String]): Self = StObject.set(x, "labelMapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelMappingUndefined: Self = StObject.set(x, "labelMapping", js.undefined)
    
    @scala.inline
    def setSortIndex(value: Double): Self = StObject.set(x, "sortIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortIndexUndefined: Self = StObject.set(x, "sortIndex", js.undefined)
  }
}
