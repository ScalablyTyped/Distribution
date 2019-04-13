package typings
package jsonDashStringifyDashSafeLib.jsonDashStringifyDashSafeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("json-stringify-safe", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(obj: js.Any): java.lang.String = js.native
  def apply(obj: js.Any, serializer: EntryProcessor): java.lang.String = js.native
  def apply(obj: js.Any, serializer: EntryProcessor, indent: java.lang.String | scala.Double): java.lang.String = js.native
  def apply(
    obj: js.Any,
    serializer: EntryProcessor,
    indent: java.lang.String | scala.Double,
    decycler: EntryProcessor
  ): java.lang.String = js.native
  def getSerialize(): EntryProcessor = js.native
  def getSerialize(serializer: EntryProcessor): EntryProcessor = js.native
  def getSerialize(serializer: EntryProcessor, decycler: EntryProcessor): EntryProcessor = js.native
  def getSerialize(serializer: scala.Null, decycler: EntryProcessor): EntryProcessor = js.native
}

