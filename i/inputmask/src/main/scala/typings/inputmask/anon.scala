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
    
    @scala.inline
    def apply(back: String, front: String): Back = {
      val __obj = js.Dynamic.literal(back = back.asInstanceOf[js.Any], front = front.asInstanceOf[js.Any])
      __obj.asInstanceOf[Back]
    }
    
    @scala.inline
    implicit class BackMutableBuilder[Self <: Back] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBack(value: String): Self = StObject.set(x, "back", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFront(value: String): Self = StObject.set(x, "front", value.asInstanceOf[js.Any])
    }
  }
  
  trait C extends StObject {
    
    var c: String
    
    var pos: Double
  }
  object C {
    
    @scala.inline
    def apply(c: String, pos: Double): C = {
      val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
      __obj.asInstanceOf[C]
    }
    
    @scala.inline
    implicit class CMutableBuilder[Self <: C] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setC(value: String): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPos(value: Double): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
    }
  }
  
  trait End extends StObject {
    
    var end: String
    
    var start: String
  }
  object End {
    
    @scala.inline
    def apply(end: String, start: String): End = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[End]
    }
    
    @scala.inline
    implicit class EndMutableBuilder[Self <: End] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait Start extends StObject {
    
    var end: Double
    
    var start: Double
  }
  object Start {
    
    @scala.inline
    def apply(end: Double, start: Double): Start = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[Start]
    }
    
    @scala.inline
    implicit class StartMutableBuilder[Self <: Start] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
}
