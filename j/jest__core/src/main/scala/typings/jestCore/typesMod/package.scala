package typings.jestCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type Filter = js.Function1[
    /* testPaths */ js.Array[java.lang.String], 
    js.Promise[typings.jestCore.anon.Filtered]
  ]
  
  type TestPathCases = js.Array[typings.jestCore.anon.IsMatch]
  
  type TestRunData = js.Array[typings.jestCore.anon.Matches]
}
