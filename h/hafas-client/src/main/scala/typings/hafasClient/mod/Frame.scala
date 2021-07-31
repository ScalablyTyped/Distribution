package typings.hafasClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Frame extends StObject {
  
  var destination: Stop | Location
  
  var origin: Stop | Location
  
  var t: js.UndefOr[Double] = js.undefined
}
object Frame {
  
  @scala.inline
  def apply(destination: Stop | Location, origin: Stop | Location): Frame = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Frame]
  }
  
  @scala.inline
  implicit class FrameMutableBuilder[Self <: Frame] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestination(value: Stop | Location): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrigin(value: Stop | Location): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setT(value: Double): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTUndefined: Self = StObject.set(x, "t", js.undefined)
  }
}
