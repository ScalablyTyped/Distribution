package typings.inputmask

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Back extends StObject {
    
    var back: String
    
    var front: String
  }
  object Back {
    
    inline def apply(back: String, front: String): Back = {
      val __obj = js.Dynamic.literal(back = back.asInstanceOf[js.Any], front = front.asInstanceOf[js.Any])
      __obj.asInstanceOf[Back]
    }
    
    extension [Self <: Back](x: Self) {
      
      inline def setBack(value: String): Self = StObject.set(x, "back", value.asInstanceOf[js.Any])
      
      inline def setFront(value: String): Self = StObject.set(x, "front", value.asInstanceOf[js.Any])
    }
  }
  
  trait C extends StObject {
    
    var c: String
    
    var pos: Double
  }
  object C {
    
    inline def apply(c: String, pos: Double): C = {
      val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
      __obj.asInstanceOf[C]
    }
    
    extension [Self <: C](x: Self) {
      
      inline def setC(value: String): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
      
      inline def setPos(value: Double): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
    }
  }
  
  trait End extends StObject {
    
    var end: String
    
    var start: String
  }
  object End {
    
    inline def apply(end: String, start: String): End = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[End]
    }
    
    extension [Self <: End](x: Self) {
      
      inline def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait Start extends StObject {
    
    var end: Double
    
    var start: Double
  }
  object Start {
    
    inline def apply(end: Double, start: Double): Start = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[Start]
    }
    
    extension [Self <: Start](x: Self) {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
}
