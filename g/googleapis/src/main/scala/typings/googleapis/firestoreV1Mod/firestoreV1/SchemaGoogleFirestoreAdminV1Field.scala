package typings.googleapis.firestoreV1Mod.firestoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleFirestoreAdminV1Field extends StObject {
  
  /**
    * The index configuration for this field. If unset, field indexing will revert to the configuration defined by the `ancestor_field`. To explicitly remove all indexes for this field, specify an index config with an empty list of indexes.
    */
  var indexConfig: js.UndefOr[SchemaGoogleFirestoreAdminV1IndexConfig] = js.undefined
  
  /**
    * Required. A field name of the form `projects/{project_id\}/databases/{database_id\}/collectionGroups/{collection_id\}/fields/{field_path\}` A field path may be a simple field name, e.g. `address` or a path to fields within map_value , e.g. `address.city`, or a special field path. The only valid special field is `*`, which represents any field. Field paths may be quoted using ` (backtick). The only character that needs to be escaped within a quoted field path is the backtick character itself, escaped using a backslash. Special characters in field paths that must be quoted include: `*`, `.`, ``` (backtick), `[`, `]`, as well as any ascii symbolic characters. Examples: (Note: Comments here are written in markdown syntax, so there is an additional layer of backticks to represent a code block) `\`address.city\`` represents a field named `address.city`, not the map key `city` in the field `address`. `\`*\`` represents a field named `*`, not any field. A special `Field` contains the default indexing settings for all fields. This field's resource name is: `projects/{project_id\}/databases/{database_id\}/collectionGroups/__default__/fields/x` Indexes defined on this `Field` will be applied to all fields which do not have their own `Field` index configuration.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The TTL configuration for this `Field`. Setting or unsetting this will enable or disable the TTL for documents that have this `Field`.
    */
  var ttlConfig: js.UndefOr[SchemaGoogleFirestoreAdminV1TtlConfig] = js.undefined
}
object SchemaGoogleFirestoreAdminV1Field {
  
  inline def apply(): SchemaGoogleFirestoreAdminV1Field = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirestoreAdminV1Field]
  }
  
  extension [Self <: SchemaGoogleFirestoreAdminV1Field](x: Self) {
    
    inline def setIndexConfig(value: SchemaGoogleFirestoreAdminV1IndexConfig): Self = StObject.set(x, "indexConfig", value.asInstanceOf[js.Any])
    
    inline def setIndexConfigUndefined: Self = StObject.set(x, "indexConfig", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTtlConfig(value: SchemaGoogleFirestoreAdminV1TtlConfig): Self = StObject.set(x, "ttlConfig", value.asInstanceOf[js.Any])
    
    inline def setTtlConfigUndefined: Self = StObject.set(x, "ttlConfig", js.undefined)
  }
}
