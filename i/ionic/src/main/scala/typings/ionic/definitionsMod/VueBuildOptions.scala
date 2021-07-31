package typings.ionic.definitionsMod

import typings.ionic.ionicStrings.vue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VueBuildOptions
  extends StObject
     with BuildOptions[vue] {
  
  var configuration: js.UndefOr[String] = js.undefined
  
  var cordovaAssets: js.UndefOr[Boolean] = js.undefined
  
  var sourcemaps: js.UndefOr[Boolean] = js.undefined
}
object VueBuildOptions {
  
  @scala.inline
  def apply(`--`: js.Array[String], engine: String): VueBuildOptions = {
    val __obj = js.Dynamic.literal(engine = engine.asInstanceOf[js.Any])
    __obj.updateDynamic("--")(`--`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("vue")
    __obj.asInstanceOf[VueBuildOptions]
  }
  
  @scala.inline
  implicit class VueBuildOptionsMutableBuilder[Self <: VueBuildOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfiguration(value: String): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
    
    @scala.inline
    def setCordovaAssets(value: Boolean): Self = StObject.set(x, "cordovaAssets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCordovaAssetsUndefined: Self = StObject.set(x, "cordovaAssets", js.undefined)
    
    @scala.inline
    def setSourcemaps(value: Boolean): Self = StObject.set(x, "sourcemaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcemapsUndefined: Self = StObject.set(x, "sourcemaps", js.undefined)
  }
}
