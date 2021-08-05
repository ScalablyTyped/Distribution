package typings.ionic.definitionsMod

import typings.ionic.ionicStrings.`ionic-angular`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonicAngularBuildOptions
  extends StObject
     with BuildOptions[`ionic-angular`] {
  
  var aot: Boolean
  
  var env: js.UndefOr[String] = js.undefined
  
  var minifycss: Boolean
  
  var minifyjs: Boolean
  
  var optimizejs: Boolean
  
  var prod: Boolean
  
  var sourcemaps: js.UndefOr[Boolean] = js.undefined
}
object IonicAngularBuildOptions {
  
  inline def apply(
    `--`: js.Array[String],
    aot: Boolean,
    engine: String,
    minifycss: Boolean,
    minifyjs: Boolean,
    optimizejs: Boolean,
    prod: Boolean
  ): IonicAngularBuildOptions = {
    val __obj = js.Dynamic.literal(aot = aot.asInstanceOf[js.Any], engine = engine.asInstanceOf[js.Any], minifycss = minifycss.asInstanceOf[js.Any], minifyjs = minifyjs.asInstanceOf[js.Any], optimizejs = optimizejs.asInstanceOf[js.Any], prod = prod.asInstanceOf[js.Any])
    __obj.updateDynamic("--")(`--`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ionic-angular")
    __obj.asInstanceOf[IonicAngularBuildOptions]
  }
  
  extension [Self <: IonicAngularBuildOptions](x: Self) {
    
    inline def setAot(value: Boolean): Self = StObject.set(x, "aot", value.asInstanceOf[js.Any])
    
    inline def setEnv(value: String): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    inline def setMinifycss(value: Boolean): Self = StObject.set(x, "minifycss", value.asInstanceOf[js.Any])
    
    inline def setMinifyjs(value: Boolean): Self = StObject.set(x, "minifyjs", value.asInstanceOf[js.Any])
    
    inline def setOptimizejs(value: Boolean): Self = StObject.set(x, "optimizejs", value.asInstanceOf[js.Any])
    
    inline def setProd(value: Boolean): Self = StObject.set(x, "prod", value.asInstanceOf[js.Any])
    
    inline def setSourcemaps(value: Boolean): Self = StObject.set(x, "sourcemaps", value.asInstanceOf[js.Any])
    
    inline def setSourcemapsUndefined: Self = StObject.set(x, "sourcemaps", js.undefined)
  }
}
