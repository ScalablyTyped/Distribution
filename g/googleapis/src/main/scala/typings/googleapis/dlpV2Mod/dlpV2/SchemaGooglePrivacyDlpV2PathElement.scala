package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A (kind, ID/name) pair used to construct a key path.  If either name or ID
  * is set, the element is complete. If neither is set, the element is
  * incomplete.
  */
@js.native
trait SchemaGooglePrivacyDlpV2PathElement extends StObject {
  
  /**
    * The auto-allocated ID of the entity. Never equal to zero. Values less
    * than zero are discouraged and may not be supported in the future.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The kind of the entity. A kind matching regex `__.*__` is
    * reserved/read-only. A kind must not contain more than 1500 bytes when
    * UTF-8 encoded. Cannot be `&quot;&quot;`.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The name of the entity. A name matching regex `__.*__` is
    * reserved/read-only. A name must not be more than 1500 bytes when UTF-8
    * encoded. Cannot be `&quot;&quot;`.
    */
  var name: js.UndefOr[String] = js.native
}
object SchemaGooglePrivacyDlpV2PathElement {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2PathElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2PathElement]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2PathElementMutableBuilder[Self <: SchemaGooglePrivacyDlpV2PathElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
