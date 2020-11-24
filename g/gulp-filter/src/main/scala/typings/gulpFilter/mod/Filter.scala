package typings.gulpFilter.mod

import typings.node.NodeJS.ReadWriteStream
import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// A transform stream with a .restore object
@js.native
trait Filter
  extends ReadableStream
     with WritableStream {
  
  var restore: ReadWriteStream = js.native
}
