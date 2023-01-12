package typings.jsfl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlashTools extends StObject {
  
  var activeTool: Any
  
  var altIsDown: Any
  
  def constraintPoint(): Any
  
  var ctlIsDown: Any
  
  def getKeyDown(): Any
  
  var mouseIsDown: Any
  
  var penDownLoc: Any
  
  var penLoc: Any
  
  def setCreatingBbox(): Any
  
  def setCursor(): Any
  
  var shiftIsDown: Any
  
  def snapPoint(): Any
  
  var toolObjs: Any
}
object FlashTools {
  
  inline def apply(
    activeTool: Any,
    altIsDown: Any,
    constraintPoint: () => Any,
    ctlIsDown: Any,
    getKeyDown: () => Any,
    mouseIsDown: Any,
    penDownLoc: Any,
    penLoc: Any,
    setCreatingBbox: () => Any,
    setCursor: () => Any,
    shiftIsDown: Any,
    snapPoint: () => Any,
    toolObjs: Any
  ): FlashTools = {
    val __obj = js.Dynamic.literal(activeTool = activeTool.asInstanceOf[js.Any], altIsDown = altIsDown.asInstanceOf[js.Any], constraintPoint = js.Any.fromFunction0(constraintPoint), ctlIsDown = ctlIsDown.asInstanceOf[js.Any], getKeyDown = js.Any.fromFunction0(getKeyDown), mouseIsDown = mouseIsDown.asInstanceOf[js.Any], penDownLoc = penDownLoc.asInstanceOf[js.Any], penLoc = penLoc.asInstanceOf[js.Any], setCreatingBbox = js.Any.fromFunction0(setCreatingBbox), setCursor = js.Any.fromFunction0(setCursor), shiftIsDown = shiftIsDown.asInstanceOf[js.Any], snapPoint = js.Any.fromFunction0(snapPoint), toolObjs = toolObjs.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashTools]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FlashTools] (val x: Self) extends AnyVal {
    
    inline def setActiveTool(value: Any): Self = StObject.set(x, "activeTool", value.asInstanceOf[js.Any])
    
    inline def setAltIsDown(value: Any): Self = StObject.set(x, "altIsDown", value.asInstanceOf[js.Any])
    
    inline def setConstraintPoint(value: () => Any): Self = StObject.set(x, "constraintPoint", js.Any.fromFunction0(value))
    
    inline def setCtlIsDown(value: Any): Self = StObject.set(x, "ctlIsDown", value.asInstanceOf[js.Any])
    
    inline def setGetKeyDown(value: () => Any): Self = StObject.set(x, "getKeyDown", js.Any.fromFunction0(value))
    
    inline def setMouseIsDown(value: Any): Self = StObject.set(x, "mouseIsDown", value.asInstanceOf[js.Any])
    
    inline def setPenDownLoc(value: Any): Self = StObject.set(x, "penDownLoc", value.asInstanceOf[js.Any])
    
    inline def setPenLoc(value: Any): Self = StObject.set(x, "penLoc", value.asInstanceOf[js.Any])
    
    inline def setSetCreatingBbox(value: () => Any): Self = StObject.set(x, "setCreatingBbox", js.Any.fromFunction0(value))
    
    inline def setSetCursor(value: () => Any): Self = StObject.set(x, "setCursor", js.Any.fromFunction0(value))
    
    inline def setShiftIsDown(value: Any): Self = StObject.set(x, "shiftIsDown", value.asInstanceOf[js.Any])
    
    inline def setSnapPoint(value: () => Any): Self = StObject.set(x, "snapPoint", js.Any.fromFunction0(value))
    
    inline def setToolObjs(value: Any): Self = StObject.set(x, "toolObjs", value.asInstanceOf[js.Any])
  }
}
