package typings.ignoreWalk.mod

import org.scalablytyped.runtime.StringDictionary
import typings.ignoreWalk.anon.Follow
import typings.ignoreWalk.ignoreWalkStrings.done
import typings.ignoreWalk.ignoreWalkStrings.error
import typings.node.eventsMod.EventEmitter
import typings.node.fsMod.Stats
import typings.std.Error
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ignore-walk", "Walker")
@js.native
class Walker () extends EventEmitter {
  def this(opts: WalkerOptions) = this()
  
  def addIgnoreFile(file: String, `then`: js.Function0[Unit]): Unit = js.native
  
  def addIgnoreFiles(): Unit = js.native
  
  @JSName("addListener")
  def addListener_done(event: done, listener: js.Function1[/* data */ js.Array[String], Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  
  var basename: String = js.native
  
  def emit(ev: String, data: js.Any): Boolean = js.native
  
  var entries: js.Array[String] = js.native
  
  def filterEntries(): Unit = js.native
  
  def filterEntry(entry: String, partial: Boolean): Boolean = js.native
  
  var follow: Boolean = js.native
  
  var ignoreFiles: js.Array[String] = js.native
  
  var ignoreRules: StringDictionary[String] = js.native
  
  var includeEmpty: Boolean = js.native
  
  def isIgnoreFile(e: String): Boolean = js.native
  
  def onReadIgnoreFile(file: String, data: String, `then`: js.Function0[Unit]): Unit = js.native
  
  def onReaddir(entries: js.Array[String]): Unit = js.native
  
  @JSName("on")
  def on_done(event: done, listener: js.Function1[/* data */ js.Array[String], Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  
  @JSName("once")
  def once_done(event: done, listener: js.Function1[/* data */ js.Array[String], Unit]): this.type = js.native
  @JSName("once")
  def once_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  
  def onstat(st: Stats, entry: String, file: Boolean, dir: Boolean, `then`: js.Function0[Unit]): Unit = js.native
  
  var parent: Walker | WalkerSync | Null = js.native
  
  var path: String = js.native
  
  @JSName("prependListener")
  def prependListener_done(event: done, listener: js.Function1[/* data */ js.Array[String], Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  
  @JSName("prependOnceListener")
  def prependOnceListener_done(event: done, listener: js.Function1[/* data */ js.Array[String], Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  
  var result: Set[String] | js.Array[String] = js.native
  
  var root: String = js.native
  
  var sawError: Boolean = js.native
  
  def sort(a: String, b: String): Double = js.native
  
  def start(): this.type = js.native
  
  def stat(entry: String, file: Boolean, dir: Boolean, the: js.Function0[Unit]): Unit = js.native
  
  def walker(entry: String, `then`: js.Function0[Unit]): Unit = js.native
  
  def walkerOpt(entry: String): Follow = js.native
}
