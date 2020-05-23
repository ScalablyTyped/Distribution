package typings.interpret

import org.scalablytyped.runtime.StringDictionary
import typings.interpret.anon.Dictkey
import typings.interpret.anon.Extensions
import typings.node.NodeModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("interpret", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait ExtensionDescriptor extends js.Object {
    var module: String = js.native
    @JSName("register")
    var register_Original: RegisterFn = js.native
    def register(hook: Hook): Unit = js.native
  }
  
  @js.native
  trait Hook extends js.Object {
    def apply(m: Extensions): js.Any = js.native
    def apply(m: NodeModule): js.Any = js.native
    def install(): Unit = js.native
    def install(m: Dictkey): Unit = js.native
  }
  
  val extensions: Extensions_ = js.native
  val jsVariants: Extensions_ = js.native
  type Extension = String | ExtensionDescriptor | (js.Array[String | ExtensionDescriptor])
  type Extensions_ = StringDictionary[Extension | Null]
  type RegisterFn = js.Function1[/* hook */ Hook, Unit]
}

