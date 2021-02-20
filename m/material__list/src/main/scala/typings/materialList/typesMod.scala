package typings.materialList

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait MDCListActionEvent extends Event {
    
    var detail: MDCListActionEventDetail = js.native
  }
  
  @js.native
  trait MDCListActionEventDetail extends StObject {
    
    /**
      * Index of the list item that was activated.
      */
    var index: Double = js.native
  }
  object MDCListActionEventDetail {
    
    @scala.inline
    def apply(index: Double): MDCListActionEventDetail = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[MDCListActionEventDetail]
    }
    
    @scala.inline
    implicit class MDCListActionEventDetailMutableBuilder[Self <: MDCListActionEventDetail] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    }
  }
  
  type MDCListIndex = Double | js.Array[Double]
  
  @js.native
  trait MDCListTextAndIndex extends StObject {
    
    var index: Double = js.native
    
    var text: String = js.native
  }
  object MDCListTextAndIndex {
    
    @scala.inline
    def apply(index: Double, text: String): MDCListTextAndIndex = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[MDCListTextAndIndex]
    }
    
    @scala.inline
    implicit class MDCListTextAndIndexMutableBuilder[Self <: MDCListTextAndIndex] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
