package typings
package atIonicCoreLib.distTypesComponentsMod.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonRouterOutlet extends js.Object {
  /**
    * If `true`, the router-outlet should animate the transition of components.
    */
  var animated: scala.Boolean = js.native
  /**
    * By default `ion-nav` animates transition between pages based in the mode (ios or material design). However, this property allows to create custom transition using `AnimateBuilder` functions.
    */
  var animation: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any
  ] = js.native
  var delegate: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify FrameworkDelegate */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify FrameworkDelegate */ js.Any
  ] = js.native
  var mode: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Mode */ js.Any = js.native
  var swipeHandler: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SwipeGestureHandler */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SwipeGestureHandler */ js.Any
  ] = js.native
  def commit(enteringEl: stdLib.HTMLElement): js.Promise[scala.Boolean] = js.native
  def commit(
    enteringEl: stdLib.HTMLElement,
    leavingEl: js.UndefOr[scala.Nothing],
    opts: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify RouterOutletOptions */ js.Any
  ): js.Promise[scala.Boolean] = js.native
  def commit(enteringEl: stdLib.HTMLElement, leavingEl: stdLib.HTMLElement): js.Promise[scala.Boolean] = js.native
  def commit(
    enteringEl: stdLib.HTMLElement,
    leavingEl: stdLib.HTMLElement,
    opts: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify RouterOutletOptions */ js.Any
  ): js.Promise[scala.Boolean] = js.native
  def getRouteId(): js.Promise[
    js.UndefOr[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify RouteID */ _
    ]
  ] = js.native
  def setRouteId(
    id: java.lang.String,
    params: js.UndefOr[scala.Nothing],
    direction: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify RouterDirection */ js.Any
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify RouteWrite */ _
  ] = js.native
  def setRouteId(
    id: java.lang.String,
    params: org.scalablytyped.runtime.StringDictionary[js.Any],
    direction: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify RouterDirection */ js.Any
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify RouteWrite */ _
  ] = js.native
}

