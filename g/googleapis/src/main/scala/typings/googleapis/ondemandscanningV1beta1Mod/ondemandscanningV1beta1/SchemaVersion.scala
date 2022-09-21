package typings.googleapis.ondemandscanningV1beta1Mod.ondemandscanningV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVersion extends StObject {
  
  /**
    * Used to correct mistakes in the version numbering scheme.
    */
  var epoch: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Human readable version string. This string is of the form :- and is only set when kind is NORMAL.
    */
  var fullName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether this version is specifying part of an inclusive range. Grafeas does not have the capability to specify version ranges; instead we have fields that specify start version and end versions. At times this is insufficient - we also need to specify whether the version is included in the range or is excluded from the range. This boolean is expected to be set to true when the version is included in a range.
    */
  var inclusive: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Required. Distinguishes between sentinel MIN/MAX versions and normal versions.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required only when version kind is NORMAL. The main part of the version name.
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
    
    inline def setFullName(value: String): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
    
    inline def setFullNameNull: Self = StObject.set(x, "fullName", null)
    
    inline def setFullNameUndefined: Self = StObject.set(x, "fullName", js.undefined)
    
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
