package typings.ionic.definitionsMod

import typings.ionic.ionicStrings.`ionic-angular`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IonicAngularBuildOptions extends BuildOptions[`ionic-angular`] {
  
  var aot: Boolean = js.native
  
  var env: js.UndefOr[String] = js.native
  
  var minifycss: Boolean = js.native
  
  var minifyjs: Boolean = js.native
  
  var optimizejs: Boolean = js.native
  
  var prod: Boolean = js.native
  
  var sourcemaps: js.UndefOr[Boolean] = js.native
}
object IonicAngularBuildOptions {
  
  @scala.inline
  def apply(
    `--`: js.Array[String],
    aot: Boolean,
    engine: String,
    minifycss: Boolean,
    minifyjs: Boolean,
    optimizejs: Boolean,
    prod: Boolean,
    `type`: `ionic-angular`
  ): IonicAngularBuildOptions = {
    val __obj = js.Dynamic.literal(aot = aot.asInstanceOf[js.Any], engine = engine.asInstanceOf[js.Any], minifycss = minifycss.asInstanceOf[js.Any], minifyjs = minifyjs.asInstanceOf[js.Any], optimizejs = optimizejs.asInstanceOf[js.Any], prod = prod.asInstanceOf[js.Any])
    __obj.updateDynamic("--")(`--`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonicAngularBuildOptions]
  }
  
  @scala.inline
  implicit class IonicAngularBuildOptionsMutableBuilder[Self <: IonicAngularBuildOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAot(value: Boolean): Self = StObject.set(x, "aot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnv(value: String): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    @scala.inline
    def setMinifycss(value: Boolean): Self = StObject.set(x, "minifycss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinifyjs(value: Boolean): Self = StObject.set(x, "minifyjs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptimizejs(value: Boolean): Self = StObject.set(x, "optimizejs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProd(value: Boolean): Self = StObject.set(x, "prod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcemaps(value: Boolean): Self = StObject.set(x, "sourcemaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcemapsUndefined: Self = StObject.set(x, "sourcemaps", js.undefined)
  }
}
