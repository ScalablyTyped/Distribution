package typings.googleapis.runV1alpha1Mod.runV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ConfigurationSpec holds the desired state of the Configuration (from the
  * client).
  */
trait SchemaConfigurationSpec extends StObject {
  
  /**
    * Deprecated and not currently populated by Cloud Run. See
    * metadata.generation instead, which is the sequence number containing the
    * latest generation of the desired state.  Read-only.
    */
  var generation: js.UndefOr[Double] = js.undefined
  
  /**
    * RevisionTemplate holds the latest specification for the Revision to be
    * stamped out. The template references the container image, and may also
    * include labels and annotations that should be attached to the Revision.
    * To correlate a Revision, and/or to force a Revision to be created when
    * the spec doesn&#39;t otherwise change, a nonce label may be provided in
    * the template metadata. For more details, see:
    * https://github.com/knative/serving/blob/master/docs/client-conventions.md#associate-modifications-with-revisions
    * Cloud Run does not currently support referencing a build that is
    * responsible for materializing the container image from source.
    */
  var revisionTemplate: js.UndefOr[SchemaRevisionTemplate] = js.undefined
}
object SchemaConfigurationSpec {
  
  @scala.inline
  def apply(): SchemaConfigurationSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConfigurationSpec]
  }
  
  @scala.inline
  implicit class SchemaConfigurationSpecMutableBuilder[Self <: SchemaConfigurationSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGeneration(value: Double): Self = StObject.set(x, "generation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerationUndefined: Self = StObject.set(x, "generation", js.undefined)
    
    @scala.inline
    def setRevisionTemplate(value: SchemaRevisionTemplate): Self = StObject.set(x, "revisionTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionTemplateUndefined: Self = StObject.set(x, "revisionTemplate", js.undefined)
  }
}
