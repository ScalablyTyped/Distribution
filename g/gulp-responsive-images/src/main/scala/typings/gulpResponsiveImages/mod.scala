package typings.gulpResponsiveImages

import org.scalablytyped.runtime.StringDictionary
import typings.gm.mod.FilterType
import typings.gm.mod.GravityDirection
import typings.gulpRename.mod.Options
import typings.gulpRename.mod.ParsedPath
import typings.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gulp-responsive-images", JSImport.Namespace)
  @js.native
  def apply(configs: Matchers): Transform = js.native
  
  type Matchers = StringDictionary[js.Array[Settings]]
  
  type Rename = String | (js.Function1[/* path */ ParsedPath, js.Any]) | Options
  
  type SamplingFactor = js.Tuple2[Double, Double]
  
  @js.native
  trait Settings extends StObject {
    
    var crop: js.UndefOr[Boolean] = js.native
    
    var filter: js.UndefOr[FilterType] = js.native
    
    var format: js.UndefOr[String] = js.native
    
    var gravity: js.UndefOr[GravityDirection] = js.native
    
    var height: js.UndefOr[Double] = js.native
    
    var overwrite: js.UndefOr[Boolean] = js.native
    
    var percentage: js.UndefOr[Double] = js.native
    
    var quality: js.UndefOr[Double] = js.native
    
    var rename: js.UndefOr[Rename] = js.native
    
    var samplingFactor: js.UndefOr[SamplingFactor] = js.native
    
    var sharpen: js.UndefOr[Boolean] = js.native
    
    var suffix: js.UndefOr[String] = js.native
    
    var upscale: js.UndefOr[Boolean] = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  object Settings {
    
    @scala.inline
    def apply(): Settings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Settings]
    }
    
    @scala.inline
    implicit class SettingsMutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCrop(value: Boolean): Self = StObject.set(x, "crop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCropUndefined: Self = StObject.set(x, "crop", js.undefined)
      
      @scala.inline
      def setFilter(value: FilterType): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setGravity(value: GravityDirection): Self = StObject.set(x, "gravity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGravityUndefined: Self = StObject.set(x, "gravity", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
      
      @scala.inline
      def setPercentage(value: Double): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPercentageUndefined: Self = StObject.set(x, "percentage", js.undefined)
      
      @scala.inline
      def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      @scala.inline
      def setRename(value: Rename): Self = StObject.set(x, "rename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenameFunction1(value: /* path */ ParsedPath => js.Any): Self = StObject.set(x, "rename", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenameUndefined: Self = StObject.set(x, "rename", js.undefined)
      
      @scala.inline
      def setSamplingFactor(value: SamplingFactor): Self = StObject.set(x, "samplingFactor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSamplingFactorUndefined: Self = StObject.set(x, "samplingFactor", js.undefined)
      
      @scala.inline
      def setSharpen(value: Boolean): Self = StObject.set(x, "sharpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSharpenUndefined: Self = StObject.set(x, "sharpen", js.undefined)
      
      @scala.inline
      def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      @scala.inline
      def setUpscale(value: Boolean): Self = StObject.set(x, "upscale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpscaleUndefined: Self = StObject.set(x, "upscale", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
