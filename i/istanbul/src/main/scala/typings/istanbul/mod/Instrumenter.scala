package typings.istanbul.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Instrumenter
  extends Instantiable0[Instrumenter]
     with Instantiable1[/* options */ js.Any, Instrumenter] {
  
  def instrumentSync(code: String, filename: String): String = js.native
}
