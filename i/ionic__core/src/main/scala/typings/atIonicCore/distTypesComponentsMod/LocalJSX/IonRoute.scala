package typings.atIonicCore.distTypesComponentsMod.LocalJSX

import org.scalablytyped.runtime.StringDictionary
import typings.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonRoute extends js.Object {
  /**
    * Name of the component to load/select in the navigation outlet (`ion-tabs`, `ion-nav`) when the route matches.  The value of this property is not always the tagname of the component to load, in `ion-tabs` it actually refers to the name of the `ion-tab` to select.
    */
  var component: String
  /**
    * A key value `{ 'red': true, 'blue': 'white'}` containing props that should be passed to the defined component when rendered.
    */
  var componentProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /**
    * Used internally by `ion-router` to know when this route did change.
    */
  var onIonRouteDataChanged: js.UndefOr[js.Function1[/* event */ CustomEvent[_], Unit]] = js.undefined
  /**
    * Relative path that needs to match in order for this route to apply.  Accepts paths similar to expressjs so that you can define parameters in the url /foo/:bar where bar would be available in incoming props.
    */
  var url: js.UndefOr[String] = js.undefined
}

object IonRoute {
  @scala.inline
  def apply(
    component: String,
    componentProps: StringDictionary[js.Any] = null,
    onIonRouteDataChanged: /* event */ CustomEvent[_] => Unit = null,
    url: String = null
  ): IonRoute = {
    val __obj = js.Dynamic.literal(component = component)
    if (componentProps != null) __obj.updateDynamic("componentProps")(componentProps)
    if (onIonRouteDataChanged != null) __obj.updateDynamic("onIonRouteDataChanged")(js.Any.fromFunction1(onIonRouteDataChanged))
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[IonRoute]
  }
}

