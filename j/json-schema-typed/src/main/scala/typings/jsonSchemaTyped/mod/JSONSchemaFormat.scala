package typings.jsonSchemaTyped.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait JSONSchemaFormat extends StObject
@JSImport("json-schema-typed", "JSONSchemaFormat")
@js.native
object JSONSchemaFormat extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[JSONSchemaFormat with String] = js.native
  
  /**
    * A string instance is valid against this attribute if it is a valid
    * representation according to the "full-date" production in
    * [RFC 3339][RFC3339].
    *
    * [RFC3339]: http://json-schema.org/latest/json-schema-validation.html#RFC3339
    */
  @js.native
  sealed trait Date extends JSONSchemaFormat
  /* "date" */ val Date: typings.jsonSchemaTyped.mod.JSONSchemaFormat.Date with String = js.native
  
  /**
    * A string instance is valid against this attribute if it is a valid
    * representation according to the "date-time" production in
    * [RFC 3339][RFC3339].
    *
    * [RFC3339]: http://json-schema.org/latest/json-schema-validation.html#RFC3339
    */
  @js.native
  sealed trait DateTime extends JSONSchemaFormat
  /* "date-time" */ val DateTime: typings.jsonSchemaTyped.mod.JSONSchemaFormat.DateTime with String = js.native
  
  /**
    * A string instance is valid against these attributes if it is a valid
    * Internet email address as defined by [RFC 5322, section 3.4.1][RFC5322].
    *
    * [RFC5322]: http://json-schema.org/latest/json-schema-validation.html#RFC5322
    */
  @js.native
  sealed trait Email extends JSONSchemaFormat
  /* "email" */ val Email: typings.jsonSchemaTyped.mod.JSONSchemaFormat.Email with String = js.native
  
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
  /* "hostname" */ val Hostname: typings.jsonSchemaTyped.mod.JSONSchemaFormat.Hostname with String = js.native
  
  /**
    * A string instance is valid against these attributes if it is a valid
    * Internet email address as defined by [RFC 6531][RFC6531].
    *
    * [RFC6531]: http://json-schema.org/latest/json-schema-validation.html#RFC6531
    */
  @js.native
  sealed trait IDNEmail extends JSONSchemaFormat
  /* "idn-email" */ val IDNEmail: typings.jsonSchemaTyped.mod.JSONSchemaFormat.IDNEmail with String = js.native
  
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
  /* "idn-hostname" */ val IDNHostname: typings.jsonSchemaTyped.mod.JSONSchemaFormat.IDNHostname with String = js.native
  
  /**
    * An IPv4 address according to the "dotted-quad" ABNF syntax as defined in
    * [RFC 2673, section 3.2][RFC2673].
    *
    * [RFC2673]: http://json-schema.org/latest/json-schema-validation.html#RFC2673
    */
  @js.native
  sealed trait IPv4 extends JSONSchemaFormat
  /* "ipv4" */ val IPv4: typings.jsonSchemaTyped.mod.JSONSchemaFormat.IPv4 with String = js.native
  
  /**
    * An IPv6 address as defined in [RFC 4291, section 2.2][RFC4291].
    *
    * [RFC4291]: http://json-schema.org/latest/json-schema-validation.html#RFC4291
    */
  @js.native
  sealed trait IPv6 extends JSONSchemaFormat
  /* "ipv6" */ val IPv6: typings.jsonSchemaTyped.mod.JSONSchemaFormat.IPv6 with String = js.native
  
  /**
    * A string instance is valid against this attribute if it is a valid IRI,
    * according to [RFC3987][RFC3987].
    *
    * [RFC3987]: http://json-schema.org/latest/json-schema-validation.html#RFC3987
    */
  @js.native
  sealed trait IRI extends JSONSchemaFormat
  /* "iri" */ val IRI: typings.jsonSchemaTyped.mod.JSONSchemaFormat.IRI with String = js.native
  
  /**
    * A string instance is valid against this attribute if it is a valid IRI
    * Reference (either an IRI or a relative-reference), according to
    * [RFC3987][RFC3987].
    *
    * [RFC3987]: http://json-schema.org/latest/json-schema-validation.html#RFC3987
    */
  @js.native
  sealed trait IRIReference extends JSONSchemaFormat
  /* "iri-reference" */ val IRIReference: typings.jsonSchemaTyped.mod.JSONSchemaFormat.IRIReference with String = js.native
  
  /**
    * A string instance is valid against this attribute if it is a valid JSON
    * string representation of a JSON Pointer, according to
    * [RFC 6901, section 5][RFC6901].
    *
    * [RFC6901]: http://json-schema.org/latest/json-schema-validation.html#RFC6901
    */
  @js.native
  sealed trait JSONPointer extends JSONSchemaFormat
  /* "json-pointer" */ val JSONPointer: typings.jsonSchemaTyped.mod.JSONSchemaFormat.JSONPointer with String = js.native
  
  /**
    * A string instance is valid against this attribute if it is a valid JSON
    * string representation of a JSON Pointer fragment, according to
    * [RFC 6901, section 5][RFC6901].
    *
    * [RFC6901]: http://json-schema.org/latest/json-schema-validation.html#RFC6901
    */
  @js.native
  sealed trait JSONPointerURIFragment extends JSONSchemaFormat
  /* "json-pointer-uri-fragment" */ val JSONPointerURIFragment: typings.jsonSchemaTyped.mod.JSONSchemaFormat.JSONPointerURIFragment with String = js.native
  
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
  /* "regex" */ val RegEx: typings.jsonSchemaTyped.mod.JSONSchemaFormat.RegEx with String = js.native
  
  /**
    * A string instance is valid against this attribute if it is a valid
    * [Relative JSON Pointer][relative-json-pointer].
    *
    * [relative-json-pointer]: http://json-schema.org/latest/json-schema-validation.html#relative-json-pointer
    */
  @js.native
  sealed trait RelativeJSONPointer extends JSONSchemaFormat
  /* "relative-json-pointer" */ val RelativeJSONPointer: typings.jsonSchemaTyped.mod.JSONSchemaFormat.RelativeJSONPointer with String = js.native
  
  /**
    * A string instance is valid against this attribute if it is a valid
    * representation according to the "time" production in [RFC 3339][RFC3339].
    *
    * [RFC3339]: http://json-schema.org/latest/json-schema-validation.html#RFC3339
    */
  @js.native
  sealed trait Time extends JSONSchemaFormat
  /* "time" */ val Time: typings.jsonSchemaTyped.mod.JSONSchemaFormat.Time with String = js.native
  
  /**
    * A string instance is valid against this attribute if it is a valid URI,
    * according to [RFC3986][RFC3986].
    *
    * [RFC3986]: http://json-schema.org/latest/json-schema-validation.html#RFC3986
    */
  @js.native
  sealed trait URI extends JSONSchemaFormat
  /* "uri" */ val URI: typings.jsonSchemaTyped.mod.JSONSchemaFormat.URI with String = js.native
  
  /**
    * A string instance is valid against this attribute if it is a valid URI
    * Reference (either a URI or a relative-reference), according to
    * [RFC3986][RFC3986].
    *
    * [RFC3986]: http://json-schema.org/latest/json-schema-validation.html#RFC3986
    */
  @js.native
  sealed trait URIReference extends JSONSchemaFormat
  /* "uri-reference" */ val URIReference: typings.jsonSchemaTyped.mod.JSONSchemaFormat.URIReference with String = js.native
  
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
  /* "uri-template" */ val URITemplate: typings.jsonSchemaTyped.mod.JSONSchemaFormat.URITemplate with String = js.native
  
  /**
    * UUID
    */
  @js.native
  sealed trait UUID extends JSONSchemaFormat
  /* "uuid" */ val UUID: typings.jsonSchemaTyped.mod.JSONSchemaFormat.UUID with String = js.native
}
