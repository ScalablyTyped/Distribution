package typings.jade

import org.scalablytyped.runtime.StringDictionary
import typings.jade.anon.Body
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jade", "compile")
  @js.native
  def compile(template: String): JadeGenerationFunction = js.native
  @JSImport("jade", "compile")
  @js.native
  def compile(template: String, options: JadeOptions): JadeGenerationFunction = js.native
  
  @JSImport("jade", "compileClient")
  @js.native
  def compileClient(template: String): JadeGenerationFunction = js.native
  @JSImport("jade", "compileClient")
  @js.native
  def compileClient(template: String, options: JadeOptions): JadeGenerationFunction = js.native
  
  @JSImport("jade", "compileClientWithDependenciesTracked")
  @js.native
  def compileClientWithDependenciesTracked(template: String): Body = js.native
  @JSImport("jade", "compileClientWithDependenciesTracked")
  @js.native
  def compileClientWithDependenciesTracked(template: String, options: JadeOptions): Body = js.native
  
  @JSImport("jade", "compileFile")
  @js.native
  def compileFile(path: String): JadeGenerationFunction = js.native
  @JSImport("jade", "compileFile")
  @js.native
  def compileFile(path: String, options: JadeOptions): JadeGenerationFunction = js.native
  
  @JSImport("jade", "render")
  @js.native
  def render(template: String): String = js.native
  @JSImport("jade", "render")
  @js.native
  def render(template: String, options: JadeOptions): String = js.native
  
  @JSImport("jade", "renderFile")
  @js.native
  def renderFile(path: String): String = js.native
  @JSImport("jade", "renderFile")
  @js.native
  def renderFile(path: String, options: JadeOptions): String = js.native
  
  type JadeCustomFilterFunction = js.Function2[/* text */ String, /* options */ StringDictionary[Boolean], String]
  
  type JadeGenerationFunction = js.Function1[/* locals */ js.UndefOr[TemplateLocals], String]
  
  @js.native
  trait JadeOptions extends StObject {
    
    var basedir: js.UndefOr[String] = js.native
    
    var cache: js.UndefOr[Boolean] = js.native
    
    var compileDebug: js.UndefOr[Boolean] = js.native
    
    var debug: js.UndefOr[Boolean] = js.native
    
    var doctype: js.UndefOr[String] = js.native
    
    var filename: js.UndefOr[String] = js.native
    
    var filters: js.UndefOr[StringDictionary[JadeCustomFilterFunction]] = js.native
    
    var globals: js.UndefOr[js.Array[String]] = js.native
    
    var inlineRuntimeFunctions: js.UndefOr[Boolean] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var pretty: js.UndefOr[Boolean | String] = js.native
    
    var self: js.UndefOr[Boolean] = js.native
  }
  object JadeOptions {
    
    @scala.inline
    def apply(): JadeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JadeOptions]
    }
    
    @scala.inline
    implicit class JadeOptionsMutableBuilder[Self <: JadeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBasedir(value: String): Self = StObject.set(x, "basedir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasedirUndefined: Self = StObject.set(x, "basedir", js.undefined)
      
      @scala.inline
      def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      @scala.inline
      def setCompileDebug(value: Boolean): Self = StObject.set(x, "compileDebug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompileDebugUndefined: Self = StObject.set(x, "compileDebug", js.undefined)
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setDoctype(value: String): Self = StObject.set(x, "doctype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDoctypeUndefined: Self = StObject.set(x, "doctype", js.undefined)
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      @scala.inline
      def setFilters(value: StringDictionary[JadeCustomFilterFunction]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setGlobals(value: js.Array[String]): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalsUndefined: Self = StObject.set(x, "globals", js.undefined)
      
      @scala.inline
      def setGlobalsVarargs(value: String*): Self = StObject.set(x, "globals", js.Array(value :_*))
      
      @scala.inline
      def setInlineRuntimeFunctions(value: Boolean): Self = StObject.set(x, "inlineRuntimeFunctions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineRuntimeFunctionsUndefined: Self = StObject.set(x, "inlineRuntimeFunctions", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPretty(value: Boolean | String): Self = StObject.set(x, "pretty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrettyUndefined: Self = StObject.set(x, "pretty", js.undefined)
      
      @scala.inline
      def setSelf(value: Boolean): Self = StObject.set(x, "self", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelfUndefined: Self = StObject.set(x, "self", js.undefined)
    }
  }
  
  type TemplateLocals = StringDictionary[js.Any]
}
