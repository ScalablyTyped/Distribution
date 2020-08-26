package typings.karmaBrowserstackLauncher.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrowserStackOptions extends js.Object {
  /**  BS access key, you can also use BROWSERSTACK_ACCESS_KEY env variable */
  var accessKey: String = js.native
  /** the BS worker build name */
  var build: js.UndefOr[String] = js.native
  /** the browser capture timeout */
  var captureTimeout: js.UndefOr[Double] = js.native
  /** force traffic through the local BrowserStack tunnel, passes flag through to BrowserStackTunnel */
  var forcelocal: js.UndefOr[Boolean] = js.native
  /**
    * @alias tunnelIdentifier
    */
  var localIdentifier: js.UndefOr[String] = js.native
  /** the BS worker name  */
  var name: js.UndefOr[String] = js.native
  /** the BS worker project name */
  var project: js.UndefOr[String] = js.native
  /** the host of your proxy for communicating with BrowserStack REST API and BrowserStackLocal */
  var proxyHost: js.UndefOr[String] = js.native
  /** the password used for authentication with your proxy */
  var proxyPass: js.UndefOr[String] = js.native
  /** the port of your proxy */
  var proxyPort: js.UndefOr[Double] = js.native
  /** the protocol of your proxy (optional. default: http. valid: http or https) */
  var proxyProtocol: js.UndefOr[String] = js.native
  /** the username used for authentication with your proxy */
  var proxyUser: js.UndefOr[String] = js.native
  /** how many times do you want to retry to capture the browser */
  var retryLimit: js.UndefOr[Double] = js.native
  /** do you wanna establish the BrowserStack tunnel */
  var startTunnel: js.UndefOr[Boolean] = js.native
  /** the BS worker timeout */
  var timeout: js.UndefOr[Double] = js.native
  /**
    * in case you want to start the BrowserStack tunnel outside `karma` by setting `startTunnel` to `false`,
    * set the identifier passed to the `-localIdentifier` option here
    */
  var tunnelIdentifier: js.UndefOr[String] = js.native
  /** BS username, you can also use BROWSERSTACK_USERNAME env variable */
  var username: String = js.native
  /** enable video recording of session on BrowserStack */
  var video: js.UndefOr[Boolean] = js.native
}

object BrowserStackOptions {
  @scala.inline
  def apply(accessKey: String, username: String): BrowserStackOptions = {
    val __obj = js.Dynamic.literal(accessKey = accessKey.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowserStackOptions]
  }
  @scala.inline
  implicit class BrowserStackOptionsOps[Self <: BrowserStackOptions] (val x: Self) extends AnyVal {
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
    def setAccessKey(value: String): Self = this.set("accessKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    @scala.inline
    def setBuild(value: String): Self = this.set("build", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuild: Self = this.set("build", js.undefined)
    @scala.inline
    def setCaptureTimeout(value: Double): Self = this.set("captureTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaptureTimeout: Self = this.set("captureTimeout", js.undefined)
    @scala.inline
    def setForcelocal(value: Boolean): Self = this.set("forcelocal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForcelocal: Self = this.set("forcelocal", js.undefined)
    @scala.inline
    def setLocalIdentifier(value: String): Self = this.set("localIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalIdentifier: Self = this.set("localIdentifier", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setProject(value: String): Self = this.set("project", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProject: Self = this.set("project", js.undefined)
    @scala.inline
    def setProxyHost(value: String): Self = this.set("proxyHost", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProxyHost: Self = this.set("proxyHost", js.undefined)
    @scala.inline
    def setProxyPass(value: String): Self = this.set("proxyPass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProxyPass: Self = this.set("proxyPass", js.undefined)
    @scala.inline
    def setProxyPort(value: Double): Self = this.set("proxyPort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProxyPort: Self = this.set("proxyPort", js.undefined)
    @scala.inline
    def setProxyProtocol(value: String): Self = this.set("proxyProtocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProxyProtocol: Self = this.set("proxyProtocol", js.undefined)
    @scala.inline
    def setProxyUser(value: String): Self = this.set("proxyUser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProxyUser: Self = this.set("proxyUser", js.undefined)
    @scala.inline
    def setRetryLimit(value: Double): Self = this.set("retryLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetryLimit: Self = this.set("retryLimit", js.undefined)
    @scala.inline
    def setStartTunnel(value: Boolean): Self = this.set("startTunnel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTunnel: Self = this.set("startTunnel", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setTunnelIdentifier(value: String): Self = this.set("tunnelIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTunnelIdentifier: Self = this.set("tunnelIdentifier", js.undefined)
    @scala.inline
    def setVideo(value: Boolean): Self = this.set("video", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideo: Self = this.set("video", js.undefined)
  }
  
}

