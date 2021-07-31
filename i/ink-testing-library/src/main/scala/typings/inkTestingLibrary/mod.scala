package typings.inkTestingLibrary

import typings.inkTestingLibrary.anon.Write
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ink-testing-library", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def cleanup(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanup")().asInstanceOf[Unit]
  
  @scala.inline
  def render(
    tree: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InkElement */ js.Any
  ): RenderResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("render")(tree.asInstanceOf[js.Any]).asInstanceOf[RenderResponse]
  
  trait RenderResponse extends StObject {
    
    var frames: js.Array[String]
    
    def lastFrame(): String
    
    def rerender(
      tree: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InkElement */ js.Any
    ): Unit
    
    var stdin: Write
    
    def unmount(): Unit
  }
  object RenderResponse {
    
    @scala.inline
    def apply(
      frames: js.Array[String],
      lastFrame: () => String,
      rerender: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InkElement */ js.Any => Unit,
      stdin: Write,
      unmount: () => Unit
    ): RenderResponse = {
      val __obj = js.Dynamic.literal(frames = frames.asInstanceOf[js.Any], lastFrame = js.Any.fromFunction0(lastFrame), rerender = js.Any.fromFunction1(rerender), stdin = stdin.asInstanceOf[js.Any], unmount = js.Any.fromFunction0(unmount))
      __obj.asInstanceOf[RenderResponse]
    }
    
    @scala.inline
    implicit class RenderResponseMutableBuilder[Self <: RenderResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrames(value: js.Array[String]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFramesVarargs(value: String*): Self = StObject.set(x, "frames", js.Array(value :_*))
      
      @scala.inline
      def setLastFrame(value: () => String): Self = StObject.set(x, "lastFrame", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRerender(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InkElement */ js.Any => Unit
      ): Self = StObject.set(x, "rerender", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStdin(value: Write): Self = StObject.set(x, "stdin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnmount(value: () => Unit): Self = StObject.set(x, "unmount", js.Any.fromFunction0(value))
    }
  }
}
