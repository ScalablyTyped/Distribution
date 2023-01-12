package typings.jestEnvironmentNode

import org.scalablytyped.runtime.Instantiable2
import typings.jestEnvironment.mod.EnvironmentContext
import typings.jestEnvironment.mod.JestEnvironment
import typings.jestEnvironment.mod.JestEnvironmentConfig
import typings.node.vmMod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jest-environment-node", JSImport.Default)
  @js.native
  open class default protected () extends NodeEnvironment {
    def this(config: JestEnvironmentConfig, _context: EnvironmentContext) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("jest-environment-node", "TestEnvironment")
  @js.native
  open class TestEnvironment protected () extends NodeEnvironment {
    def this(config: JestEnvironmentConfig, _context: EnvironmentContext) = this()
  }
  @JSImport("jest-environment-node", "TestEnvironment")
  @js.native
  val TestEnvironment: Instantiable2[
    /* config */ JestEnvironmentConfig, 
    /* _context */ EnvironmentContext, 
    NodeEnvironment
  ] = js.native
  
  @js.native
  trait NodeEnvironment extends JestEnvironment[Timer] {
    
    var context: Context | Null = js.native
    
    var customExportConditions: js.Array[String] = js.native
    
    @JSName("exportConditions")
    def exportConditions_MNodeEnvironment(): js.Array[String] = js.native
  }
  
  trait Timer extends StObject {
    
    var id: Double
    
    def ref(): Timer
    
    def unref(): Timer
  }
  object Timer {
    
    inline def apply(id: Double, ref: () => Timer, unref: () => Timer): Timer = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ref = js.Any.fromFunction0(ref), unref = js.Any.fromFunction0(unref))
      __obj.asInstanceOf[Timer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Timer] (val x: Self) extends AnyVal {
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setRef(value: () => Timer): Self = StObject.set(x, "ref", js.Any.fromFunction0(value))
      
      inline def setUnref(value: () => Timer): Self = StObject.set(x, "unref", js.Any.fromFunction0(value))
    }
  }
}
