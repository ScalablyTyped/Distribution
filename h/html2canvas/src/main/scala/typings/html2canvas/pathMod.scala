package typings.html2canvas

import typings.html2canvas.html2canvasInts.`0`
import typings.html2canvas.html2canvasInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pathMod {
  
  @JSImport("html2canvas/dist/types/render/path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def equalPath(a: js.Array[Path], b: js.Array[Path]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalPath")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def transformPath(path: js.Array[Path], deltaX: Double, deltaY: Double, deltaW: Double, deltaH: Double): js.Array[Path] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformPath")(path.asInstanceOf[js.Any], deltaX.asInstanceOf[js.Any], deltaY.asInstanceOf[js.Any], deltaW.asInstanceOf[js.Any], deltaH.asInstanceOf[js.Any])).asInstanceOf[js.Array[Path]]
  
  trait IPath extends StObject {
    
    def add(deltaX: Double, deltaY: Double): IPath
    
    var `type`: PathType
  }
  object IPath {
    
    inline def apply(add: (Double, Double) => IPath, `type`: PathType): IPath = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPath]
    }
    
    extension [Self <: IPath](x: Self) {
      
      inline def setAdd(value: (Double, Double) => IPath): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
      
      inline def setType(value: PathType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.html2canvas.vectorMod.Vector
    - typings.html2canvas.bezierCurveMod.BezierCurve
  */
  trait Path extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.html2canvas.html2canvasInts.`0`
    - typings.html2canvas.html2canvasInts.`1`
  */
  trait PathType extends StObject
  object PathType {
    
    inline def BEZIER_CURVE: `1` = 1.asInstanceOf[`1`]
    
    inline def VECTOR: `0` = 0.asInstanceOf[`0`]
  }
}
