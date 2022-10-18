package typings.jupyterlabSettingeditor

import typings.luminoCommands.mod.CommandRegistry
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
  
  trait Registry extends StObject {
    
    /**
      * The command registry.
      */
    var registry: CommandRegistry
    
    /**
      * The revert command ID.
      */
    var revert: String
    
    /**
      * The save command ID.
      */
    var save: String
  }
  object Registry {
    
    inline def apply(registry: CommandRegistry, revert: String, save: String): Registry = {
      val __obj = js.Dynamic.literal(registry = registry.asInstanceOf[js.Any], revert = revert.asInstanceOf[js.Any], save = save.asInstanceOf[js.Any])
      __obj.asInstanceOf[Registry]
    }
    
    extension [Self <: Registry](x: Self) {
      
      inline def setRegistry(value: CommandRegistry): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
      
      inline def setRevert(value: String): Self = StObject.set(x, "revert", value.asInstanceOf[js.Any])
      
      inline def setSave(value: String): Self = StObject.set(x, "save", value.asInstanceOf[js.Any])
    }
  }
}
