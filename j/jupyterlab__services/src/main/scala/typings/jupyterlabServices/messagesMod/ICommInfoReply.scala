package typings.jupyterlabServices.messagesMod

import org.scalablytyped.runtime.StringDictionary
import typings.jupyterlabServices.anon.TargetnameString
import typings.jupyterlabServices.jupyterlabServicesStrings.ok
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICommInfoReply extends IReplyOkContent {
  /**
    * Mapping of comm ids to target names.
    */
  var comms: StringDictionary[TargetnameString]
}

object ICommInfoReply {
  @scala.inline
  def apply(comms: StringDictionary[TargetnameString], status: ok): ICommInfoReply = {
    val __obj = js.Dynamic.literal(comms = comms.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICommInfoReply]
  }
}

