package typings.ionic.anon

import typings.ionic.definitionsMod.NpmClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<ionic.ionic/definitions.ConfigFile> */
@js.native
trait PartialConfigFile extends js.Object {
  
  @JSName("features.ssl-commands")
  var `featuresDotssl-commands`: js.UndefOr[Boolean] = js.native
  
  @JSName("git.host")
  var gitDothost: js.UndefOr[String] = js.native
  
  @JSName("git.port")
  var gitDotport: js.UndefOr[Double] = js.native
  
  @JSName("git.setup")
  var gitDotsetup: js.UndefOr[Boolean] = js.native
  
  var interactive: js.UndefOr[Boolean] = js.native
  
  var npmClient: js.UndefOr[NpmClient] = js.native
  
  @JSName("org.id")
  var orgDotid: js.UndefOr[String] = js.native
  
  var proxy: js.UndefOr[String] = js.native
  
  @JSName("ssl.cafile")
  var sslDotcafile: js.UndefOr[String | js.Array[String]] = js.native
  
  @JSName("ssl.certfile")
  var sslDotcertfile: js.UndefOr[String | js.Array[String]] = js.native
  
  @JSName("ssl.keyfile")
  var sslDotkeyfile: js.UndefOr[String | js.Array[String]] = js.native
  
  var telemetry: js.UndefOr[Boolean] = js.native
  
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
  
  var version: js.UndefOr[String] = js.native
}
object PartialConfigFile {
  
  @scala.inline
  def apply(): PartialConfigFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialConfigFile]
  }
  
  @scala.inline
  implicit class PartialConfigFileOps[Self <: PartialConfigFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def `setFeaturesDotssl-commands`(value: Boolean): Self = this.set("features.ssl-commands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFeaturesDotssl-commands`: Self = this.set("features.ssl-commands", js.undefined)
    
    @scala.inline
    def setGitDothost(value: String): Self = this.set("git.host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGitDothost: Self = this.set("git.host", js.undefined)
    
    @scala.inline
    def setGitDotport(value: Double): Self = this.set("git.port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGitDotport: Self = this.set("git.port", js.undefined)
    
    @scala.inline
    def setGitDotsetup(value: Boolean): Self = this.set("git.setup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGitDotsetup: Self = this.set("git.setup", js.undefined)
    
    @scala.inline
    def setInteractive(value: Boolean): Self = this.set("interactive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInteractive: Self = this.set("interactive", js.undefined)
    
    @scala.inline
    def setNpmClient(value: NpmClient): Self = this.set("npmClient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNpmClient: Self = this.set("npmClient", js.undefined)
    
    @scala.inline
    def setOrgDotid(value: String): Self = this.set("org.id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrgDotid: Self = this.set("org.id", js.undefined)
    
    @scala.inline
    def setProxy(value: String): Self = this.set("proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxy: Self = this.set("proxy", js.undefined)
    
    @scala.inline
    def setSslDotcafileVarargs(value: String*): Self = this.set("ssl.cafile", js.Array(value :_*))
    
    @scala.inline
    def setSslDotcafile(value: String | js.Array[String]): Self = this.set("ssl.cafile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSslDotcafile: Self = this.set("ssl.cafile", js.undefined)
    
    @scala.inline
    def setSslDotcertfileVarargs(value: String*): Self = this.set("ssl.certfile", js.Array(value :_*))
    
    @scala.inline
    def setSslDotcertfile(value: String | js.Array[String]): Self = this.set("ssl.certfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSslDotcertfile: Self = this.set("ssl.certfile", js.undefined)
    
    @scala.inline
    def setSslDotkeyfileVarargs(value: String*): Self = this.set("ssl.keyfile", js.Array(value :_*))
    
    @scala.inline
    def setSslDotkeyfile(value: String | js.Array[String]): Self = this.set("ssl.keyfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSslDotkeyfile: Self = this.set("ssl.keyfile", js.undefined)
    
    @scala.inline
    def setTelemetry(value: Boolean): Self = this.set("telemetry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTelemetry: Self = this.set("telemetry", js.undefined)
    
    @scala.inline
    def setTokensDottelemetry(value: String): Self = this.set("tokens.telemetry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTokensDottelemetry: Self = this.set("tokens.telemetry", js.undefined)
    
    @scala.inline
    def setTokensDotuser(value: String): Self = this.set("tokens.user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTokensDotuser: Self = this.set("tokens.user", js.undefined)
    
    @scala.inline
    def setUrlsDotapi(value: String): Self = this.set("urls.api", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrlsDotapi: Self = this.set("urls.api", js.undefined)
    
    @scala.inline
    def setUrlsDotdash(value: String): Self = this.set("urls.dash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrlsDotdash: Self = this.set("urls.dash", js.undefined)
    
    @scala.inline
    def setUserDotemail(value: String): Self = this.set("user.email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserDotemail: Self = this.set("user.email", js.undefined)
    
    @scala.inline
    def setUserDotid(value: Double): Self = this.set("user.id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserDotid: Self = this.set("user.id", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
