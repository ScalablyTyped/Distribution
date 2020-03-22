package typings.mangopay2NodejsSdk.mod.card

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREATED
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALIDATED
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ERROR
*/
trait CardStatus extends js.Object

object CardStatus {
  @scala.inline
  def CREATED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREATED = this.cast("CREATED")
  @scala.inline
  def ERROR: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ERROR = this.cast("ERROR")
  @scala.inline
  def VALIDATED: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALIDATED = this.cast("VALIDATED")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

