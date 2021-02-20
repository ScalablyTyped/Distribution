package typings.intercomClient.anon

import typings.intercomClient.intercomClientStrings.user
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Perpage extends StObject {
  
  var per_page: js.UndefOr[Double] = js.native
  
  var `type`: user = js.native
}
object Perpage {
  
  @scala.inline
  def apply(`type`: user): Perpage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Perpage]
  }
  
  @scala.inline
  implicit class PerpageMutableBuilder[Self <: Perpage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
    
    @scala.inline
    def setType(value: user): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
