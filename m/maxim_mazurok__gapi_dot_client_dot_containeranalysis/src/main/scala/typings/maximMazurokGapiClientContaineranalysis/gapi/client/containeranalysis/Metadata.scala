package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Metadata extends StObject {
  
  /** The timestamp of when the build completed. */
  var buildFinishedOn: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies the particular build invocation, which can be useful for finding associated logs or other ad-hoc analysis. The value SHOULD be globally unique, per in-toto Provenance
    * spec.
    */
  var buildInvocationId: js.UndefOr[String] = js.undefined
  
  /** The timestamp of when the build started. */
  var buildStartedOn: js.UndefOr[String] = js.undefined
  
  /** Indicates that the builder claims certain fields in this message to be complete. */
  var completeness: js.UndefOr[Completeness] = js.undefined
  
  /** If true, the builder claims that running the recipe on materials will produce bit-for-bit identical output. */
  var reproducible: js.UndefOr[Boolean] = js.undefined
}
object Metadata {
  
  inline def apply(): Metadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Metadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Metadata] (val x: Self) extends AnyVal {
    
    inline def setBuildFinishedOn(value: String): Self = StObject.set(x, "buildFinishedOn", value.asInstanceOf[js.Any])
    
    inline def setBuildFinishedOnUndefined: Self = StObject.set(x, "buildFinishedOn", js.undefined)
    
    inline def setBuildInvocationId(value: String): Self = StObject.set(x, "buildInvocationId", value.asInstanceOf[js.Any])
    
    inline def setBuildInvocationIdUndefined: Self = StObject.set(x, "buildInvocationId", js.undefined)
    
    inline def setBuildStartedOn(value: String): Self = StObject.set(x, "buildStartedOn", value.asInstanceOf[js.Any])
    
    inline def setBuildStartedOnUndefined: Self = StObject.set(x, "buildStartedOn", js.undefined)
    
    inline def setCompleteness(value: Completeness): Self = StObject.set(x, "completeness", value.asInstanceOf[js.Any])
    
    inline def setCompletenessUndefined: Self = StObject.set(x, "completeness", js.undefined)
    
    inline def setReproducible(value: Boolean): Self = StObject.set(x, "reproducible", value.asInstanceOf[js.Any])
    
    inline def setReproducibleUndefined: Self = StObject.set(x, "reproducible", js.undefined)
  }
}
