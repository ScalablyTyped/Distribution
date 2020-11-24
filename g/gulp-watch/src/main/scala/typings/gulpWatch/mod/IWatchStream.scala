package typings.gulpWatch.mod

import typings.node.NodeJS.ReadWriteStream
import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWatchStream
  extends ReadableStream
     with WritableStream {
  
  def add(path: String): ReadWriteStream = js.native
  def add(path: js.Array[String]): ReadWriteStream = js.native
  
  def close(): ReadWriteStream = js.native
  
  def unwatch(path: String): ReadWriteStream = js.native
  def unwatch(path: js.Array[String]): ReadWriteStream = js.native
}
