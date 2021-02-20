package typings.googleapis.proximitybeaconV1beta1Mod.proximitybeaconV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An attachment namespace defines read and write access for all the
  * attachments created under it. Each namespace is globally unique, and owned
  * by one project which is the only project that can create attachments under
  * it.
  */
@js.native
trait SchemaNamespace extends StObject {
  
  /**
    * Resource name of this namespace. Namespaces names have the format:
    * &lt;code&gt;namespaces/&lt;var&gt;namespace&lt;/var&gt;&lt;/code&gt;.
    */
  var namespaceName: js.UndefOr[String] = js.native
  
  /**
    * Specifies what clients may receive attachments under this namespace via
    * `beaconinfo.getforobserved`.
    */
  var servingVisibility: js.UndefOr[String] = js.native
}
object SchemaNamespace {
  
  @scala.inline
  def apply(): SchemaNamespace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNamespace]
  }
  
  @scala.inline
  implicit class SchemaNamespaceMutableBuilder[Self <: SchemaNamespace] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNamespaceName(value: String): Self = StObject.set(x, "namespaceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceNameUndefined: Self = StObject.set(x, "namespaceName", js.undefined)
    
    @scala.inline
    def setServingVisibility(value: String): Self = StObject.set(x, "servingVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServingVisibilityUndefined: Self = StObject.set(x, "servingVisibility", js.undefined)
  }
}
