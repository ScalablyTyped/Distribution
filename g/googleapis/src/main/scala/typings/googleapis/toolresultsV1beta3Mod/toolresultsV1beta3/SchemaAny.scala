package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * `Any` contains an arbitrary serialized protocol buffer message along with a
  * URL that describes the type of the serialized message.  Protobuf library
  * provides support to pack/unpack Any values in the form of utility functions
  * or additional generated methods of the Any type.  Example 1: Pack and
  * unpack a message in C++.  Foo foo = ...; Any any; any.PackFrom(foo); ... if
  * (any.UnpackTo(&amp;foo)) { ... }  Example 2: Pack and unpack a message in
  * Java.  Foo foo = ...; Any any = Any.pack(foo); ... if (any.is(Foo.class)) {
  * foo = any.unpack(Foo.class); }  Example 3: Pack and unpack a message in
  * Python.  foo = Foo(...) any = Any() any.Pack(foo) ... if
  * any.Is(Foo.DESCRIPTOR): any.Unpack(foo) ...  Example 4: Pack and unpack a
  * message in Go  foo := &amp;pb.Foo{...} any, err := ptypes.MarshalAny(foo)
  * ... foo := &amp;pb.Foo{} if err := ptypes.UnmarshalAny(any, foo); err !=
  * nil { ... }  The pack methods provided by protobuf library will by default
  * use &#39;type.googleapis.com/full.type.name&#39; as the type URL and the
  * unpack methods only use the fully qualified type name after the last
  * &#39;/&#39; in the type URL, for example &quot;foo.bar.com/x/y.z&quot; will
  * yield type name &quot;y.z&quot;.    JSON ==== The JSON representation of an
  * `Any` value uses the regular representation of the deserialized, embedded
  * message, with an additional field `@type` which contains the type URL.
  * Example:  package google.profile; message Person { string first_name = 1;
  * string last_name = 2; }  { &quot;@type&quot;:
  * &quot;type.googleapis.com/google.profile.Person&quot;,
  * &quot;firstName&quot;: , &quot;lastName&quot;:  }  If the embedded message
  * type is well-known and has a custom JSON representation, that
  * representation will be embedded adding a field `value` which holds the
  * custom JSON in addition to the `@type` field. Example (for message
  * [google.protobuf.Duration][]):  { &quot;@type&quot;:
  * &quot;type.googleapis.com/google.protobuf.Duration&quot;,
  * &quot;value&quot;: &quot;1.212s&quot; }
  */
@js.native
trait SchemaAny extends StObject {
  
  /**
    * A URL/resource name that uniquely identifies the type of the serialized
    * protocol buffer message. This string must contain at least one
    * &quot;/&quot; character. The last segment of the URL&#39;s path must
    * represent the fully qualified name of the type (as in
    * `path/google.protobuf.Duration`). The name should be in a canonical form
    * (e.g., leading &quot;.&quot; is not accepted).  In practice, teams
    * usually precompile into the binary all types that they expect it to use
    * in the context of Any. However, for URLs which use the scheme `http`,
    * `https`, or no scheme, one can optionally set up a type server that maps
    * type URLs to message definitions as follows:  * If no scheme is provided,
    * `https` is assumed. * An HTTP GET on the URL must yield a
    * [google.protobuf.Type][] value in binary format, or produce an error. *
    * Applications are allowed to cache lookup results based on the URL, or
    * have them precompiled into a binary to avoid any lookup. Therefore,
    * binary compatibility needs to be preserved on changes to types. (Use
    * versioned type names to manage breaking changes.)  Note: this
    * functionality is not currently available in the official protobuf
    * release, and it is not used for type URLs beginning with
    * type.googleapis.com.  Schemes other than `http`, `https` (or the empty
    * scheme) might be used with implementation specific semantics.
    */
  var typeUrl: js.UndefOr[String] = js.native
  
  /**
    * Must be a valid serialized protocol buffer of the above specified type.
    */
  var value: js.UndefOr[String] = js.native
}
object SchemaAny {
  
  @scala.inline
  def apply(): SchemaAny = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAny]
  }
  
  @scala.inline
  implicit class SchemaAnyMutableBuilder[Self <: SchemaAny] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTypeUrl(value: String): Self = StObject.set(x, "typeUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUrlUndefined: Self = StObject.set(x, "typeUrl", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
