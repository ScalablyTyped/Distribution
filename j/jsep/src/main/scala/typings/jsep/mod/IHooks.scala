package typings.jsep.mod

import typings.jsep.anon.Context
import typings.jsep.anon.nameinHookTypeHookCallbac
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHooks
  extends StObject
     with HookTypeObj {
  
  def add(name: HookType, cb: HookCallback): Unit = js.native
  def add(name: HookType, cb: HookCallback, first: Boolean): Unit = js.native
  def add(obj: nameinHookTypeHookCallbac): Unit = js.native
  def add(obj: nameinHookTypeHookCallbac, first: Boolean): Unit = js.native
  
  def run(name: String, env: Context): Unit = js.native
}
