package typings.hapiJoi.mod

import typings.hapiJoi.hapiJoiStrings.NFC
import typings.hapiJoi.hapiJoiStrings.NFD
import typings.hapiJoi.hapiJoiStrings.NFKC
import typings.hapiJoi.hapiJoiStrings.NFKD
import typings.hapiJoi.hapiJoiStrings.lower
import typings.hapiJoi.hapiJoiStrings.upper
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.hapiJoi.mod._Schema because Already inherited */ @js.native
trait StringSchema
  extends StObject
     with AnySchema {
  
  /**
    * Requires the string value to only contain a-z, A-Z, and 0-9.
    */
  def alphanum(): this.type = js.native
  
  /**
    * Requires the string value to be a valid base64 string; does not check the decoded value.
    */
  def base64(): this.type = js.native
  def base64(options: Base64Options): this.type = js.native
  
  @JSName("case")
  def case_lower(direction: lower): this.type = js.native
  /**
    * Sets the required string case.
    */
  @JSName("case")
  def case_upper(direction: upper): this.type = js.native
  
  /**
    * Requires the number to be a credit card number (Using Lunh Algorithm).
    */
  def creditCard(): this.type = js.native
  
  /**
    * Requires the string value to be a valid data URI string.
    */
  def dataUri(): this.type = js.native
  def dataUri(options: DataUriOptions): this.type = js.native
  
  /**
    * Requires the string value to be a valid domain.
    */
  def domain(): this.type = js.native
  def domain(options: DomainOptions): this.type = js.native
  
  /**
    * Requires the string value to be a valid email address.
    */
  def email(): this.type = js.native
  def email(options: EmailOptions): this.type = js.native
  
  /**
    * Requires the string value to be a valid GUID.
    */
  def guid(): this.type = js.native
  def guid(options: GuidOptions): this.type = js.native
  
  /**
    * Requires the string value to be a valid hexadecimal string.
    */
  def hex(): this.type = js.native
  def hex(options: HexOptions): this.type = js.native
  
  /**
    * Requires the string value to be a valid hostname as per RFC1123.
    */
  def hostname(): this.type = js.native
  
  /**
    * Allows the value to match any whitelist of blacklist item in a case insensitive comparison.
    */
  def insensitive(): this.type = js.native
  
  /**
    * Requires the string value to be a valid ip address.
    */
  def ip(): this.type = js.native
  def ip(options: IpOptions): this.type = js.native
  
  /**
    * Requires the string value to be in valid ISO 8601 date format.
    */
  def isoDate(): this.type = js.native
  
  /**
    * Requires the string value to be in valid ISO 8601 duration format.
    */
  def isoDuration(): this.type = js.native
  
  /**
    * Specifies the exact string length required
    * @param limit - the required string length. It can also be a reference to another field.
    * @param encoding - if specified, the string length is calculated in bytes using the provided encoding.
    */
  def length(limit: Double): this.type = js.native
  def length(limit: Double, encoding: String): this.type = js.native
  def length(limit: Reference): this.type = js.native
  def length(limit: Reference, encoding: String): this.type = js.native
  
  /**
    * Requires the string value to be all lowercase. If the validation convert option is on (enabled by default), the string will be forced to lowercase.
    */
  def lowercase(): this.type = js.native
  
  /**
    * Specifies the maximum number of string characters.
    * @param limit - the maximum number of string characters allowed. It can also be a reference to another field.
    * @param encoding - if specified, the string length is calculated in bytes using the provided encoding.
    */
  def max(limit: Double): this.type = js.native
  def max(limit: Double, encoding: String): this.type = js.native
  def max(limit: Reference): this.type = js.native
  def max(limit: Reference, encoding: String): this.type = js.native
  
  /**
    * Specifies the minimum number string characters.
    * @param limit - the minimum number of string characters required. It can also be a reference to another field.
    * @param encoding - if specified, the string length is calculated in bytes using the provided encoding.
    */
  def min(limit: Double): this.type = js.native
  def min(limit: Double, encoding: String): this.type = js.native
  def min(limit: Reference): this.type = js.native
  def min(limit: Reference, encoding: String): this.type = js.native
  
  /**
    * Requires the string value to be in a unicode normalized form. If the validation convert option is on (enabled by default), the string will be normalized.
    * @param [form='NFC'] - The unicode normalization form to use. Valid values: NFC [default], NFD, NFKC, NFKD
    */
  def normalize(): this.type = js.native
  @JSName("normalize")
  def normalize_NFC(form: NFC): this.type = js.native
  @JSName("normalize")
  def normalize_NFD(form: NFD): this.type = js.native
  @JSName("normalize")
  def normalize_NFKC(form: NFKC): this.type = js.native
  @JSName("normalize")
  def normalize_NFKD(form: NFKD): this.type = js.native
  
  /**
    * Defines a regular expression rule.
    * @param pattern - a regular expression object the string value must match against.
    * @param options - optional, can be:
    *   Name for patterns (useful with multiple patterns). Defaults to 'required'.
    *   An optional configuration object with the following supported properties:
    *     name - optional pattern name.
    *     invert - optional boolean flag. Defaults to false behavior. If specified as true, the provided pattern will be disallowed instead of required.
    */
  def pattern(pattern: RegExp): this.type = js.native
  def pattern(pattern: RegExp, options: String): this.type = js.native
  def pattern(pattern: RegExp, options: StringRegexOptions): this.type = js.native
  
  /**
    * Defines a regular expression rule.
    * @param pattern - a regular expression object the string value must match against.
    * @param options - optional, can be:
    *   Name for patterns (useful with multiple patterns). Defaults to 'required'.
    *   An optional configuration object with the following supported properties:
    *     name - optional pattern name.
    *     invert - optional boolean flag. Defaults to false behavior. If specified as true, the provided pattern will be disallowed instead of required.
    */
  def regex(pattern: RegExp): this.type = js.native
  def regex(pattern: RegExp, options: String): this.type = js.native
  def regex(pattern: RegExp, options: StringRegexOptions): this.type = js.native
  
  def replace(pattern: String, replacement: String): this.type = js.native
  /**
    * Replace characters matching the given pattern with the specified replacement string where:
    * @param pattern - a regular expression object to match against, or a string of which all occurrences will be replaced.
    * @param replacement - the string that will replace the pattern.
    */
  def replace(pattern: RegExp, replacement: String): this.type = js.native
  
  /**
    * Requires the string value to only contain a-z, A-Z, 0-9, and underscore _.
    */
  def token(): this.type = js.native
  
  /**
    * Requires the string value to contain no whitespace before or after. If the validation convert option is on (enabled by default), the string will be trimmed.
    * @param [enabled=true] - optional parameter defaulting to true which allows you to reset the behavior of trim by providing a falsy value.
    */
  def trim(): this.type = js.native
  def trim(enabled: js.Any): this.type = js.native
  
  /**
    * Specifies whether the string.max() limit should be used as a truncation.
    * @param [enabled=true] - optional parameter defaulting to true which allows you to reset the behavior of truncate by providing a falsy value.
    */
  def truncate(): this.type = js.native
  def truncate(enabled: Boolean): this.type = js.native
  
  /**
    * Requires the string value to be all uppercase. If the validation convert option is on (enabled by default), the string will be forced to uppercase.
    */
  def uppercase(): this.type = js.native
  
  /**
    * Requires the string value to be a valid RFC 3986 URI.
    */
  def uri(): this.type = js.native
  def uri(options: UriOptions): this.type = js.native
  
  /**
    * Requires the string value to be a valid GUID.
    */
  def uuid(): this.type = js.native
  def uuid(options: GuidOptions): this.type = js.native
}
