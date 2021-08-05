package typings.jsfl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlashTools extends StObject {
  
  var activeTool: js.Any
  
  var altIsDown: js.Any
  
  def constraintPoint(): js.Any
  
  var ctlIsDown: js.Any
  
  def getKeyDown(): js.Any
  
  var mouseIsDown: js.Any
  
  var penDownLoc: js.Any
  
  var penLoc: js.Any
  
  def setCreatingBbox(): js.Any
  
  def setCursor(): js.Any
  
  var shiftIsDown: js.Any
  
  def snapPoint(): js.Any
  
  var toolObjs: js.Any
}
object FlashTools {
  
  inline def apply(
    activeTool: js.Any,
    altIsDown: js.Any,
    constraintPoint: () => js.Any,
    ctlIsDown: js.Any,
    getKeyDown: () => js.Any,
    mouseIsDown: js.Any,
    penDownLoc: js.Any,
    penLoc: js.Any,
    setCreatingBbox: () => js.Any,
    setCursor: () => js.Any,
    shiftIsDown: js.Any,
    snapPoint: () => js.Any,
    toolObjs: js.Any
  ): FlashTools = {
    val __obj = js.Dynamic.literal(activeTool = activeTool.asInstanceOf[js.Any], altIsDown = altIsDown.asInstanceOf[js.Any], constraintPoint = js.Any.fromFunction0(constraintPoint), ctlIsDown = ctlIsDown.asInstanceOf[js.Any], getKeyDown = js.Any.fromFunction0(getKeyDown), mouseIsDown = mouseIsDown.asInstanceOf[js.Any], penDownLoc = penDownLoc.asInstanceOf[js.Any], penLoc = penLoc.asInstanceOf[js.Any], setCreatingBbox = js.Any.fromFunction0(setCreatingBbox), setCursor = js.Any.fromFunction0(setCursor), shiftIsDown = shiftIsDown.asInstanceOf[js.Any], snapPoint = js.Any.fromFunction0(snapPoint), toolObjs = toolObjs.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashTools]
  }
  
  extension [Self <: FlashTools](x: Self) {
    
    inline def setActiveTool(value: js.Any): Self = StObject.set(x, "activeTool", value.asInstanceOf[js.Any])
    
    inline def setAltIsDown(value: js.Any): Self = StObject.set(x, "altIsDown", value.asInstanceOf[js.Any])
    
    inline def setConstraintPoint(value: () => js.Any): Self = StObject.set(x, "constraintPoint", js.Any.fromFunction0(value))
    
    inline def setCtlIsDown(value: js.Any): Self = StObject.set(x, "ctlIsDown", value.asInstanceOf[js.Any])
    
    inline def setGetKeyDown(value: () => js.Any): Self = StObject.set(x, "getKeyDown", js.Any.fromFunction0(value))
    
    inline def setMouseIsDown(value: js.Any): Self = StObject.set(x, "mouseIsDown", value.asInstanceOf[js.Any])
    
    inline def setPenDownLoc(value: js.Any): Self = StObject.set(x, "penDownLoc", value.asInstanceOf[js.Any])
    
    inline def setPenLoc(value: js.Any): Self = StObject.set(x, "penLoc", value.asInstanceOf[js.Any])
    
    inline def setSetCreatingBbox(value: () => js.Any): Self = StObject.set(x, "setCreatingBbox", js.Any.fromFunction0(value))
    
    inline def setSetCursor(value: () => js.Any): Self = StObject.set(x, "setCursor", js.Any.fromFunction0(value))
    
    inline def setShiftIsDown(value: js.Any): Self = StObject.set(x, "shiftIsDown", value.asInstanceOf[js.Any])
    
    inline def setSnapPoint(value: () => js.Any): Self = StObject.set(x, "snapPoint", js.Any.fromFunction0(value))
    
    inline def setToolObjs(value: js.Any): Self = StObject.set(x, "toolObjs", value.asInstanceOf[js.Any])
  }
}
