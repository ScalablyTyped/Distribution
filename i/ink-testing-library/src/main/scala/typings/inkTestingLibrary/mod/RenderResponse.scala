package typings.inkTestingLibrary.mod

import typings.inkTestingLibrary.anon.Write
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderResponse extends js.Object {
  
  var frames: js.Array[String] = js.native
  
  def lastFrame(): String = js.native
  
  def rerender(
    tree: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InkElement */ js.Any
  ): Unit = js.native
  
  var stdin: Write = js.native
  
  def unmount(): Unit = js.native
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
  implicit class RenderResponseOps[Self <: RenderResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFramesVarargs(value: String*): Self = this.set("frames", js.Array(value :_*))
    
    @scala.inline
    def setFrames(value: js.Array[String]): Self = this.set("frames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastFrame(value: () => String): Self = this.set("lastFrame", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRerender(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InkElement */ js.Any => Unit
    ): Self = this.set("rerender", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStdin(value: Write): Self = this.set("stdin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnmount(value: () => Unit): Self = this.set("unmount", js.Any.fromFunction0(value))
  }
}
