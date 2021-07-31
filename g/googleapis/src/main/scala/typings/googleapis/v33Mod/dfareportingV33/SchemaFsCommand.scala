package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * FsCommand.
  */
trait SchemaFsCommand extends StObject {
  
  /**
    * Distance from the left of the browser.Applicable when positionOption is
    * DISTANCE_FROM_TOP_LEFT_CORNER.
    */
  var left: js.UndefOr[Double] = js.undefined
  
  /**
    * Position in the browser where the window will open.
    */
  var positionOption: js.UndefOr[String] = js.undefined
  
  /**
    * Distance from the top of the browser. Applicable when positionOption is
    * DISTANCE_FROM_TOP_LEFT_CORNER.
    */
  var top: js.UndefOr[Double] = js.undefined
  
  /**
    * Height of the window.
    */
  var windowHeight: js.UndefOr[Double] = js.undefined
  
  /**
    * Width of the window.
    */
  var windowWidth: js.UndefOr[Double] = js.undefined
}
object SchemaFsCommand {
  
  @scala.inline
  def apply(): SchemaFsCommand = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFsCommand]
  }
  
  @scala.inline
  implicit class SchemaFsCommandMutableBuilder[Self <: SchemaFsCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    @scala.inline
    def setPositionOption(value: String): Self = StObject.set(x, "positionOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionOptionUndefined: Self = StObject.set(x, "positionOption", js.undefined)
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    @scala.inline
    def setWindowHeight(value: Double): Self = StObject.set(x, "windowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowHeightUndefined: Self = StObject.set(x, "windowHeight", js.undefined)
    
    @scala.inline
    def setWindowWidth(value: Double): Self = StObject.set(x, "windowWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowWidthUndefined: Self = StObject.set(x, "windowWidth", js.undefined)
  }
}
