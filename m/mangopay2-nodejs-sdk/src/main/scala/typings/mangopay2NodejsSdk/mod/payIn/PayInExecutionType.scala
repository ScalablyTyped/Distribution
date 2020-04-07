package typings.mangopay2NodejsSdk.mod.payIn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.ValueOf<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.IPayInExecutionType> | 'EXTERNAL_INSTRUCTION' */
/* Rewritten from type alias, can be one of: 
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DIRECT
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.WEB
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EXTERNAL_INSTRUCTION
*/
trait PayInExecutionType extends js.Object

object PayInExecutionType {
  @scala.inline
  def DIRECT: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DIRECT = this.cast("DIRECT")
  @scala.inline
  def EXTERNAL_INSTRUCTION: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.EXTERNAL_INSTRUCTION = this.cast("EXTERNAL_INSTRUCTION")
  @scala.inline
  def WEB: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.WEB = this.cast("WEB")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

