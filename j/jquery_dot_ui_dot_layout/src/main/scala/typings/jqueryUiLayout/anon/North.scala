package typings.jqueryUiLayout.anon

import typings.jqueryUiLayout.JQueryUILayout.PaneState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait North extends js.Object {
  
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
  implicit class NorthOps[Self <: North] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEast(value: PaneState): Self = this.set("east", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNorth(value: PaneState): Self = this.set("north", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSouth(value: PaneState): Self = this.set("south", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWest(value: PaneState): Self = this.set("west", value.asInstanceOf[js.Any])
  }
}
