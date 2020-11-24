package typings.jsonSchemaTyped.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait JSONSchemaContentEncoding extends js.Object
@JSImport("json-schema-typed", "JSONSchemaContentEncoding")
@js.native
object JSONSchemaContentEncoding extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[JSONSchemaContentEncoding with String] = js.native
  
  /**
    * Only US-ASCII characters, which use the lower 7 bits for each character.
    *
    * Each line must be less than 1,000 characters.
    */
  @js.native
  sealed trait `7bit` extends JSONSchemaContentEncoding
  /* "7bit" */ @js.native
  object `7bit` extends TopLevel[`7bit` with String]
  
  /**
    * Allow extended ASCII characters which can use the 8th (highest) bit to
    * indicate special characters not available in 7bit.
    *
    * Each line must be less than 1,000 characters.
    */
  @js.native
  sealed trait `8bit` extends JSONSchemaContentEncoding
  /* "8bit" */ @js.native
  object `8bit` extends TopLevel[`8bit` with String]
  
  /**
    * Useful for data that is mostly non-text.
    */
  @js.native
  sealed trait Base64 extends JSONSchemaContentEncoding
  /* "base64" */ @js.native
  object Base64 extends TopLevel[Base64 with String]
  
  /**
    * Same character set as 8bit, with no line length restriction.
    */
  @js.native
  sealed trait Binary extends JSONSchemaContentEncoding
  /* "binary" */ @js.native
  object Binary extends TopLevel[Binary with String]
  
  /**
    * An extension token defined by a standards-track RFC and registered with
    * IANA.
    */
  @js.native
  sealed trait IETFToken extends JSONSchemaContentEncoding
  /* "ietf-token" */ @js.native
  object IETFToken extends TopLevel[IETFToken with String]
  
  /**
    * Lines are limited to 76 characters, and line breaks are represented using
    * special characters that are escaped.
    */
  @js.native
  sealed trait QuotedPrintable extends JSONSchemaContentEncoding
  /* "quoted-printable" */ @js.native
  object QuotedPrintable extends TopLevel[QuotedPrintable with String]
  
  /**
    * The two characters "X-" or "x-" followed, with no intervening white space,
    * by any token.
    */
  @js.native
  sealed trait XToken extends JSONSchemaContentEncoding
  /* "x-token" */ @js.native
  object XToken extends TopLevel[XToken with String]
}
