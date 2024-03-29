package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebApp extends StObject {
  
  /** The display mode of the web app. */
  var displayMode: js.UndefOr[String] = js.undefined
  
  /** A list of icons for the web app. Must have at least one element. */
  var icons: js.UndefOr[js.Array[WebAppIcon]] = js.undefined
  
  /** The name of the web app, which is generated by the server during creation in the form enterprises/{enterpriseId}/webApps/{packageName}. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The start URL, i.e. the URL that should load when the user opens the application. */
  var startUrl: js.UndefOr[String] = js.undefined
  
  /** The title of the web app as displayed to the user (e.g., amongst a list of other applications, or as a label for an icon). */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * The current version of the app.Note that the version can automatically increase during the lifetime of the web app, while Google does internal housekeeping to keep the web app
    * up-to-date.
    */
  var versionCode: js.UndefOr[String] = js.undefined
}
object WebApp {
  
  inline def apply(): WebApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebApp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebApp] (val x: Self) extends AnyVal {
    
    inline def setDisplayMode(value: String): Self = StObject.set(x, "displayMode", value.asInstanceOf[js.Any])
    
    inline def setDisplayModeUndefined: Self = StObject.set(x, "displayMode", js.undefined)
    
    inline def setIcons(value: js.Array[WebAppIcon]): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
    
    inline def setIconsVarargs(value: WebAppIcon*): Self = StObject.set(x, "icons", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStartUrl(value: String): Self = StObject.set(x, "startUrl", value.asInstanceOf[js.Any])
    
    inline def setStartUrlUndefined: Self = StObject.set(x, "startUrl", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setVersionCode(value: String): Self = StObject.set(x, "versionCode", value.asInstanceOf[js.Any])
    
    inline def setVersionCodeUndefined: Self = StObject.set(x, "versionCode", js.undefined)
  }
}
