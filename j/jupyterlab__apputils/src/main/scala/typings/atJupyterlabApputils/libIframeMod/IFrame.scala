package typings.atJupyterlabApputils.libIframeMod

import typings.atJupyterlabApputils.libIframeMod.IFrameNs.IOptions
import typings.atJupyterlabApputils.libIframeMod.IFrameNs.ReferrerPolicy
import typings.atJupyterlabApputils.libIframeMod.IFrameNs.SandboxExceptions
import typings.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/apputils/lib/iframe", "IFrame")
@js.native
/**
  * Create a new IFrame widget.
  */
class IFrame () extends Widget {
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
  var referrerPolicy: ReferrerPolicy = js.native
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
  var sandbox: js.Array[SandboxExceptions] = js.native
  /**
    * The url of the IFrame.
    */
  var url: String = js.native
}

