package typings.ionicons.stencilPublicRuntimeMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentInterface
  extends /* prop */ StringDictionary[js.Any] {
  /**
    * The component has loaded and has already rendered.
    *
    * Updating data in this method will cause the
    * component to re-render.
    *
    * componentDidLoad will only be called once.
    */
  var componentDidLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
  var componentDidRender: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * The component has just re-rendered.
    *
    * Called multiple times throughout the life of
    * the component as it updates.
    *
    * componentWillUpdate is not called on the
    * first render.
    */
  var componentDidUpdate: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * A `@Prop` or `@State` property changed and a rerender is about to be requested.
    *
    * Called multiple times throughout the life of
    * the component as its properties change.
    *
    * componentShouldUpdate is not called on the first render.
    */
  var componentShouldUpdate: js.UndefOr[
    js.Function3[/* newVal */ js.Any, /* oldVal */ js.Any, /* propName */ String, Boolean | Unit]
  ] = js.undefined
  /**
    * The component is about to load and it has not
    * rendered yet.
    *
    * This is the best place to make any data updates
    * before the first render.
    *
    * componentWillLoad will only be called once.
    */
  var componentWillLoad: js.UndefOr[js.Function0[js.Promise[Unit] | Unit]] = js.undefined
  var componentWillRender: js.UndefOr[js.Function0[js.Promise[Unit] | Unit]] = js.undefined
  /**
    * The component is about to update and re-render.
    *
    * Called multiple times throughout the life of
    * the component as it updates.
    *
    * componentWillUpdate is not called on the first render.
    */
  var componentWillUpdate: js.UndefOr[js.Function0[js.Promise[Unit] | Unit]] = js.undefined
  var connectedCallback: js.UndefOr[js.Function0[Unit]] = js.undefined
  var disconnectedCallback: js.UndefOr[js.Function0[Unit]] = js.undefined
  var render: js.UndefOr[js.Function0[_]] = js.undefined
}

object ComponentInterface {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    componentDidLoad: () => Unit = null,
    componentDidRender: () => Unit = null,
    componentDidUpdate: () => Unit = null,
    componentShouldUpdate: (/* newVal */ js.Any, /* oldVal */ js.Any, /* propName */ String) => Boolean | Unit = null,
    componentWillLoad: () => js.Promise[Unit] | Unit = null,
    componentWillRender: () => js.Promise[Unit] | Unit = null,
    componentWillUpdate: () => js.Promise[Unit] | Unit = null,
    connectedCallback: () => Unit = null,
    disconnectedCallback: () => Unit = null,
    render: () => _ = null
  ): ComponentInterface = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (componentDidLoad != null) __obj.updateDynamic("componentDidLoad")(js.Any.fromFunction0(componentDidLoad))
    if (componentDidRender != null) __obj.updateDynamic("componentDidRender")(js.Any.fromFunction0(componentDidRender))
    if (componentDidUpdate != null) __obj.updateDynamic("componentDidUpdate")(js.Any.fromFunction0(componentDidUpdate))
    if (componentShouldUpdate != null) __obj.updateDynamic("componentShouldUpdate")(js.Any.fromFunction3(componentShouldUpdate))
    if (componentWillLoad != null) __obj.updateDynamic("componentWillLoad")(js.Any.fromFunction0(componentWillLoad))
    if (componentWillRender != null) __obj.updateDynamic("componentWillRender")(js.Any.fromFunction0(componentWillRender))
    if (componentWillUpdate != null) __obj.updateDynamic("componentWillUpdate")(js.Any.fromFunction0(componentWillUpdate))
    if (connectedCallback != null) __obj.updateDynamic("connectedCallback")(js.Any.fromFunction0(connectedCallback))
    if (disconnectedCallback != null) __obj.updateDynamic("disconnectedCallback")(js.Any.fromFunction0(disconnectedCallback))
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction0(render))
    __obj.asInstanceOf[ComponentInterface]
  }
}

