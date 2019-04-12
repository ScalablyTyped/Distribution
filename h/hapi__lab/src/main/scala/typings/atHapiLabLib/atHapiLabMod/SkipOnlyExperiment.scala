package typings
package atHapiLabLib.atHapiLabMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkipOnlyExperiment extends js.Object {
  /** Only execute this test suite */
  @JSName("only")
  var only_Original: atHapiLabLib.ExperimentArgs with atHapiLabLib.ExperimentWithOptionsArgs = js.native
  /** Skip this test suite */
  @JSName("skip")
  var skip_Original: atHapiLabLib.ExperimentArgs with atHapiLabLib.ExperimentWithOptionsArgs = js.native
  /** Only execute this test suite */
  def only(desc: java.lang.String, cb: atHapiLabLib.EmptyCallback): js.Object = js.native
  /** Only execute this test suite */
  def only(
    desc: java.lang.String,
    options: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ExperimentOptions */ js.Any,
    cb: atHapiLabLib.EmptyCallback
  ): js.Object = js.native
  /** Skip this test suite */
  def skip(desc: java.lang.String, cb: atHapiLabLib.EmptyCallback): js.Object = js.native
  /** Skip this test suite */
  def skip(
    desc: java.lang.String,
    options: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ExperimentOptions */ js.Any,
    cb: atHapiLabLib.EmptyCallback
  ): js.Object = js.native
}

