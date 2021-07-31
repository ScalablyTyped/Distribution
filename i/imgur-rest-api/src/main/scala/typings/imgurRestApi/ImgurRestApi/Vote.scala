package typings.imgurRestApi.ImgurRestApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Vote extends StObject {
  
  var downs: Double
  
  var ups: Double
}
object Vote {
  
  @scala.inline
  def apply(downs: Double, ups: Double): Vote = {
    val __obj = js.Dynamic.literal(downs = downs.asInstanceOf[js.Any], ups = ups.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vote]
  }
  
  @scala.inline
  implicit class VoteMutableBuilder[Self <: Vote] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDowns(value: Double): Self = StObject.set(x, "downs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUps(value: Double): Self = StObject.set(x, "ups", value.asInstanceOf[js.Any])
  }
}
