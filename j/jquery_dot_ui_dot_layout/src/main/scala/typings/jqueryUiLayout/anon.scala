package typings.jqueryUiLayout

import typings.jqueryUiLayout.JQueryUILayout.PaneState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait East extends StObject {
    
    var east: JQuery | Boolean = js.native
    
    var north: JQuery | Boolean = js.native
    
    var south: JQuery | Boolean = js.native
    
    var west: JQuery | Boolean = js.native
  }
  object East {
    
    @scala.inline
    def apply(east: JQuery | Boolean, north: JQuery | Boolean, south: JQuery | Boolean, west: JQuery | Boolean): East = {
      val __obj = js.Dynamic.literal(east = east.asInstanceOf[js.Any], north = north.asInstanceOf[js.Any], south = south.asInstanceOf[js.Any], west = west.asInstanceOf[js.Any])
      __obj.asInstanceOf[East]
    }
    
    @scala.inline
    implicit class EastMutableBuilder[Self <: East] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEast(value: JQuery | Boolean): Self = StObject.set(x, "east", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNorth(value: JQuery | Boolean): Self = StObject.set(x, "north", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSouth(value: JQuery | Boolean): Self = StObject.set(x, "south", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWest(value: JQuery | Boolean): Self = StObject.set(x, "west", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait North extends StObject {
    
    var east: PaneState = js.native
    
    var north: PaneState = js.native
    
    var south: PaneState = js.native
    
    var west: PaneState = js.native
  }
  object North {
    
    @scala.inline
    def apply(east: PaneState, north: PaneState, south: PaneState, west: PaneState): North = {
      val __obj = js.Dynamic.literal(east = east.asInstanceOf[js.Any], north = north.asInstanceOf[js.Any], south = south.asInstanceOf[js.Any], west = west.asInstanceOf[js.Any])
      __obj.asInstanceOf[North]
    }
    
    @scala.inline
    implicit class NorthMutableBuilder[Self <: North] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEast(value: PaneState): Self = StObject.set(x, "east", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNorth(value: PaneState): Self = StObject.set(x, "north", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSouth(value: PaneState): Self = StObject.set(x, "south", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWest(value: PaneState): Self = StObject.set(x, "west", value.asInstanceOf[js.Any])
    }
  }
}
