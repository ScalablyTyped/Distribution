package typings.makeDir.anon

import typings.node.fsMod.NoParamCallback
import typings.node.fsMod.PathLike
import typings.node.fsMod.symlink.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofsymlink extends StObject {
  
  def apply(target: PathLike, path: PathLike, callback: NoParamCallback): Unit = js.native
  def apply(target: PathLike, path: PathLike, `type`: Null, callback: NoParamCallback): Unit = js.native
  def apply(target: PathLike, path: PathLike, `type`: Unit, callback: NoParamCallback): Unit = js.native
  def apply(target: PathLike, path: PathLike, `type`: Type, callback: NoParamCallback): Unit = js.native
}
