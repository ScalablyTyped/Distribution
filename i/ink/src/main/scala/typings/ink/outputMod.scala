package typings.ink

import typings.ink.anon.Height
import typings.ink.anon.Transformers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outputMod {
  
  @JSImport("ink/build/output", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Output {
    def this(options: Options) = this()
    
    /* CompleteClass */
    override def get(): Height = js.native
    
    /* CompleteClass */
    var height: Double = js.native
    
    /* CompleteClass */
    var width: Double = js.native
    
    /* CompleteClass */
    override def write(x: Double, y: Double, text: String, options: Transformers): Unit = js.native
    
    /* private */ /* CompleteClass */
    override val writes: Any = js.native
  }
  
  /**
    * "Virtual" output class
    *
    * Handles the positioning and saving of the output of each node in the tree.
    * Also responsible for applying transformations to each character of the output.
    *
    * Used to generate the final output of all nodes before writing it to actual output stream (e.g. stdout)
    */
  trait Options extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object Options {
    
    inline def apply(height: Double, width: Double): Options = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Output extends StObject {
    
    def get(): Height
    
    var height: Double
    
    var width: Double
    
    def write(x: Double, y: Double, text: String, options: Transformers): Unit
    
    /* private */ val writes: Any
  }
  object Output {
    
    inline def apply(
      get: () => Height,
      height: Double,
      width: Double,
      write: (Double, Double, String, Transformers) => Unit,
      writes: Any
    ): Output = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], write = js.Any.fromFunction4(write), writes = writes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Output]
    }
    
    extension [Self <: Output](x: Self) {
      
      inline def setGet(value: () => Height): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWrite(value: (Double, Double, String, Transformers) => Unit): Self = StObject.set(x, "write", js.Any.fromFunction4(value))
      
      inline def setWrites(value: Any): Self = StObject.set(x, "writes", value.asInstanceOf[js.Any])
    }
  }
}
