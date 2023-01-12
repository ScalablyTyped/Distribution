package typings.gulpResponsiveImages

import org.scalablytyped.runtime.StringDictionary
import typings.gm.mod.FilterType
import typings.gm.mod.GravityDirection
import typings.gulpRename.mod.Options
import typings.gulpRename.mod.ParsedPath
import typings.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(configs: Matchers): Transform = ^.asInstanceOf[js.Dynamic].apply(configs.asInstanceOf[js.Any]).asInstanceOf[Transform]
  
  @JSImport("gulp-responsive-images", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Matchers = StringDictionary[js.Array[Settings]]
  
  type Rename = String | (js.Function1[/* path */ ParsedPath, Any]) | Options
  
  type SamplingFactor = js.Tuple2[Double, Double]
  
  trait Settings extends StObject {
    
    var crop: js.UndefOr[Boolean] = js.undefined
    
    var filter: js.UndefOr[FilterType] = js.undefined
    
    var format: js.UndefOr[String] = js.undefined
    
    var gravity: js.UndefOr[GravityDirection] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var overwrite: js.UndefOr[Boolean] = js.undefined
    
    var percentage: js.UndefOr[Double] = js.undefined
    
    var quality: js.UndefOr[Double] = js.undefined
    
    var rename: js.UndefOr[Rename] = js.undefined
    
    var samplingFactor: js.UndefOr[SamplingFactor] = js.undefined
    
    var sharpen: js.UndefOr[Boolean] = js.undefined
    
    var suffix: js.UndefOr[String] = js.undefined
    
    var upscale: js.UndefOr[Boolean] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object Settings {
    
    inline def apply(): Settings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Settings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
      
      inline def setCrop(value: Boolean): Self = StObject.set(x, "crop", value.asInstanceOf[js.Any])
      
      inline def setCropUndefined: Self = StObject.set(x, "crop", js.undefined)
      
      inline def setFilter(value: FilterType): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setGravity(value: GravityDirection): Self = StObject.set(x, "gravity", value.asInstanceOf[js.Any])
      
      inline def setGravityUndefined: Self = StObject.set(x, "gravity", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
      
      inline def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
      
      inline def setPercentage(value: Double): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
      
      inline def setPercentageUndefined: Self = StObject.set(x, "percentage", js.undefined)
      
      inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      inline def setRename(value: Rename): Self = StObject.set(x, "rename", value.asInstanceOf[js.Any])
      
      inline def setRenameFunction1(value: /* path */ ParsedPath => Any): Self = StObject.set(x, "rename", js.Any.fromFunction1(value))
      
      inline def setRenameUndefined: Self = StObject.set(x, "rename", js.undefined)
      
      inline def setSamplingFactor(value: SamplingFactor): Self = StObject.set(x, "samplingFactor", value.asInstanceOf[js.Any])
      
      inline def setSamplingFactorUndefined: Self = StObject.set(x, "samplingFactor", js.undefined)
      
      inline def setSharpen(value: Boolean): Self = StObject.set(x, "sharpen", value.asInstanceOf[js.Any])
      
      inline def setSharpenUndefined: Self = StObject.set(x, "sharpen", js.undefined)
      
      inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      inline def setUpscale(value: Boolean): Self = StObject.set(x, "upscale", value.asInstanceOf[js.Any])
      
      inline def setUpscaleUndefined: Self = StObject.set(x, "upscale", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
