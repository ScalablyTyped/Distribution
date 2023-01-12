package typings.maximMazurokGapiClientCivicinfo.gapi.client.civicinfo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureIdProto extends StObject {
  
  /**
    * The S2CellId corresponding to the approximate location of this feature as of when it was first created. This can be of variable accuracy, ranging from the exact centroid of the
    * feature at creation, a very large S2 Cell, or even being completely randomized for locationless features. Cell ids have the nice property that they follow a space-filling curve over
    * the surface of the earth. (See s2cellid.h for details.) WARNING: Clients should only use cell IDs to perform spatial locality optimizations. There is no strict guarantee that the
    * cell ID of a feature is related to the current geometry of the feature in any way.
    */
  var cellId: js.UndefOr[String] = js.undefined
  
  /**
    * A 64-bit fingerprint used to identify features. Most clients should rely on MapFacts or OneRing to choose fingerprints. If creating new fprints, the strategy should be chosen so
    * that the chance of collision is remote or non-existent, and the distribution should be reasonably uniform. For example, if the source data assigns unique ids to features, then a
    * fingerprint of the provider name, version, and source id is sufficient.
    */
  var fprint: js.UndefOr[String] = js.undefined
  
  /** A place for clients to attach arbitrary data to a feature ID. Never set in MapFacts. */
  var temporaryData: js.UndefOr[Any] = js.undefined
}
object FeatureIdProto {
  
  inline def apply(): FeatureIdProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureIdProto]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FeatureIdProto] (val x: Self) extends AnyVal {
    
    inline def setCellId(value: String): Self = StObject.set(x, "cellId", value.asInstanceOf[js.Any])
    
    inline def setCellIdUndefined: Self = StObject.set(x, "cellId", js.undefined)
    
    inline def setFprint(value: String): Self = StObject.set(x, "fprint", value.asInstanceOf[js.Any])
    
    inline def setFprintUndefined: Self = StObject.set(x, "fprint", js.undefined)
    
    inline def setTemporaryData(value: Any): Self = StObject.set(x, "temporaryData", value.asInstanceOf[js.Any])
    
    inline def setTemporaryDataUndefined: Self = StObject.set(x, "temporaryData", js.undefined)
  }
}
