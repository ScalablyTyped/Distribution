package typings.mangopay2NodejsSdk.mod.dispute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CONTESTABLE
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NOT_CONTESTABLE
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RETRIEVAL
*/
trait DisputeType extends js.Object

object DisputeType {
  @scala.inline
  def CONTESTABLE: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CONTESTABLE = this.cast("CONTESTABLE")
  @scala.inline
  def NOT_CONTESTABLE: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NOT_CONTESTABLE = this.cast("NOT_CONTESTABLE")
  @scala.inline
  def RETRIEVAL: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RETRIEVAL = this.cast("RETRIEVAL")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

