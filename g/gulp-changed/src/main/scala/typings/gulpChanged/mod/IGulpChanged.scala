package typings.gulpChanged.mod

import typings.node.NodeJS.ReadWriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGulpChanged extends js.Object {
  
  def apply(destination: String): ReadWriteStream = js.native
  def apply(destination: String, options: IOptions): ReadWriteStream = js.native
  def apply(destination: IDestination): ReadWriteStream = js.native
  def apply(destination: IDestination, options: IOptions): ReadWriteStream = js.native
  
  var compareLastModifiedTime: IComparator = js.native
  
  var compareSha1Digest: IComparator = js.native
}
