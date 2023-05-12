package typings.ink

import typings.ink.anon.Height
import typings.ink.anon.Transformers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildOutputMod {
  
  @JSImport("ink/build/output", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Output {
    def this(options: Options) = this()
    
    /* CompleteClass */
    override def clip(clip: Clip): Unit = js.native
    
    /* CompleteClass */
    override def get(): Height = js.native
    
    /* CompleteClass */
    var height: Double = js.native
    
    /* private */ /* CompleteClass */
    override val operations: Any = js.native
    
    /* CompleteClass */
    override def unclip(): Unit = js.native
    
    /* CompleteClass */
    var width: Double = js.native
    
    /* CompleteClass */
    override def write(x: Double, y: Double, text: String, options: Transformers): Unit = js.native
  }
  
  trait Clip extends StObject {
    
    var x1: js.UndefOr[Double] = js.undefined
    
    var x2: js.UndefOr[Double] = js.undefined
    
    var y1: js.UndefOr[Double] = js.undefined
    
    var y2: js.UndefOr[Double] = js.undefined
  }
  object Clip {
    
    inline def apply(): Clip = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Clip]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Clip] (val x: Self) extends AnyVal {
      
      inline def setX1(value: Double): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
      
      inline def setX1Undefined: Self = StObject.set(x, "x1", js.undefined)
      
      inline def setX2(value: Double): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
      
      inline def setX2Undefined: Self = StObject.set(x, "x2", js.undefined)
      
      inline def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
      
      inline def setY1Undefined: Self = StObject.set(x, "y1", js.undefined)
      
      inline def setY2(value: Double): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
      
      inline def setY2Undefined: Self = StObject.set(x, "y2", js.undefined)
    }
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Output extends StObject {
    
    def clip(clip: Clip): Unit
    
    def get(): Height
    
    var height: Double
    
    /* private */ val operations: Any
    
    def unclip(): Unit
    
    var width: Double
    
    def write(x: Double, y: Double, text: String, options: Transformers): Unit
  }
  object Output {
    
    inline def apply(
      clip: Clip => Unit,
      get: () => Height,
      height: Double,
      operations: Any,
      unclip: () => Unit,
      width: Double,
      write: (Double, Double, String, Transformers) => Unit
    ): Output = {
      val __obj = js.Dynamic.literal(clip = js.Any.fromFunction1(clip), get = js.Any.fromFunction0(get), height = height.asInstanceOf[js.Any], operations = operations.asInstanceOf[js.Any], unclip = js.Any.fromFunction0(unclip), width = width.asInstanceOf[js.Any], write = js.Any.fromFunction4(write))
      __obj.asInstanceOf[Output]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Output] (val x: Self) extends AnyVal {
      
      inline def setClip(value: Clip => Unit): Self = StObject.set(x, "clip", js.Any.fromFunction1(value))
      
      inline def setGet(value: () => Height): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setOperations(value: Any): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
      
      inline def setUnclip(value: () => Unit): Self = StObject.set(x, "unclip", js.Any.fromFunction0(value))
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWrite(value: (Double, Double, String, Transformers) => Unit): Self = StObject.set(x, "write", js.Any.fromFunction4(value))
    }
  }
}
