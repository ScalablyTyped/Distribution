package typings.imgurRestApi.ImgurRestApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagVote extends StObject {
  
  var author: String
  
  var downs: Double
  
  var name: String
  
  var ups: Double
}
object TagVote {
  
  inline def apply(author: String, downs: Double, name: String, ups: Double): TagVote = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], downs = downs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ups = ups.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagVote]
  }
  
  extension [Self <: TagVote](x: Self) {
    
    inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setDowns(value: Double): Self = StObject.set(x, "downs", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setUps(value: Double): Self = StObject.set(x, "ups", value.asInstanceOf[js.Any])
  }
}
