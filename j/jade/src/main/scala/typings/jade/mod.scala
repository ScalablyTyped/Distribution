package typings.jade

import org.scalablytyped.runtime.StringDictionary
import typings.jade.anon.Body
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jade", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compile(template: String): JadeGenerationFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")(template.asInstanceOf[js.Any]).asInstanceOf[JadeGenerationFunction]
  inline def compile(template: String, options: JadeOptions): JadeGenerationFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(template.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[JadeGenerationFunction]
  
  inline def compileClient(template: String): JadeGenerationFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("compileClient")(template.asInstanceOf[js.Any]).asInstanceOf[JadeGenerationFunction]
  inline def compileClient(template: String, options: JadeOptions): JadeGenerationFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("compileClient")(template.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[JadeGenerationFunction]
  
  inline def compileClientWithDependenciesTracked(template: String): Body = ^.asInstanceOf[js.Dynamic].applyDynamic("compileClientWithDependenciesTracked")(template.asInstanceOf[js.Any]).asInstanceOf[Body]
  inline def compileClientWithDependenciesTracked(template: String, options: JadeOptions): Body = (^.asInstanceOf[js.Dynamic].applyDynamic("compileClientWithDependenciesTracked")(template.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Body]
  
  inline def compileFile(path: String): JadeGenerationFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("compileFile")(path.asInstanceOf[js.Any]).asInstanceOf[JadeGenerationFunction]
  inline def compileFile(path: String, options: JadeOptions): JadeGenerationFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("compileFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[JadeGenerationFunction]
  
  inline def render(template: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("render")(template.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def render(template: String, options: JadeOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(template.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def renderFile(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("renderFile")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def renderFile(path: String, options: JadeOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("renderFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type JadeCustomFilterFunction = js.Function2[/* text */ String, /* options */ StringDictionary[Boolean], String]
  
  type JadeGenerationFunction = js.Function1[/* locals */ js.UndefOr[TemplateLocals], String]
  
  trait JadeOptions extends StObject {
    
    var basedir: js.UndefOr[String] = js.undefined
    
    var cache: js.UndefOr[Boolean] = js.undefined
    
    var compileDebug: js.UndefOr[Boolean] = js.undefined
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var doctype: js.UndefOr[String] = js.undefined
    
    var filename: js.UndefOr[String] = js.undefined
    
    var filters: js.UndefOr[StringDictionary[JadeCustomFilterFunction]] = js.undefined
    
    var globals: js.UndefOr[js.Array[String]] = js.undefined
    
    var inlineRuntimeFunctions: js.UndefOr[Boolean] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var pretty: js.UndefOr[Boolean | String] = js.undefined
    
    var self: js.UndefOr[Boolean] = js.undefined
  }
  object JadeOptions {
    
    inline def apply(): JadeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JadeOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JadeOptions] (val x: Self) extends AnyVal {
      
      inline def setBasedir(value: String): Self = StObject.set(x, "basedir", value.asInstanceOf[js.Any])
      
      inline def setBasedirUndefined: Self = StObject.set(x, "basedir", js.undefined)
      
      inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setCompileDebug(value: Boolean): Self = StObject.set(x, "compileDebug", value.asInstanceOf[js.Any])
      
      inline def setCompileDebugUndefined: Self = StObject.set(x, "compileDebug", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setDoctype(value: String): Self = StObject.set(x, "doctype", value.asInstanceOf[js.Any])
      
      inline def setDoctypeUndefined: Self = StObject.set(x, "doctype", js.undefined)
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setFilters(value: StringDictionary[JadeCustomFilterFunction]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setGlobals(value: js.Array[String]): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
      
      inline def setGlobalsUndefined: Self = StObject.set(x, "globals", js.undefined)
      
      inline def setGlobalsVarargs(value: String*): Self = StObject.set(x, "globals", js.Array(value*))
      
      inline def setInlineRuntimeFunctions(value: Boolean): Self = StObject.set(x, "inlineRuntimeFunctions", value.asInstanceOf[js.Any])
      
      inline def setInlineRuntimeFunctionsUndefined: Self = StObject.set(x, "inlineRuntimeFunctions", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPretty(value: Boolean | String): Self = StObject.set(x, "pretty", value.asInstanceOf[js.Any])
      
      inline def setPrettyUndefined: Self = StObject.set(x, "pretty", js.undefined)
      
      inline def setSelf(value: Boolean): Self = StObject.set(x, "self", value.asInstanceOf[js.Any])
      
      inline def setSelfUndefined: Self = StObject.set(x, "self", js.undefined)
    }
  }
  
  type TemplateLocals = StringDictionary[Any]
}
