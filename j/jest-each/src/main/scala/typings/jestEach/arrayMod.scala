package typings.jestEach

import typings.jestEach.bindMod.EachTests
import typings.jestTypes.globalMod.ArrayTable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jest-each/build/table/array", JSImport.Namespace)
@js.native
object arrayMod extends js.Object {
  
  def default(title: String, arrayTable: ArrayTable): EachTests = js.native
}
