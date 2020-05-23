package typings.inkTestingLibrary.mod

import typings.inkTestingLibrary.anon.Write
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderResponse extends js.Object {
  var frames: js.Array[String]
  var stdin: Write
  def lastFrame(): String
  def rerender(
    tree: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InkElement */ js.Any
  ): Unit
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
}

