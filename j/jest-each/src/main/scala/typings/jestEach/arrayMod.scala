package typings.jestEach

import typings.jestEach.bindMod.EachTests
import typings.jestTypes.globalMod.ArrayTable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrayMod {
  
  @JSImport("jest-each/build/table/array", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(title: String, arrayTable: ArrayTable): EachTests = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(title.asInstanceOf[js.Any], arrayTable.asInstanceOf[js.Any])).asInstanceOf[EachTests]
}
