package typings
package jsonDashSchemaDashTypedLib.jsonDashSchemaDashTypedMod

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
  sealed trait `7bit`
    extends jsonDashSchemaDashTypedLib.jsonDashSchemaDashTypedMod.JSONSchemaContentEncoding
  
  /**
    * Allow extended ASCII characters which can use the 8th (highest) bit to
    * indicate special characters not available in 7bit.
    *
    * Each line must be less than 1,000 characters.
    */
  @js.native
  sealed trait `8bit`
    extends jsonDashSchemaDashTypedLib.jsonDashSchemaDashTypedMod.JSONSchemaContentEncoding
  
  /**
    * Useful for data that is mostly non-text.
    */
  @js.native
  sealed trait Base64
    extends jsonDashSchemaDashTypedLib.jsonDashSchemaDashTypedMod.JSONSchemaContentEncoding
  
  /**
    * Same character set as 8bit, with no line length restriction.
    */
  @js.native
  sealed trait Binary
    extends jsonDashSchemaDashTypedLib.jsonDashSchemaDashTypedMod.JSONSchemaContentEncoding
  
  /**
    * An extension token defined by a standards-track RFC and registered with
    * IANA.
    */
  @js.native
  sealed trait IETFToken
    extends jsonDashSchemaDashTypedLib.jsonDashSchemaDashTypedMod.JSONSchemaContentEncoding
  
  /**
    * Lines are limited to 76 characters, and line breaks are represented using
    * special characters that are escaped.
    */
  @js.native
  sealed trait QuotedPrintable
    extends jsonDashSchemaDashTypedLib.jsonDashSchemaDashTypedMod.JSONSchemaContentEncoding
  
  /**
    * The two characters "X-" or "x-" followed, with no intervening white space,
    * by any token.
    */
  @js.native
  sealed trait XToken
    extends jsonDashSchemaDashTypedLib.jsonDashSchemaDashTypedMod.JSONSchemaContentEncoding
  
  /* "7bit" */ val `7bit`: `7bit` with java.lang.String = js.native
  /* "8bit" */ val `8bit`: `8bit` with java.lang.String = js.native
  /* "base64" */ val Base64: Base64 with java.lang.String = js.native
  /* "binary" */ val Binary: Binary with java.lang.String = js.native
  /* "ietf-token" */ val IETFToken: IETFToken with java.lang.String = js.native
  /* "quoted-printable" */ val QuotedPrintable: QuotedPrintable with java.lang.String = js.native
  /* "x-token" */ val XToken: XToken with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    jsonDashSchemaDashTypedLib.jsonDashSchemaDashTypedMod.JSONSchemaContentEncoding with java.lang.String
  ] = js.native
}

