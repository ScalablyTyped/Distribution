package typings.jestRuntime.mod

import typings.expect.typesMod.Expect
import typings.jestTypes.globalMod.TestFrameworkGlobals
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JestGlobals extends TestFrameworkGlobals {
  
  var expect: Expect = js.native
}
