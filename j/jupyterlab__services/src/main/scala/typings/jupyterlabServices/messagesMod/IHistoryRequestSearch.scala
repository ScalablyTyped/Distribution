package typings.jupyterlabServices.messagesMod

import typings.jupyterlabServices.jupyterlabServicesStrings.search
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHistoryRequestSearch extends StObject {
  
  var hist_access_type: search = js.native
  
  var n: Double = js.native
  
  var output: Boolean = js.native
  
  var pattern: String = js.native
  
  var raw: Boolean = js.native
  
  var unique: Boolean = js.native
}
object IHistoryRequestSearch {
  
  @scala.inline
  def apply(
    hist_access_type: search,
    n: Double,
    output: Boolean,
    pattern: String,
    raw: Boolean,
    unique: Boolean
  ): IHistoryRequestSearch = {
    val __obj = js.Dynamic.literal(hist_access_type = hist_access_type.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], unique = unique.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHistoryRequestSearch]
  }
  
  @scala.inline
  implicit class IHistoryRequestSearchMutableBuilder[Self <: IHistoryRequestSearch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHist_access_type(value: search): Self = StObject.set(x, "hist_access_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setN(value: Double): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutput(value: Boolean): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnique(value: Boolean): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
  }
}
