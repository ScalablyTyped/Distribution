package typings
package labLib.labMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkipOnlyExperiment extends js.Object {
  /** Only execute this test suite */
  @JSName("only")
  var only_Original: labLib.ExperimentArgs with labLib.ExperimentWithOptionsArgs = js.native
  /** Skip this test suite */
  @JSName("skip")
  var skip_Original: labLib.ExperimentArgs with labLib.ExperimentWithOptionsArgs = js.native
  /** Only execute this test suite */
  def only(desc: java.lang.String, cb: labLib.EmptyCallback): js.Object = js.native
  /** Only execute this test suite */
  def only(desc: java.lang.String, options: js.Any, cb: labLib.EmptyCallback): js.Object = js.native
  /** Skip this test suite */
  def skip(desc: java.lang.String, cb: labLib.EmptyCallback): js.Object = js.native
  /** Skip this test suite */
  def skip(desc: java.lang.String, options: js.Any, cb: labLib.EmptyCallback): js.Object = js.native
}

