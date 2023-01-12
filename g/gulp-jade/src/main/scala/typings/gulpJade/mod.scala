package typings.gulpJade

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Any = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Any]
  inline def apply(params: Params): Any = ^.asInstanceOf[js.Dynamic].apply(params.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("gulp-jade", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Params extends StObject {
    
    /**
      * If set to true, compiled functions are cached. filename
      * must be set as the cache key.
      */
    var cache: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Compile to JS instead of HTML.
      */
    var client: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If set to true, the function source will be included in the
      * compiled template for better error messages (sometimes useful
      * in development). It is enabled by default unless used with
      * express in production mode.
      */
    var compileDebug: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Data to be used while parsing jade files. Has lower
      * precedence than locals.
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /**
      * If set to true, the tokens and function body is logged
      * to stdout
      */
    var debug: js.UndefOr[Boolean] = js.undefined
    
    /*******
      * JADE API OPTIONS
      *******/
    /**
      * If the doctype is not specified as part of the
      * template, you can specify it here. It is sometimes
      * useful to get self-closing tags and remove mirroring
      * of boolean attributes.
      */
    var doctype: js.UndefOr[String] = js.undefined
    
    /*******
      * GULP-JADE OPTIONS
      *******/
    /**
      * Used to set a version of jade other than this library's
      * dependency, or to customise filters.
      */
    var jade: js.UndefOr[Any] = js.undefined
    
    /**
      * Locals to be used while parsing jade files. Takes
      * precedence over data.
      */
    var locals: js.UndefOr[Any] = js.undefined
    
    /**
      * Adds whitespace to the resulting html to make it
      * easier for a human to read using '  ' as indentation.
      * If a string is specified, that will be used as
      * indentation instead (e.g. '\t').
      */
    var pretty: js.UndefOr[Boolean | String] = js.undefined
    
    /**
      * Use a self namespace to hold the locals (false by default)
      */
    var self: js.UndefOr[Boolean] = js.undefined
  }
  object Params {
    
    inline def apply(): Params = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Params]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Params] (val x: Self) extends AnyVal {
      
      inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setClient(value: Boolean): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
      
      inline def setCompileDebug(value: Boolean): Self = StObject.set(x, "compileDebug", value.asInstanceOf[js.Any])
      
      inline def setCompileDebugUndefined: Self = StObject.set(x, "compileDebug", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setDoctype(value: String): Self = StObject.set(x, "doctype", value.asInstanceOf[js.Any])
      
      inline def setDoctypeUndefined: Self = StObject.set(x, "doctype", js.undefined)
      
      inline def setJade(value: Any): Self = StObject.set(x, "jade", value.asInstanceOf[js.Any])
      
      inline def setJadeUndefined: Self = StObject.set(x, "jade", js.undefined)
      
      inline def setLocals(value: Any): Self = StObject.set(x, "locals", value.asInstanceOf[js.Any])
      
      inline def setLocalsUndefined: Self = StObject.set(x, "locals", js.undefined)
      
      inline def setPretty(value: Boolean | String): Self = StObject.set(x, "pretty", value.asInstanceOf[js.Any])
      
      inline def setPrettyUndefined: Self = StObject.set(x, "pretty", js.undefined)
      
      inline def setSelf(value: Boolean): Self = StObject.set(x, "self", value.asInstanceOf[js.Any])
      
      inline def setSelfUndefined: Self = StObject.set(x, "self", js.undefined)
    }
  }
}
