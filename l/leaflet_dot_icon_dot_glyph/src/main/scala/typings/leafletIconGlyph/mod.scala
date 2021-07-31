package typings.leafletIconGlyph

import typings.leaflet.mod.BaseIconOptions
import typings.leaflet.mod.IconOptions
import typings.leaflet.mod.PointExpression
import typings.leafletIconGlyph.mod.Icon_.Glyph
import typings.leafletIconGlyph.mod.Icon_.GlyphIconOptions
import typings.leafletIconGlyph.mod.Icon_.GlyphOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  object Icon_ {
    
    @JSImport("leaflet", "Icon.Glyph")
    @js.native
    class Glyph ()
      extends typings.leaflet.mod.Icon_[IconOptions] {
      def this(options: GlyphIconOptions) = this()
      def this(options: GlyphOptions) = this()
      
      @JSName("options")
      var options_Glyph: GlyphIconOptions = js.native
    }
    
    trait GlyphIconOptions
      extends StObject
         with IconOptions {
      
      var bgPos: js.UndefOr[PointExpression] = js.undefined
      
      var bgSize: js.UndefOr[PointExpression] = js.undefined
      
      var glyph: js.UndefOr[String] = js.undefined
      
      var glyphAnchor: js.UndefOr[PointExpression] = js.undefined
      
      var glyphColor: js.UndefOr[String] = js.undefined
      
      var glyphSize: js.UndefOr[String] = js.undefined
      
      var prefix: js.UndefOr[String] = js.undefined
    }
    object GlyphIconOptions {
      
      @scala.inline
      def apply(iconUrl: String): GlyphIconOptions = {
        val __obj = js.Dynamic.literal(iconUrl = iconUrl.asInstanceOf[js.Any])
        __obj.asInstanceOf[GlyphIconOptions]
      }
      
      @scala.inline
      implicit class GlyphIconOptionsMutableBuilder[Self <: GlyphIconOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBgPos(value: PointExpression): Self = StObject.set(x, "bgPos", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBgPosUndefined: Self = StObject.set(x, "bgPos", js.undefined)
        
        @scala.inline
        def setBgSize(value: PointExpression): Self = StObject.set(x, "bgSize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBgSizeUndefined: Self = StObject.set(x, "bgSize", js.undefined)
        
        @scala.inline
        def setGlyph(value: String): Self = StObject.set(x, "glyph", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGlyphAnchor(value: PointExpression): Self = StObject.set(x, "glyphAnchor", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGlyphAnchorUndefined: Self = StObject.set(x, "glyphAnchor", js.undefined)
        
        @scala.inline
        def setGlyphColor(value: String): Self = StObject.set(x, "glyphColor", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGlyphColorUndefined: Self = StObject.set(x, "glyphColor", js.undefined)
        
        @scala.inline
        def setGlyphSize(value: String): Self = StObject.set(x, "glyphSize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGlyphSizeUndefined: Self = StObject.set(x, "glyphSize", js.undefined)
        
        @scala.inline
        def setGlyphUndefined: Self = StObject.set(x, "glyph", js.undefined)
        
        @scala.inline
        def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      }
    }
    
    trait GlyphOptions
      extends StObject
         with BaseIconOptions {
      
      var bgPos: js.UndefOr[PointExpression] = js.undefined
      
      var bgSize: js.UndefOr[PointExpression] = js.undefined
      
      var glyph: js.UndefOr[String] = js.undefined
      
      var glyphAnchor: js.UndefOr[PointExpression] = js.undefined
      
      var glyphColor: js.UndefOr[String] = js.undefined
      
      var glyphSize: js.UndefOr[String] = js.undefined
      
      var prefix: js.UndefOr[String] = js.undefined
    }
    object GlyphOptions {
      
      @scala.inline
      def apply(): GlyphOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[GlyphOptions]
      }
      
      @scala.inline
      implicit class GlyphOptionsMutableBuilder[Self <: GlyphOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBgPos(value: PointExpression): Self = StObject.set(x, "bgPos", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBgPosUndefined: Self = StObject.set(x, "bgPos", js.undefined)
        
        @scala.inline
        def setBgSize(value: PointExpression): Self = StObject.set(x, "bgSize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBgSizeUndefined: Self = StObject.set(x, "bgSize", js.undefined)
        
        @scala.inline
        def setGlyph(value: String): Self = StObject.set(x, "glyph", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGlyphAnchor(value: PointExpression): Self = StObject.set(x, "glyphAnchor", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGlyphAnchorUndefined: Self = StObject.set(x, "glyphAnchor", js.undefined)
        
        @scala.inline
        def setGlyphColor(value: String): Self = StObject.set(x, "glyphColor", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGlyphColorUndefined: Self = StObject.set(x, "glyphColor", js.undefined)
        
        @scala.inline
        def setGlyphSize(value: String): Self = StObject.set(x, "glyphSize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGlyphSizeUndefined: Self = StObject.set(x, "glyphSize", js.undefined)
        
        @scala.inline
        def setGlyphUndefined: Self = StObject.set(x, "glyph", js.undefined)
        
        @scala.inline
        def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      }
    }
  }
  
  object icon {
    
    @JSImport("leaflet", "icon")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def glyph(): Glyph = ^.asInstanceOf[js.Dynamic].applyDynamic("glyph")().asInstanceOf[Glyph]
    @scala.inline
    def glyph(options: GlyphIconOptions): Glyph = ^.asInstanceOf[js.Dynamic].applyDynamic("glyph")(options.asInstanceOf[js.Any]).asInstanceOf[Glyph]
    @scala.inline
    def glyph(options: GlyphOptions): Glyph = ^.asInstanceOf[js.Dynamic].applyDynamic("glyph")(options.asInstanceOf[js.Any]).asInstanceOf[Glyph]
  }
}
