package typings.materialBase

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/base/foundation", JSImport.Namespace)
@js.native
object foundationMod extends js.Object {
  @js.native
  class MDCFoundation[AdapterType /* <: js.Object */] () extends js.Object {
    def this(adapter: AdapterType) = this()
    var adapter: AdapterType = js.native
    def destroy(): Unit = js.native
    def init(): Unit = js.native
  }
  
  @js.native
  class default[AdapterType /* <: js.Object */] () extends MDCFoundation[AdapterType] {
    def this(adapter: AdapterType) = this()
  }
  
  /* static members */
  @js.native
  object MDCFoundation extends js.Object {
    def cssClasses: StringDictionary[String] = js.native
    def defaultAdapter: js.Object = js.native
    def numbers: StringDictionary[Double] = js.native
    def strings: StringDictionary[String] = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    def cssClasses: StringDictionary[String] = js.native
    def defaultAdapter: js.Object = js.native
    def numbers: StringDictionary[Double] = js.native
    def strings: StringDictionary[String] = js.native
  }
  
}

