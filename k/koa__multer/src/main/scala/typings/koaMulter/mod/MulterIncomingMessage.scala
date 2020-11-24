package typings.koaMulter.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MulterIncomingMessage extends IncomingMessage {
  
  var body: js.Any = js.native
  
  var file: File = js.native
  
  var files: StringDictionary[js.Array[File]] | js.Array[File] = js.native
}
