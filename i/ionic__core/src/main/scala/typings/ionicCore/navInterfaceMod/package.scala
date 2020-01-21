package typings.ionicCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object navInterfaceMod {
  type NavComponent = typings.ionicCore.mod.ComponentRef | typings.ionicCore.viewControllerMod.ViewController
  type Page = org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, js.Any]
  type TransitionDoneFn = js.Function5[
    /* hasCompleted */ scala.Boolean, 
    /* requiresTransition */ scala.Boolean, 
    /* enteringView */ js.UndefOr[typings.ionicCore.viewControllerMod.ViewController], 
    /* leavingView */ js.UndefOr[typings.ionicCore.viewControllerMod.ViewController], 
    /* direction */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
  type TransitionRejectFn = js.Function2[
    /* rejectReason */ js.Any, 
    /* transition */ js.UndefOr[typings.ionicCore.oldAnimationAnimationInterfaceMod.Animation], 
    scala.Unit
  ]
  type TransitionResolveFn = js.Function5[
    /* hasCompleted */ scala.Boolean, 
    /* requiresTransition */ scala.Boolean, 
    /* enteringName */ js.UndefOr[java.lang.String], 
    /* leavingName */ js.UndefOr[java.lang.String], 
    /* direction */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
}
