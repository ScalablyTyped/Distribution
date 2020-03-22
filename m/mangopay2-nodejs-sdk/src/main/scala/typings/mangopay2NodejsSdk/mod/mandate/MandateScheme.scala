package typings.mangopay2NodejsSdk.mod.mandate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SEPA
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BACS
*/
trait MandateScheme extends js.Object

object MandateScheme {
  @scala.inline
  def BACS: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BACS = this.cast("BACS")
  @scala.inline
  def SEPA: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SEPA = this.cast("SEPA")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

