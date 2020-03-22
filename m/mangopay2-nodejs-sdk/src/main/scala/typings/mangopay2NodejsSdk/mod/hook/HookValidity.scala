package typings.mangopay2NodejsSdk.mod.hook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UNKNOWN
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALID
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.INVALID
*/
trait HookValidity extends js.Object

object HookValidity {
  @scala.inline
  def INVALID: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.INVALID = this.cast("INVALID")
  @scala.inline
  def UNKNOWN: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UNKNOWN = this.cast("UNKNOWN")
  @scala.inline
  def VALID: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALID = this.cast("VALID")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

