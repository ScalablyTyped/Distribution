package typings.jsSpec

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type PredFn = js.Function1[/* value */ js.Any, scala.Boolean]
  
  type SpecInput = typings.jsSpec.mod.PredFn | typings.jsSpec.mod.Spec_
}
