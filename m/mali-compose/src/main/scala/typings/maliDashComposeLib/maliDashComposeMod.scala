package typings
package maliDashComposeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mali-compose", JSImport.Namespace)
@js.native
object maliDashComposeMod extends js.Object {
  def apply(
    middleware: js.Array[
      js.Function2[
        /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Context */ /* ctx */ _, 
        /* next */ js.Function0[js.Promise[scala.Unit]], 
        js.Promise[scala.Unit]
      ]
    ]
  ): js.Function2[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Context */ /* context */ js.Any, 
    /* next */ js.Function0[js.Promise[scala.Unit]], 
    js.Promise[scala.Unit]
  ] = js.native
}

