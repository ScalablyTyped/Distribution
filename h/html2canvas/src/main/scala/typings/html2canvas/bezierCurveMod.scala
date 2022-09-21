package typings.html2canvas

import typings.html2canvas.pathMod.IPath
import typings.html2canvas.pathMod.Path
import typings.html2canvas.pathMod.PathType
import typings.html2canvas.vectorMod.Vector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bezierCurveMod {
  
  @JSImport("html2canvas/dist/types/render/bezier-curve", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("html2canvas/dist/types/render/bezier-curve", "BezierCurve")
  @js.native
  open class BezierCurve protected ()
    extends StObject
       with IPath
       with Path {
    def this(start: Vector, startControl: Vector, endControl: Vector, end: Vector) = this()
    
    /* CompleteClass */
    override def add(deltaX: Double, deltaY: Double): IPath = js.native
    
    var end: Vector = js.native
    
    var endControl: Vector = js.native
    
    def reverse(): BezierCurve = js.native
    
    var start: Vector = js.native
    
    var startControl: Vector = js.native
    
    def subdivide(t: Double, firstHalf: Boolean): BezierCurve = js.native
    
    /* CompleteClass */
    var `type`: PathType = js.native
  }
  
  inline def isBezierCurve(path: Path): /* is html2canvas.html2canvas/dist/types/render/bezier-curve.BezierCurve */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBezierCurve")(path.asInstanceOf[js.Any]).asInstanceOf[/* is html2canvas.html2canvas/dist/types/render/bezier-curve.BezierCurve */ Boolean]
}
