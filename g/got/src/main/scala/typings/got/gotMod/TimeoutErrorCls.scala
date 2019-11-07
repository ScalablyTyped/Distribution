package typings.got.gotMod

import typings.got.gotStrings.connect
import typings.got.gotStrings.lookup
import typings.got.gotStrings.request
import typings.got.gotStrings.response
import typings.got.gotStrings.secureConnect
import typings.got.gotStrings.send
import typings.got.gotStrings.socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("got", "TimeoutError")
@js.native
class TimeoutErrorCls () extends TimeoutError {
  /* CompleteClass */
  override var event: lookup | connect | secureConnect | socket | response | send | request = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  @JSName("name")
  override var name_TimeoutError: typings.got.gotStrings.TimeoutError = js.native
}

