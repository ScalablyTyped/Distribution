package typings.iobroker.mod.global.ioBroker

import typings.iobroker.iobrokerStrings.adapter
import typings.iobroker.iobrokerStrings.channel
import typings.iobroker.iobrokerStrings.config
import typings.iobroker.iobrokerStrings.device
import typings.iobroker.iobrokerStrings.enum
import typings.iobroker.iobrokerStrings.folder
import typings.iobroker.iobrokerStrings.group
import typings.iobroker.iobrokerStrings.host
import typings.iobroker.iobrokerStrings.info
import typings.iobroker.iobrokerStrings.instance
import typings.iobroker.iobrokerStrings.meta
import typings.iobroker.iobrokerStrings.script
import typings.iobroker.iobrokerStrings.state
import typings.iobroker.iobrokerStrings.user
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// In set[Foreign]Object[NotExists] methods, the ID and acl of the object is optional
/* Rewritten from type alias, can be one of: 
  - typings.iobroker.anon.SettableObjectWorkerState
  - typings.iobroker.anon.SettableObjectWorkerChann
  - typings.iobroker.anon.SettableObjectWorkerDevic
  - typings.iobroker.anon.SettableObjectWorkerFolde
  - typings.iobroker.anon.SettableObjectWorkerOther
*/
trait SettableObject extends js.Object

object SettableObject {
  @scala.inline
  def SettableObjectWorkerState(common: StateCommon, native: Record[String, ObjectField], `type`: state): SettableObject = {
    val __obj = js.Dynamic.literal(common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SettableObject]
  }
  @scala.inline
  def SettableObjectWorkerDevic(common: DeviceCommon, native: Record[String, ObjectField], `type`: device): SettableObject = {
    val __obj = js.Dynamic.literal(common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SettableObject]
  }
  @scala.inline
  def SettableObjectWorkerFolde(common: OtherCommon, native: Record[String, ObjectField], `type`: folder): SettableObject = {
    val __obj = js.Dynamic.literal(common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SettableObject]
  }
  @scala.inline
  def SettableObjectWorkerOther(
    common: OtherCommon,
    native: Record[String, ObjectField],
    `type`: adapter | config | enum | group | host | info | instance | meta | script | user
  ): SettableObject = {
    val __obj = js.Dynamic.literal(common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SettableObject]
  }
  @scala.inline
  def SettableObjectWorkerChann(common: ChannelCommon, native: Record[String, ObjectField], `type`: channel): SettableObject = {
    val __obj = js.Dynamic.literal(common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SettableObject]
  }
}

