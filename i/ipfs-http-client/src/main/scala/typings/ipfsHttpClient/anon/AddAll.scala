package typings.ipfsHttpClient.anon

import typings.cids.mod.^
import typings.std.AsyncGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddAll extends StObject {
  
  def add(path: js.Any): js.Promise[Unit | ^] = js.native
  def add(path: js.Any, options: js.Object): js.Promise[Unit | ^] = js.native
  
  def addAll(source: js.Any): AsyncGenerator[^, Unit, js.Any] = js.native
  def addAll(source: js.Any, options: js.Object): AsyncGenerator[^, Unit, js.Any] = js.native
  
  def ls(): AsyncGenerator[Type, Unit, js.Any] = js.native
  def ls(options: js.Object): AsyncGenerator[Type, Unit, js.Any] = js.native
  
  def rm(path: js.Any): js.Promise[js.Any] = js.native
  def rm(path: js.Any, options: js.Object): js.Promise[js.Any] = js.native
  
  def rmAll(source: js.Any): AsyncGenerator[js.Any, Unit, js.Any] = js.native
  def rmAll(source: js.Any, options: js.Object): AsyncGenerator[js.Any, Unit, js.Any] = js.native
}
