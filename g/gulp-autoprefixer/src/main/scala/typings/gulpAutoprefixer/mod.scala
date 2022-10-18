package typings.gulpAutoprefixer

import typings.gulpAutoprefixer.gulpAutoprefixerBooleans.`false`
import typings.gulpAutoprefixer.gulpAutoprefixerStrings.`no-2009`
import typings.gulpAutoprefixer.gulpAutoprefixerStrings.`no-autoplace`
import typings.gulpAutoprefixer.gulpAutoprefixerStrings.autoplace
import typings.node.NodeJS.ReadWriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): ReadWriteStream = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[ReadWriteStream]
  inline def apply(opts: Options): ReadWriteStream = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[ReadWriteStream]
  
  @JSImport("gulp-autoprefixer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var add: js.UndefOr[Boolean] = js.undefined
    
    var browsers: js.UndefOr[js.Array[String]] = js.undefined
    
    var cascade: js.UndefOr[Boolean] = js.undefined
    
    var env: js.UndefOr[String] = js.undefined
    
    var flexbox: js.UndefOr[Boolean | `no-2009`] = js.undefined
    
    var grid: js.UndefOr[`false` | autoplace | `no-autoplace`] = js.undefined
    
    var ignoreUnknownVersions: js.UndefOr[Boolean] = js.undefined
    
    var remove: js.UndefOr[Boolean] = js.undefined
    
    var stats: js.UndefOr[js.Object] = js.undefined
    
    var supports: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAdd(value: Boolean): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
      
      inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
      
      inline def setBrowsers(value: js.Array[String]): Self = StObject.set(x, "browsers", value.asInstanceOf[js.Any])
      
      inline def setBrowsersUndefined: Self = StObject.set(x, "browsers", js.undefined)
      
      inline def setBrowsersVarargs(value: String*): Self = StObject.set(x, "browsers", js.Array(value*))
      
      inline def setCascade(value: Boolean): Self = StObject.set(x, "cascade", value.asInstanceOf[js.Any])
      
      inline def setCascadeUndefined: Self = StObject.set(x, "cascade", js.undefined)
      
      inline def setEnv(value: String): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setFlexbox(value: Boolean | `no-2009`): Self = StObject.set(x, "flexbox", value.asInstanceOf[js.Any])
      
      inline def setFlexboxUndefined: Self = StObject.set(x, "flexbox", js.undefined)
      
      inline def setGrid(value: `false` | autoplace | `no-autoplace`): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      inline def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
      
      inline def setIgnoreUnknownVersions(value: Boolean): Self = StObject.set(x, "ignoreUnknownVersions", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUnknownVersionsUndefined: Self = StObject.set(x, "ignoreUnknownVersions", js.undefined)
      
      inline def setRemove(value: Boolean): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
      
      inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
      
      inline def setStats(value: js.Object): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
      
      inline def setSupports(value: Boolean): Self = StObject.set(x, "supports", value.asInstanceOf[js.Any])
      
      inline def setSupportsUndefined: Self = StObject.set(x, "supports", js.undefined)
    }
  }
}
