package typings.jsonSchemaTyped.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait JSONSchemaContentEncoding extends StObject
@JSImport("json-schema-typed", "JSONSchemaContentEncoding")
@js.native
object JSONSchemaContentEncoding extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[JSONSchemaContentEncoding & String] = js.native
  
  /**
    * Only US-ASCII characters, which use the lower 7 bits for each character.
    *
    * Each line must be less than 1,000 characters.
    */
  @js.native
  sealed trait `7bit`
    extends StObject
       with JSONSchemaContentEncoding
  /* "7bit" */ val `7bit`: typings.jsonSchemaTyped.mod.JSONSchemaContentEncoding.`7bit` & String = js.native
  
  /**
    * Allow extended ASCII characters which can use the 8th (highest) bit to
    * indicate special characters not available in 7bit.
    *
    * Each line must be less than 1,000 characters.
    */
  @js.native
  sealed trait `8bit`
    extends StObject
       with JSONSchemaContentEncoding
  /* "8bit" */ val `8bit`: typings.jsonSchemaTyped.mod.JSONSchemaContentEncoding.`8bit` & String = js.native
  
  /**
    * Useful for data that is mostly non-text.
    */
  @js.native
  sealed trait Base64
    extends StObject
       with JSONSchemaContentEncoding
  /* "base64" */ val Base64: typings.jsonSchemaTyped.mod.JSONSchemaContentEncoding.Base64 & String = js.native
  
  /**
    * Same character set as 8bit, with no line length restriction.
    */
  @js.native
  sealed trait Binary
    extends StObject
       with JSONSchemaContentEncoding
  /* "binary" */ val Binary: typings.jsonSchemaTyped.mod.JSONSchemaContentEncoding.Binary & String = js.native
  
  /**
    * An extension token defined by a standards-track RFC and registered with
    * IANA.
    */
  @js.native
  sealed trait IETFToken
    extends StObject
       with JSONSchemaContentEncoding
  /* "ietf-token" */ val IETFToken: typings.jsonSchemaTyped.mod.JSONSchemaContentEncoding.IETFToken & String = js.native
  
  /**
    * Lines are limited to 76 characters, and line breaks are represented using
    * special characters that are escaped.
    */
  @js.native
  sealed trait QuotedPrintable
    extends StObject
       with JSONSchemaContentEncoding
  /* "quoted-printable" */ val QuotedPrintable: typings.jsonSchemaTyped.mod.JSONSchemaContentEncoding.QuotedPrintable & String = js.native
  
  /**
    * The two characters "X-" or "x-" followed, with no intervening white space,
    * by any token.
    */
  @js.native
  sealed trait XToken
    extends StObject
       with JSONSchemaContentEncoding
  /* "x-token" */ val XToken: typings.jsonSchemaTyped.mod.JSONSchemaContentEncoding.XToken & String = js.native
}
