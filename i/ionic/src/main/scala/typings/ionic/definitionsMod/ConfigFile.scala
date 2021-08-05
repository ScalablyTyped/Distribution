package typings.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigFile extends StObject {
  
  @JSName("features.ssl-commands")
  var `featuresDotssl-commands`: js.UndefOr[Boolean] = js.undefined
  
  @JSName("git.host")
  var gitDothost: js.UndefOr[String] = js.undefined
  
  @JSName("git.port")
  var gitDotport: js.UndefOr[Double] = js.undefined
  
  @JSName("git.setup")
  var gitDotsetup: js.UndefOr[Boolean] = js.undefined
  
  var interactive: js.UndefOr[Boolean] = js.undefined
  
  var npmClient: NpmClient
  
  @JSName("org.id")
  var orgDotid: js.UndefOr[String] = js.undefined
  
  var proxy: js.UndefOr[String] = js.undefined
  
  @JSName("ssl.cafile")
  var sslDotcafile: js.UndefOr[String | js.Array[String]] = js.undefined
  
  @JSName("ssl.certfile")
  var sslDotcertfile: js.UndefOr[String | js.Array[String]] = js.undefined
  
  @JSName("ssl.keyfile")
  var sslDotkeyfile: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var telemetry: Boolean
  
  @JSName("tokens.telemetry")
  var tokensDottelemetry: js.UndefOr[String] = js.undefined
  
  @JSName("tokens.user")
  var tokensDotuser: js.UndefOr[String] = js.undefined
  
  @JSName("urls.api")
  var urlsDotapi: js.UndefOr[String] = js.undefined
  
  @JSName("urls.dash")
  var urlsDotdash: js.UndefOr[String] = js.undefined
  
  @JSName("user.email")
  var userDotemail: js.UndefOr[String] = js.undefined
  
  @JSName("user.id")
  var userDotid: js.UndefOr[Double] = js.undefined
  
  var version: String
}
object ConfigFile {
  
  inline def apply(npmClient: NpmClient, telemetry: Boolean, version: String): ConfigFile = {
    val __obj = js.Dynamic.literal(npmClient = npmClient.asInstanceOf[js.Any], telemetry = telemetry.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigFile]
  }
  
  extension [Self <: ConfigFile](x: Self) {
    
    inline def `setFeaturesDotssl-commands`(value: Boolean): Self = StObject.set(x, "features.ssl-commands", value.asInstanceOf[js.Any])
    
    inline def `setFeaturesDotssl-commandsUndefined`: Self = StObject.set(x, "features.ssl-commands", js.undefined)
    
    inline def setGitDothost(value: String): Self = StObject.set(x, "git.host", value.asInstanceOf[js.Any])
    
    inline def setGitDothostUndefined: Self = StObject.set(x, "git.host", js.undefined)
    
    inline def setGitDotport(value: Double): Self = StObject.set(x, "git.port", value.asInstanceOf[js.Any])
    
    inline def setGitDotportUndefined: Self = StObject.set(x, "git.port", js.undefined)
    
    inline def setGitDotsetup(value: Boolean): Self = StObject.set(x, "git.setup", value.asInstanceOf[js.Any])
    
    inline def setGitDotsetupUndefined: Self = StObject.set(x, "git.setup", js.undefined)
    
    inline def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
    
    inline def setInteractiveUndefined: Self = StObject.set(x, "interactive", js.undefined)
    
    inline def setNpmClient(value: NpmClient): Self = StObject.set(x, "npmClient", value.asInstanceOf[js.Any])
    
    inline def setOrgDotid(value: String): Self = StObject.set(x, "org.id", value.asInstanceOf[js.Any])
    
    inline def setOrgDotidUndefined: Self = StObject.set(x, "org.id", js.undefined)
    
    inline def setProxy(value: String): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
    
    inline def setSslDotcafile(value: String | js.Array[String]): Self = StObject.set(x, "ssl.cafile", value.asInstanceOf[js.Any])
    
    inline def setSslDotcafileUndefined: Self = StObject.set(x, "ssl.cafile", js.undefined)
    
    inline def setSslDotcafileVarargs(value: String*): Self = StObject.set(x, "ssl.cafile", js.Array(value :_*))
    
    inline def setSslDotcertfile(value: String | js.Array[String]): Self = StObject.set(x, "ssl.certfile", value.asInstanceOf[js.Any])
    
    inline def setSslDotcertfileUndefined: Self = StObject.set(x, "ssl.certfile", js.undefined)
    
    inline def setSslDotcertfileVarargs(value: String*): Self = StObject.set(x, "ssl.certfile", js.Array(value :_*))
    
    inline def setSslDotkeyfile(value: String | js.Array[String]): Self = StObject.set(x, "ssl.keyfile", value.asInstanceOf[js.Any])
    
    inline def setSslDotkeyfileUndefined: Self = StObject.set(x, "ssl.keyfile", js.undefined)
    
    inline def setSslDotkeyfileVarargs(value: String*): Self = StObject.set(x, "ssl.keyfile", js.Array(value :_*))
    
    inline def setTelemetry(value: Boolean): Self = StObject.set(x, "telemetry", value.asInstanceOf[js.Any])
    
    inline def setTokensDottelemetry(value: String): Self = StObject.set(x, "tokens.telemetry", value.asInstanceOf[js.Any])
    
    inline def setTokensDottelemetryUndefined: Self = StObject.set(x, "tokens.telemetry", js.undefined)
    
    inline def setTokensDotuser(value: String): Self = StObject.set(x, "tokens.user", value.asInstanceOf[js.Any])
    
    inline def setTokensDotuserUndefined: Self = StObject.set(x, "tokens.user", js.undefined)
    
    inline def setUrlsDotapi(value: String): Self = StObject.set(x, "urls.api", value.asInstanceOf[js.Any])
    
    inline def setUrlsDotapiUndefined: Self = StObject.set(x, "urls.api", js.undefined)
    
    inline def setUrlsDotdash(value: String): Self = StObject.set(x, "urls.dash", value.asInstanceOf[js.Any])
    
    inline def setUrlsDotdashUndefined: Self = StObject.set(x, "urls.dash", js.undefined)
    
    inline def setUserDotemail(value: String): Self = StObject.set(x, "user.email", value.asInstanceOf[js.Any])
    
    inline def setUserDotemailUndefined: Self = StObject.set(x, "user.email", js.undefined)
    
    inline def setUserDotid(value: Double): Self = StObject.set(x, "user.id", value.asInstanceOf[js.Any])
    
    inline def setUserDotidUndefined: Self = StObject.set(x, "user.id", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
