package typings.immutable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Immutable {
  
  type RecordOf[TProps /* <: js.Object */] = typings.immutable.Immutable.Record[TProps] with TProps
}
