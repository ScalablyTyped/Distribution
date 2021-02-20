package typings.jupyterlabApplication

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait App extends StObject {
    
    val app: String = js.native
    
    val base: String = js.native
    
    val hubHost: js.UndefOr[String] = js.native
    
    val hubPrefix: js.UndefOr[String] = js.native
    
    val hubServerName: js.UndefOr[String] = js.native
    
    val hubUser: js.UndefOr[String] = js.native
    
    val notFound: js.UndefOr[String] = js.native
    
    val settings: String = js.native
    
    val static: String = js.native
    
    val themes: String = js.native
    
    val tree: String = js.native
    
    val workspaces: String = js.native
  }
  object App {
    
    @scala.inline
    def apply(
      app: String,
      base: String,
      settings: String,
      static: String,
      themes: String,
      tree: String,
      workspaces: String
    ): App = {
      val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], themes = themes.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], workspaces = workspaces.asInstanceOf[js.Any])
      __obj.asInstanceOf[App]
    }
    
    @scala.inline
    implicit class AppMutableBuilder[Self <: App] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApp(value: String): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHubHost(value: String): Self = StObject.set(x, "hubHost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHubHostUndefined: Self = StObject.set(x, "hubHost", js.undefined)
      
      @scala.inline
      def setHubPrefix(value: String): Self = StObject.set(x, "hubPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHubPrefixUndefined: Self = StObject.set(x, "hubPrefix", js.undefined)
      
      @scala.inline
      def setHubServerName(value: String): Self = StObject.set(x, "hubServerName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHubServerNameUndefined: Self = StObject.set(x, "hubServerName", js.undefined)
      
      @scala.inline
      def setHubUser(value: String): Self = StObject.set(x, "hubUser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHubUserUndefined: Self = StObject.set(x, "hubUser", js.undefined)
      
      @scala.inline
      def setNotFound(value: String): Self = StObject.set(x, "notFound", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotFoundUndefined: Self = StObject.set(x, "notFound", js.undefined)
      
      @scala.inline
      def setSettings(value: String): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatic(value: String): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemes(value: String): Self = StObject.set(x, "themes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTree(value: String): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkspaces(value: String): Self = StObject.set(x, "workspaces", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AppSettings extends StObject {
    
    val appSettings: String = js.native
    
    val schemas: String = js.native
    
    val serverRoot: String = js.native
    
    val static: String = js.native
    
    val templates: String = js.native
    
    val themes: String = js.native
    
    val userSettings: String = js.native
    
    val workspaces: String = js.native
  }
  object AppSettings {
    
    @scala.inline
    def apply(
      appSettings: String,
      schemas: String,
      serverRoot: String,
      static: String,
      templates: String,
      themes: String,
      userSettings: String,
      workspaces: String
    ): AppSettings = {
      val __obj = js.Dynamic.literal(appSettings = appSettings.asInstanceOf[js.Any], schemas = schemas.asInstanceOf[js.Any], serverRoot = serverRoot.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], templates = templates.asInstanceOf[js.Any], themes = themes.asInstanceOf[js.Any], userSettings = userSettings.asInstanceOf[js.Any], workspaces = workspaces.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppSettings]
    }
    
    @scala.inline
    implicit class AppSettingsMutableBuilder[Self <: AppSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppSettings(value: String): Self = StObject.set(x, "appSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemas(value: String): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerRoot(value: String): Self = StObject.set(x, "serverRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatic(value: String): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplates(value: String): Self = StObject.set(x, "templates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemes(value: String): Self = StObject.set(x, "themes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserSettings(value: String): Self = StObject.set(x, "userSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkspaces(value: String): Self = StObject.set(x, "workspaces", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Browser extends StObject {
    
    var browser: String = js.native
    
    var file: String = js.native
  }
  object Browser {
    
    @scala.inline
    def apply(browser: String, file: String): Browser = {
      val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[Browser]
    }
    
    @scala.inline
    implicit class BrowserMutableBuilder[Self <: Browser] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBrowser(value: String): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Matches extends StObject {
    
    var matches: js.Array[String] = js.native
    
    var patterns: js.Array[String] = js.native
  }
  object Matches {
    
    @scala.inline
    def apply(matches: js.Array[String], patterns: js.Array[String]): Matches = {
      val __obj = js.Dynamic.literal(matches = matches.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any])
      __obj.asInstanceOf[Matches]
    }
    
    @scala.inline
    implicit class MatchesMutableBuilder[Self <: Matches] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMatches(value: js.Array[String]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchesVarargs(value: String*): Self = StObject.set(x, "matches", js.Array(value :_*))
      
      @scala.inline
      def setPatterns(value: js.Array[String]): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternsVarargs(value: String*): Self = StObject.set(x, "patterns", js.Array(value :_*))
    }
  }
  
  /* Inlined std.Partial<@jupyterlab/application.@jupyterlab/application/lib/frontend.JupyterFrontEnd.IPaths> */
  @js.native
  trait PartialIPaths extends StObject {
    
    var directories: js.UndefOr[AppSettings] = js.native
    
    var urls: js.UndefOr[App] = js.native
  }
  object PartialIPaths {
    
    @scala.inline
    def apply(): PartialIPaths = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialIPaths]
    }
    
    @scala.inline
    implicit class PartialIPathsMutableBuilder[Self <: PartialIPaths] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirectories(value: AppSettings): Self = StObject.set(x, "directories", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectoriesUndefined: Self = StObject.set(x, "directories", js.undefined)
      
      @scala.inline
      def setUrls(value: App): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlsUndefined: Self = StObject.set(x, "urls", js.undefined)
    }
  }
}
