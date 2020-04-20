package typings.jupyterlabApputils.iframeMod

import typings.jupyterlabApputils.iframeMod.IFrame.IOptions
import typings.jupyterlabApputils.iframeMod.IFrame.ReferrerPolicy
import typings.jupyterlabApputils.iframeMod.IFrame.SandboxExceptions
import typings.luminoWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/apputils/lib/iframe", "IFrame")
@js.native
/**
  * Create a new IFrame widget.
  */
class IFrame_ () extends Widget {
  def this(options: IOptions) = this()
  var _referrerPolicy: js.Any = js.native
  var _sandbox: js.Any = js.native
  /**
    * Referrer policy for the iframe.
    *
    * #### Notes
    * By default, `no-referrer` is chosen.
    *
    * For more information, see
    * https://developer.mozilla.org/en-US/docs/Web/API/HTMLIFrameElement/referrerPolicy
    */
  def referrerPolicy: ReferrerPolicy = js.native
  def referrerPolicy(value: ReferrerPolicy): js.Any = js.native
  /**
    * Exceptions to the sandboxing.
    *
    * #### Notes
    * By default, all sandboxing security policies are enabled.
    * This setting allows the user to selectively disable these
    * policies. This should be done with care, as it can
    * introduce security risks, and possibly allow malicious
    * sites to execute code in a JupyterLab session.
    *
    * For more information, see
    * https://developer.mozilla.org/en-US/docs/Web/HTML/Element/iframe
    */
  def sandbox: js.Array[SandboxExceptions] = js.native
  def sandbox(values: js.Array[SandboxExceptions]): js.Any = js.native
  /**
    * The url of the IFrame.
    */
  def url: String = js.native
  def url(url: String): js.Any = js.native
}

