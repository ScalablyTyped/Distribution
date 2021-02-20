package typings.kdbxweb.mod

import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kdbxweb", "Group")
@js.native
class Group () extends KdbxObject {
  
  def copyFrom(group: Group): Unit = js.native
  
  var customIcon: KdbxUuid = js.native
  
  var defaultAutoTypeSeq: StringProtected = js.native
  
  var enableAutoType: Boolean = js.native
  
  var enableSearching: Boolean = js.native
  
  var entries: js.Array[Entry] = js.native
  
  var expanded: Boolean = js.native
  
  def forEach(
    callback: js.Function2[
      /* thisArg */ js.Function1[/* value */ js.Any, Unit], 
      /* entry */ js.UndefOr[Entry], 
      Unit
    ],
    thisArg: js.Function1[/* value */ js.Any, Unit]
  ): Unit = js.native
  
  var groups: js.Array[Group] = js.native
  
  var icon: Double = js.native
  
  var lastTopVisibleEntry: KdbxUuid = js.native
  
  def merge(objectMap: ObjectMap): Unit = js.native
  
  var name: StringProtected = js.native
  
  var notes: StringProtected = js.native
  
  var parentGroup: Group = js.native
  
  var times: Times = js.native
  
  var uuid: KdbxUuid = js.native
  
  def write(parentNode: Node, ctx: Context): Unit = js.native
}
/* static members */
object Group {
  
  @JSImport("kdbxweb", "Group.create")
  @js.native
  def create(name: StringProtected, parentGroup: Group): Group = js.native
  
  @JSImport("kdbxweb", "Group.read")
  @js.native
  def read(xmlNode: Node, ctx: Context, parentGroup: Group): Group = js.native
}
