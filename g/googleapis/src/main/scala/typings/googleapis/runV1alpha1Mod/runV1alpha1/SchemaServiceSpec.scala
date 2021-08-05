package typings.googleapis.runV1alpha1Mod.runV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ServiceSpec holds the desired state of the Route (from the client), which
  * is used to manipulate the underlying Route and Configuration(s).
  */
trait SchemaServiceSpec extends StObject {
  
  /**
    * Deprecated and not currently populated by Cloud Run. See
    * metadata.generation instead, which is the sequence number containing the
    * latest generation of the desired state.  Read-only.
    */
  var generation: js.UndefOr[Double] = js.undefined
  
  /**
    * Manual contains the options for configuring a manual service. See
    * ServiceSpec for more details.  Not currently supported by Cloud Run.
    */
  var manual: js.UndefOr[SchemaServiceSpecManualType] = js.undefined
  
  /**
    * Pins this service to a specific revision name. The revision must be owned
    * by the configuration provided.  Deprecated and not supported by Cloud
    * Run. +optional
    */
  var pinned: js.UndefOr[SchemaServiceSpecPinnedType] = js.undefined
  
  /**
    * Release enables gradual promotion of new revisions by allowing traffic to
    * be split between two revisions. This type replaces the deprecated Pinned
    * type.  Not currently supported by Cloud Run.
    */
  var release: js.UndefOr[SchemaServiceSpecReleaseType] = js.undefined
  
  /**
    * RunLatest defines a simple Service. It will automatically configure a
    * route that keeps the latest ready revision from the supplied
    * configuration running. +optional
    */
  var runLatest: js.UndefOr[SchemaServiceSpecRunLatest] = js.undefined
}
object SchemaServiceSpec {
  
  inline def apply(): SchemaServiceSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServiceSpec]
  }
  
  extension [Self <: SchemaServiceSpec](x: Self) {
    
    inline def setGeneration(value: Double): Self = StObject.set(x, "generation", value.asInstanceOf[js.Any])
    
    inline def setGenerationUndefined: Self = StObject.set(x, "generation", js.undefined)
    
    inline def setManual(value: SchemaServiceSpecManualType): Self = StObject.set(x, "manual", value.asInstanceOf[js.Any])
    
    inline def setManualUndefined: Self = StObject.set(x, "manual", js.undefined)
    
    inline def setPinned(value: SchemaServiceSpecPinnedType): Self = StObject.set(x, "pinned", value.asInstanceOf[js.Any])
    
    inline def setPinnedUndefined: Self = StObject.set(x, "pinned", js.undefined)
    
    inline def setRelease(value: SchemaServiceSpecReleaseType): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
    
    inline def setReleaseUndefined: Self = StObject.set(x, "release", js.undefined)
    
    inline def setRunLatest(value: SchemaServiceSpecRunLatest): Self = StObject.set(x, "runLatest", value.asInstanceOf[js.Any])
    
    inline def setRunLatestUndefined: Self = StObject.set(x, "runLatest", js.undefined)
  }
}
