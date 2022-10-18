package typings.htmlWebpackPlugin

import org.scalablytyped.runtime.StringDictionary
import typings.htmlWebpackPlugin.mod.HtmlTagObject
import typings.htmlWebpackPlugin.mod.HtmlWebpackPlugin
import typings.htmlWebpackPlugin.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AssetTags extends StObject {
    
    var assetTags: Meta
    
    var outputName: String
    
    var plugin: HtmlWebpackPlugin
    
    var publicPath: String
  }
  object AssetTags {
    
    inline def apply(assetTags: Meta, outputName: String, plugin: HtmlWebpackPlugin, publicPath: String): AssetTags = {
      val __obj = js.Dynamic.literal(assetTags = assetTags.asInstanceOf[js.Any], outputName = outputName.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any], publicPath = publicPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[AssetTags]
    }
    
    extension [Self <: AssetTags](x: Self) {
      
      inline def setAssetTags(value: Meta): Self = StObject.set(x, "assetTags", value.asInstanceOf[js.Any])
      
      inline def setOutputName(value: String): Self = StObject.set(x, "outputName", value.asInstanceOf[js.Any])
      
      inline def setPlugin(value: HtmlWebpackPlugin): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
      
      inline def setPublicPath(value: String): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
    }
  }
  
  trait Assets extends StObject {
    
    var assets: Css
    
    var outputName: String
    
    var plugin: HtmlWebpackPlugin
  }
  object Assets {
    
    inline def apply(assets: Css, outputName: String, plugin: HtmlWebpackPlugin): Assets = {
      val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any], outputName = outputName.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any])
      __obj.asInstanceOf[Assets]
    }
    
    extension [Self <: Assets](x: Self) {
      
      inline def setAssets(value: Css): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
      
      inline def setOutputName(value: String): Self = StObject.set(x, "outputName", value.asInstanceOf[js.Any])
      
      inline def setPlugin(value: HtmlWebpackPlugin): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
    }
  }
  
  trait BodyTags extends StObject {
    
    var bodyTags: js.Array[HtmlTagObject]
    
    var headTags: js.Array[HtmlTagObject]
    
    var outputName: String
    
    var plugin: HtmlWebpackPlugin
    
    var publicPath: String
  }
  object BodyTags {
    
    inline def apply(
      bodyTags: js.Array[HtmlTagObject],
      headTags: js.Array[HtmlTagObject],
      outputName: String,
      plugin: HtmlWebpackPlugin,
      publicPath: String
    ): BodyTags = {
      val __obj = js.Dynamic.literal(bodyTags = bodyTags.asInstanceOf[js.Any], headTags = headTags.asInstanceOf[js.Any], outputName = outputName.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any], publicPath = publicPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[BodyTags]
    }
    
    extension [Self <: BodyTags](x: Self) {
      
      inline def setBodyTags(value: js.Array[HtmlTagObject]): Self = StObject.set(x, "bodyTags", value.asInstanceOf[js.Any])
      
      inline def setBodyTagsVarargs(value: HtmlTagObject*): Self = StObject.set(x, "bodyTags", js.Array(value*))
      
      inline def setHeadTags(value: js.Array[HtmlTagObject]): Self = StObject.set(x, "headTags", value.asInstanceOf[js.Any])
      
      inline def setHeadTagsVarargs(value: HtmlTagObject*): Self = StObject.set(x, "headTags", js.Array(value*))
      
      inline def setOutputName(value: String): Self = StObject.set(x, "outputName", value.asInstanceOf[js.Any])
      
      inline def setPlugin(value: HtmlWebpackPlugin): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
      
      inline def setPublicPath(value: String): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
    }
  }
  
  trait BodyTagsHeadTags extends StObject {
    
    var bodyTags: js.Array[HtmlTagObject]
    
    var headTags: js.Array[HtmlTagObject]
  }
  object BodyTagsHeadTags {
    
    inline def apply(bodyTags: js.Array[HtmlTagObject], headTags: js.Array[HtmlTagObject]): BodyTagsHeadTags = {
      val __obj = js.Dynamic.literal(bodyTags = bodyTags.asInstanceOf[js.Any], headTags = headTags.asInstanceOf[js.Any])
      __obj.asInstanceOf[BodyTagsHeadTags]
    }
    
    extension [Self <: BodyTagsHeadTags](x: Self) {
      
      inline def setBodyTags(value: js.Array[HtmlTagObject]): Self = StObject.set(x, "bodyTags", value.asInstanceOf[js.Any])
      
      inline def setBodyTagsVarargs(value: HtmlTagObject*): Self = StObject.set(x, "bodyTags", js.Array(value*))
      
      inline def setHeadTags(value: js.Array[HtmlTagObject]): Self = StObject.set(x, "headTags", value.asInstanceOf[js.Any])
      
      inline def setHeadTagsVarargs(value: HtmlTagObject*): Self = StObject.set(x, "headTags", js.Array(value*))
    }
  }
  
  trait Css extends StObject {
    
    var css: js.Array[String]
    
    var favicon: js.UndefOr[String] = js.undefined
    
    @JSName("js")
    var js_ : js.Array[String]
    
    var manifest: js.UndefOr[String] = js.undefined
    
    var publicPath: String
  }
  object Css {
    
    inline def apply(css: js.Array[String], js_ : js.Array[String], publicPath: String): Css = {
      val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], publicPath = publicPath.asInstanceOf[js.Any])
      __obj.updateDynamic("js")(js_.asInstanceOf[js.Any])
      __obj.asInstanceOf[Css]
    }
    
    extension [Self <: Css](x: Self) {
      
      inline def setCss(value: js.Array[String]): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      inline def setCssVarargs(value: String*): Self = StObject.set(x, "css", js.Array(value*))
      
      inline def setFavicon(value: String): Self = StObject.set(x, "favicon", value.asInstanceOf[js.Any])
      
      inline def setFaviconUndefined: Self = StObject.set(x, "favicon", js.undefined)
      
      inline def setJs_(value: js.Array[String]): Self = StObject.set(x, "js", value.asInstanceOf[js.Any])
      
      inline def setJs_Varargs(value: String*): Self = StObject.set(x, "js", js.Array(value*))
      
      inline def setManifest(value: String): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
      
      inline def setManifestUndefined: Self = StObject.set(x, "manifest", js.undefined)
      
      inline def setPublicPath(value: String): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
    }
  }
  
  trait DictmetaAttributeName
    extends StObject
       with /**
    * In addition to the options actually used by this plugin, you can use this hash to pass arbitrary data through
    * to your template.
    */
  /* option */ StringDictionary[Any] {
    
    var plugin: js.UndefOr[String] = js.undefined
  }
  object DictmetaAttributeName {
    
    inline def apply(): DictmetaAttributeName = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DictmetaAttributeName]
    }
    
    extension [Self <: DictmetaAttributeName](x: Self) {
      
      inline def setPlugin(value: String): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
      
      inline def setPluginUndefined: Self = StObject.set(x, "plugin", js.undefined)
    }
  }
  
  trait Favicon extends StObject {
    
    var css: js.Array[String]
    
    var favicon: js.UndefOr[String] = js.undefined
    
    @JSName("js")
    var js_ : js.Array[String]
    
    var manifest: js.UndefOr[String] = js.undefined
    
    var publicPath: String
  }
  object Favicon {
    
    inline def apply(css: js.Array[String], js_ : js.Array[String], publicPath: String): Favicon = {
      val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], publicPath = publicPath.asInstanceOf[js.Any])
      __obj.updateDynamic("js")(js_.asInstanceOf[js.Any])
      __obj.asInstanceOf[Favicon]
    }
    
    extension [Self <: Favicon](x: Self) {
      
      inline def setCss(value: js.Array[String]): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      inline def setCssVarargs(value: String*): Self = StObject.set(x, "css", js.Array(value*))
      
      inline def setFavicon(value: String): Self = StObject.set(x, "favicon", value.asInstanceOf[js.Any])
      
      inline def setFaviconUndefined: Self = StObject.set(x, "favicon", js.undefined)
      
      inline def setJs_(value: js.Array[String]): Self = StObject.set(x, "js", value.asInstanceOf[js.Any])
      
      inline def setJs_Varargs(value: String*): Self = StObject.set(x, "js", js.Array(value*))
      
      inline def setManifest(value: String): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
      
      inline def setManifestUndefined: Self = StObject.set(x, "manifest", js.undefined)
      
      inline def setPublicPath(value: String): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
    }
  }
  
  trait Files extends StObject {
    
    var files: Favicon
    
    var options: Options
    
    var tags: BodyTagsHeadTags
  }
  object Files {
    
    inline def apply(files: Favicon, options: Options, tags: BodyTagsHeadTags): Files = {
      val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[Files]
    }
    
    extension [Self <: Files](x: Self) {
      
      inline def setFiles(value: Favicon): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setTags(value: BodyTagsHeadTags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    }
  }
  
  trait HeadTags extends StObject {
    
    var bodyTags: js.Array[HtmlTagObject]
    
    var headTags: js.Array[HtmlTagObject]
    
    var html: String
    
    var outputName: String
    
    var plugin: HtmlWebpackPlugin
  }
  object HeadTags {
    
    inline def apply(
      bodyTags: js.Array[HtmlTagObject],
      headTags: js.Array[HtmlTagObject],
      html: String,
      outputName: String,
      plugin: HtmlWebpackPlugin
    ): HeadTags = {
      val __obj = js.Dynamic.literal(bodyTags = bodyTags.asInstanceOf[js.Any], headTags = headTags.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], outputName = outputName.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeadTags]
    }
    
    extension [Self <: HeadTags](x: Self) {
      
      inline def setBodyTags(value: js.Array[HtmlTagObject]): Self = StObject.set(x, "bodyTags", value.asInstanceOf[js.Any])
      
      inline def setBodyTagsVarargs(value: HtmlTagObject*): Self = StObject.set(x, "bodyTags", js.Array(value*))
      
      inline def setHeadTags(value: js.Array[HtmlTagObject]): Self = StObject.set(x, "headTags", value.asInstanceOf[js.Any])
      
      inline def setHeadTagsVarargs(value: HtmlTagObject*): Self = StObject.set(x, "headTags", js.Array(value*))
      
      inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setOutputName(value: String): Self = StObject.set(x, "outputName", value.asInstanceOf[js.Any])
      
      inline def setPlugin(value: HtmlWebpackPlugin): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
    }
  }
  
  trait Html extends StObject {
    
    var html: String
    
    var outputName: String
    
    var plugin: HtmlWebpackPlugin
  }
  object Html {
    
    inline def apply(html: String, outputName: String, plugin: HtmlWebpackPlugin): Html = {
      val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], outputName = outputName.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any])
      __obj.asInstanceOf[Html]
    }
    
    extension [Self <: Html](x: Self) {
      
      inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setOutputName(value: String): Self = StObject.set(x, "outputName", value.asInstanceOf[js.Any])
      
      inline def setPlugin(value: HtmlWebpackPlugin): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
    }
  }
  
  trait Meta extends StObject {
    
    var meta: js.Array[HtmlTagObject]
    
    var scripts: js.Array[HtmlTagObject]
    
    var styles: js.Array[HtmlTagObject]
  }
  object Meta {
    
    inline def apply(meta: js.Array[HtmlTagObject], scripts: js.Array[HtmlTagObject], styles: js.Array[HtmlTagObject]): Meta = {
      val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], scripts = scripts.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
      __obj.asInstanceOf[Meta]
    }
    
    extension [Self <: Meta](x: Self) {
      
      inline def setMeta(value: js.Array[HtmlTagObject]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaVarargs(value: HtmlTagObject*): Self = StObject.set(x, "meta", js.Array(value*))
      
      inline def setScripts(value: js.Array[HtmlTagObject]): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
      
      inline def setScriptsVarargs(value: HtmlTagObject*): Self = StObject.set(x, "scripts", js.Array(value*))
      
      inline def setStyles(value: js.Array[HtmlTagObject]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesVarargs(value: HtmlTagObject*): Self = StObject.set(x, "styles", js.Array(value*))
    }
  }
  
  trait OutputName extends StObject {
    
    var outputName: String
    
    var plugin: HtmlWebpackPlugin
  }
  object OutputName {
    
    inline def apply(outputName: String, plugin: HtmlWebpackPlugin): OutputName = {
      val __obj = js.Dynamic.literal(outputName = outputName.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any])
      __obj.asInstanceOf[OutputName]
    }
    
    extension [Self <: OutputName](x: Self) {
      
      inline def setOutputName(value: String): Self = StObject.set(x, "outputName", value.asInstanceOf[js.Any])
      
      inline def setPlugin(value: HtmlWebpackPlugin): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
    }
  }
}
