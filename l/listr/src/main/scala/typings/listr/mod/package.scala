package typings.listr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ListrContext = js.Any
  
  type ListrTaskResult[Ctx] = java.lang.String | js.Promise[js.Any] | typings.listr.mod.Listr[Ctx] | typings.node.streamMod.Readable | typings.rxjs.mod.Observable_[js.Any]
}
