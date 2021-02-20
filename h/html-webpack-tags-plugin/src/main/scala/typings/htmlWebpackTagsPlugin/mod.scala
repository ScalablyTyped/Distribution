package typings.htmlWebpackTagsPlugin

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("html-webpack-tags-plugin", JSImport.Namespace)
  @js.native
  class ^ () extends HtmlWebpackTagsPlugin {
    def this(options: Options) = this()
  }
  
  type AddHashFunction = js.Function2[/* assetPath */ String, /* hash */ String, String]
  
  type AddPublicPathFunction = js.Function2[/* assetPath */ String, /* publicPath */ String, String]
  
  type AttributesObject = StringDictionary[String | Boolean | Double]
  
  @js.native
  trait BaseTagOptions extends CommonOptions {
    
    var glob: js.UndefOr[String] = js.native
    
    var globFlatten: js.UndefOr[Boolean] = js.native
    
    var globPath: js.UndefOr[String] = js.native
    
    var sourcePath: js.UndefOr[String] = js.native
  }
  object BaseTagOptions {
    
    @scala.inline
    def apply(): BaseTagOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseTagOptions]
    }
    
    @scala.inline
    implicit class BaseTagOptionsMutableBuilder[Self <: BaseTagOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGlob(value: String): Self = StObject.set(x, "glob", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobFlatten(value: Boolean): Self = StObject.set(x, "globFlatten", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobFlattenUndefined: Self = StObject.set(x, "globFlatten", js.undefined)
      
      @scala.inline
      def setGlobPath(value: String): Self = StObject.set(x, "globPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobPathUndefined: Self = StObject.set(x, "globPath", js.undefined)
      
      @scala.inline
      def setGlobUndefined: Self = StObject.set(x, "glob", js.undefined)
      
      @scala.inline
      def setSourcePath(value: String): Self = StObject.set(x, "sourcePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourcePathUndefined: Self = StObject.set(x, "sourcePath", js.undefined)
    }
  }
  
  @js.native
  trait CommonOptions extends StObject {
    
    var addHash: js.UndefOr[AddHashFunction] = js.native
    
    var addPublicPath: js.UndefOr[AddPublicPathFunction] = js.native
    
    var append: js.UndefOr[Boolean] = js.native
    
    var hash: js.UndefOr[Boolean | String | AddHashFunction] = js.native
    
    var publicPath: js.UndefOr[Boolean | String | AddPublicPathFunction] = js.native
    
    var useHash: js.UndefOr[Boolean] = js.native
    
    var usePublicPath: js.UndefOr[Boolean] = js.native
  }
  object CommonOptions {
    
    @scala.inline
    def apply(): CommonOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonOptions]
    }
    
    @scala.inline
    implicit class CommonOptionsMutableBuilder[Self <: CommonOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddHash(value: (/* assetPath */ String, /* hash */ String) => String): Self = StObject.set(x, "addHash", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAddHashUndefined: Self = StObject.set(x, "addHash", js.undefined)
      
      @scala.inline
      def setAddPublicPath(value: (/* assetPath */ String, /* publicPath */ String) => String): Self = StObject.set(x, "addPublicPath", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAddPublicPathUndefined: Self = StObject.set(x, "addPublicPath", js.undefined)
      
      @scala.inline
      def setAppend(value: Boolean): Self = StObject.set(x, "append", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppendUndefined: Self = StObject.set(x, "append", js.undefined)
      
      @scala.inline
      def setHash(value: Boolean | String | AddHashFunction): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashFunction2(value: (/* assetPath */ String, /* hash */ String) => String): Self = StObject.set(x, "hash", js.Any.fromFunction2(value))
      
      @scala.inline
      def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      @scala.inline
      def setPublicPath(value: Boolean | String | AddPublicPathFunction): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicPathFunction2(value: (/* assetPath */ String, /* publicPath */ String) => String): Self = StObject.set(x, "publicPath", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPublicPathUndefined: Self = StObject.set(x, "publicPath", js.undefined)
      
      @scala.inline
      def setUseHash(value: Boolean): Self = StObject.set(x, "useHash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseHashUndefined: Self = StObject.set(x, "useHash", js.undefined)
      
      @scala.inline
      def setUsePublicPath(value: Boolean): Self = StObject.set(x, "usePublicPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsePublicPathUndefined: Self = StObject.set(x, "usePublicPath", js.undefined)
    }
  }
  
  @js.native
  trait ExternalObject extends StObject {
    
    var packageName: String = js.native
    
    var variableName: String = js.native
  }
  object ExternalObject {
    
    @scala.inline
    def apply(packageName: String, variableName: String): ExternalObject = {
      val __obj = js.Dynamic.literal(packageName = packageName.asInstanceOf[js.Any], variableName = variableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExternalObject]
    }
    
    @scala.inline
    implicit class ExternalObjectMutableBuilder[Self <: ExternalObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariableName(value: String): Self = StObject.set(x, "variableName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait HtmlWebpackTagsPlugin extends StObject {
    
    @JSName("apply")
    def apply(
      compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Compiler */ js.Any
    ): Unit = js.native
  }
  object HtmlWebpackTagsPlugin {
    
    @scala.inline
    def apply(
      apply: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Compiler */ js.Any => Unit
    ): HtmlWebpackTagsPlugin = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply))
      __obj.asInstanceOf[HtmlWebpackTagsPlugin]
    }
    
    @scala.inline
    implicit class HtmlWebpackTagsPluginMutableBuilder[Self <: HtmlWebpackTagsPlugin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApply(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Compiler */ js.Any => Unit
      ): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait LinkTagOptions extends BaseTagOptions {
    
    var attributes: js.UndefOr[AttributesObject] = js.native
    
    var path: String = js.native
  }
  object LinkTagOptions {
    
    @scala.inline
    def apply(path: String): LinkTagOptions = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinkTagOptions]
    }
    
    @scala.inline
    implicit class LinkTagOptionsMutableBuilder[Self <: LinkTagOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: AttributesObject): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MaybeLinkTagOptions extends LinkTagOptions {
    
    var `type`: js.UndefOr[TypeString] = js.native
  }
  object MaybeLinkTagOptions {
    
    @scala.inline
    def apply(path: String): MaybeLinkTagOptions = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[MaybeLinkTagOptions]
    }
    
    @scala.inline
    implicit class MaybeLinkTagOptionsMutableBuilder[Self <: MaybeLinkTagOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: TypeString): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait MaybeScriptTagOptions extends ScriptTagOptions {
    
    var `type`: js.UndefOr[TypeString] = js.native
  }
  object MaybeScriptTagOptions {
    
    @scala.inline
    def apply(path: String): MaybeScriptTagOptions = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[MaybeScriptTagOptions]
    }
    
    @scala.inline
    implicit class MaybeScriptTagOptionsMutableBuilder[Self <: MaybeScriptTagOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: TypeString): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait MetaTagOptions extends BaseTagOptions {
    
    var attributes: AttributesObject = js.native
    
    var path: js.UndefOr[String] = js.native
  }
  object MetaTagOptions {
    
    @scala.inline
    def apply(attributes: AttributesObject): MetaTagOptions = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetaTagOptions]
    }
    
    @scala.inline
    implicit class MetaTagOptionsMutableBuilder[Self <: MetaTagOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: AttributesObject): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
  
  @js.native
  trait Options extends CommonOptions {
    
    var cssExtensions: js.UndefOr[String | js.Array[String]] = js.native
    
    var files: js.UndefOr[js.Array[String]] = js.native
    
    var jsExtensions: js.UndefOr[String | js.Array[String]] = js.native
    
    var links: js.UndefOr[String | LinkTagOptions | (js.Array[String | LinkTagOptions])] = js.native
    
    var metas: js.UndefOr[String | MetaTagOptions | (js.Array[String | MetaTagOptions])] = js.native
    
    var prependExternals: js.UndefOr[Boolean] = js.native
    
    var scripts: js.UndefOr[String | ScriptTagOptions | (js.Array[String | ScriptTagOptions])] = js.native
    
    var tags: js.UndefOr[
        String | MaybeLinkTagOptions | MaybeScriptTagOptions | (js.Array[String | MaybeLinkTagOptions | MaybeScriptTagOptions])
      ] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCssExtensions(value: String | js.Array[String]): Self = StObject.set(x, "cssExtensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssExtensionsUndefined: Self = StObject.set(x, "cssExtensions", js.undefined)
      
      @scala.inline
      def setCssExtensionsVarargs(value: String*): Self = StObject.set(x, "cssExtensions", js.Array(value :_*))
      
      @scala.inline
      def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      @scala.inline
      def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value :_*))
      
      @scala.inline
      def setJsExtensions(value: String | js.Array[String]): Self = StObject.set(x, "jsExtensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsExtensionsUndefined: Self = StObject.set(x, "jsExtensions", js.undefined)
      
      @scala.inline
      def setJsExtensionsVarargs(value: String*): Self = StObject.set(x, "jsExtensions", js.Array(value :_*))
      
      @scala.inline
      def setLinks(value: String | LinkTagOptions | (js.Array[String | LinkTagOptions])): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
      
      @scala.inline
      def setLinksVarargs(value: (String | LinkTagOptions)*): Self = StObject.set(x, "links", js.Array(value :_*))
      
      @scala.inline
      def setMetas(value: String | MetaTagOptions | (js.Array[String | MetaTagOptions])): Self = StObject.set(x, "metas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetasUndefined: Self = StObject.set(x, "metas", js.undefined)
      
      @scala.inline
      def setMetasVarargs(value: (String | MetaTagOptions)*): Self = StObject.set(x, "metas", js.Array(value :_*))
      
      @scala.inline
      def setPrependExternals(value: Boolean): Self = StObject.set(x, "prependExternals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrependExternalsUndefined: Self = StObject.set(x, "prependExternals", js.undefined)
      
      @scala.inline
      def setScripts(value: String | ScriptTagOptions | (js.Array[String | ScriptTagOptions])): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScriptsUndefined: Self = StObject.set(x, "scripts", js.undefined)
      
      @scala.inline
      def setScriptsVarargs(value: (String | ScriptTagOptions)*): Self = StObject.set(x, "scripts", js.Array(value :_*))
      
      @scala.inline
      def setTags(
        value: String | MaybeLinkTagOptions | MaybeScriptTagOptions | (js.Array[String | MaybeLinkTagOptions | MaybeScriptTagOptions])
      ): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTagsVarargs(value: (String | MaybeLinkTagOptions | MaybeScriptTagOptions)*): Self = StObject.set(x, "tags", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ScriptTagOptions extends BaseTagOptions {
    
    var attributes: js.UndefOr[AttributesObject] = js.native
    
    var external: js.UndefOr[ExternalObject] = js.native
    
    var path: String = js.native
  }
  object ScriptTagOptions {
    
    @scala.inline
    def apply(path: String): ScriptTagOptions = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScriptTagOptions]
    }
    
    @scala.inline
    implicit class ScriptTagOptionsMutableBuilder[Self <: ScriptTagOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: AttributesObject): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      @scala.inline
      def setExternal(value: ExternalObject): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternalUndefined: Self = StObject.set(x, "external", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.htmlWebpackTagsPlugin.htmlWebpackTagsPluginStrings.css
    - typings.htmlWebpackTagsPlugin.htmlWebpackTagsPluginStrings.js_
  */
  trait TypeString extends StObject
  object TypeString {
    
    @scala.inline
    def css: typings.htmlWebpackTagsPlugin.htmlWebpackTagsPluginStrings.css = "css".asInstanceOf[typings.htmlWebpackTagsPlugin.htmlWebpackTagsPluginStrings.css]
    
    @scala.inline
    def js_ : typings.htmlWebpackTagsPlugin.htmlWebpackTagsPluginStrings.js_ = "js".asInstanceOf[typings.htmlWebpackTagsPlugin.htmlWebpackTagsPluginStrings.js_]
  }
}
