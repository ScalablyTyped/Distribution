package typings.googleapis.runV1alpha1Mod.runV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ServiceSpec holds the desired state of the Route (from the client), which
  * is used to manipulate the underlying Route and Configuration(s).
  */
@js.native
trait SchemaServiceSpec extends StObject {
  
  /**
    * Deprecated and not currently populated by Cloud Run. See
    * metadata.generation instead, which is the sequence number containing the
    * latest generation of the desired state.  Read-only.
    */
  var generation: js.UndefOr[Double] = js.native
  
  /**
    * Manual contains the options for configuring a manual service. See
    * ServiceSpec for more details.  Not currently supported by Cloud Run.
    */
  var manual: js.UndefOr[SchemaServiceSpecManualType] = js.native
  
  /**
    * Pins this service to a specific revision name. The revision must be owned
    * by the configuration provided.  Deprecated and not supported by Cloud
    * Run. +optional
    */
  var pinned: js.UndefOr[SchemaServiceSpecPinnedType] = js.native
  
  /**
    * Release enables gradual promotion of new revisions by allowing traffic to
    * be split between two revisions. This type replaces the deprecated Pinned
    * type.  Not currently supported by Cloud Run.
    */
  var release: js.UndefOr[SchemaServiceSpecReleaseType] = js.native
  
  /**
    * RunLatest defines a simple Service. It will automatically configure a
    * route that keeps the latest ready revision from the supplied
    * configuration running. +optional
    */
  var runLatest: js.UndefOr[SchemaServiceSpecRunLatest] = js.native
}
object SchemaServiceSpec {
  
  @scala.inline
  def apply(): SchemaServiceSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServiceSpec]
  }
  
  @scala.inline
  implicit class SchemaServiceSpecMutableBuilder[Self <: SchemaServiceSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGeneration(value: Double): Self = StObject.set(x, "generation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerationUndefined: Self = StObject.set(x, "generation", js.undefined)
    
    @scala.inline
    def setManual(value: SchemaServiceSpecManualType): Self = StObject.set(x, "manual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManualUndefined: Self = StObject.set(x, "manual", js.undefined)
    
    @scala.inline
    def setPinned(value: SchemaServiceSpecPinnedType): Self = StObject.set(x, "pinned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinnedUndefined: Self = StObject.set(x, "pinned", js.undefined)
    
    @scala.inline
    def setRelease(value: SchemaServiceSpecReleaseType): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseUndefined: Self = StObject.set(x, "release", js.undefined)
    
    @scala.inline
    def setRunLatest(value: SchemaServiceSpecRunLatest): Self = StObject.set(x, "runLatest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunLatestUndefined: Self = StObject.set(x, "runLatest", js.undefined)
  }
}
