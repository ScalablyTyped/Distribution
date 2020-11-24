package typings.ipfsCore.anon

import typings.ipfsCore.nameResolveMod.ResolveSettings
import typings.ipfsCore.publishMod.PublishResult
import typings.ipfsCore.publishMod.PublishSettings
import typings.ipfsCore.srcUtilsMod.AbortOptions
import typings.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Publish extends js.Object {
  
  def publish(value: String): js.Promise[PublishResult] = js.native
  def publish(value: String, options: PublishSettings with AbortOptions): js.Promise[PublishResult] = js.native
  
  var pubsub: Cancel = js.native
  
  def resolve(name: String): AsyncIterable[String] = js.native
  def resolve(name: String, options: ResolveSettings with AbortOptions): AsyncIterable[String] = js.native
}
