package typings.jsdom

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.External
import typings.std.InputEvent
import typings.std.InputEventInit
import typings.std.ShadowRoot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object anon extends js.Object {
  
  @js.native
  trait Instantiable
    extends Instantiable1[/* type */ String, InputEvent]
       with Instantiable2[/* type */ String, /* eventInitDict */ InputEventInit, InputEvent]
  
  @js.native
  trait InstantiableExternal extends Instantiable0[External]
  
  @js.native
  trait InstantiableShadowRoot extends Instantiable0[ShadowRoot]
}
