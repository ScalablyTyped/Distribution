package typings.interfaceDatastore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Batch[Value] extends js.Object {
  
  def commit(): js.Promise[Unit] = js.native
  def commit(options: Options): js.Promise[Unit] = js.native
  
  def delete(key: Key): Unit = js.native
  
  def put(key: Key, value: Value): Unit = js.native
}
