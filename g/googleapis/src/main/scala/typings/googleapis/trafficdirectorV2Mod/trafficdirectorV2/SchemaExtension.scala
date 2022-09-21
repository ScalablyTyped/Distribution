package typings.googleapis.trafficdirectorV2Mod.trafficdirectorV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaExtension extends StObject {
  
  /**
    * Category of the extension. Extension category names use reverse DNS notation. For instance "envoy.filters.listener" for Envoy's built-in listener filters or "com.acme.filters.http" for HTTP filters from acme.com vendor. [#comment:
    */
  var category: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Indicates that the extension is present but was disabled via dynamic configuration.
    */
  var disabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * This is the name of the Envoy filter as specified in the Envoy configuration, e.g. envoy.filters.http.router, com.acme.widget.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [#not-implemented-hide:] Type descriptor of extension configuration proto. [#comment:
    */
  var typeDescriptor: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The version is a property of the extension and maintained independently of other extensions and the Envoy API. This field is not set when extension did not provide version information.
    */
  var version: js.UndefOr[SchemaBuildVersion] = js.undefined
}
object SchemaExtension {
  
  inline def apply(): SchemaExtension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExtension]
  }
  
  extension [Self <: SchemaExtension](x: Self) {
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryNull: Self = StObject.set(x, "category", null)
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledNull: Self = StObject.set(x, "disabled", null)
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTypeDescriptor(value: String): Self = StObject.set(x, "typeDescriptor", value.asInstanceOf[js.Any])
    
    inline def setTypeDescriptorNull: Self = StObject.set(x, "typeDescriptor", null)
    
    inline def setTypeDescriptorUndefined: Self = StObject.set(x, "typeDescriptor", js.undefined)
    
    inline def setVersion(value: SchemaBuildVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
