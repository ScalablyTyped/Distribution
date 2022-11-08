package typings.gulpSpritesmith

import typings.gulpSpritesmith.anon.Height
import typings.gulpSpritesmith.anon.Index
import typings.gulpSpritesmith.anon.Sort
import typings.gulpSpritesmith.anon.Width
import typings.gulpSpritesmith.gulpSpritesmithStrings.`alt-diagonal`
import typings.gulpSpritesmith.gulpSpritesmithStrings.`binary-tree`
import typings.gulpSpritesmith.gulpSpritesmithStrings.`left-right`
import typings.gulpSpritesmith.gulpSpritesmithStrings.`top-down`
import typings.gulpSpritesmith.gulpSpritesmithStrings.diagonal
import typings.node.streamMod.Readable
import typings.node.streamMod.Transform
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  // Union type might be better, but in this case it lead to a lot of errors
  // tslint:disable-next-line unified-signatures
  inline def apply(options: GulpSpriteSmithOptions): GulpSpriteSmithResult = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[GulpSpriteSmithResult]
  inline def apply(options: GulpSpriteSmithRetinaOptions): GulpSpriteSmithResult = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[GulpSpriteSmithResult]
  
  @JSImport("gulp.spritesmith", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait GulpSpriteSmithOptions extends StObject {
    
    var algorithm: js.UndefOr[`top-down` | `left-right` | diagonal | `alt-diagonal` | `binary-tree` | String] = js.undefined
    
    var algorithmOpts: js.UndefOr[Sort] = js.undefined
    
    var cssFormat: js.UndefOr[String] = js.undefined
    
    var cssHandlebarsHelpers: js.UndefOr[Record[String, js.Function1[/* repeated */ Any, Any]]] = js.undefined
    
    var cssName: String
    
    var cssOpts: js.UndefOr[Any] = js.undefined
    
    var cssSpritesheetName: js.UndefOr[String] = js.undefined
    
    var cssTemplate: js.UndefOr[String | (js.Function1[/* data */ SpritesmithData, String])] = js.undefined
    
    var cssVarMap: js.UndefOr[js.Function1[/* sprite */ Sprite, Unit]] = js.undefined
    
    var engine: js.UndefOr[String] = js.undefined
    
    var engineOpts: js.UndefOr[Any] = js.undefined
    
    var imgName: String
    
    var imgOpts: js.UndefOr[Any] = js.undefined
    
    var imgPath: js.UndefOr[String] = js.undefined
    
    var padding: js.UndefOr[Double] = js.undefined
  }
  object GulpSpriteSmithOptions {
    
    inline def apply(cssName: String, imgName: String): GulpSpriteSmithOptions = {
      val __obj = js.Dynamic.literal(cssName = cssName.asInstanceOf[js.Any], imgName = imgName.asInstanceOf[js.Any])
      __obj.asInstanceOf[GulpSpriteSmithOptions]
    }
    
    extension [Self <: GulpSpriteSmithOptions](x: Self) {
      
      inline def setAlgorithm(value: `top-down` | `left-right` | diagonal | `alt-diagonal` | `binary-tree` | String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setAlgorithmOpts(value: Sort): Self = StObject.set(x, "algorithmOpts", value.asInstanceOf[js.Any])
      
      inline def setAlgorithmOptsUndefined: Self = StObject.set(x, "algorithmOpts", js.undefined)
      
      inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
      
      inline def setCssFormat(value: String): Self = StObject.set(x, "cssFormat", value.asInstanceOf[js.Any])
      
      inline def setCssFormatUndefined: Self = StObject.set(x, "cssFormat", js.undefined)
      
      inline def setCssHandlebarsHelpers(value: Record[String, js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "cssHandlebarsHelpers", value.asInstanceOf[js.Any])
      
      inline def setCssHandlebarsHelpersUndefined: Self = StObject.set(x, "cssHandlebarsHelpers", js.undefined)
      
      inline def setCssName(value: String): Self = StObject.set(x, "cssName", value.asInstanceOf[js.Any])
      
      inline def setCssOpts(value: Any): Self = StObject.set(x, "cssOpts", value.asInstanceOf[js.Any])
      
      inline def setCssOptsUndefined: Self = StObject.set(x, "cssOpts", js.undefined)
      
      inline def setCssSpritesheetName(value: String): Self = StObject.set(x, "cssSpritesheetName", value.asInstanceOf[js.Any])
      
      inline def setCssSpritesheetNameUndefined: Self = StObject.set(x, "cssSpritesheetName", js.undefined)
      
      inline def setCssTemplate(value: String | (js.Function1[/* data */ SpritesmithData, String])): Self = StObject.set(x, "cssTemplate", value.asInstanceOf[js.Any])
      
      inline def setCssTemplateFunction1(value: /* data */ SpritesmithData => String): Self = StObject.set(x, "cssTemplate", js.Any.fromFunction1(value))
      
      inline def setCssTemplateUndefined: Self = StObject.set(x, "cssTemplate", js.undefined)
      
      inline def setCssVarMap(value: /* sprite */ Sprite => Unit): Self = StObject.set(x, "cssVarMap", js.Any.fromFunction1(value))
      
      inline def setCssVarMapUndefined: Self = StObject.set(x, "cssVarMap", js.undefined)
      
      inline def setEngine(value: String): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
      
      inline def setEngineOpts(value: Any): Self = StObject.set(x, "engineOpts", value.asInstanceOf[js.Any])
      
      inline def setEngineOptsUndefined: Self = StObject.set(x, "engineOpts", js.undefined)
      
      inline def setEngineUndefined: Self = StObject.set(x, "engine", js.undefined)
      
      inline def setImgName(value: String): Self = StObject.set(x, "imgName", value.asInstanceOf[js.Any])
      
      inline def setImgOpts(value: Any): Self = StObject.set(x, "imgOpts", value.asInstanceOf[js.Any])
      
      inline def setImgOptsUndefined: Self = StObject.set(x, "imgOpts", js.undefined)
      
      inline def setImgPath(value: String): Self = StObject.set(x, "imgPath", value.asInstanceOf[js.Any])
      
      inline def setImgPathUndefined: Self = StObject.set(x, "imgPath", js.undefined)
      
      inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    }
  }
  
  @js.native
  trait GulpSpriteSmithResult extends Transform {
    
    var css: Readable = js.native
    
    var img: Readable = js.native
  }
  
  /* Inlined parent std.Omit<gulp.spritesmith.gulp.spritesmith.GulpSpriteSmithOptions, 'cssTemplate'> */
  trait GulpSpriteSmithRetinaOptions extends StObject {
    
    var algorithm: js.UndefOr[`top-down` | `left-right` | diagonal | `alt-diagonal` | `binary-tree` | String] = js.undefined
    
    var algorithmOpts: js.UndefOr[Sort] = js.undefined
    
    var cssFormat: js.UndefOr[String] = js.undefined
    
    var cssHandlebarsHelpers: js.UndefOr[Record[String, js.Function1[/* repeated */ Any, Any]]] = js.undefined
    
    var cssName: String
    
    var cssOpts: js.UndefOr[Any] = js.undefined
    
    var cssRetinaGroupsName: js.UndefOr[String] = js.undefined
    
    var cssRetinaSpritesheetName: js.UndefOr[String] = js.undefined
    
    var cssSpritesheetName: js.UndefOr[String] = js.undefined
    
    // override
    var cssTemplate: js.UndefOr[String | (js.Function1[/* data */ SpritesmithRetinaData, String])] = js.undefined
    
    var cssVarMap: js.UndefOr[js.Function1[/* sprite */ Sprite, Unit]] = js.undefined
    
    var engine: js.UndefOr[String] = js.undefined
    
    var engineOpts: js.UndefOr[Any] = js.undefined
    
    var imgName: String
    
    var imgOpts: js.UndefOr[Any] = js.undefined
    
    var imgPath: js.UndefOr[String] = js.undefined
    
    var padding: js.UndefOr[Double] = js.undefined
    
    var retinaImgName: String
    
    var retinaImgOpts: js.UndefOr[Any] = js.undefined
    
    var retinaImgPath: js.UndefOr[String] = js.undefined
    
    var retinaSrcFilter: String | js.Array[String]
  }
  object GulpSpriteSmithRetinaOptions {
    
    inline def apply(
      cssName: String,
      imgName: String,
      retinaImgName: String,
      retinaSrcFilter: String | js.Array[String]
    ): GulpSpriteSmithRetinaOptions = {
      val __obj = js.Dynamic.literal(cssName = cssName.asInstanceOf[js.Any], imgName = imgName.asInstanceOf[js.Any], retinaImgName = retinaImgName.asInstanceOf[js.Any], retinaSrcFilter = retinaSrcFilter.asInstanceOf[js.Any])
      __obj.asInstanceOf[GulpSpriteSmithRetinaOptions]
    }
    
    extension [Self <: GulpSpriteSmithRetinaOptions](x: Self) {
      
      inline def setAlgorithm(value: `top-down` | `left-right` | diagonal | `alt-diagonal` | `binary-tree` | String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setAlgorithmOpts(value: Sort): Self = StObject.set(x, "algorithmOpts", value.asInstanceOf[js.Any])
      
      inline def setAlgorithmOptsUndefined: Self = StObject.set(x, "algorithmOpts", js.undefined)
      
      inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
      
      inline def setCssFormat(value: String): Self = StObject.set(x, "cssFormat", value.asInstanceOf[js.Any])
      
      inline def setCssFormatUndefined: Self = StObject.set(x, "cssFormat", js.undefined)
      
      inline def setCssHandlebarsHelpers(value: Record[String, js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "cssHandlebarsHelpers", value.asInstanceOf[js.Any])
      
      inline def setCssHandlebarsHelpersUndefined: Self = StObject.set(x, "cssHandlebarsHelpers", js.undefined)
      
      inline def setCssName(value: String): Self = StObject.set(x, "cssName", value.asInstanceOf[js.Any])
      
      inline def setCssOpts(value: Any): Self = StObject.set(x, "cssOpts", value.asInstanceOf[js.Any])
      
      inline def setCssOptsUndefined: Self = StObject.set(x, "cssOpts", js.undefined)
      
      inline def setCssRetinaGroupsName(value: String): Self = StObject.set(x, "cssRetinaGroupsName", value.asInstanceOf[js.Any])
      
      inline def setCssRetinaGroupsNameUndefined: Self = StObject.set(x, "cssRetinaGroupsName", js.undefined)
      
      inline def setCssRetinaSpritesheetName(value: String): Self = StObject.set(x, "cssRetinaSpritesheetName", value.asInstanceOf[js.Any])
      
      inline def setCssRetinaSpritesheetNameUndefined: Self = StObject.set(x, "cssRetinaSpritesheetName", js.undefined)
      
      inline def setCssSpritesheetName(value: String): Self = StObject.set(x, "cssSpritesheetName", value.asInstanceOf[js.Any])
      
      inline def setCssSpritesheetNameUndefined: Self = StObject.set(x, "cssSpritesheetName", js.undefined)
      
      inline def setCssTemplate(value: String | (js.Function1[/* data */ SpritesmithRetinaData, String])): Self = StObject.set(x, "cssTemplate", value.asInstanceOf[js.Any])
      
      inline def setCssTemplateFunction1(value: /* data */ SpritesmithRetinaData => String): Self = StObject.set(x, "cssTemplate", js.Any.fromFunction1(value))
      
      inline def setCssTemplateUndefined: Self = StObject.set(x, "cssTemplate", js.undefined)
      
      inline def setCssVarMap(value: /* sprite */ Sprite => Unit): Self = StObject.set(x, "cssVarMap", js.Any.fromFunction1(value))
      
      inline def setCssVarMapUndefined: Self = StObject.set(x, "cssVarMap", js.undefined)
      
      inline def setEngine(value: String): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
      
      inline def setEngineOpts(value: Any): Self = StObject.set(x, "engineOpts", value.asInstanceOf[js.Any])
      
      inline def setEngineOptsUndefined: Self = StObject.set(x, "engineOpts", js.undefined)
      
      inline def setEngineUndefined: Self = StObject.set(x, "engine", js.undefined)
      
      inline def setImgName(value: String): Self = StObject.set(x, "imgName", value.asInstanceOf[js.Any])
      
      inline def setImgOpts(value: Any): Self = StObject.set(x, "imgOpts", value.asInstanceOf[js.Any])
      
      inline def setImgOptsUndefined: Self = StObject.set(x, "imgOpts", js.undefined)
      
      inline def setImgPath(value: String): Self = StObject.set(x, "imgPath", value.asInstanceOf[js.Any])
      
      inline def setImgPathUndefined: Self = StObject.set(x, "imgPath", js.undefined)
      
      inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setRetinaImgName(value: String): Self = StObject.set(x, "retinaImgName", value.asInstanceOf[js.Any])
      
      inline def setRetinaImgOpts(value: Any): Self = StObject.set(x, "retinaImgOpts", value.asInstanceOf[js.Any])
      
      inline def setRetinaImgOptsUndefined: Self = StObject.set(x, "retinaImgOpts", js.undefined)
      
      inline def setRetinaImgPath(value: String): Self = StObject.set(x, "retinaImgPath", value.asInstanceOf[js.Any])
      
      inline def setRetinaImgPathUndefined: Self = StObject.set(x, "retinaImgPath", js.undefined)
      
      inline def setRetinaSrcFilter(value: String | js.Array[String]): Self = StObject.set(x, "retinaSrcFilter", value.asInstanceOf[js.Any])
      
      inline def setRetinaSrcFilterVarargs(value: String*): Self = StObject.set(x, "retinaSrcFilter", js.Array(value*))
    }
  }
  
  trait Sprite extends StObject {
    
    var escaped_image: String
    
    var height: Double
    
    var image: String
    
    var name: String
    
    var offset_x: Double
    
    var offset_y: Double
    
    var px: Height
    
    var source_image: String
    
    var total_height: Double
    
    var total_width: Double
    
    var width: Double
    
    var x: Double
    
    var y: Double
  }
  object Sprite {
    
    inline def apply(
      escaped_image: String,
      height: Double,
      image: String,
      name: String,
      offset_x: Double,
      offset_y: Double,
      px: Height,
      source_image: String,
      total_height: Double,
      total_width: Double,
      width: Double,
      x: Double,
      y: Double
    ): Sprite = {
      val __obj = js.Dynamic.literal(escaped_image = escaped_image.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offset_x = offset_x.asInstanceOf[js.Any], offset_y = offset_y.asInstanceOf[js.Any], px = px.asInstanceOf[js.Any], source_image = source_image.asInstanceOf[js.Any], total_height = total_height.asInstanceOf[js.Any], total_width = total_width.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Sprite]
    }
    
    extension [Self <: Sprite](x: Self) {
      
      inline def setEscaped_image(value: String): Self = StObject.set(x, "escaped_image", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOffset_x(value: Double): Self = StObject.set(x, "offset_x", value.asInstanceOf[js.Any])
      
      inline def setOffset_y(value: Double): Self = StObject.set(x, "offset_y", value.asInstanceOf[js.Any])
      
      inline def setPx(value: Height): Self = StObject.set(x, "px", value.asInstanceOf[js.Any])
      
      inline def setSource_image(value: String): Self = StObject.set(x, "source_image", value.asInstanceOf[js.Any])
      
      inline def setTotal_height(value: Double): Self = StObject.set(x, "total_height", value.asInstanceOf[js.Any])
      
      inline def setTotal_width(value: Double): Self = StObject.set(x, "total_width", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait Spritesheet extends StObject {
    
    var escaped_image: String
    
    var image: String
    
    var px: Width
    
    var total_height: Double
    
    var width: Double
  }
  object Spritesheet {
    
    inline def apply(escaped_image: String, image: String, px: Width, total_height: Double, width: Double): Spritesheet = {
      val __obj = js.Dynamic.literal(escaped_image = escaped_image.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], px = px.asInstanceOf[js.Any], total_height = total_height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Spritesheet]
    }
    
    extension [Self <: Spritesheet](x: Self) {
      
      inline def setEscaped_image(value: String): Self = StObject.set(x, "escaped_image", value.asInstanceOf[js.Any])
      
      inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setPx(value: Width): Self = StObject.set(x, "px", value.asInstanceOf[js.Any])
      
      inline def setTotal_height(value: Double): Self = StObject.set(x, "total_height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait SpritesheetInfo extends StObject {
    
    var name: String
  }
  object SpritesheetInfo {
    
    inline def apply(name: String): SpritesheetInfo = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpritesheetInfo]
    }
    
    extension [Self <: SpritesheetInfo](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait SpritesmithData extends StObject {
    
    var sprites: js.Array[Sprite]
    
    var spritesheet: Spritesheet
    
    var spritesheet_info: SpritesheetInfo
  }
  object SpritesmithData {
    
    inline def apply(sprites: js.Array[Sprite], spritesheet: Spritesheet, spritesheet_info: SpritesheetInfo): SpritesmithData = {
      val __obj = js.Dynamic.literal(sprites = sprites.asInstanceOf[js.Any], spritesheet = spritesheet.asInstanceOf[js.Any], spritesheet_info = spritesheet_info.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpritesmithData]
    }
    
    extension [Self <: SpritesmithData](x: Self) {
      
      inline def setSprites(value: js.Array[Sprite]): Self = StObject.set(x, "sprites", value.asInstanceOf[js.Any])
      
      inline def setSpritesVarargs(value: Sprite*): Self = StObject.set(x, "sprites", js.Array(value*))
      
      inline def setSpritesheet(value: Spritesheet): Self = StObject.set(x, "spritesheet", value.asInstanceOf[js.Any])
      
      inline def setSpritesheet_info(value: SpritesheetInfo): Self = StObject.set(x, "spritesheet_info", value.asInstanceOf[js.Any])
    }
  }
  
  trait SpritesmithRetinaData
    extends StObject
       with SpritesmithData {
    
    var options: Any
    
    var retina_groups: js.Array[Index]
    
    var retina_groups_info: SpritesheetInfo
    
    var retina_sprites: js.Array[Sprite]
    
    var retina_spritesheet: Spritesheet
    
    var retina_spritesheet_info: SpritesheetInfo
  }
  object SpritesmithRetinaData {
    
    inline def apply(
      options: Any,
      retina_groups: js.Array[Index],
      retina_groups_info: SpritesheetInfo,
      retina_sprites: js.Array[Sprite],
      retina_spritesheet: Spritesheet,
      retina_spritesheet_info: SpritesheetInfo,
      sprites: js.Array[Sprite],
      spritesheet: Spritesheet,
      spritesheet_info: SpritesheetInfo
    ): SpritesmithRetinaData = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], retina_groups = retina_groups.asInstanceOf[js.Any], retina_groups_info = retina_groups_info.asInstanceOf[js.Any], retina_sprites = retina_sprites.asInstanceOf[js.Any], retina_spritesheet = retina_spritesheet.asInstanceOf[js.Any], retina_spritesheet_info = retina_spritesheet_info.asInstanceOf[js.Any], sprites = sprites.asInstanceOf[js.Any], spritesheet = spritesheet.asInstanceOf[js.Any], spritesheet_info = spritesheet_info.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpritesmithRetinaData]
    }
    
    extension [Self <: SpritesmithRetinaData](x: Self) {
      
      inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setRetina_groups(value: js.Array[Index]): Self = StObject.set(x, "retina_groups", value.asInstanceOf[js.Any])
      
      inline def setRetina_groupsVarargs(value: Index*): Self = StObject.set(x, "retina_groups", js.Array(value*))
      
      inline def setRetina_groups_info(value: SpritesheetInfo): Self = StObject.set(x, "retina_groups_info", value.asInstanceOf[js.Any])
      
      inline def setRetina_sprites(value: js.Array[Sprite]): Self = StObject.set(x, "retina_sprites", value.asInstanceOf[js.Any])
      
      inline def setRetina_spritesVarargs(value: Sprite*): Self = StObject.set(x, "retina_sprites", js.Array(value*))
      
      inline def setRetina_spritesheet(value: Spritesheet): Self = StObject.set(x, "retina_spritesheet", value.asInstanceOf[js.Any])
      
      inline def setRetina_spritesheet_info(value: SpritesheetInfo): Self = StObject.set(x, "retina_spritesheet_info", value.asInstanceOf[js.Any])
    }
  }
}
