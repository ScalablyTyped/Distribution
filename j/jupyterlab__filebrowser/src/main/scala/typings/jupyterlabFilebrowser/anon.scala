package typings.jupyterlabFilebrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<@jupyterlab/apputils.@jupyterlab/apputils.IScore> */
  trait PartialIScore extends StObject {
    
    var indices: js.UndefOr[js.Array[Double] | Null] = js.undefined
    
    var score: js.UndefOr[Double] = js.undefined
  }
  object PartialIScore {
    
    inline def apply(): PartialIScore = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialIScore]
    }
    
    extension [Self <: PartialIScore](x: Self) {
      
      inline def setIndices(value: js.Array[Double]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
      
      inline def setIndicesNull: Self = StObject.set(x, "indices", null)
      
      inline def setIndicesUndefined: Self = StObject.set(x, "indices", js.undefined)
      
      inline def setIndicesVarargs(value: Double*): Self = StObject.set(x, "indices", js.Array(value*))
      
      inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
      
      inline def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
    }
  }
}
