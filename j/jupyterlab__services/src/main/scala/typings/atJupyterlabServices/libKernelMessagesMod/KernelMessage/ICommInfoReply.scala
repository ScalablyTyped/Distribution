package typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage

import org.scalablytyped.runtime.StringDictionary
import typings.atJupyterlabServices.Anon_Targetname
import typings.atJupyterlabServices.atJupyterlabServicesStrings.ok
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `'comm_info_reply'` message content.
  *
  * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#comm-info).
  *
  * **See also:** [[ICommInfoRequest]], [[IKernel.commInfo]]
  */
trait ICommInfoReply extends IReplyOkContent {
  /**
    * Mapping of comm ids to target names.
    */
  var comms: StringDictionary[Anon_Targetname]
}

object ICommInfoReply {
  @scala.inline
  def apply(comms: StringDictionary[Anon_Targetname], status: ok): ICommInfoReply = {
    val __obj = js.Dynamic.literal(comms = comms.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ICommInfoReply]
  }
}

