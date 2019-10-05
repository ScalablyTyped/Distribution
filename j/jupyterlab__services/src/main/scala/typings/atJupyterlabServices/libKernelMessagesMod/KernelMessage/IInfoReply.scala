package typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage

import typings.atJupyterlabServices.Anon_Text
import typings.atJupyterlabServices.atJupyterlabServicesStrings.ok
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `'kernel_info_reply'` message content.
  *
  * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#kernel-info).
  */
trait IInfoReply extends IReplyOkContent {
  var banner: String
  var help_links: js.Array[Anon_Text]
  var implementation: String
  var implementation_version: String
  var language_info: ILanguageInfo
  var protocol_version: String
}

object IInfoReply {
  @scala.inline
  def apply(
    banner: String,
    help_links: js.Array[Anon_Text],
    implementation: String,
    implementation_version: String,
    language_info: ILanguageInfo,
    protocol_version: String,
    status: ok
  ): IInfoReply = {
    val __obj = js.Dynamic.literal(banner = banner, help_links = help_links, implementation = implementation, implementation_version = implementation_version, language_info = language_info, protocol_version = protocol_version, status = status)
  
    __obj.asInstanceOf[IInfoReply]
  }
}

