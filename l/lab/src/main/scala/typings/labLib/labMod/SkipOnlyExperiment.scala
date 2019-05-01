package typings
package labLib.labMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkipOnlyExperiment extends js.Object {
  /** Only execute this test suite */
  @JSName("only")
  var only_Original: ExperimentArgs with ExperimentWithOptionsArgs = js.native
  /** Skip this test suite */
  @JSName("skip")
  var skip_Original: ExperimentArgs with ExperimentWithOptionsArgs = js.native
  /** Only execute this test suite */
  def only(desc: java.lang.String, cb: EmptyCallback): js.Object = js.native
  /** Only execute this test suite */
  def only(desc: java.lang.String, options: ExperimentOptions, cb: EmptyCallback): js.Object = js.native
  /** Skip this test suite */
  def skip(desc: java.lang.String, cb: EmptyCallback): js.Object = js.native
  /** Skip this test suite */
  def skip(desc: java.lang.String, options: ExperimentOptions, cb: EmptyCallback): js.Object = js.native
}

