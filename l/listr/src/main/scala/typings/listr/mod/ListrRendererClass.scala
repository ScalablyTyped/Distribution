package typings.listr.mod

import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListrRendererClass[Ctx]
  extends ListrRendererValue[Ctx]
     with Instantiable2[
      /* tasks */ js.Array[ListrTaskObject[Ctx]], 
      /* options */ ListrOptions[Ctx], 
      ListrRenderer
    ] {
  var nonTTY: Boolean = js.native
}

