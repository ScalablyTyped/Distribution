package typings.kdbxweb.mod

import org.scalablytyped.runtime.StringDictionary
import typings.kdbxweb.anon.DefaultSequence
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kdbxweb", "Entry")
@js.native
class Entry () extends KdbxObject {
  
  var autoType: DefaultSequence = js.native
  
  var bgColor: StringProtected = js.native
  
  def copyFrom(entry: Entry): Unit = js.native
  
  var customIcon: KdbxUuid = js.native
  
  var fgColor: StringProtected = js.native
  
  var fields: StringDictionary[StringProtected] = js.native
  
  var history: js.Array[Entry] = js.native
  
  var icon: Double = js.native
  
  def merge(objectMap: ObjectMap): Unit = js.native
  
  var overrideUrl: StringProtected = js.native
  
  var parentGroup: Group = js.native
  
  def pushHistory(): Unit = js.native
  
  def removeHistory(index: Double, count: Double): Unit = js.native
  
  var tags: js.Array[String] = js.native
  
  var times: Times = js.native
  
  var uuid: KdbxUuid = js.native
  
  def write(parentNode: Node, ctx: Context): Unit = js.native
}
/* static members */
object Entry {
  
  @JSImport("kdbxweb", "Entry.create")
  @js.native
  def create(meta: Meta, parentGroup: Group): Entry = js.native
  
  @JSImport("kdbxweb", "Entry.read")
  @js.native
  def read(xmlNode: Node, ctx: Context, parentGroup: Group): Entry = js.native
}
