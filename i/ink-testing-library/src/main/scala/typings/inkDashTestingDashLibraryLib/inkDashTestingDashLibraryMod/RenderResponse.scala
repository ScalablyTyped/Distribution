package typings
package inkDashTestingDashLibraryLib.inkDashTestingDashLibraryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderResponse extends js.Object {
  var frames: js.Array[java.lang.String]
  var stdin: inkDashTestingDashLibraryLib.Anon_Data
  def lastFrame(): java.lang.String
  def rerender(tree: inkLib.inkMod.InkElement): scala.Unit
  def unmount(): scala.Unit
}

object RenderResponse {
  @scala.inline
  def apply(
    frames: js.Array[java.lang.String],
    lastFrame: () => java.lang.String,
    rerender: inkLib.inkMod.InkElement => scala.Unit,
    stdin: inkDashTestingDashLibraryLib.Anon_Data,
    unmount: () => scala.Unit
  ): RenderResponse = {
    val __obj = js.Dynamic.literal(frames = frames, lastFrame = js.Any.fromFunction0(lastFrame), rerender = js.Any.fromFunction1(rerender), stdin = stdin, unmount = js.Any.fromFunction0(unmount))
  
    __obj.asInstanceOf[RenderResponse]
  }
}

