package typings
package atIonicCoreLib.distTypesComponentsMod.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonNav extends js.Object {
  /**
    * If `true`, the nav should animate the transition of components.
    */
  var animated: scala.Boolean = js.native
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
    * Root NavComponent to load
    */
  var root: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavComponent */ js.Any
  ] = js.native
  /**
    * Any parameters for the root component
    */
  var rootParams: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentProps */ js.Any
  ] = js.native
  /**
    * If the nav component should allow for swipe-to-go-back.
    */
  var swipeGesture: js.UndefOr[scala.Boolean] = js.native
  /**
    * Returns `true` if the current view can go back.
    */
  def canGoBack(): js.Promise[scala.Boolean] = js.native
  def canGoBack(
    view: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ViewController */ js.Any
  ): js.Promise[scala.Boolean] = js.native
  /**
    * Get the active view.
    */
  def getActive(): js.Promise[
    js.UndefOr[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ViewController */ _
    ]
  ] = js.native
  /**
    * Get the view at the specified index.
    */
  def getByIndex(index: scala.Double): js.Promise[
    js.UndefOr[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ViewController */ _
    ]
  ] = js.native
  /**
    * Get the previous view.
    */
  def getPrevious(): js.Promise[
    js.UndefOr[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ViewController */ _
    ]
  ] = js.native
  def getPrevious(
    view: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ViewController */ js.Any
  ): js.Promise[
    js.UndefOr[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ViewController */ _
    ]
  ] = js.native
  def getRouteId(): js.Promise[
    js.UndefOr[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify RouteID */ _
    ]
  ] = js.native
  /**
    * Inserts a component into the navigation stack at the specified index. This is useful to add a component at any point in the navigation stack.
    */
  def insert[T /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavComponent */ js.Any */](insertIndex: scala.Double, component: T): js.Promise[scala.Boolean] = js.native
  def insert[T /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavComponent */ js.Any */](
    insertIndex: scala.Double,
    component: T,
    componentProps: js.UndefOr[scala.Nothing],
    opts: js.UndefOr[scala.Nothing],
    done: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TransitionDoneFn */ js.Any
  ): js.Promise[scala.Boolean] = js.native
  def insert[T /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavComponent */ js.Any */](
    insertIndex: scala.Double,
    component: T,
    componentProps: js.UndefOr[scala.Nothing],
    opts: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavOptions */ js.Any
  ): js.Promise[scala.Boolean] = js.native
  def insert[T /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavComponent */ js.Any */](
    insertIndex: scala.Double,
    component: T,
    componentProps: js.UndefOr[scala.Nothing],
    opts: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavOptions */ js.Any,
    done: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TransitionDoneFn */ js.Any
  ): js.Promise[scala.Boolean] = js.native
  def insert[T /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavComponent */ js.Any */](
    insertIndex: scala.Double,
    component: T,
    componentProps: js.UndefOr[scala.Nothing],
    opts: scala.Null,
    done: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TransitionDoneFn */ js.Any
  ): js.Promise[scala.Boolean] = js.native
  def insert[T /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavComponent */ js.Any */](
    insertIndex: scala.Double,
    component: T,
    componentProps: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentProps<T> */ js.Any
  ): js.Promise[scala.Boolean] = js.native
  def insert[T /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavComponent */ js.Any */](
    insertIndex: scala.Double,
    component: T,
    componentProps: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentProps<T> */ js.Any,
    opts: js.UndefOr[scala.Nothing],
    done: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TransitionDoneFn */ js.Any
  ): js.Promise[scala.Boolean] = js.native
  def insert[T /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavComponent */ js.Any */](
    insertIndex: scala.Double,
    component: T,
    componentProps: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentProps<T> */ js.Any,
    opts: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavOptions */ js.Any
  ): js.Promise[scala.Boolean] = js.native
  def insert[T /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavComponent */ js.Any */](
    insertIndex: scala.Double,
    component: T,
    componentProps: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentProps<T> */ js.Any,
    opts: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavOptions */ js.Any,
    done: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TransitionDoneFn */ js.Any
  ): js.Promise[scala.Boolean] = js.native
  def insert[T /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavComponent */ js.Any */](
    insertIndex: scala.Double,
    component: T,
    componentProps: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentProps<T> */ js.Any,
    opts: scala.Null,
    done: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TransitionDoneFn */ js.Any
  ): js.Promise[scala.Boolean] = js.native
  def insert[T /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavComponent */ js.Any */](
    insertIndex: scala.Double,
    component: T,
    componentProps: scala.Null,
    opts: js.UndefOr[scala.Nothing],
    done: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TransitionDoneFn */ js.Any
  ): js.Promise[scala.Boolean] = js.native
  def insert[T /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavComponent */ js.Any */](
    insertIndex: scala.Double,
    component: T,
    componentProps: scala.Null,
    opts: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavOptions */ js.Any
  ): js.Promise[scala.Boolean] = js.native
  def insert[T /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavComponent */ js.Any */](
    insertIndex: scala.Double,
    component: T,
    componentProps: scala.Null,
    opts: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavOptions */ js.Any,
    done: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TransitionDoneFn */ js.Any
  ): js.Promise[scala.Boolean] = js.native
  def insert[T /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavComponent */ js.Any */](
    insertIndex: scala.Double,
    component: T,
    componentProps: scala.Null,
    opts: scala.Null,
    done: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TransitionDoneFn */ js.Any
  ): js.Promise[scala.Boolean] = js.native
  /**
    * Inserts an array of components into the navigation stack at the specified index. The last component in the array will become instantiated as a view, and animate in to become the active view.
    */
  def insertPages(
    insertIndex: scala.Double,
    insertComponents: js.Array[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavComponent */ _
    ]
  ): js.Promise[scala.Boolean] = js.native
  def insertPages(
    insertIndex: scala.Double,
    insertComponents: js.Array[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavComponent */ _
    ],
    opts: js.UndefOr[scala.Nothing],
    done: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TransitionDoneFn */ js.Any
  ): js.Promise[scala.Boolean] = js.native
  def insertPages(
    insertIndex: scala.Double,
    insertComponents: js.Array[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavComponent */ _
    ],
    opts: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavOptions */ js.Any
  ): js.Promise[scala.Boolean] = js.native
  def insertPages(
    insertIndex: scala.Double,
    insertComponents: js.Array[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavComponent */ _
    ],
    opts: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavOptions */ js.Any,
    done: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TransitionDoneFn */ js.Any
  ): js.Promise[scala.Boolean] = js.native
  def insertPages(
    insertIndex: scala.Double,
    insertComponents: js.Array[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavComponent */ _
    ],
    opts: scala.Null,
    done: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TransitionDoneFn */ js.Any
  ): js.Promise[scala.Boolean] = js.native
  /**
    * Pop a component off of the navigation stack. Navigates back from the current component.
    */
  def pop(): js.Promise[scala.Boolean] = js.native
  def pop(
    opts: js.UndefOr[scala.Nothing],
    done: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TransitionDoneFn */ js.Any
  ): js.Promise[scala.Boolean] = js.native
  def pop(
    opts: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavOptions */ js.Any
  ): js.Promise[scala.Boolean] = js.native
  def pop(
    opts: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavOptions */ js.Any,
    done: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TransitionDoneFn */ js.Any
  ): js.Promise[scala.Boolean] = js.native
  def pop(
    opts: scala.Null,
    done: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TransitionDoneFn */ js.Any
  ): js.Promise[scala.Boolean] = js.native
  def popTo(
    indexOrViewCtrl: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ViewController */ js.Any
  ): js.Promise[scala.Boolean] = js.native
  def popTo(
    indexOrViewCtrl: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ViewController */ js.Any,
    opts: js.UndefOr[scala.Nothing],
    done: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TransitionDoneFn */ js.Any
  ): js.Promise[scala.Boolean] = js.native
  def popTo(
    indexOrViewCtrl: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ViewController */ js.Any,
    opts: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavOptions */ js.Any
  ): js.Promise[scala.Boolean] = js.native
  def popTo(
    indexOrViewCtrl: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ViewController */ js.Any,
    opts: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavOptions */ js.Any,
    done: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TransitionDoneFn */ js.Any
  ): js.Promise[scala.Boolean] = js.native
  def popTo(
    indexOrViewCtrl: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ViewController */ js.Any,
    opts: scala.Null,
    done: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TransitionDoneFn */ js.Any
  ): js.Promise[scala.Boolean] = js.native
  /**
    * Pop to a specific index in the navigation stack.
    */
  def popTo(indexOrViewCtrl: scala.Double): js.Promise[scala.Boolean] = js.native
  def popTo(
    indexOrViewCtrl: scala.Double,
    opts: js.UndefOr[scala.Nothing],
    done: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TransitionDoneFn */ js.Any
  ): js.Promise[scala.Boolean] = js.native
  def popTo(
    indexOrViewCtrl: scala.Double,
    opts: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavOptions */ js.Any
  ): js.Promise[scala.Boolean] = js.native
  def popTo(
    indexOrViewCtrl: scala.Double,
    opts: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavOptions */ js.Any,
    done: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TransitionDoneFn */ js.Any
  ): js.Promise[scala.Boolean] = js.native
  def popTo(
    indexOrViewCtrl: scala.Double,
    opts: scala.Null,
    done: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TransitionDoneFn */ js.Any
  ): js.Promise[scala.Boolean] = js.native
  /**
    * Navigate back to the root of the stack, no matter how far back that is.
    */
  def popToRoot(): js.Promise[scala.Boolean] = js.native
  def popToRoot(
    opts: js.UndefOr[scala.Nothing],
    done: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TransitionDoneFn */ js.Any
  ): js.Promise[scala.Boolean] = js.native
  def popToRoot(
    opts: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavOptions */ js.Any
  ): js.Promise[scala.Boolean] = js.native
  def popToRoot(
    opts: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavOptions */ js.Any,
    done: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TransitionDoneFn */ js.Any
  ): js.Promise[scala.Boolean] = js.native
  def popToRoot(
    opts: scala.Null,
    done: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TransitionDoneFn */ js.Any
  ): js.Promise[scala.Boolean] = js.native
  /**
    * Push a new component onto the current navigation stack. Pass any additional information along as an object. This additional information is accessible through NavParams.
    */
  def push[T /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavComponent */ js.Any */](component: T): js.Promise[scala.Boolean] = js.native
  def push[T /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavComponent */ js.Any */](
    component: T,
    componentProps: js.UndefOr[scala.Nothing],
    opts: js.UndefOr[scala.Nothing],
    done: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TransitionDoneFn */ js.Any
  ): js.Promise[scala.Boolean] = js.native
  def push[T /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavComponent */ js.Any */](
    component: T,
    componentProps: js.UndefOr[scala.Nothing],
    opts: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavOptions */ js.Any
  ): js.Promise[scala.Boolean] = js.native
  def push[T /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavComponent */ js.Any */](
    component: T,
    componentProps: js.UndefOr[scala.Nothing],
    opts: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavOptions */ js.Any,
    done: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TransitionDoneFn */ js.Any
  ): js.Promise[scala.Boolean] = js.native
  def push[T /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavComponent */ js.Any */](
    component: T,
    componentProps: js.UndefOr[scala.Nothing],
    opts: scala.Null,
    done: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TransitionDoneFn */ js.Any
  ): js.Promise[scala.Boolean] = js.native
  def push[T /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavComponent */ js.Any */](
    component: T,
    componentProps: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentProps<T> */ js.Any
  ): js.Promise[scala.Boolean] = js.native
  def push[T /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavComponent */ js.Any */](
    component: T,
    componentProps: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentProps<T> */ js.Any,
    opts: js.UndefOr[scala.Nothing],
    done: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TransitionDoneFn */ js.Any
  ): js.Promise[scala.Boolean] = js.native
  def push[T /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavComponent */ js.Any */](
    component: T,
    componentProps: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentProps<T> */ js.Any,
    opts: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavOptions */ js.Any
  ): js.Promise[scala.Boolean] = js.native
  def push[T /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavComponent */ js.Any */](
    component: T,
    componentProps: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentProps<T> */ js.Any,
    opts: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavOptions */ js.Any,
    done: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TransitionDoneFn */ js.Any
  ): js.Promise[scala.Boolean] = js.native
  def push[T /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavComponent */ js.Any */](
    component: T,
    componentProps: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentProps<T> */ js.Any,
    opts: scala.Null,
    done: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TransitionDoneFn */ js.Any
  ): js.Promise[scala.Boolean] = js.native
  def push[T /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavComponent */ js.Any */](
    component: T,
    componentProps: scala.Null,
    opts: js.UndefOr[scala.Nothing],
    done: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TransitionDoneFn */ js.Any
  ): js.Promise[scala.Boolean] = js.native
  def push[T /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavComponent */ js.Any */](
    component: T,
    componentProps: scala.Null,
    opts: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavOptions */ js.Any
  ): js.Promise[scala.Boolean] = js.native
  def push[T /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavComponent */ js.Any */](
    component: T,
    componentProps: scala.Null,
    opts: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavOptions */ js.Any,
    done: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TransitionDoneFn */ js.Any
  ): js.Promise[scala.Boolean] = js.native
  def push[T /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavComponent */ js.Any */](
    component: T,
    componentProps: scala.Null,
    opts: scala.Null,
    done: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TransitionDoneFn */ js.Any
  ): js.Promise[scala.Boolean] = js.native
  /**
    * Removes a component from the navigation stack at the specified index.
    */
  def removeIndex(startIndex: scala.Double): js.Promise[scala.Boolean] = js.native
  def removeIndex(startIndex: scala.Double, removeCount: scala.Double): js.Promise[scala.Boolean] = js.native
  def removeIndex(
    startIndex: scala.Double,
    removeCount: scala.Double,
    opts: js.UndefOr[scala.Nothing],
    done: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TransitionDoneFn */ js.Any
  ): js.Promise[scala.Boolean] = js.native
  def removeIndex(
    startIndex: scala.Double,
    removeCount: scala.Double,
    opts: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavOptions */ js.Any
  ): js.Promise[scala.Boolean] = js.native
  def removeIndex(
    startIndex: scala.Double,
    removeCount: scala.Double,
    opts: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavOptions */ js.Any,
    done: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TransitionDoneFn */ js.Any
  ): js.Promise[scala.Boolean] = js.native
  def removeIndex(
    startIndex: scala.Double,
    removeCount: scala.Double,
    opts: scala.Null,
    done: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TransitionDoneFn */ js.Any
  ): js.Promise[scala.Boolean] = js.native
  /**
    * Set the views of the current navigation stack and navigate to the last view. By default animations are disabled, but they can be enabled by passing options to the navigation controller. Navigation parameters can also be passed to the individual pages in the array.
    */
  def setPages(views: js.Array[_]): js.Promise[scala.Boolean] = js.native
  def setPages(
    views: js.Array[_],
    opts: js.UndefOr[scala.Nothing],
    done: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TransitionDoneFn */ js.Any
  ): js.Promise[scala.Boolean] = js.native
  def setPages(
    views: js.Array[_],
    opts: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavOptions */ js.Any
  ): js.Promise[scala.Boolean] = js.native
  def setPages(
    views: js.Array[_],
    opts: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavOptions */ js.Any,
    done: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TransitionDoneFn */ js.Any
  ): js.Promise[scala.Boolean] = js.native
  def setPages(
    views: js.Array[_],
    opts: scala.Null,
    done: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TransitionDoneFn */ js.Any
  ): js.Promise[scala.Boolean] = js.native
  /**
    * Set the root for the current navigation stack to a component.
    */
  def setRoot[T /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavComponent */ js.Any */](component: T): js.Promise[scala.Boolean] = js.native
  def setRoot[T /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavComponent */ js.Any */](
    component: T,
    componentProps: js.UndefOr[scala.Nothing],
    opts: js.UndefOr[scala.Nothing],
    done: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TransitionDoneFn */ js.Any
  ): js.Promise[scala.Boolean] = js.native
  def setRoot[T /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavComponent */ js.Any */](
    component: T,
    componentProps: js.UndefOr[scala.Nothing],
    opts: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavOptions */ js.Any
  ): js.Promise[scala.Boolean] = js.native
  def setRoot[T /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavComponent */ js.Any */](
    component: T,
    componentProps: js.UndefOr[scala.Nothing],
    opts: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavOptions */ js.Any,
    done: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TransitionDoneFn */ js.Any
  ): js.Promise[scala.Boolean] = js.native
  def setRoot[T /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavComponent */ js.Any */](
    component: T,
    componentProps: js.UndefOr[scala.Nothing],
    opts: scala.Null,
    done: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TransitionDoneFn */ js.Any
  ): js.Promise[scala.Boolean] = js.native
  def setRoot[T /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavComponent */ js.Any */](
    component: T,
    componentProps: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentProps<T> */ js.Any
  ): js.Promise[scala.Boolean] = js.native
  def setRoot[T /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavComponent */ js.Any */](
    component: T,
    componentProps: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentProps<T> */ js.Any,
    opts: js.UndefOr[scala.Nothing],
    done: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TransitionDoneFn */ js.Any
  ): js.Promise[scala.Boolean] = js.native
  def setRoot[T /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavComponent */ js.Any */](
    component: T,
    componentProps: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentProps<T> */ js.Any,
    opts: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavOptions */ js.Any
  ): js.Promise[scala.Boolean] = js.native
  def setRoot[T /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavComponent */ js.Any */](
    component: T,
    componentProps: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentProps<T> */ js.Any,
    opts: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavOptions */ js.Any,
    done: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TransitionDoneFn */ js.Any
  ): js.Promise[scala.Boolean] = js.native
  def setRoot[T /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavComponent */ js.Any */](
    component: T,
    componentProps: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentProps<T> */ js.Any,
    opts: scala.Null,
    done: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TransitionDoneFn */ js.Any
  ): js.Promise[scala.Boolean] = js.native
  def setRoot[T /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavComponent */ js.Any */](
    component: T,
    componentProps: scala.Null,
    opts: js.UndefOr[scala.Nothing],
    done: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TransitionDoneFn */ js.Any
  ): js.Promise[scala.Boolean] = js.native
  def setRoot[T /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavComponent */ js.Any */](
    component: T,
    componentProps: scala.Null,
    opts: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavOptions */ js.Any
  ): js.Promise[scala.Boolean] = js.native
  def setRoot[T /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavComponent */ js.Any */](
    component: T,
    componentProps: scala.Null,
    opts: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavOptions */ js.Any,
    done: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TransitionDoneFn */ js.Any
  ): js.Promise[scala.Boolean] = js.native
  def setRoot[T /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavComponent */ js.Any */](
    component: T,
    componentProps: scala.Null,
    opts: scala.Null,
    done: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TransitionDoneFn */ js.Any
  ): js.Promise[scala.Boolean] = js.native
  def setRouteId(
    id: java.lang.String,
    params: js.UndefOr[scala.Nothing],
    direction: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify RouterDirection */ js.Any
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify RouteWrite */ _
  ] = js.native
  def setRouteId(
    id: java.lang.String,
    params: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentProps<null> */ js.Any,
    direction: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify RouterDirection */ js.Any
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify RouteWrite */ _
  ] = js.native
}

