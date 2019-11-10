package typings.inkDashTestingDashLibrary.inkDashTestingDashLibraryMod

import typings.inkDashTestingDashLibrary.Anon_Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderResponse extends js.Object {
  var frames: js.Array[String]
  var stdin: Anon_Data
  def lastFrame(): String
  def rerender(
    tree: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify InkElement */ js.Any
  ): Unit
  def unmount(): Unit
}

object RenderResponse {
  @scala.inline
  def apply(
    frames: js.Array[String],
    lastFrame: () => String,
    rerender: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify InkElement */ js.Any => Unit,
    stdin: Anon_Data,
    unmount: () => Unit
  ): RenderResponse = {
    val __obj = js.Dynamic.literal(frames = frames, lastFrame = js.Any.fromFunction0(lastFrame), rerender = js.Any.fromFunction1(rerender), stdin = stdin, unmount = js.Any.fromFunction0(unmount))
  
    __obj.asInstanceOf[RenderResponse]
  }
}

