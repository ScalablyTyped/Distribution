package typings.jestInCase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type TestCases[Opts] = js.Array[Opts] | org.scalablytyped.runtime.StringDictionary[Opts]
  
  type Tester[Opts] = js.Function2[
    /* opts */ Opts, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.DoneCallback */ /* done */ js.Any, 
    js.Any
  ]
}
