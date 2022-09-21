package typings.googleapis.serviceusageV1beta1Mod.serviceusageV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaApi extends StObject {
  
  /**
    * The methods of this interface, in unspecified order.
    */
  var methods: js.UndefOr[js.Array[SchemaMethod]] = js.undefined
  
  /**
    * Included interfaces. See Mixin.
    */
  var mixins: js.UndefOr[js.Array[SchemaMixin]] = js.undefined
  
  /**
    * The fully qualified name of this interface, including package name followed by the interface's simple name.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Any metadata attached to the interface.
    */
  var options: js.UndefOr[js.Array[SchemaOption]] = js.undefined
  
  /**
    * Source context for the protocol buffer service represented by this message.
    */
  var sourceContext: js.UndefOr[SchemaSourceContext] = js.undefined
  
  /**
    * The source syntax of the service.
    */
  var syntax: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A version string for this interface. If specified, must have the form `major-version.minor-version`, as in `1.10`. If the minor version is omitted, it defaults to zero. If the entire version field is empty, the major version is derived from the package name, as outlined below. If the field is not empty, the version in the package name will be verified to be consistent with what is provided here. The versioning schema uses [semantic versioning](http://semver.org) where the major version number indicates a breaking change and the minor version an additive, non-breaking change. Both version numbers are signals to users what to expect from different versions, and should be carefully chosen based on the product plan. The major version is also reflected in the package name of the interface, which must end in `v`, as in `google.feature.v1`. For major versions 0 and 1, the suffix can be omitted. Zero major versions must only be used for experimental, non-GA interfaces.
    */
  var version: js.UndefOr[String | Null] = js.undefined
}
object SchemaApi {
  
  inline def apply(): SchemaApi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApi]
  }
  
  extension [Self <: SchemaApi](x: Self) {
    
    inline def setMethods(value: js.Array[SchemaMethod]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
    
    inline def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
    
    inline def setMethodsVarargs(value: SchemaMethod*): Self = StObject.set(x, "methods", js.Array(value*))
    
    inline def setMixins(value: js.Array[SchemaMixin]): Self = StObject.set(x, "mixins", value.asInstanceOf[js.Any])
    
    inline def setMixinsUndefined: Self = StObject.set(x, "mixins", js.undefined)
    
    inline def setMixinsVarargs(value: SchemaMixin*): Self = StObject.set(x, "mixins", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOptions(value: js.Array[SchemaOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setOptionsVarargs(value: SchemaOption*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setSourceContext(value: SchemaSourceContext): Self = StObject.set(x, "sourceContext", value.asInstanceOf[js.Any])
    
    inline def setSourceContextUndefined: Self = StObject.set(x, "sourceContext", js.undefined)
    
    inline def setSyntax(value: String): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
    
    inline def setSyntaxNull: Self = StObject.set(x, "syntax", null)
    
    inline def setSyntaxUndefined: Self = StObject.set(x, "syntax", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
