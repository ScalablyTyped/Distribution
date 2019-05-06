package typings
package atIonicCoreLib.distTypesStencilDotCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentInstance
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
  /**
    * The component did unload and the element
    * will be destroyed.
    */
  var componentDidUnload: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
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
  /**
    * The component is about to update and re-render.
    *
    * Called multiple times throughout the life of
    * the component as it updates.
    *
    * componentWillUpdate is not called on the first render.
    */
  var componentWillUpdate: js.UndefOr[js.Function0[js.Promise[scala.Unit] | scala.Unit]] = js.undefined
  /**
    * Used to dynamically set host element attributes.
    * Should be placed directly above render()
    */
  var hostData: js.UndefOr[js.Function0[atIonicCoreLib.Anon_AttrName]] = js.undefined
  var render: js.UndefOr[js.Function0[_]] = js.undefined
}

object ComponentInstance {
  @scala.inline
  def apply(
    StringDictionary: /* memberName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    componentDidLoad: () => scala.Unit = null,
    componentDidUnload: () => scala.Unit = null,
    componentDidUpdate: () => scala.Unit = null,
    componentWillLoad: () => js.Promise[scala.Unit] | scala.Unit = null,
    componentWillUpdate: () => js.Promise[scala.Unit] | scala.Unit = null,
    hostData: () => atIonicCoreLib.Anon_AttrName = null,
    render: () => _ = null
  ): ComponentInstance = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (componentDidLoad != null) __obj.updateDynamic("componentDidLoad")(js.Any.fromFunction0(componentDidLoad))
    if (componentDidUnload != null) __obj.updateDynamic("componentDidUnload")(js.Any.fromFunction0(componentDidUnload))
    if (componentDidUpdate != null) __obj.updateDynamic("componentDidUpdate")(js.Any.fromFunction0(componentDidUpdate))
    if (componentWillLoad != null) __obj.updateDynamic("componentWillLoad")(js.Any.fromFunction0(componentWillLoad))
    if (componentWillUpdate != null) __obj.updateDynamic("componentWillUpdate")(js.Any.fromFunction0(componentWillUpdate))
    if (hostData != null) __obj.updateDynamic("hostData")(js.Any.fromFunction0(hostData))
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction0(render))
    __obj.asInstanceOf[ComponentInstance]
  }
}

