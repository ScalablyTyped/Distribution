package typings.materialList

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait MDCListActionEvent
    extends StObject
       with Event {
    
    var detail: MDCListActionEventDetail = js.native
  }
  
  trait MDCListActionEventDetail extends StObject {
    
    /**
      * Index of the list item that was activated.
      */
    var index: Double
  }
  object MDCListActionEventDetail {
    
    inline def apply(index: Double): MDCListActionEventDetail = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[MDCListActionEventDetail]
    }
    
    extension [Self <: MDCListActionEventDetail](x: Self) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    }
  }
  
  type MDCListIndex = Double | js.Array[Double]
  
  trait MDCListSelectionChangeDetail extends StObject {
    
    /** Indices of the list items for which the selection changed. */
    var changedIndices: js.Array[Double]
  }
  object MDCListSelectionChangeDetail {
    
    inline def apply(changedIndices: js.Array[Double]): MDCListSelectionChangeDetail = {
      val __obj = js.Dynamic.literal(changedIndices = changedIndices.asInstanceOf[js.Any])
      __obj.asInstanceOf[MDCListSelectionChangeDetail]
    }
    
    extension [Self <: MDCListSelectionChangeDetail](x: Self) {
      
      inline def setChangedIndices(value: js.Array[Double]): Self = StObject.set(x, "changedIndices", value.asInstanceOf[js.Any])
      
      inline def setChangedIndicesVarargs(value: Double*): Self = StObject.set(x, "changedIndices", js.Array(value*))
    }
  }
  
  @js.native
  trait MDCListSelectionChangeEvent
    extends StObject
       with Event {
    
    var detail: MDCListSelectionChangeDetail = js.native
  }
  
  trait MDCListTextAndIndex extends StObject {
    
    var index: Double
    
    var text: String
  }
  object MDCListTextAndIndex {
    
    inline def apply(index: Double, text: String): MDCListTextAndIndex = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[MDCListTextAndIndex]
    }
    
    extension [Self <: MDCListTextAndIndex](x: Self) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
