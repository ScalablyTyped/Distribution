package typings.isbinaryfile

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("isbinaryfile", "isBinaryFile")
  @js.native
  def isBinaryFile(file: String): js.Promise[Boolean] = js.native
  @JSImport("isbinaryfile", "isBinaryFile")
  @js.native
  def isBinaryFile(file: String, size: Double): js.Promise[Boolean] = js.native
  @JSImport("isbinaryfile", "isBinaryFile")
  @js.native
  def isBinaryFile(file: Buffer): js.Promise[Boolean] = js.native
  @JSImport("isbinaryfile", "isBinaryFile")
  @js.native
  def isBinaryFile(file: Buffer, size: Double): js.Promise[Boolean] = js.native
  
  @JSImport("isbinaryfile", "isBinaryFileSync")
  @js.native
  def isBinaryFileSync(file: String): Boolean = js.native
  @JSImport("isbinaryfile", "isBinaryFileSync")
  @js.native
  def isBinaryFileSync(file: String, size: Double): Boolean = js.native
  @JSImport("isbinaryfile", "isBinaryFileSync")
  @js.native
  def isBinaryFileSync(file: Buffer): Boolean = js.native
  @JSImport("isbinaryfile", "isBinaryFileSync")
  @js.native
  def isBinaryFileSync(file: Buffer, size: Double): Boolean = js.native
}
