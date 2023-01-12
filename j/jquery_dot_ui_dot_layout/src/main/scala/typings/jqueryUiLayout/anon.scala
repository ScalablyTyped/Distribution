package typings.jqueryUiLayout

import typings.jqueryUiLayout.JQueryUILayout.PaneState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait East extends StObject {
    
    var east: JQuery | Boolean
    
    var north: JQuery | Boolean
    
    var south: JQuery | Boolean
    
    var west: JQuery | Boolean
  }
  object East {
    
    inline def apply(east: JQuery | Boolean, north: JQuery | Boolean, south: JQuery | Boolean, west: JQuery | Boolean): East = {
      val __obj = js.Dynamic.literal(east = east.asInstanceOf[js.Any], north = north.asInstanceOf[js.Any], south = south.asInstanceOf[js.Any], west = west.asInstanceOf[js.Any])
      __obj.asInstanceOf[East]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: East] (val x: Self) extends AnyVal {
      
      inline def setEast(value: JQuery | Boolean): Self = StObject.set(x, "east", value.asInstanceOf[js.Any])
      
      inline def setNorth(value: JQuery | Boolean): Self = StObject.set(x, "north", value.asInstanceOf[js.Any])
      
      inline def setSouth(value: JQuery | Boolean): Self = StObject.set(x, "south", value.asInstanceOf[js.Any])
      
      inline def setWest(value: JQuery | Boolean): Self = StObject.set(x, "west", value.asInstanceOf[js.Any])
    }
  }
  
  trait North extends StObject {
    
    var east: PaneState
    
    var north: PaneState
    
    var south: PaneState
    
    var west: PaneState
  }
  object North {
    
    inline def apply(east: PaneState, north: PaneState, south: PaneState, west: PaneState): North = {
      val __obj = js.Dynamic.literal(east = east.asInstanceOf[js.Any], north = north.asInstanceOf[js.Any], south = south.asInstanceOf[js.Any], west = west.asInstanceOf[js.Any])
      __obj.asInstanceOf[North]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: North] (val x: Self) extends AnyVal {
      
      inline def setEast(value: PaneState): Self = StObject.set(x, "east", value.asInstanceOf[js.Any])
      
      inline def setNorth(value: PaneState): Self = StObject.set(x, "north", value.asInstanceOf[js.Any])
      
      inline def setSouth(value: PaneState): Self = StObject.set(x, "south", value.asInstanceOf[js.Any])
      
      inline def setWest(value: PaneState): Self = StObject.set(x, "west", value.asInstanceOf[js.Any])
    }
  }
}
