package typings.jupyterlabServices.messagesMod.KernelMessage

import org.scalablytyped.runtime.StringDictionary
import typings.jupyterlabServices.AnonTargetname
import typings.jupyterlabServices.jupyterlabServicesStrings.ok
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
  var comms: StringDictionary[AnonTargetname]
}

object ICommInfoReply {
  @scala.inline
  def apply(comms: StringDictionary[AnonTargetname], status: ok): ICommInfoReply = {
    val __obj = js.Dynamic.literal(comms = comms.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ICommInfoReply]
  }
}

