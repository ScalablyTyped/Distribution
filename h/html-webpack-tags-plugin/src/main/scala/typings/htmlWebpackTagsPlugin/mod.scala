package typings.htmlWebpackTagsPlugin

import org.scalablytyped.runtime.StringDictionary
import typings.webpack.mod.Compiler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("html-webpack-tags-plugin", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with HtmlWebpackTagsPlugin {
    def this(options: Options) = this()
    
    /* CompleteClass */
    @JSName("apply")
    override def apply(compiler: Compiler): Unit = js.native
  }
  
  type AddHashFunction = js.Function2[/* assetPath */ String, /* hash */ String, String]
  
  type AddPublicPathFunction = js.Function2[/* assetPath */ String, /* publicPath */ String, String]
  
  type AttributesObject = StringDictionary[String | Boolean | Double]
  
  trait BaseTagOptions
    extends StObject
       with CommonOptions {
    
    var glob: js.UndefOr[String] = js.undefined
    
    var globFlatten: js.UndefOr[Boolean] = js.undefined
    
    var globPath: js.UndefOr[String] = js.undefined
    
    var sourcePath: js.UndefOr[String] = js.undefined
  }
  object BaseTagOptions {
    
    inline def apply(): BaseTagOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseTagOptions]
    }
    
    extension [Self <: BaseTagOptions](x: Self) {
      
      inline def setGlob(value: String): Self = StObject.set(x, "glob", value.asInstanceOf[js.Any])
      
      inline def setGlobFlatten(value: Boolean): Self = StObject.set(x, "globFlatten", value.asInstanceOf[js.Any])
      
      inline def setGlobFlattenUndefined: Self = StObject.set(x, "globFlatten", js.undefined)
      
      inline def setGlobPath(value: String): Self = StObject.set(x, "globPath", value.asInstanceOf[js.Any])
      
      inline def setGlobPathUndefined: Self = StObject.set(x, "globPath", js.undefined)
      
      inline def setGlobUndefined: Self = StObject.set(x, "glob", js.undefined)
      
      inline def setSourcePath(value: String): Self = StObject.set(x, "sourcePath", value.asInstanceOf[js.Any])
      
      inline def setSourcePathUndefined: Self = StObject.set(x, "sourcePath", js.undefined)
    }
  }
  
  trait CommonOptions extends StObject {
    
    var addHash: js.UndefOr[AddHashFunction] = js.undefined
    
    var addPublicPath: js.UndefOr[AddPublicPathFunction] = js.undefined
    
    var append: js.UndefOr[Boolean] = js.undefined
    
    var hash: js.UndefOr[Boolean | String | AddHashFunction] = js.undefined
    
    var publicPath: js.UndefOr[Boolean | String | AddPublicPathFunction] = js.undefined
    
    var useHash: js.UndefOr[Boolean] = js.undefined
    
    var usePublicPath: js.UndefOr[Boolean] = js.undefined
  }
  object CommonOptions {
    
    inline def apply(): CommonOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonOptions]
    }
    
    extension [Self <: CommonOptions](x: Self) {
      
      inline def setAddHash(value: (/* assetPath */ String, /* hash */ String) => String): Self = StObject.set(x, "addHash", js.Any.fromFunction2(value))
      
      inline def setAddHashUndefined: Self = StObject.set(x, "addHash", js.undefined)
      
      inline def setAddPublicPath(value: (/* assetPath */ String, /* publicPath */ String) => String): Self = StObject.set(x, "addPublicPath", js.Any.fromFunction2(value))
      
      inline def setAddPublicPathUndefined: Self = StObject.set(x, "addPublicPath", js.undefined)
      
      inline def setAppend(value: Boolean): Self = StObject.set(x, "append", value.asInstanceOf[js.Any])
      
      inline def setAppendUndefined: Self = StObject.set(x, "append", js.undefined)
      
      inline def setHash(value: Boolean | String | AddHashFunction): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHashFunction2(value: (/* assetPath */ String, /* hash */ String) => String): Self = StObject.set(x, "hash", js.Any.fromFunction2(value))
      
      inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      inline def setPublicPath(value: Boolean | String | AddPublicPathFunction): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
      
      inline def setPublicPathFunction2(value: (/* assetPath */ String, /* publicPath */ String) => String): Self = StObject.set(x, "publicPath", js.Any.fromFunction2(value))
      
      inline def setPublicPathUndefined: Self = StObject.set(x, "publicPath", js.undefined)
      
      inline def setUseHash(value: Boolean): Self = StObject.set(x, "useHash", value.asInstanceOf[js.Any])
      
      inline def setUseHashUndefined: Self = StObject.set(x, "useHash", js.undefined)
      
      inline def setUsePublicPath(value: Boolean): Self = StObject.set(x, "usePublicPath", value.asInstanceOf[js.Any])
      
      inline def setUsePublicPathUndefined: Self = StObject.set(x, "usePublicPath", js.undefined)
    }
  }
  
  trait ExternalObject extends StObject {
    
    var packageName: String
    
    var variableName: String
  }
  object ExternalObject {
    
    inline def apply(packageName: String, variableName: String): ExternalObject = {
      val __obj = js.Dynamic.literal(packageName = packageName.asInstanceOf[js.Any], variableName = variableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExternalObject]
    }
    
    extension [Self <: ExternalObject](x: Self) {
      
      inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
      
      inline def setVariableName(value: String): Self = StObject.set(x, "variableName", value.asInstanceOf[js.Any])
    }
  }
  
  trait HtmlWebpackTagsPlugin extends StObject {
    
    @JSName("apply")
    def apply(compiler: Compiler): Unit
  }
  object HtmlWebpackTagsPlugin {
    
    inline def apply(apply: Compiler => Unit): HtmlWebpackTagsPlugin = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply))
      __obj.asInstanceOf[HtmlWebpackTagsPlugin]
    }
    
    extension [Self <: HtmlWebpackTagsPlugin](x: Self) {
      
      inline def setApply(value: Compiler => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
    }
  }
  
  trait LinkTagOptions
    extends StObject
       with BaseTagOptions {
    
    var attributes: js.UndefOr[AttributesObject] = js.undefined
    
    var path: String
  }
  object LinkTagOptions {
    
    inline def apply(path: String): LinkTagOptions = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinkTagOptions]
    }
    
    extension [Self <: LinkTagOptions](x: Self) {
      
      inline def setAttributes(value: AttributesObject): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait MaybeLinkTagOptions
    extends StObject
       with LinkTagOptions {
    
    var `type`: js.UndefOr[TypeString] = js.undefined
  }
  object MaybeLinkTagOptions {
    
    inline def apply(path: String): MaybeLinkTagOptions = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[MaybeLinkTagOptions]
    }
    
    extension [Self <: MaybeLinkTagOptions](x: Self) {
      
      inline def setType(value: TypeString): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait MaybeScriptTagOptions
    extends StObject
       with ScriptTagOptions {
    
    var `type`: js.UndefOr[TypeString] = js.undefined
  }
  object MaybeScriptTagOptions {
    
    inline def apply(path: String): MaybeScriptTagOptions = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[MaybeScriptTagOptions]
    }
    
    extension [Self <: MaybeScriptTagOptions](x: Self) {
      
      inline def setType(value: TypeString): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait MetaTagOptions
    extends StObject
       with BaseTagOptions {
    
    var attributes: AttributesObject
    
    var path: js.UndefOr[String] = js.undefined
  }
  object MetaTagOptions {
    
    inline def apply(attributes: AttributesObject): MetaTagOptions = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetaTagOptions]
    }
    
    extension [Self <: MetaTagOptions](x: Self) {
      
      inline def setAttributes(value: AttributesObject): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
  
  trait Options
    extends StObject
       with CommonOptions {
    
    var cssExtensions: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var files: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var jsExtensions: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var links: js.UndefOr[String | LinkTagOptions | (js.Array[String | LinkTagOptions])] = js.undefined
    
    var metas: js.UndefOr[String | MetaTagOptions | (js.Array[String | MetaTagOptions])] = js.undefined
    
    var prependExternals: js.UndefOr[Boolean] = js.undefined
    
    var scripts: js.UndefOr[String | ScriptTagOptions | (js.Array[String | ScriptTagOptions])] = js.undefined
    
    var tags: js.UndefOr[
        String | MaybeLinkTagOptions | MaybeScriptTagOptions | (js.Array[String | MaybeLinkTagOptions | MaybeScriptTagOptions])
      ] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCssExtensions(value: String | js.Array[String]): Self = StObject.set(x, "cssExtensions", value.asInstanceOf[js.Any])
      
      inline def setCssExtensionsUndefined: Self = StObject.set(x, "cssExtensions", js.undefined)
      
      inline def setCssExtensionsVarargs(value: String*): Self = StObject.set(x, "cssExtensions", js.Array(value*))
      
      inline def setFiles(value: String | js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value*))
      
      inline def setJsExtensions(value: String | js.Array[String]): Self = StObject.set(x, "jsExtensions", value.asInstanceOf[js.Any])
      
      inline def setJsExtensionsUndefined: Self = StObject.set(x, "jsExtensions", js.undefined)
      
      inline def setJsExtensionsVarargs(value: String*): Self = StObject.set(x, "jsExtensions", js.Array(value*))
      
      inline def setLinks(value: String | LinkTagOptions | (js.Array[String | LinkTagOptions])): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
      
      inline def setLinksVarargs(value: (String | LinkTagOptions)*): Self = StObject.set(x, "links", js.Array(value*))
      
      inline def setMetas(value: String | MetaTagOptions | (js.Array[String | MetaTagOptions])): Self = StObject.set(x, "metas", value.asInstanceOf[js.Any])
      
      inline def setMetasUndefined: Self = StObject.set(x, "metas", js.undefined)
      
      inline def setMetasVarargs(value: (String | MetaTagOptions)*): Self = StObject.set(x, "metas", js.Array(value*))
      
      inline def setPrependExternals(value: Boolean): Self = StObject.set(x, "prependExternals", value.asInstanceOf[js.Any])
      
      inline def setPrependExternalsUndefined: Self = StObject.set(x, "prependExternals", js.undefined)
      
      inline def setScripts(value: String | ScriptTagOptions | (js.Array[String | ScriptTagOptions])): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
      
      inline def setScriptsUndefined: Self = StObject.set(x, "scripts", js.undefined)
      
      inline def setScriptsVarargs(value: (String | ScriptTagOptions)*): Self = StObject.set(x, "scripts", js.Array(value*))
      
      inline def setTags(
        value: String | MaybeLinkTagOptions | MaybeScriptTagOptions | (js.Array[String | MaybeLinkTagOptions | MaybeScriptTagOptions])
      ): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTagsVarargs(value: (String | MaybeLinkTagOptions | MaybeScriptTagOptions)*): Self = StObject.set(x, "tags", js.Array(value*))
    }
  }
  
  trait ScriptTagOptions
    extends StObject
       with BaseTagOptions {
    
    var attributes: js.UndefOr[AttributesObject] = js.undefined
    
    var external: js.UndefOr[ExternalObject] = js.undefined
    
    var path: String
  }
  object ScriptTagOptions {
    
    inline def apply(path: String): ScriptTagOptions = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScriptTagOptions]
    }
    
    extension [Self <: ScriptTagOptions](x: Self) {
      
      inline def setAttributes(value: AttributesObject): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setExternal(value: ExternalObject): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
      
      inline def setExternalUndefined: Self = StObject.set(x, "external", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.htmlWebpackTagsPlugin.htmlWebpackTagsPluginStrings.css
    - typings.htmlWebpackTagsPlugin.htmlWebpackTagsPluginStrings.js_
  */
  trait TypeString extends StObject
  object TypeString {
    
    inline def css: typings.htmlWebpackTagsPlugin.htmlWebpackTagsPluginStrings.css = "css".asInstanceOf[typings.htmlWebpackTagsPlugin.htmlWebpackTagsPluginStrings.css]
    
    inline def js_ : typings.htmlWebpackTagsPlugin.htmlWebpackTagsPluginStrings.js_ = "js".asInstanceOf[typings.htmlWebpackTagsPlugin.htmlWebpackTagsPluginStrings.js_]
  }
}
