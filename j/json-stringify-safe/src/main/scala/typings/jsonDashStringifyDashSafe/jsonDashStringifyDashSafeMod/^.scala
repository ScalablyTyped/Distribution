package typings.jsonDashStringifyDashSafe.jsonDashStringifyDashSafeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("json-stringify-safe", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(obj: js.Any): String = js.native
  def apply(obj: js.Any, serializer: EntryProcessor): String = js.native
  def apply(obj: js.Any, serializer: EntryProcessor, indent: String | Double): String = js.native
  def apply(obj: js.Any, serializer: EntryProcessor, indent: String | Double, decycler: EntryProcessor): String = js.native
  def getSerialize(): EntryProcessor = js.native
  def getSerialize(serializer: Null, decycler: EntryProcessor): EntryProcessor = js.native
  def getSerialize(serializer: EntryProcessor): EntryProcessor = js.native
  def getSerialize(serializer: EntryProcessor, decycler: EntryProcessor): EntryProcessor = js.native
}

