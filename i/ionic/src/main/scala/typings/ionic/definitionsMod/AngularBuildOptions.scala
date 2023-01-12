package typings.ionic.definitionsMod

import typings.ionic.ionicStrings.angular
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AngularBuildOptions
  extends StObject
     with BuildOptions[angular] {
  
  /**
    * The Angular architect configuration to use for builds.
    *
    * The `--prod` command line flag is a shortcut which translates to the
    * 'production' configuration.
    */
  var configuration: js.UndefOr[String] = js.undefined
  
  var cordovaAssets: js.UndefOr[Boolean] = js.undefined
  
  var sourcemaps: js.UndefOr[Boolean] = js.undefined
  
  var watch: js.UndefOr[Boolean] = js.undefined
}
object AngularBuildOptions {
  
  inline def apply(`--`: js.Array[String], engine: String): AngularBuildOptions = {
    val __obj = js.Dynamic.literal(engine = engine.asInstanceOf[js.Any])
    __obj.updateDynamic("--")(`--`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("angular")
    __obj.asInstanceOf[AngularBuildOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AngularBuildOptions] (val x: Self) extends AnyVal {
    
    inline def setConfiguration(value: String): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
    
    inline def setCordovaAssets(value: Boolean): Self = StObject.set(x, "cordovaAssets", value.asInstanceOf[js.Any])
    
    inline def setCordovaAssetsUndefined: Self = StObject.set(x, "cordovaAssets", js.undefined)
    
    inline def setSourcemaps(value: Boolean): Self = StObject.set(x, "sourcemaps", value.asInstanceOf[js.Any])
    
    inline def setSourcemapsUndefined: Self = StObject.set(x, "sourcemaps", js.undefined)
    
    inline def setWatch(value: Boolean): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
    
    inline def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
  }
}
