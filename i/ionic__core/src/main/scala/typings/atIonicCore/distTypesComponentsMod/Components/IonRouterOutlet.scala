package typings.atIonicCore.distTypesComponentsMod.Components

import typings.atIonicCore.atIonicCoreStrings.ios
import typings.atIonicCore.atIonicCoreStrings.md
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonRouterOutlet extends js.Object {
  /**
    * If `true`, the router-outlet should animate the transition of components.
    */
  var animated: Boolean = js.native
  /**
    * By default `ion-nav` animates transition between pages based in the mode (ios or material design). However, this property allows to create custom transition using `AnimateBuilder` functions.
    */
  var animation: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any
  ] = js.native
  var delegate: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify FrameworkDelegate */ js.Any
  ] = js.native
  /**
    * The mode determines which platform styles to use.
    */
  var mode: ios | md = js.native
  var swipeHandler: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SwipeGestureHandler */ js.Any
  ] = js.native
  def commit(enteringEl: HTMLElement): js.Promise[Boolean] = js.native
  def commit(
    enteringEl: HTMLElement,
    leavingEl: js.UndefOr[scala.Nothing],
    opts: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify RouterOutletOptions */ js.Any
  ): js.Promise[Boolean] = js.native
  def commit(enteringEl: HTMLElement, leavingEl: HTMLElement): js.Promise[Boolean] = js.native
  def commit(
    enteringEl: HTMLElement,
    leavingEl: HTMLElement,
    opts: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify RouterOutletOptions */ js.Any
  ): js.Promise[Boolean] = js.native
  def getRouteId(): js.Promise[
    js.UndefOr[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify RouteID */ _
    ]
  ] = js.native
  def setRouteId(
    id: String,
    params: js.UndefOr[scala.Nothing],
    direction: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify RouterDirection */ js.Any
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify RouteWrite */ _
  ] = js.native
  def setRouteId(
    id: String,
    params: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentProps<null> */ js.Any,
    direction: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify RouterDirection */ js.Any
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify RouteWrite */ _
  ] = js.native
}

