package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVersion extends StObject {
  
  /**
    * Used to correct mistakes in the version numbering scheme.
    */
  var epoch: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Whether this version is vulnerable, when defining the version bounds. For example, if the minimum version is 2.0, inclusive=true would say 2.0 is vulnerable, while inclusive=false would say it's not
    */
  var inclusive: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Distinguish between sentinel MIN/MAX versions and normal versions. If kind is not NORMAL, then the other fields are ignored.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The main part of the version name.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The iteration of the package build from the above version.
    */
  var revision: js.UndefOr[String | Null] = js.undefined
}
object SchemaVersion {
  
  inline def apply(): SchemaVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVersion]
  }
  
  extension [Self <: SchemaVersion](x: Self) {
    
    inline def setEpoch(value: Double): Self = StObject.set(x, "epoch", value.asInstanceOf[js.Any])
    
    inline def setEpochNull: Self = StObject.set(x, "epoch", null)
    
    inline def setEpochUndefined: Self = StObject.set(x, "epoch", js.undefined)
    
    inline def setInclusive(value: Boolean): Self = StObject.set(x, "inclusive", value.asInstanceOf[js.Any])
    
    inline def setInclusiveNull: Self = StObject.set(x, "inclusive", null)
    
    inline def setInclusiveUndefined: Self = StObject.set(x, "inclusive", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRevision(value: String): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    inline def setRevisionNull: Self = StObject.set(x, "revision", null)
    
    inline def setRevisionUndefined: Self = StObject.set(x, "revision", js.undefined)
  }
}
