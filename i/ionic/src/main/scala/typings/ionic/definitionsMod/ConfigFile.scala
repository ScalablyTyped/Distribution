package typings.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigFile extends StObject {
  
  @JSName("features.ssl-commands")
  var `featuresDotssl-commands`: js.UndefOr[Boolean] = js.native
  
  @JSName("git.host")
  var gitDothost: js.UndefOr[String] = js.native
  
  @JSName("git.port")
  var gitDotport: js.UndefOr[Double] = js.native
  
  @JSName("git.setup")
  var gitDotsetup: js.UndefOr[Boolean] = js.native
  
  var interactive: js.UndefOr[Boolean] = js.native
  
  var npmClient: NpmClient = js.native
  
  @JSName("org.id")
  var orgDotid: js.UndefOr[String] = js.native
  
  var proxy: js.UndefOr[String] = js.native
  
  @JSName("ssl.cafile")
  var sslDotcafile: js.UndefOr[String | js.Array[String]] = js.native
  
  @JSName("ssl.certfile")
  var sslDotcertfile: js.UndefOr[String | js.Array[String]] = js.native
  
  @JSName("ssl.keyfile")
  var sslDotkeyfile: js.UndefOr[String | js.Array[String]] = js.native
  
  var telemetry: Boolean = js.native
  
  @JSName("tokens.telemetry")
  var tokensDottelemetry: js.UndefOr[String] = js.native
  
  @JSName("tokens.user")
  var tokensDotuser: js.UndefOr[String] = js.native
  
  @JSName("urls.api")
  var urlsDotapi: js.UndefOr[String] = js.native
  
  @JSName("urls.dash")
  var urlsDotdash: js.UndefOr[String] = js.native
  
  @JSName("user.email")
  var userDotemail: js.UndefOr[String] = js.native
  
  @JSName("user.id")
  var userDotid: js.UndefOr[Double] = js.native
  
  var version: String = js.native
}
object ConfigFile {
  
  @scala.inline
  def apply(npmClient: NpmClient, telemetry: Boolean, version: String): ConfigFile = {
    val __obj = js.Dynamic.literal(npmClient = npmClient.asInstanceOf[js.Any], telemetry = telemetry.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigFile]
  }
  
  @scala.inline
  implicit class ConfigFileMutableBuilder[Self <: ConfigFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setFeaturesDotssl-commands`(value: Boolean): Self = StObject.set(x, "features.ssl-commands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFeaturesDotssl-commandsUndefined`: Self = StObject.set(x, "features.ssl-commands", js.undefined)
    
    @scala.inline
    def setGitDothost(value: String): Self = StObject.set(x, "git.host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGitDothostUndefined: Self = StObject.set(x, "git.host", js.undefined)
    
    @scala.inline
    def setGitDotport(value: Double): Self = StObject.set(x, "git.port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGitDotportUndefined: Self = StObject.set(x, "git.port", js.undefined)
    
    @scala.inline
    def setGitDotsetup(value: Boolean): Self = StObject.set(x, "git.setup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGitDotsetupUndefined: Self = StObject.set(x, "git.setup", js.undefined)
    
    @scala.inline
    def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInteractiveUndefined: Self = StObject.set(x, "interactive", js.undefined)
    
    @scala.inline
    def setNpmClient(value: NpmClient): Self = StObject.set(x, "npmClient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrgDotid(value: String): Self = StObject.set(x, "org.id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrgDotidUndefined: Self = StObject.set(x, "org.id", js.undefined)
    
    @scala.inline
    def setProxy(value: String): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
    
    @scala.inline
    def setSslDotcafile(value: String | js.Array[String]): Self = StObject.set(x, "ssl.cafile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSslDotcafileUndefined: Self = StObject.set(x, "ssl.cafile", js.undefined)
    
    @scala.inline
    def setSslDotcafileVarargs(value: String*): Self = StObject.set(x, "ssl.cafile", js.Array(value :_*))
    
    @scala.inline
    def setSslDotcertfile(value: String | js.Array[String]): Self = StObject.set(x, "ssl.certfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSslDotcertfileUndefined: Self = StObject.set(x, "ssl.certfile", js.undefined)
    
    @scala.inline
    def setSslDotcertfileVarargs(value: String*): Self = StObject.set(x, "ssl.certfile", js.Array(value :_*))
    
    @scala.inline
    def setSslDotkeyfile(value: String | js.Array[String]): Self = StObject.set(x, "ssl.keyfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSslDotkeyfileUndefined: Self = StObject.set(x, "ssl.keyfile", js.undefined)
    
    @scala.inline
    def setSslDotkeyfileVarargs(value: String*): Self = StObject.set(x, "ssl.keyfile", js.Array(value :_*))
    
    @scala.inline
    def setTelemetry(value: Boolean): Self = StObject.set(x, "telemetry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokensDottelemetry(value: String): Self = StObject.set(x, "tokens.telemetry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokensDottelemetryUndefined: Self = StObject.set(x, "tokens.telemetry", js.undefined)
    
    @scala.inline
    def setTokensDotuser(value: String): Self = StObject.set(x, "tokens.user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokensDotuserUndefined: Self = StObject.set(x, "tokens.user", js.undefined)
    
    @scala.inline
    def setUrlsDotapi(value: String): Self = StObject.set(x, "urls.api", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlsDotapiUndefined: Self = StObject.set(x, "urls.api", js.undefined)
    
    @scala.inline
    def setUrlsDotdash(value: String): Self = StObject.set(x, "urls.dash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlsDotdashUndefined: Self = StObject.set(x, "urls.dash", js.undefined)
    
    @scala.inline
    def setUserDotemail(value: String): Self = StObject.set(x, "user.email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserDotemailUndefined: Self = StObject.set(x, "user.email", js.undefined)
    
    @scala.inline
    def setUserDotid(value: Double): Self = StObject.set(x, "user.id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserDotidUndefined: Self = StObject.set(x, "user.id", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
