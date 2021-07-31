package typings.lucene

import typings.lucene.mod.TermLocation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait End extends StObject {
    
    var end: TermLocation
    
    var start: TermLocation
  }
  object End {
    
    @scala.inline
    def apply(end: TermLocation, start: TermLocation): End = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[End]
    }
    
    @scala.inline
    implicit class EndMutableBuilder[Self <: End] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: TermLocation): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: TermLocation): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait Start extends StObject {
    
    var end: TermLocation
    
    var start: TermLocation
  }
  object Start {
    
    @scala.inline
    def apply(end: TermLocation, start: TermLocation): Start = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[Start]
    }
    
    @scala.inline
    implicit class StartMutableBuilder[Self <: Start] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: TermLocation): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: TermLocation): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
}
