package typings.jsonDashSchemaDashTyped.jsonDashSchemaDashTypedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait JSONSchemaContentEncoding extends js.Object

@JSImport("json-schema-typed", "JSONSchemaContentEncoding")
@js.native
object JSONSchemaContentEncoding extends js.Object {
  /**
    * Only US-ASCII characters, which use the lower 7 bits for each character.
    *
    * Each line must be less than 1,000 characters.
    */
  @js.native
  sealed trait `7bit` extends JSONSchemaContentEncoding
  
  /**
    * Allow extended ASCII characters which can use the 8th (highest) bit to
    * indicate special characters not available in 7bit.
    *
    * Each line must be less than 1,000 characters.
    */
  @js.native
  sealed trait `8bit` extends JSONSchemaContentEncoding
  
  /**
    * Useful for data that is mostly non-text.
    */
  @js.native
  sealed trait Base64 extends JSONSchemaContentEncoding
  
  /**
    * Same character set as 8bit, with no line length restriction.
    */
  @js.native
  sealed trait Binary extends JSONSchemaContentEncoding
  
  /**
    * An extension token defined by a standards-track RFC and registered with
    * IANA.
    */
  @js.native
  sealed trait IETFToken extends JSONSchemaContentEncoding
  
  /**
    * Lines are limited to 76 characters, and line breaks are represented using
    * special characters that are escaped.
    */
  @js.native
  sealed trait QuotedPrintable extends JSONSchemaContentEncoding
  
  /**
    * The two characters "X-" or "x-" followed, with no intervening white space,
    * by any token.
    */
  @js.native
  sealed trait XToken extends JSONSchemaContentEncoding
  
  /* "7bit" */ val `7bit`: typings.jsonDashSchemaDashTyped.jsonDashSchemaDashTypedMod.JSONSchemaContentEncoding.`7bit` with String = js.native
  /* "8bit" */ val `8bit`: typings.jsonDashSchemaDashTyped.jsonDashSchemaDashTypedMod.JSONSchemaContentEncoding.`8bit` with String = js.native
  /* "base64" */ val Base64: typings.jsonDashSchemaDashTyped.jsonDashSchemaDashTypedMod.JSONSchemaContentEncoding.Base64 with String = js.native
  /* "binary" */ val Binary: typings.jsonDashSchemaDashTyped.jsonDashSchemaDashTypedMod.JSONSchemaContentEncoding.Binary with String = js.native
  /* "ietf-token" */ val IETFToken: typings.jsonDashSchemaDashTyped.jsonDashSchemaDashTypedMod.JSONSchemaContentEncoding.IETFToken with String = js.native
  /* "quoted-printable" */ val QuotedPrintable: typings.jsonDashSchemaDashTyped.jsonDashSchemaDashTypedMod.JSONSchemaContentEncoding.QuotedPrintable with String = js.native
  /* "x-token" */ val XToken: typings.jsonDashSchemaDashTyped.jsonDashSchemaDashTypedMod.JSONSchemaContentEncoding.XToken with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[JSONSchemaContentEncoding with String] = js.native
}

