package typings.jestJasmine2

import typings.jestJasmine2.typesMod.Spy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-jasmine2/build/jasmine/createSpy", JSImport.Namespace)
@js.native
object createSpyMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: any} */ @js.native
  trait Fn extends js.Object {
    def apply(): js.Any = js.native
  }
  
  def default(name: String, originalFn: Fn): Spy = js.native
}

