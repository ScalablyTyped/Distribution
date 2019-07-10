package typings
package atIonicCoreLib.distTypesStencilDotCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentInterface
  extends /* memberName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
    * The component has loaded and has already rendered.
    *
    * Updating data in this method will cause the
    * component to re-render.
    *
    * componentDidLoad will only be called once.
    */
  var componentDidLoad: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var componentDidRender: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * The component has just re-rendered.
    *
    * Called multiple times throughout the life of
    * the component as it updates.
    *
    * componentWillUpdate is not called on the
    * first render.
    */
  var componentDidUpdate: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * The component is about to load and it has not
    * rendered yet.
    *
    * This is the best place to make any data updates
    * before the first render.
    *
    * componentWillLoad will only be called once.
    */
  var componentWillLoad: js.UndefOr[js.Function0[js.Promise[scala.Unit] | scala.Unit]] = js.undefined
  var componentWillRender: js.UndefOr[js.Function0[js.Promise[scala.Unit] | scala.Unit]] = js.undefined
  /**
    * The component is about to update and re-render.
    *
    * Called multiple times throughout the life of
    * the component as it updates.
    *
    * componentWillUpdate is not called on the first render.
    */
  var componentWillUpdate: js.UndefOr[js.Function0[js.Promise[scala.Unit] | scala.Unit]] = js.undefined
  var connectedCallback: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var disconnectedCallback: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var render: js.UndefOr[js.Function0[_]] = js.undefined
}

object ComponentInterface {
  @scala.inline
  def apply(
    StringDictionary: /* memberName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    componentDidLoad: () => scala.Unit = null,
    componentDidRender: () => scala.Unit = null,
    componentDidUpdate: () => scala.Unit = null,
    componentWillLoad: () => js.Promise[scala.Unit] | scala.Unit = null,
    componentWillRender: () => js.Promise[scala.Unit] | scala.Unit = null,
    componentWillUpdate: () => js.Promise[scala.Unit] | scala.Unit = null,
    connectedCallback: () => scala.Unit = null,
    disconnectedCallback: () => scala.Unit = null,
    render: () => _ = null
  ): ComponentInterface = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (componentDidLoad != null) __obj.updateDynamic("componentDidLoad")(js.Any.fromFunction0(componentDidLoad))
    if (componentDidRender != null) __obj.updateDynamic("componentDidRender")(js.Any.fromFunction0(componentDidRender))
    if (componentDidUpdate != null) __obj.updateDynamic("componentDidUpdate")(js.Any.fromFunction0(componentDidUpdate))
    if (componentWillLoad != null) __obj.updateDynamic("componentWillLoad")(js.Any.fromFunction0(componentWillLoad))
    if (componentWillRender != null) __obj.updateDynamic("componentWillRender")(js.Any.fromFunction0(componentWillRender))
    if (componentWillUpdate != null) __obj.updateDynamic("componentWillUpdate")(js.Any.fromFunction0(componentWillUpdate))
    if (connectedCallback != null) __obj.updateDynamic("connectedCallback")(js.Any.fromFunction0(connectedCallback))
    if (disconnectedCallback != null) __obj.updateDynamic("disconnectedCallback")(js.Any.fromFunction0(disconnectedCallback))
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction0(render))
    __obj.asInstanceOf[ComponentInterface]
  }
}

