package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaylistLoaderConfig extends StObject {
  
  var levelLoadingMaxRetry: Double
  
  var levelLoadingMaxRetryTimeout: Double
  
  var levelLoadingRetryDelay: Double
  
  var levelLoadingTimeOut: Double
  
  var manifestLoadingMaxRetry: Double
  
  var manifestLoadingMaxRetryTimeout: Double
  
  var manifestLoadingRetryDelay: Double
  
  var manifestLoadingTimeOut: Double
  
  var pLoader: js.UndefOr[PlaylistLoaderConstructor] = js.undefined
}
object PlaylistLoaderConfig {
  
  inline def apply(
    levelLoadingMaxRetry: Double,
    levelLoadingMaxRetryTimeout: Double,
    levelLoadingRetryDelay: Double,
    levelLoadingTimeOut: Double,
    manifestLoadingMaxRetry: Double,
    manifestLoadingMaxRetryTimeout: Double,
    manifestLoadingRetryDelay: Double,
    manifestLoadingTimeOut: Double
  ): PlaylistLoaderConfig = {
    val __obj = js.Dynamic.literal(levelLoadingMaxRetry = levelLoadingMaxRetry.asInstanceOf[js.Any], levelLoadingMaxRetryTimeout = levelLoadingMaxRetryTimeout.asInstanceOf[js.Any], levelLoadingRetryDelay = levelLoadingRetryDelay.asInstanceOf[js.Any], levelLoadingTimeOut = levelLoadingTimeOut.asInstanceOf[js.Any], manifestLoadingMaxRetry = manifestLoadingMaxRetry.asInstanceOf[js.Any], manifestLoadingMaxRetryTimeout = manifestLoadingMaxRetryTimeout.asInstanceOf[js.Any], manifestLoadingRetryDelay = manifestLoadingRetryDelay.asInstanceOf[js.Any], manifestLoadingTimeOut = manifestLoadingTimeOut.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaylistLoaderConfig]
  }
  
  extension [Self <: PlaylistLoaderConfig](x: Self) {
    
    inline def setLevelLoadingMaxRetry(value: Double): Self = StObject.set(x, "levelLoadingMaxRetry", value.asInstanceOf[js.Any])
    
    inline def setLevelLoadingMaxRetryTimeout(value: Double): Self = StObject.set(x, "levelLoadingMaxRetryTimeout", value.asInstanceOf[js.Any])
    
    inline def setLevelLoadingRetryDelay(value: Double): Self = StObject.set(x, "levelLoadingRetryDelay", value.asInstanceOf[js.Any])
    
    inline def setLevelLoadingTimeOut(value: Double): Self = StObject.set(x, "levelLoadingTimeOut", value.asInstanceOf[js.Any])
    
    inline def setManifestLoadingMaxRetry(value: Double): Self = StObject.set(x, "manifestLoadingMaxRetry", value.asInstanceOf[js.Any])
    
    inline def setManifestLoadingMaxRetryTimeout(value: Double): Self = StObject.set(x, "manifestLoadingMaxRetryTimeout", value.asInstanceOf[js.Any])
    
    inline def setManifestLoadingRetryDelay(value: Double): Self = StObject.set(x, "manifestLoadingRetryDelay", value.asInstanceOf[js.Any])
    
    inline def setManifestLoadingTimeOut(value: Double): Self = StObject.set(x, "manifestLoadingTimeOut", value.asInstanceOf[js.Any])
    
    inline def setPLoader(value: PlaylistLoaderConstructor): Self = StObject.set(x, "pLoader", value.asInstanceOf[js.Any])
    
    inline def setPLoaderUndefined: Self = StObject.set(x, "pLoader", js.undefined)
  }
}
