package typings.koaEjs

import org.scalablytyped.runtime.StringDictionary
import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.^
import typings.koaEjs.koaEjsBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    *  Adds render method to the app context.
    */
  @JSImport("koa-ejs", JSImport.Namespace)
  @js.native
  def apply(app: ^[DefaultState, DefaultContext], settings: Settings): Unit = js.native
  
  /**
    * The ejs API.
    */
  @JSImport("koa-ejs", "ejs")
  @js.native
  val ejs: js.Any = js.native
  
  @js.native
  trait Settings extends StObject {
    
    /** When true, EJS will use an async function for rendering. Depends on async/await support in the JS runtime */
    var async: js.UndefOr[Boolean] = js.native
    
    /** Cache compiled templates */
    var cache: js.UndefOr[Boolean] = js.native
    
    /** Log debug messages. */
    var debug: js.UndefOr[Boolean] = js.native
    
    /** Character to use with angle brackets for open / close (default %). */
    var delimiter: js.UndefOr[String] = js.native
    
    /** Global layout file, default is layout, set false to disable layout. */
    var layout: js.UndefOr[String | `false`] = js.native
    
    /** View root directory */
    var root: String = js.native
    
    /** Filename extension for the views. Defaults to html. */
    var viewExt: js.UndefOr[String] = js.native
  }
  object Settings {
    
    @scala.inline
    def apply(root: String): Settings = {
      val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[Settings]
    }
    
    @scala.inline
    implicit class SettingsMutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      @scala.inline
      def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      @scala.inline
      def setLayout(value: String | `false`): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewExt(value: String): Self = StObject.set(x, "viewExt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewExtUndefined: Self = StObject.set(x, "viewExt", js.undefined)
    }
  }
  
  object koaAugmentingMod {
    
    @js.native
    trait ExtendableContext extends StObject {
      
      /** Properties values can be of any format; e.g. string, number, boolean, or even nested objects of these types */
      def render(template: String): js.Promise[String] = js.native
      def render(template: String, properties: StringDictionary[js.Any]): js.Promise[String] = js.native
    }
  }
}
