package typings.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleDevtoolsRemotebuildbotCommandEvents extends StObject {
  
  /**
    * Indicates if and how Container Manager is being used for task execution.
    */
  var cmUsage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Indicates whether we are using a cached Docker image (true) or had to pull the Docker image (false) for this command.
    */
  var dockerCacheHit: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Docker Image name.
    */
  var dockerImageName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The input cache miss ratio.
    */
  var inputCacheMiss: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The number of errors reported.
    */
  var numErrors: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The number of warnings reported.
    */
  var numWarnings: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Indicates whether output files and/or output directories were found relative to the execution root or to the user provided work directory or both or none.
    */
  var outputLocation: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Indicates whether an asynchronous container was used for execution.
    */
  var usedAsyncContainer: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleDevtoolsRemotebuildbotCommandEvents {
  
  inline def apply(): SchemaGoogleDevtoolsRemotebuildbotCommandEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemotebuildbotCommandEvents]
  }
  
  extension [Self <: SchemaGoogleDevtoolsRemotebuildbotCommandEvents](x: Self) {
    
    inline def setCmUsage(value: String): Self = StObject.set(x, "cmUsage", value.asInstanceOf[js.Any])
    
    inline def setCmUsageNull: Self = StObject.set(x, "cmUsage", null)
    
    inline def setCmUsageUndefined: Self = StObject.set(x, "cmUsage", js.undefined)
    
    inline def setDockerCacheHit(value: Boolean): Self = StObject.set(x, "dockerCacheHit", value.asInstanceOf[js.Any])
    
    inline def setDockerCacheHitNull: Self = StObject.set(x, "dockerCacheHit", null)
    
    inline def setDockerCacheHitUndefined: Self = StObject.set(x, "dockerCacheHit", js.undefined)
    
    inline def setDockerImageName(value: String): Self = StObject.set(x, "dockerImageName", value.asInstanceOf[js.Any])
    
    inline def setDockerImageNameNull: Self = StObject.set(x, "dockerImageName", null)
    
    inline def setDockerImageNameUndefined: Self = StObject.set(x, "dockerImageName", js.undefined)
    
    inline def setInputCacheMiss(value: Double): Self = StObject.set(x, "inputCacheMiss", value.asInstanceOf[js.Any])
    
    inline def setInputCacheMissNull: Self = StObject.set(x, "inputCacheMiss", null)
    
    inline def setInputCacheMissUndefined: Self = StObject.set(x, "inputCacheMiss", js.undefined)
    
    inline def setNumErrors(value: String): Self = StObject.set(x, "numErrors", value.asInstanceOf[js.Any])
    
    inline def setNumErrorsNull: Self = StObject.set(x, "numErrors", null)
    
    inline def setNumErrorsUndefined: Self = StObject.set(x, "numErrors", js.undefined)
    
    inline def setNumWarnings(value: String): Self = StObject.set(x, "numWarnings", value.asInstanceOf[js.Any])
    
    inline def setNumWarningsNull: Self = StObject.set(x, "numWarnings", null)
    
    inline def setNumWarningsUndefined: Self = StObject.set(x, "numWarnings", js.undefined)
    
    inline def setOutputLocation(value: String): Self = StObject.set(x, "outputLocation", value.asInstanceOf[js.Any])
    
    inline def setOutputLocationNull: Self = StObject.set(x, "outputLocation", null)
    
    inline def setOutputLocationUndefined: Self = StObject.set(x, "outputLocation", js.undefined)
    
    inline def setUsedAsyncContainer(value: Boolean): Self = StObject.set(x, "usedAsyncContainer", value.asInstanceOf[js.Any])
    
    inline def setUsedAsyncContainerNull: Self = StObject.set(x, "usedAsyncContainer", null)
    
    inline def setUsedAsyncContainerUndefined: Self = StObject.set(x, "usedAsyncContainer", js.undefined)
  }
}
