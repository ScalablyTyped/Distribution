package typings.hexo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CategoryPage extends IndexPage {
  
  var category: String = js.native
}
object CategoryPage {
  
  @scala.inline
  def apply(category: String): CategoryPage = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any])
    __obj.asInstanceOf[CategoryPage]
  }
  
  @scala.inline
  implicit class CategoryPageMutableBuilder[Self <: CategoryPage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
  }
}
