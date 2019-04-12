package typings
package atHapiLabLib.atHapiLabMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkipOnlyTest extends js.Object {
  /** Only execute this test */
  @JSName("only")
  var only_Original: atHapiLabLib.TestArgs with atHapiLabLib.TestWithOptionsArgs = js.native
  /** Skip this test */
  @JSName("skip")
  var skip_Original: atHapiLabLib.TestArgs with atHapiLabLib.TestWithOptionsArgs = js.native
  /** Only execute this test */
  def only(desc: java.lang.String, cb: atHapiLabLib.TestCallback): js.Object = js.native
  /** Only execute this test */
  def only(
    desc: java.lang.String,
    options: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TestOptions */ js.Any,
    cb: atHapiLabLib.TestCallback
  ): js.Object = js.native
  /** Skip this test */
  def skip(desc: java.lang.String, cb: atHapiLabLib.TestCallback): js.Object = js.native
  /** Skip this test */
  def skip(
    desc: java.lang.String,
    options: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TestOptions */ js.Any,
    cb: atHapiLabLib.TestCallback
  ): js.Object = js.native
}

