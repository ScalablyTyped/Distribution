package typings.jestDashJasmine2

import typings.jestDashJasmine2.buildTypesMod.Spy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-jasmine2/build/jasmine/createSpy", JSImport.Namespace)
@js.native
object buildJasmineCreateSpyMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: any} */ @js.native
  trait Fn extends js.Object {
    def apply(): js.Any = js.native
  }
  
  def default(name: String, originalFn: Fn): Spy = js.native
}

