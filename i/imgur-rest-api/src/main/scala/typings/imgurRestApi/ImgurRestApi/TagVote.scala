package typings.imgurRestApi.ImgurRestApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagVote extends StObject {
  
  var author: String = js.native
  
  var downs: Double = js.native
  
  var name: String = js.native
  
  var ups: Double = js.native
}
object TagVote {
  
  @scala.inline
  def apply(author: String, downs: Double, name: String, ups: Double): TagVote = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], downs = downs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ups = ups.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagVote]
  }
  
  @scala.inline
  implicit class TagVoteMutableBuilder[Self <: TagVote] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDowns(value: Double): Self = StObject.set(x, "downs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUps(value: Double): Self = StObject.set(x, "ups", value.asInstanceOf[js.Any])
  }
}
