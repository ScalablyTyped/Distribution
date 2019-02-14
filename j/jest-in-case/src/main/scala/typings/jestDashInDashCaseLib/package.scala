package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jestDashInDashCaseLib {
  type TestCases[Opts] = js.Array[Opts] | org.scalablytyped.runtime.StringDictionary[Opts]
  type Tester[Opts] = js.Function2[
    /* opts */ Opts, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify jest.DoneCallback */ /* done */ js.Any, 
    js.Any
  ]
}
