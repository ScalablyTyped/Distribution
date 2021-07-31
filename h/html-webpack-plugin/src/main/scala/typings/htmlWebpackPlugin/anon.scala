package typings.htmlWebpackPlugin

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
  }
  object AssetTags {
    
    @scala.inline
    def apply(assetTags: Meta, outputName: String, plugin: HtmlWebpackPlugin): AssetTags = {
      val __obj = js.Dynamic.literal(assetTags = assetTags.asInstanceOf[js.Any], outputName = outputName.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any])
      __obj.asInstanceOf[AssetTags]
    }
    
    @scala.inline
    implicit class AssetTagsMutableBuilder[Self <: AssetTags] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAssetTags(value: Meta): Self = StObject.set(x, "assetTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputName(value: String): Self = StObject.set(x, "outputName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlugin(value: HtmlWebpackPlugin): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
    }
  }
  
  trait Assets extends StObject {
    
    var assets: Favicon
    
    var outputName: String
    
    var plugin: HtmlWebpackPlugin
  }
  object Assets {
    
    @scala.inline
    def apply(assets: Favicon, outputName: String, plugin: HtmlWebpackPlugin): Assets = {
      val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any], outputName = outputName.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any])
      __obj.asInstanceOf[Assets]
    }
    
    @scala.inline
    implicit class AssetsMutableBuilder[Self <: Assets] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAssets(value: Favicon): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputName(value: String): Self = StObject.set(x, "outputName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlugin(value: HtmlWebpackPlugin): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
    }
  }
  
  trait BodyTags extends StObject {
    
    var bodyTags: js.Array[HtmlTagObject]
    
    var headTags: js.Array[HtmlTagObject]
  }
  object BodyTags {
    
    @scala.inline
    def apply(bodyTags: js.Array[HtmlTagObject], headTags: js.Array[HtmlTagObject]): BodyTags = {
      val __obj = js.Dynamic.literal(bodyTags = bodyTags.asInstanceOf[js.Any], headTags = headTags.asInstanceOf[js.Any])
      __obj.asInstanceOf[BodyTags]
    }
    
    @scala.inline
    implicit class BodyTagsMutableBuilder[Self <: BodyTags] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBodyTags(value: js.Array[HtmlTagObject]): Self = StObject.set(x, "bodyTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyTagsVarargs(value: HtmlTagObject*): Self = StObject.set(x, "bodyTags", js.Array(value :_*))
      
      @scala.inline
      def setHeadTags(value: js.Array[HtmlTagObject]): Self = StObject.set(x, "headTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadTagsVarargs(value: HtmlTagObject*): Self = StObject.set(x, "headTags", js.Array(value :_*))
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
    
    @scala.inline
    def apply(css: js.Array[String], js_ : js.Array[String], publicPath: String): Css = {
      val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], publicPath = publicPath.asInstanceOf[js.Any])
      __obj.updateDynamic("js")(js_.asInstanceOf[js.Any])
      __obj.asInstanceOf[Css]
    }
    
    @scala.inline
    implicit class CssMutableBuilder[Self <: Css] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCss(value: js.Array[String]): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssVarargs(value: String*): Self = StObject.set(x, "css", js.Array(value :_*))
      
      @scala.inline
      def setFavicon(value: String): Self = StObject.set(x, "favicon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFaviconUndefined: Self = StObject.set(x, "favicon", js.undefined)
      
      @scala.inline
      def setJs_(value: js.Array[String]): Self = StObject.set(x, "js", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJs_Varargs(value: String*): Self = StObject.set(x, "js", js.Array(value :_*))
      
      @scala.inline
      def setManifest(value: String): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManifestUndefined: Self = StObject.set(x, "manifest", js.undefined)
      
      @scala.inline
      def setPublicPath(value: String): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(css: js.Array[String], js_ : js.Array[String], publicPath: String): Favicon = {
      val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], publicPath = publicPath.asInstanceOf[js.Any])
      __obj.updateDynamic("js")(js_.asInstanceOf[js.Any])
      __obj.asInstanceOf[Favicon]
    }
    
    @scala.inline
    implicit class FaviconMutableBuilder[Self <: Favicon] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCss(value: js.Array[String]): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssVarargs(value: String*): Self = StObject.set(x, "css", js.Array(value :_*))
      
      @scala.inline
      def setFavicon(value: String): Self = StObject.set(x, "favicon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFaviconUndefined: Self = StObject.set(x, "favicon", js.undefined)
      
      @scala.inline
      def setJs_(value: js.Array[String]): Self = StObject.set(x, "js", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJs_Varargs(value: String*): Self = StObject.set(x, "js", js.Array(value :_*))
      
      @scala.inline
      def setManifest(value: String): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManifestUndefined: Self = StObject.set(x, "manifest", js.undefined)
      
      @scala.inline
      def setPublicPath(value: String): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
    }
  }
  
  trait Files extends StObject {
    
    var files: Css
    
    var options: Options
    
    var tags: BodyTags
  }
  object Files {
    
    @scala.inline
    def apply(files: Css, options: Options, tags: BodyTags): Files = {
      val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[Files]
    }
    
    @scala.inline
    implicit class FilesMutableBuilder[Self <: Files] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFiles(value: Css): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: BodyTags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    }
  }
  
  trait HeadTags extends StObject {
    
    var bodyTags: js.Array[HtmlTagObject]
    
    var headTags: js.Array[HtmlTagObject]
    
    var outputName: String
    
    var plugin: HtmlWebpackPlugin
  }
  object HeadTags {
    
    @scala.inline
    def apply(
      bodyTags: js.Array[HtmlTagObject],
      headTags: js.Array[HtmlTagObject],
      outputName: String,
      plugin: HtmlWebpackPlugin
    ): HeadTags = {
      val __obj = js.Dynamic.literal(bodyTags = bodyTags.asInstanceOf[js.Any], headTags = headTags.asInstanceOf[js.Any], outputName = outputName.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeadTags]
    }
    
    @scala.inline
    implicit class HeadTagsMutableBuilder[Self <: HeadTags] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBodyTags(value: js.Array[HtmlTagObject]): Self = StObject.set(x, "bodyTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyTagsVarargs(value: HtmlTagObject*): Self = StObject.set(x, "bodyTags", js.Array(value :_*))
      
      @scala.inline
      def setHeadTags(value: js.Array[HtmlTagObject]): Self = StObject.set(x, "headTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadTagsVarargs(value: HtmlTagObject*): Self = StObject.set(x, "headTags", js.Array(value :_*))
      
      @scala.inline
      def setOutputName(value: String): Self = StObject.set(x, "outputName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlugin(value: HtmlWebpackPlugin): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
    }
  }
  
  trait Html extends StObject {
    
    var bodyTags: js.Array[HtmlTagObject]
    
    var headTags: js.Array[HtmlTagObject]
    
    var html: String
    
    var outputName: String
    
    var plugin: HtmlWebpackPlugin
  }
  object Html {
    
    @scala.inline
    def apply(
      bodyTags: js.Array[HtmlTagObject],
      headTags: js.Array[HtmlTagObject],
      html: String,
      outputName: String,
      plugin: HtmlWebpackPlugin
    ): Html = {
      val __obj = js.Dynamic.literal(bodyTags = bodyTags.asInstanceOf[js.Any], headTags = headTags.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], outputName = outputName.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any])
      __obj.asInstanceOf[Html]
    }
    
    @scala.inline
    implicit class HtmlMutableBuilder[Self <: Html] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBodyTags(value: js.Array[HtmlTagObject]): Self = StObject.set(x, "bodyTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyTagsVarargs(value: HtmlTagObject*): Self = StObject.set(x, "bodyTags", js.Array(value :_*))
      
      @scala.inline
      def setHeadTags(value: js.Array[HtmlTagObject]): Self = StObject.set(x, "headTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadTagsVarargs(value: HtmlTagObject*): Self = StObject.set(x, "headTags", js.Array(value :_*))
      
      @scala.inline
      def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputName(value: String): Self = StObject.set(x, "outputName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlugin(value: HtmlWebpackPlugin): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
    }
  }
  
  trait Meta extends StObject {
    
    var meta: js.Array[HtmlTagObject]
    
    var scripts: js.Array[HtmlTagObject]
    
    var styles: js.Array[HtmlTagObject]
  }
  object Meta {
    
    @scala.inline
    def apply(meta: js.Array[HtmlTagObject], scripts: js.Array[HtmlTagObject], styles: js.Array[HtmlTagObject]): Meta = {
      val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], scripts = scripts.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
      __obj.asInstanceOf[Meta]
    }
    
    @scala.inline
    implicit class MetaMutableBuilder[Self <: Meta] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMeta(value: js.Array[HtmlTagObject]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetaVarargs(value: HtmlTagObject*): Self = StObject.set(x, "meta", js.Array(value :_*))
      
      @scala.inline
      def setScripts(value: js.Array[HtmlTagObject]): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScriptsVarargs(value: HtmlTagObject*): Self = StObject.set(x, "scripts", js.Array(value :_*))
      
      @scala.inline
      def setStyles(value: js.Array[HtmlTagObject]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesVarargs(value: HtmlTagObject*): Self = StObject.set(x, "styles", js.Array(value :_*))
    }
  }
  
  trait OutputName extends StObject {
    
    var html: String
    
    var outputName: String
    
    var plugin: HtmlWebpackPlugin
  }
  object OutputName {
    
    @scala.inline
    def apply(html: String, outputName: String, plugin: HtmlWebpackPlugin): OutputName = {
      val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], outputName = outputName.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any])
      __obj.asInstanceOf[OutputName]
    }
    
    @scala.inline
    implicit class OutputNameMutableBuilder[Self <: OutputName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputName(value: String): Self = StObject.set(x, "outputName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlugin(value: HtmlWebpackPlugin): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
    }
  }
  
  trait Plugin extends StObject {
    
    var outputName: String
    
    var plugin: HtmlWebpackPlugin
  }
  object Plugin {
    
    @scala.inline
    def apply(outputName: String, plugin: HtmlWebpackPlugin): Plugin = {
      val __obj = js.Dynamic.literal(outputName = outputName.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any])
      __obj.asInstanceOf[Plugin]
    }
    
    @scala.inline
    implicit class PluginMutableBuilder[Self <: Plugin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOutputName(value: String): Self = StObject.set(x, "outputName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlugin(value: HtmlWebpackPlugin): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
    }
  }
}
