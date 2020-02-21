package typings.karmaBrowserstackLauncher.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrowserStackOptions extends js.Object {
  /**  BS access key, you can also use BROWSERSTACK_ACCESS_KEY env variable */
  var accessKey: String
  /** the BS worker build name */
  var build: js.UndefOr[String] = js.undefined
  /** the browser capture timeout */
  var captureTimeout: js.UndefOr[Double] = js.undefined
  /** force traffic through the local BrowserStack tunnel, passes flag through to BrowserStackTunnel */
  var forcelocal: js.UndefOr[Boolean] = js.undefined
  /** the BS worker name  */
  var name: js.UndefOr[String] = js.undefined
  /** the BS worker project name */
  var project: js.UndefOr[String] = js.undefined
  /** the host of your proxy for communicating with BrowserStack REST API and BrowserStackLocal */
  var proxyHost: js.UndefOr[String] = js.undefined
  /** the password used for authentication with your proxy */
  var proxyPass: js.UndefOr[String] = js.undefined
  /** the port of your proxy */
  var proxyPort: js.UndefOr[Double] = js.undefined
  /** the protocol of your proxy (optional. default: http. valid: http or https) */
  var proxyProtocol: js.UndefOr[String] = js.undefined
  /** the username used for authentication with your proxy */
  var proxyUser: js.UndefOr[String] = js.undefined
  /** how many times do you want to retry to capture the browser */
  var retryLimit: js.UndefOr[Double] = js.undefined
  /** do you wanna establish the BrowserStack tunnel */
  var startTunnel: js.UndefOr[Boolean] = js.undefined
  /** the BS worker timeout */
  var timeout: js.UndefOr[Double] = js.undefined
  /**
    * in case you want to start the BrowserStack tunnel outside karma
    * by setting `startTunnel` to `false`,
    * set the identifier passed to the -localIdentifier option here (optional)
    */
  var tunnelIdentifier: js.UndefOr[String] = js.undefined
  /** BS username, you can also use BROWSERSTACK_USERNAME env variable */
  var username: String
  /** enable video recording of session on BrowserStack */
  var video: js.UndefOr[Boolean] = js.undefined
}

object BrowserStackOptions {
  @scala.inline
  def apply(
    accessKey: String,
    username: String,
    build: String = null,
    captureTimeout: Int | Double = null,
    forcelocal: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    project: String = null,
    proxyHost: String = null,
    proxyPass: String = null,
    proxyPort: Int | Double = null,
    proxyProtocol: String = null,
    proxyUser: String = null,
    retryLimit: Int | Double = null,
    startTunnel: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null,
    tunnelIdentifier: String = null,
    video: js.UndefOr[Boolean] = js.undefined
  ): BrowserStackOptions = {
    val __obj = js.Dynamic.literal(accessKey = accessKey.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    if (build != null) __obj.updateDynamic("build")(build.asInstanceOf[js.Any])
    if (captureTimeout != null) __obj.updateDynamic("captureTimeout")(captureTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(forcelocal)) __obj.updateDynamic("forcelocal")(forcelocal.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (project != null) __obj.updateDynamic("project")(project.asInstanceOf[js.Any])
    if (proxyHost != null) __obj.updateDynamic("proxyHost")(proxyHost.asInstanceOf[js.Any])
    if (proxyPass != null) __obj.updateDynamic("proxyPass")(proxyPass.asInstanceOf[js.Any])
    if (proxyPort != null) __obj.updateDynamic("proxyPort")(proxyPort.asInstanceOf[js.Any])
    if (proxyProtocol != null) __obj.updateDynamic("proxyProtocol")(proxyProtocol.asInstanceOf[js.Any])
    if (proxyUser != null) __obj.updateDynamic("proxyUser")(proxyUser.asInstanceOf[js.Any])
    if (retryLimit != null) __obj.updateDynamic("retryLimit")(retryLimit.asInstanceOf[js.Any])
    if (!js.isUndefined(startTunnel)) __obj.updateDynamic("startTunnel")(startTunnel.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (tunnelIdentifier != null) __obj.updateDynamic("tunnelIdentifier")(tunnelIdentifier.asInstanceOf[js.Any])
    if (!js.isUndefined(video)) __obj.updateDynamic("video")(video.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowserStackOptions]
  }
}

