package typings.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * FsCommand.
  */
@js.native
trait SchemaFsCommand extends js.Object {
  
  /**
    * Distance from the left of the browser.Applicable when positionOption is
    * DISTANCE_FROM_TOP_LEFT_CORNER.
    */
  var left: js.UndefOr[Double] = js.native
  
  /**
    * Position in the browser where the window will open.
    */
  var positionOption: js.UndefOr[String] = js.native
  
  /**
    * Distance from the top of the browser. Applicable when positionOption is
    * DISTANCE_FROM_TOP_LEFT_CORNER.
    */
  var top: js.UndefOr[Double] = js.native
  
  /**
    * Height of the window.
    */
  var windowHeight: js.UndefOr[Double] = js.native
  
  /**
    * Width of the window.
    */
  var windowWidth: js.UndefOr[Double] = js.native
}
object SchemaFsCommand {
  
  @scala.inline
  def apply(): SchemaFsCommand = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFsCommand]
  }
  
  @scala.inline
  implicit class SchemaFsCommandOps[Self <: SchemaFsCommand] (val x: Self) extends AnyVal {
    
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
    def setLeft(value: Double): Self = this.set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    
    @scala.inline
    def setPositionOption(value: String): Self = this.set("positionOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePositionOption: Self = this.set("positionOption", js.undefined)
    
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
    
    @scala.inline
    def setWindowHeight(value: Double): Self = this.set("windowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindowHeight: Self = this.set("windowHeight", js.undefined)
    
    @scala.inline
    def setWindowWidth(value: Double): Self = this.set("windowWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindowWidth: Self = this.set("windowWidth", js.undefined)
  }
}
