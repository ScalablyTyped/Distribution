package typings.googleapis.proximitybeaconV1beta1Mod.proximitybeaconV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An attachment namespace defines read and write access for all the
  * attachments created under it. Each namespace is globally unique, and owned
  * by one project which is the only project that can create attachments under
  * it.
  */
trait SchemaNamespace extends StObject {
  
  /**
    * Resource name of this namespace. Namespaces names have the format:
    * &lt;code&gt;namespaces/&lt;var&gt;namespace&lt;/var&gt;&lt;/code&gt;.
    */
  var namespaceName: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies what clients may receive attachments under this namespace via
    * `beaconinfo.getforobserved`.
    */
  var servingVisibility: js.UndefOr[String] = js.undefined
}
object SchemaNamespace {
  
  inline def apply(): SchemaNamespace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNamespace]
  }
  
  extension [Self <: SchemaNamespace](x: Self) {
    
    inline def setNamespaceName(value: String): Self = StObject.set(x, "namespaceName", value.asInstanceOf[js.Any])
    
    inline def setNamespaceNameUndefined: Self = StObject.set(x, "namespaceName", js.undefined)
    
    inline def setServingVisibility(value: String): Self = StObject.set(x, "servingVisibility", value.asInstanceOf[js.Any])
    
    inline def setServingVisibilityUndefined: Self = StObject.set(x, "servingVisibility", js.undefined)
  }
}
