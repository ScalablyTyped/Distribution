package typings.jestExpectMessage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("jest")
@js.native
object jest extends js.Object {
  
  type Expect = js.Function2[
    /* actual */ js.Any, 
    /* message */ String, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JestMatchers<T> */ js.Any
  ]
}
