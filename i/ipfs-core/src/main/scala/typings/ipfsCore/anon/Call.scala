package typings.ipfsCore.anon

import typings.cids.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Call extends js.Object {
  
  def apply(path: String): js.Promise[Unit] = js.native
  def apply(path: ^): js.Promise[Unit] = js.native
  
  /**
    * @returns {void}
    */
  def start(): Unit = js.native
  
  /**
    * @returns {void}
    */
  def stop(): Unit = js.native
}
