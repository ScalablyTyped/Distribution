package typings.atJupyterlabApputils.libIframeMod.IFrameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for creating a new IFrame widget.
  */
trait IOptions extends js.Object {
  /**
    * Referrer policy for the iframe.
    */
  var referrerPolicy: js.UndefOr[ReferrerPolicy] = js.undefined
  /**
    * Exceptions for the iframe sandbox.
    */
  var sandbox: js.UndefOr[js.Array[SandboxExceptions]] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(referrerPolicy: ReferrerPolicy = null, sandbox: js.Array[SandboxExceptions] = null): IOptions = {
    val __obj = js.Dynamic.literal()
    if (referrerPolicy != null) __obj.updateDynamic("referrerPolicy")(referrerPolicy)
    if (sandbox != null) __obj.updateDynamic("sandbox")(sandbox)
    __obj.asInstanceOf[IOptions]
  }
}

