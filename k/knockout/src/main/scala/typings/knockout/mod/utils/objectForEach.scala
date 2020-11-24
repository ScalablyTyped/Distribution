package typings.knockout.mod.utils

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("knockout", "utils.objectForEach")
@js.native
object objectForEach extends js.Object {
  
  def apply(obj: js.Object, action: js.Function2[/* key */ String, /* value */ js.Any, Unit]): Unit = js.native
  def apply[T](obj: StringDictionary[T], action: js.Function2[/* key */ String, /* value */ T, Unit]): Unit = js.native
}
