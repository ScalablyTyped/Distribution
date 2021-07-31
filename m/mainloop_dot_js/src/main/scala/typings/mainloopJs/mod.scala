package typings.mainloopJs

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("mainloop.js", JSImport.Namespace)
  @js.native
  val ^ : MainLoop = js.native
  
  @js.native
  trait MainLoop extends StObject {
    
    def getFPS(): Double = js.native
    
    def getMaxAllowedFPS(): Double = js.native
    
    def getSimulationTimestep(): Double = js.native
    
    def isRunning(): Boolean = js.native
    
    def resetFrameDelta(): Double = js.native
    
    def setBegin(begin: js.Function2[/* timestamp */ Double, /* delta */ Double, Unit]): MainLoop = js.native
    
    def setDraw(draw: js.Function1[/* interpolationPercentage */ Double, Unit]): MainLoop = js.native
    
    def setEnd(end: js.Function2[/* fps */ Double, /* panic */ Boolean, Unit]): MainLoop = js.native
    
    def setMaxAllowedFPS(): MainLoop = js.native
    def setMaxAllowedFPS(fps: Double): MainLoop = js.native
    
    def setSimulationTimestep(timestep: Double): MainLoop = js.native
    
    def setUpdate(update: js.Function1[/* delta */ Double, Unit]): MainLoop = js.native
    
    def start(): MainLoop = js.native
    
    def stop(): MainLoop = js.native
  }
  
  type _To = MainLoop
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: MainLoop = ^
}
