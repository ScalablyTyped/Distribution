package typings.jsonSchemaTyped.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jsonSchemaTyped.jsonSchemaTypedStrings.`7bit`
  - typings.jsonSchemaTyped.jsonSchemaTypedStrings.`8bit`
  - typings.jsonSchemaTyped.jsonSchemaTypedStrings.binary
  - typings.jsonSchemaTyped.jsonSchemaTypedStrings.`quoted-printable`
  - typings.jsonSchemaTyped.jsonSchemaTypedStrings.base64
  - typings.jsonSchemaTyped.jsonSchemaTypedStrings.`ietf-token`
  - typings.jsonSchemaTyped.jsonSchemaTypedStrings.`x-token`
*/
trait JSONSchemaContentEncodingName extends js.Object

object JSONSchemaContentEncodingName {
  @scala.inline
  def `7bit`: typings.jsonSchemaTyped.jsonSchemaTypedStrings.`7bit` = this.cast("7bit")
  @scala.inline
  def `8bit`: typings.jsonSchemaTyped.jsonSchemaTypedStrings.`8bit` = this.cast("8bit")
  @scala.inline
  def base64: typings.jsonSchemaTyped.jsonSchemaTypedStrings.base64 = this.cast("base64")
  @scala.inline
  def binary: typings.jsonSchemaTyped.jsonSchemaTypedStrings.binary = this.cast("binary")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `ietf-token`: typings.jsonSchemaTyped.jsonSchemaTypedStrings.`ietf-token` = this.cast("ietf-token")
  @scala.inline
  def `quoted-printable`: typings.jsonSchemaTyped.jsonSchemaTypedStrings.`quoted-printable` = this.cast("quoted-printable")
  @scala.inline
  def `x-token`: typings.jsonSchemaTyped.jsonSchemaTypedStrings.`x-token` = this.cast("x-token")
}

