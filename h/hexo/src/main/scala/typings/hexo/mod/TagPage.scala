package typings.hexo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagPage
  extends StObject
     with IndexPage {
  
  var tag: String
}
object TagPage {
  
  @scala.inline
  def apply(tag: String): TagPage = {
    val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagPage]
  }
  
  @scala.inline
  implicit class TagPageMutableBuilder[Self <: TagPage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
  }
}
