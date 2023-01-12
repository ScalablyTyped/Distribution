package typings.jupyterlabApplication

import typings.jupyterlabApplication.jupyterlabApplicationStrings.display
import typings.jupyterlabApplication.jupyterlabApplicationStrings.scale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait App extends StObject {
    
    val app: String
    
    val base: String
    
    val doc: String
    
    val hubHost: js.UndefOr[String] = js.undefined
    
    val hubPrefix: js.UndefOr[String] = js.undefined
    
    val hubServerName: js.UndefOr[String] = js.undefined
    
    val hubUser: js.UndefOr[String] = js.undefined
    
    val notFound: js.UndefOr[String] = js.undefined
    
    val settings: String
    
    val static: String
    
    val themes: String
    
    val translations: String
  }
  object App {
    
    inline def apply(
      app: String,
      base: String,
      doc: String,
      settings: String,
      static: String,
      themes: String,
      translations: String
    ): App = {
      val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], doc = doc.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], themes = themes.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
      __obj.asInstanceOf[App]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: App] (val x: Self) extends AnyVal {
      
      inline def setApp(value: String): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      inline def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setDoc(value: String): Self = StObject.set(x, "doc", value.asInstanceOf[js.Any])
      
      inline def setHubHost(value: String): Self = StObject.set(x, "hubHost", value.asInstanceOf[js.Any])
      
      inline def setHubHostUndefined: Self = StObject.set(x, "hubHost", js.undefined)
      
      inline def setHubPrefix(value: String): Self = StObject.set(x, "hubPrefix", value.asInstanceOf[js.Any])
      
      inline def setHubPrefixUndefined: Self = StObject.set(x, "hubPrefix", js.undefined)
      
      inline def setHubServerName(value: String): Self = StObject.set(x, "hubServerName", value.asInstanceOf[js.Any])
      
      inline def setHubServerNameUndefined: Self = StObject.set(x, "hubServerName", js.undefined)
      
      inline def setHubUser(value: String): Self = StObject.set(x, "hubUser", value.asInstanceOf[js.Any])
      
      inline def setHubUserUndefined: Self = StObject.set(x, "hubUser", js.undefined)
      
      inline def setNotFound(value: String): Self = StObject.set(x, "notFound", value.asInstanceOf[js.Any])
      
      inline def setNotFoundUndefined: Self = StObject.set(x, "notFound", js.undefined)
      
      inline def setSettings(value: String): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      inline def setStatic(value: String): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
      
      inline def setThemes(value: String): Self = StObject.set(x, "themes", value.asInstanceOf[js.Any])
      
      inline def setTranslations(value: String): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    }
  }
  
  trait AppSettings extends StObject {
    
    val appSettings: String
    
    val schemas: String
    
    val serverRoot: String
    
    val static: String
    
    val templates: String
    
    val themes: String
    
    val userSettings: String
    
    val workspaces: String
  }
  object AppSettings {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: AppSettings] (val x: Self) extends AnyVal {
      
      inline def setAppSettings(value: String): Self = StObject.set(x, "appSettings", value.asInstanceOf[js.Any])
      
      inline def setSchemas(value: String): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
      
      inline def setServerRoot(value: String): Self = StObject.set(x, "serverRoot", value.asInstanceOf[js.Any])
      
      inline def setStatic(value: String): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
      
      inline def setTemplates(value: String): Self = StObject.set(x, "templates", value.asInstanceOf[js.Any])
      
      inline def setThemes(value: String): Self = StObject.set(x, "themes", value.asInstanceOf[js.Any])
      
      inline def setUserSettings(value: String): Self = StObject.set(x, "userSettings", value.asInstanceOf[js.Any])
      
      inline def setWorkspaces(value: String): Self = StObject.set(x, "workspaces", value.asInstanceOf[js.Any])
    }
  }
  
  trait Browser extends StObject {
    
    var browser: String
    
    var file: String
  }
  object Browser {
    
    inline def apply(browser: String, file: String): Browser = {
      val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[Browser]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Browser] (val x: Self) extends AnyVal {
      
      inline def setBrowser(value: String): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    }
  }
  
  trait Matches extends StObject {
    
    var matches: js.Array[String]
    
    var patterns: js.Array[String]
  }
  object Matches {
    
    inline def apply(matches: js.Array[String], patterns: js.Array[String]): Matches = {
      val __obj = js.Dynamic.literal(matches = matches.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any])
      __obj.asInstanceOf[Matches]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Matches] (val x: Self) extends AnyVal {
      
      inline def setMatches(value: js.Array[String]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
      
      inline def setMatchesVarargs(value: String*): Self = StObject.set(x, "matches", js.Array(value*))
      
      inline def setPatterns(value: js.Array[String]): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
      
      inline def setPatternsVarargs(value: String*): Self = StObject.set(x, "patterns", js.Array(value*))
    }
  }
  
  /* Inlined std.Partial<@jupyterlab/application.@jupyterlab/application/lib/shell.ILabShell.IConfig> */
  trait PartialIConfig extends StObject {
    
    var hiddenMode: js.UndefOr[display | scale] = js.undefined
  }
  object PartialIConfig {
    
    inline def apply(): PartialIConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialIConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialIConfig] (val x: Self) extends AnyVal {
      
      inline def setHiddenMode(value: display | scale): Self = StObject.set(x, "hiddenMode", value.asInstanceOf[js.Any])
      
      inline def setHiddenModeUndefined: Self = StObject.set(x, "hiddenMode", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@jupyterlab/application.@jupyterlab/application/lib/frontend.JupyterFrontEnd.IPaths> */
  trait PartialIPaths extends StObject {
    
    var directories: js.UndefOr[AppSettings] = js.undefined
    
    var urls: js.UndefOr[App] = js.undefined
  }
  object PartialIPaths {
    
    inline def apply(): PartialIPaths = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialIPaths]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialIPaths] (val x: Self) extends AnyVal {
      
      inline def setDirectories(value: AppSettings): Self = StObject.set(x, "directories", value.asInstanceOf[js.Any])
      
      inline def setDirectoriesUndefined: Self = StObject.set(x, "directories", js.undefined)
      
      inline def setUrls(value: App): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
      
      inline def setUrlsUndefined: Self = StObject.set(x, "urls", js.undefined)
    }
  }
}
