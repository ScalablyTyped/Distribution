package typings.ink

import typings.ink.anon.Height
import typings.ink.anon.Transformers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outputMod {
  
  @JSImport("ink/build/output", JSImport.Default)
  @js.native
  class default protected ()
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
    
    /* CompleteClass */
    override val writes: js.Any = js.native
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
    
    @scala.inline
    def apply(height: Double, width: Double): Options = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Output extends StObject {
    
    def get(): Height
    
    var height: Double
    
    var width: Double
    
    def write(x: Double, y: Double, text: String, options: Transformers): Unit
    
    val writes: js.Any
  }
  object Output {
    
    @scala.inline
    def apply(
      get: () => Height,
      height: Double,
      width: Double,
      write: (Double, Double, String, Transformers) => Unit,
      writes: js.Any
    ): Output = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], write = js.Any.fromFunction4(write), writes = writes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Output]
    }
    
    @scala.inline
    implicit class OutputMutableBuilder[Self <: Output] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGet(value: () => Height): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrite(value: (Double, Double, String, Transformers) => Unit): Self = StObject.set(x, "write", js.Any.fromFunction4(value))
      
      @scala.inline
      def setWrites(value: js.Any): Self = StObject.set(x, "writes", value.asInstanceOf[js.Any])
    }
  }
}
