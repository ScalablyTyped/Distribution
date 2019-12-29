package typings.jsonDashSchemaDashTyped.jsonDashSchemaDashTypedMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait JSONSchemaFormat extends js.Object

@JSImport("json-schema-typed", "JSONSchemaFormat")
@js.native
object JSONSchemaFormat extends js.Object {
  /**
    * A string instance is valid against this attribute if it is a valid
    * representation according to the "full-date" production in
    * [RFC 3339][RFC3339].
    *
    * [RFC3339]: http://json-schema.org/latest/json-schema-validation.html#RFC3339
    */
  @js.native
  sealed trait Date extends JSONSchemaFormat
  
  /**
    * A string instance is valid against this attribute if it is a valid
    * representation according to the "date-time" production in
    * [RFC 3339][RFC3339].
    *
    * [RFC3339]: http://json-schema.org/latest/json-schema-validation.html#RFC3339
    */
  @js.native
  sealed trait DateTime extends JSONSchemaFormat
  
  /**
    * A string instance is valid against these attributes if it is a valid
    * Internet email address as defined by [RFC 5322, section 3.4.1][RFC5322].
    *
    * [RFC5322]: http://json-schema.org/latest/json-schema-validation.html#RFC5322
    */
  @js.native
  sealed trait Email extends JSONSchemaFormat
  
  /**
    * As defined by [RFC 1034, section 3.1][RFC1034], including host names
    * produced using the Punycode algorithm specified in
    * [RFC 5891, section 4.4][RFC5891].
    *
    * [RFC1034]: http://json-schema.org/latest/json-schema-validation.html#RFC1034
    * [RFC5891]: http://json-schema.org/latest/json-schema-validation.html#RFC5891
    */
  @js.native
  sealed trait Hostname extends JSONSchemaFormat
  
  /**
    * A string instance is valid against these attributes if it is a valid
    * Internet email address as defined by [RFC 6531][RFC6531].
    *
    * [RFC6531]: http://json-schema.org/latest/json-schema-validation.html#RFC6531
    */
  @js.native
  sealed trait IDNEmail extends JSONSchemaFormat
  
  /**
    * As defined by either [RFC 1034, section 3.1][RFC1034] as for hostname, or
    * an internationalized hostname as defined by
    * [RFC 5890, section 2.3.2.3][RFC5890].
    *
    * [RFC1034]: http://json-schema.org/latest/json-schema-validation.html#RFC1034
    * [RFC5890]: http://json-schema.org/latest/json-schema-validation.html#RFC5890
    */
  @js.native
  sealed trait IDNHostname extends JSONSchemaFormat
  
  /**
    * An IPv4 address according to the "dotted-quad" ABNF syntax as defined in
    * [RFC 2673, section 3.2][RFC2673].
    *
    * [RFC2673]: http://json-schema.org/latest/json-schema-validation.html#RFC2673
    */
  @js.native
  sealed trait IPv4 extends JSONSchemaFormat
  
  /**
    * An IPv6 address as defined in [RFC 4291, section 2.2][RFC4291].
    *
    * [RFC4291]: http://json-schema.org/latest/json-schema-validation.html#RFC4291
    */
  @js.native
  sealed trait IPv6 extends JSONSchemaFormat
  
  /**
    * A string instance is valid against this attribute if it is a valid IRI,
    * according to [RFC3987][RFC3987].
    *
    * [RFC3987]: http://json-schema.org/latest/json-schema-validation.html#RFC3987
    */
  @js.native
  sealed trait IRI extends JSONSchemaFormat
  
  /**
    * A string instance is valid against this attribute if it is a valid IRI
    * Reference (either an IRI or a relative-reference), according to
    * [RFC3987][RFC3987].
    *
    * [RFC3987]: http://json-schema.org/latest/json-schema-validation.html#RFC3987
    */
  @js.native
  sealed trait IRIReference extends JSONSchemaFormat
  
  /**
    * A string instance is valid against this attribute if it is a valid JSON
    * string representation of a JSON Pointer, according to
    * [RFC 6901, section 5][RFC6901].
    *
    * [RFC6901]: http://json-schema.org/latest/json-schema-validation.html#RFC6901
    */
  @js.native
  sealed trait JSONPointer extends JSONSchemaFormat
  
  /**
    * A string instance is valid against this attribute if it is a valid JSON
    * string representation of a JSON Pointer fragment, according to
    * [RFC 6901, section 5][RFC6901].
    *
    * [RFC6901]: http://json-schema.org/latest/json-schema-validation.html#RFC6901
    */
  @js.native
  sealed trait JSONPointerURIFragment extends JSONSchemaFormat
  
  /**
    * This attribute applies to string instances.
    *
    * A regular expression, which SHOULD be valid according to the
    * [ECMA 262][ecma262] regular expression dialect.
    *
    * Implementations that validate formats MUST accept at least the subset of
    * [ECMA 262][ecma262] defined in the [Regular Expressions][regexInterop]
    * section of this specification, and SHOULD accept all valid
    * [ECMA 262][ecma262] expressions.
    *
    * [ecma262]: http://json-schema.org/latest/json-schema-validation.html#ecma262
    * [regexInterop]: http://json-schema.org/latest/json-schema-validation.html#regexInterop
    */
  @js.native
  sealed trait RegEx extends JSONSchemaFormat
  
  /**
    * A string instance is valid against this attribute if it is a valid
    * [Relative JSON Pointer][relative-json-pointer].
    *
    * [relative-json-pointer]: http://json-schema.org/latest/json-schema-validation.html#relative-json-pointer
    */
  @js.native
  sealed trait RelativeJSONPointer extends JSONSchemaFormat
  
  /**
    * A string instance is valid against this attribute if it is a valid
    * representation according to the "time" production in [RFC 3339][RFC3339].
    *
    * [RFC3339]: http://json-schema.org/latest/json-schema-validation.html#RFC3339
    */
  @js.native
  sealed trait Time extends JSONSchemaFormat
  
  /**
    * A string instance is valid against this attribute if it is a valid URI,
    * according to [RFC3986][RFC3986].
    *
    * [RFC3986]: http://json-schema.org/latest/json-schema-validation.html#RFC3986
    */
  @js.native
  sealed trait URI extends JSONSchemaFormat
  
  /**
    * A string instance is valid against this attribute if it is a valid URI
    * Reference (either a URI or a relative-reference), according to
    * [RFC3986][RFC3986].
    *
    * [RFC3986]: http://json-schema.org/latest/json-schema-validation.html#RFC3986
    */
  @js.native
  sealed trait URIReference extends JSONSchemaFormat
  
  /**
    * A string instance is valid against this attribute if it is a valid URI
    * Template (of any level), according to [RFC6570][RFC6570].
    *
    * Note that URI Templates may be used for IRIs; there is no separate IRI
    * Template specification.
    *
    * [RFC6570]: http://json-schema.org/latest/json-schema-validation.html#RFC6570
    */
  @js.native
  sealed trait URITemplate extends JSONSchemaFormat
  
  /**
    * UUID
    */
  @js.native
  sealed trait UUID extends JSONSchemaFormat
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[JSONSchemaFormat with String] = js.native
  /* "date" */ @js.native
  object Date extends TopLevel[Date with String]
  
  /* "date-time" */ @js.native
  object DateTime extends TopLevel[DateTime with String]
  
  /* "email" */ @js.native
  object Email extends TopLevel[Email with String]
  
  /* "hostname" */ @js.native
  object Hostname extends TopLevel[Hostname with String]
  
  /* "idn-email" */ @js.native
  object IDNEmail extends TopLevel[IDNEmail with String]
  
  /* "idn-hostname" */ @js.native
  object IDNHostname extends TopLevel[IDNHostname with String]
  
  /* "ipv4" */ @js.native
  object IPv4 extends TopLevel[IPv4 with String]
  
  /* "ipv6" */ @js.native
  object IPv6 extends TopLevel[IPv6 with String]
  
  /* "iri" */ @js.native
  object IRI extends TopLevel[IRI with String]
  
  /* "iri-reference" */ @js.native
  object IRIReference extends TopLevel[IRIReference with String]
  
  /* "json-pointer" */ @js.native
  object JSONPointer extends TopLevel[JSONPointer with String]
  
  /* "json-pointer-uri-fragment" */ @js.native
  object JSONPointerURIFragment extends TopLevel[JSONPointerURIFragment with String]
  
  /* "regex" */ @js.native
  object RegEx extends TopLevel[RegEx with String]
  
  /* "relative-json-pointer" */ @js.native
  object RelativeJSONPointer extends TopLevel[RelativeJSONPointer with String]
  
  /* "time" */ @js.native
  object Time extends TopLevel[Time with String]
  
  /* "uri" */ @js.native
  object URI extends TopLevel[URI with String]
  
  /* "uri-reference" */ @js.native
  object URIReference extends TopLevel[URIReference with String]
  
  /* "uri-template" */ @js.native
  object URITemplate extends TopLevel[URITemplate with String]
  
  /* "uuid" */ @js.native
  object UUID extends TopLevel[UUID with String]
  
}

