package typings
package labLib.labMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkipOnlyTest extends js.Object {
  /** Only execute this test */
  @JSName("only")
  var only_Original: TestArgs with TestWithOptionsArgs = js.native
  /** Skip this test */
  @JSName("skip")
  var skip_Original: TestArgs with TestWithOptionsArgs = js.native
  /** Only execute this test */
  def only(desc: java.lang.String, cb: TestCallback): js.Object = js.native
  /** Only execute this test */
  def only(desc: java.lang.String, options: TestOptions, cb: TestCallback): js.Object = js.native
  /** Skip this test */
  def skip(desc: java.lang.String, cb: TestCallback): js.Object = js.native
  /** Skip this test */
  def skip(desc: java.lang.String, options: TestOptions, cb: TestCallback): js.Object = js.native
}

