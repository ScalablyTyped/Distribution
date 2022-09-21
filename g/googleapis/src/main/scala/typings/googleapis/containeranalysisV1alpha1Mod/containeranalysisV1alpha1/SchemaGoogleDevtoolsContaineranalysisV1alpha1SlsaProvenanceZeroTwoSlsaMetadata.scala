package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleDevtoolsContaineranalysisV1alpha1SlsaProvenanceZeroTwoSlsaMetadata extends StObject {
  
  /**
    * The timestamp of when the build completed.
    */
  var buildFinishedOn: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identifies this particular build invocation, which can be useful for finding associated logs or other ad-hoc analysis.
    */
  var buildInvocationId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The timestamp of when the build started.
    */
  var buildStartedOn: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Indicates that the builder claims certain fields in this message to be complete.
    */
  var completeness: js.UndefOr[
    SchemaGoogleDevtoolsContaineranalysisV1alpha1SlsaProvenanceZeroTwoSlsaCompleteness
  ] = js.undefined
  
  /**
    * If true, the builder claims that running invocation on materials will produce bit-for-bit identical output.
    */
  var reproducible: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleDevtoolsContaineranalysisV1alpha1SlsaProvenanceZeroTwoSlsaMetadata {
  
  inline def apply(): SchemaGoogleDevtoolsContaineranalysisV1alpha1SlsaProvenanceZeroTwoSlsaMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsContaineranalysisV1alpha1SlsaProvenanceZeroTwoSlsaMetadata]
  }
  
  extension [Self <: SchemaGoogleDevtoolsContaineranalysisV1alpha1SlsaProvenanceZeroTwoSlsaMetadata](x: Self) {
    
    inline def setBuildFinishedOn(value: String): Self = StObject.set(x, "buildFinishedOn", value.asInstanceOf[js.Any])
    
    inline def setBuildFinishedOnNull: Self = StObject.set(x, "buildFinishedOn", null)
    
    inline def setBuildFinishedOnUndefined: Self = StObject.set(x, "buildFinishedOn", js.undefined)
    
    inline def setBuildInvocationId(value: String): Self = StObject.set(x, "buildInvocationId", value.asInstanceOf[js.Any])
    
    inline def setBuildInvocationIdNull: Self = StObject.set(x, "buildInvocationId", null)
    
    inline def setBuildInvocationIdUndefined: Self = StObject.set(x, "buildInvocationId", js.undefined)
    
    inline def setBuildStartedOn(value: String): Self = StObject.set(x, "buildStartedOn", value.asInstanceOf[js.Any])
    
    inline def setBuildStartedOnNull: Self = StObject.set(x, "buildStartedOn", null)
    
    inline def setBuildStartedOnUndefined: Self = StObject.set(x, "buildStartedOn", js.undefined)
    
    inline def setCompleteness(value: SchemaGoogleDevtoolsContaineranalysisV1alpha1SlsaProvenanceZeroTwoSlsaCompleteness): Self = StObject.set(x, "completeness", value.asInstanceOf[js.Any])
    
    inline def setCompletenessUndefined: Self = StObject.set(x, "completeness", js.undefined)
    
    inline def setReproducible(value: Boolean): Self = StObject.set(x, "reproducible", value.asInstanceOf[js.Any])
    
    inline def setReproducibleNull: Self = StObject.set(x, "reproducible", null)
    
    inline def setReproducibleUndefined: Self = StObject.set(x, "reproducible", js.undefined)
  }
}
