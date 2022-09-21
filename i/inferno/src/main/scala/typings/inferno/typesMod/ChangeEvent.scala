package typings.inferno.typesMod

import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangeEvent[T]
  extends StObject
     with SemiSyntheticEvent[T] {
  
  @JSName("target")
  var target_ChangeEvent: EventTarget & T = js.native
}
