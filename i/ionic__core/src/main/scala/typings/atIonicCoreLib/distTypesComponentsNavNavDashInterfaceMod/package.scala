package typings
package atIonicCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypesComponentsNavNavDashInterfaceMod {
  type NavComponent = (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentRef */ js.Any) | atIonicCoreLib.distTypesComponentsNavViewDashControllerMod.ViewController
  type Page = org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, js.Any]
  type TransitionDoneFn = js.Function5[
    /* hasCompleted */ scala.Boolean, 
    /* requiresTransition */ scala.Boolean, 
    /* enteringView */ js.UndefOr[atIonicCoreLib.distTypesComponentsNavViewDashControllerMod.ViewController], 
    /* leavingView */ js.UndefOr[atIonicCoreLib.distTypesComponentsNavViewDashControllerMod.ViewController], 
    /* direction */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
  type TransitionRejectFn = js.Function2[/* rejectReason */ js.Any, /* transition */ js.UndefOr[stdLib.Animation], scala.Unit]
  type TransitionResolveFn = js.Function5[
    /* hasCompleted */ scala.Boolean, 
    /* requiresTransition */ scala.Boolean, 
    /* enteringName */ js.UndefOr[java.lang.String], 
    /* leavingName */ js.UndefOr[java.lang.String], 
    /* direction */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
}
