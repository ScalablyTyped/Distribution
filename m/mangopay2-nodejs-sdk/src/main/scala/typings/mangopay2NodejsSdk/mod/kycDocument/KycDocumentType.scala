package typings.mangopay2NodejsSdk.mod.kycDocument

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IDENTITY_PROOF
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REGISTRATION_PROOF
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ARTICLES_OF_ASSOCIATION
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SHAREHOLDER_DECLARATION
  - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ADDRESS_PROOF
*/
trait KycDocumentType extends js.Object

object KycDocumentType {
  @scala.inline
  def ADDRESS_PROOF: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ADDRESS_PROOF = this.cast("ADDRESS_PROOF")
  @scala.inline
  def ARTICLES_OF_ASSOCIATION: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ARTICLES_OF_ASSOCIATION = this.cast("ARTICLES_OF_ASSOCIATION")
  @scala.inline
  def IDENTITY_PROOF: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IDENTITY_PROOF = this.cast("IDENTITY_PROOF")
  @scala.inline
  def REGISTRATION_PROOF: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REGISTRATION_PROOF = this.cast("REGISTRATION_PROOF")
  @scala.inline
  def SHAREHOLDER_DECLARATION: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SHAREHOLDER_DECLARATION = this.cast("SHAREHOLDER_DECLARATION")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

