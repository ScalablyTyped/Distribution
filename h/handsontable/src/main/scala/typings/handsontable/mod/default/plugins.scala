package typings.handsontable.mod.default

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.handsontable.mod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("handsontable", "plugins")
@js.native
object plugins extends js.Object {
  
  @js.native
  class Base ()
    extends typings.handsontable.mod.Handsontable.plugins.Base
       with Instantiable0[typings.handsontable.mod.Handsontable.plugins.Base]
       with Instantiable1[/* hotInstance */ Core, typings.handsontable.mod.Handsontable.plugins.Base] {
    def this(hotInstance: Core) = this()
  }
  
  // utils for Filters
  @js.native
  object FiltersPlugin extends js.Object
}
