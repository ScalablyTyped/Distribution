package typings
package jsonDashSchemaDashTypedLib.jsonDashSchemaDashTypedMod

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
  sealed trait Date
    extends jsonDashSchemaDashTypedLib.jsonDashSchemaDashTypedMod.JSONSchemaFormat
  
  /**
    * A string instance is valid against this attribute if it is a valid
    * representation according to the "date-time" production in
    * [RFC 3339][RFC3339].
    *
    * [RFC3339]: http://json-schema.org/latest/json-schema-validation.html#RFC3339
    */
  @js.native
  sealed trait DateTime
    extends jsonDashSchemaDashTypedLib.jsonDashSchemaDashTypedMod.JSONSchemaFormat
  
  /**
    * A string instance is valid against these attributes if it is a valid
    * Internet email address as defined by [RFC 5322, section 3.4.1][RFC5322].
    *
    * [RFC5322]: http://json-schema.org/latest/json-schema-validation.html#RFC5322
    */
  @js.native
  sealed trait Email
    extends jsonDashSchemaDashTypedLib.jsonDashSchemaDashTypedMod.JSONSchemaFormat
  
  /**
    * As defined by [RFC 1034, section 3.1][RFC1034], including host names
    * produced using the Punycode algorithm specified in
    * [RFC 5891, section 4.4][RFC5891].
    *
    * [RFC1034]: http://json-schema.org/latest/json-schema-validation.html#RFC1034
    * [RFC5891]: http://json-schema.org/latest/json-schema-validation.html#RFC5891
    */
  @js.native
  sealed trait Hostname
    extends jsonDashSchemaDashTypedLib.jsonDashSchemaDashTypedMod.JSONSchemaFormat
  
  /**
    * A string instance is valid against these attributes if it is a valid
    * Internet email address as defined by [RFC 6531][RFC6531].
    *
    * [RFC6531]: http://json-schema.org/latest/json-schema-validation.html#RFC6531
    */
  @js.native
  sealed trait IDNEmail
    extends jsonDashSchemaDashTypedLib.jsonDashSchemaDashTypedMod.JSONSchemaFormat
  
  /**
    * As defined by either [RFC 1034, section 3.1][RFC1034] as for hostname, or
    * an internationalized hostname as defined by
    * [RFC 5890, section 2.3.2.3][RFC5890].
    *
    * [RFC1034]: http://json-schema.org/latest/json-schema-validation.html#RFC1034
    * [RFC5890]: http://json-schema.org/latest/json-schema-validation.html#RFC5890
    */
  @js.native
  sealed trait IDNHostname
    extends jsonDashSchemaDashTypedLib.jsonDashSchemaDashTypedMod.JSONSchemaFormat
  
  /**
    * An IPv4 address according to the "dotted-quad" ABNF syntax as defined in
    * [RFC 2673, section 3.2][RFC2673].
    *
    * [RFC2673]: http://json-schema.org/latest/json-schema-validation.html#RFC2673
    */
  @js.native
  sealed trait IPv4
    extends jsonDashSchemaDashTypedLib.jsonDashSchemaDashTypedMod.JSONSchemaFormat
  
  /**
    * An IPv6 address as defined in [RFC 4291, section 2.2][RFC4291].
    *
    * [RFC4291]: http://json-schema.org/latest/json-schema-validation.html#RFC4291
    */
  @js.native
  sealed trait IPv6
    extends jsonDashSchemaDashTypedLib.jsonDashSchemaDashTypedMod.JSONSchemaFormat
  
  /**
    * A string instance is valid against this attribute if it is a valid IRI,
    * according to [RFC3987][RFC3987].
    *
    * [RFC3987]: http://json-schema.org/latest/json-schema-validation.html#RFC3987
    */
  @js.native
  sealed trait IRI
    extends jsonDashSchemaDashTypedLib.jsonDashSchemaDashTypedMod.JSONSchemaFormat
  
  /**
    * A string instance is valid against this attribute if it is a valid IRI
    * Reference (either an IRI or a relative-reference), according to
    * [RFC3987][RFC3987].
    *
    * [RFC3987]: http://json-schema.org/latest/json-schema-validation.html#RFC3987
    */
  @js.native
  sealed trait IRIReference
    extends jsonDashSchemaDashTypedLib.jsonDashSchemaDashTypedMod.JSONSchemaFormat
  
  /**
    * A string instance is valid against this attribute if it is a valid JSON
    * string representation of a JSON Pointer, according to
    * [RFC 6901, section 5][RFC6901].
    *
    * [RFC6901]: http://json-schema.org/latest/json-schema-validation.html#RFC6901
    */
  @js.native
  sealed trait JSONPointer
    extends jsonDashSchemaDashTypedLib.jsonDashSchemaDashTypedMod.JSONSchemaFormat
  
  /**
    * A string instance is valid against this attribute if it is a valid JSON
    * string representation of a JSON Pointer fragment, according to
    * [RFC 6901, section 5][RFC6901].
    *
    * [RFC6901]: http://json-schema.org/latest/json-schema-validation.html#RFC6901
    */
  @js.native
  sealed trait JSONPointerURIFragment
    extends jsonDashSchemaDashTypedLib.jsonDashSchemaDashTypedMod.JSONSchemaFormat
  
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
  sealed trait RegEx
    extends jsonDashSchemaDashTypedLib.jsonDashSchemaDashTypedMod.JSONSchemaFormat
  
  /**
    * A string instance is valid against this attribute if it is a valid
    * [Relative JSON Pointer][relative-json-pointer].
    *
    * [relative-json-pointer]: http://json-schema.org/latest/json-schema-validation.html#relative-json-pointer
    */
  @js.native
  sealed trait RelativeJSONPointer
    extends jsonDashSchemaDashTypedLib.jsonDashSchemaDashTypedMod.JSONSchemaFormat
  
  /**
    * A string instance is valid against this attribute if it is a valid
    * representation according to the "time" production in [RFC 3339][RFC3339].
    *
    * [RFC3339]: http://json-schema.org/latest/json-schema-validation.html#RFC3339
    */
  @js.native
  sealed trait Time
    extends jsonDashSchemaDashTypedLib.jsonDashSchemaDashTypedMod.JSONSchemaFormat
  
  /**
    * A string instance is valid against this attribute if it is a valid URI,
    * according to [RFC3986][RFC3986].
    *
    * [RFC3986]: http://json-schema.org/latest/json-schema-validation.html#RFC3986
    */
  @js.native
  sealed trait URI
    extends jsonDashSchemaDashTypedLib.jsonDashSchemaDashTypedMod.JSONSchemaFormat
  
  /**
    * A string instance is valid against this attribute if it is a valid URI
    * Reference (either a URI or a relative-reference), according to
    * [RFC3986][RFC3986].
    *
    * [RFC3986]: http://json-schema.org/latest/json-schema-validation.html#RFC3986
    */
  @js.native
  sealed trait URIReference
    extends jsonDashSchemaDashTypedLib.jsonDashSchemaDashTypedMod.JSONSchemaFormat
  
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
  sealed trait URITemplate
    extends jsonDashSchemaDashTypedLib.jsonDashSchemaDashTypedMod.JSONSchemaFormat
  
  /**
    * UUID
    */
  @js.native
  sealed trait UUID
    extends jsonDashSchemaDashTypedLib.jsonDashSchemaDashTypedMod.JSONSchemaFormat
  
  /* "date" */ val Date: Date with java.lang.String = js.native
  /* "date-time" */ val DateTime: DateTime with java.lang.String = js.native
  /* "email" */ val Email: Email with java.lang.String = js.native
  /* "hostname" */ val Hostname: Hostname with java.lang.String = js.native
  /* "idn-email" */ val IDNEmail: IDNEmail with java.lang.String = js.native
  /* "idn-hostname" */ val IDNHostname: IDNHostname with java.lang.String = js.native
  /* "ipv4" */ val IPv4: IPv4 with java.lang.String = js.native
  /* "ipv6" */ val IPv6: IPv6 with java.lang.String = js.native
  /* "iri" */ val IRI: IRI with java.lang.String = js.native
  /* "iri-reference" */ val IRIReference: IRIReference with java.lang.String = js.native
  /* "json-pointer" */ val JSONPointer: JSONPointer with java.lang.String = js.native
  /* "json-pointer-uri-fragment" */ val JSONPointerURIFragment: JSONPointerURIFragment with java.lang.String = js.native
  /* "regex" */ val RegEx: RegEx with java.lang.String = js.native
  /* "relative-json-pointer" */ val RelativeJSONPointer: RelativeJSONPointer with java.lang.String = js.native
  /* "time" */ val Time: Time with java.lang.String = js.native
  /* "uri" */ val URI: URI with java.lang.String = js.native
  /* "uri-reference" */ val URIReference: URIReference with java.lang.String = js.native
  /* "uri-template" */ val URITemplate: URITemplate with java.lang.String = js.native
  /* "uuid" */ val UUID: UUID with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    jsonDashSchemaDashTypedLib.jsonDashSchemaDashTypedMod.JSONSchemaFormat with java.lang.String
  ] = js.native
}

