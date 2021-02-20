package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Adloox extends StObject {
  
  /** Adloox's brand safety settings. */
  var excludedAdlooxCategories: js.UndefOr[js.Array[String]] = js.native
}
object Adloox {
  
  @scala.inline
  def apply(): Adloox = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Adloox]
  }
  
  @scala.inline
  implicit class AdlooxMutableBuilder[Self <: Adloox] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExcludedAdlooxCategories(value: js.Array[String]): Self = StObject.set(x, "excludedAdlooxCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludedAdlooxCategoriesUndefined: Self = StObject.set(x, "excludedAdlooxCategories", js.undefined)
    
    @scala.inline
    def setExcludedAdlooxCategoriesVarargs(value: String*): Self = StObject.set(x, "excludedAdlooxCategories", js.Array(value :_*))
  }
}
