package typings.ionicons.stencilPublicRuntimeMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
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
  var componentDidLoad: js.UndefOr[js.Function0[Unit]] = js.native
  
  var componentDidRender: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * The component has just re-rendered.
    *
    * Called multiple times throughout the life of
    * the component as it updates.
    *
    * componentWillUpdate is not called on the
    * first render.
    */
  var componentDidUpdate: js.UndefOr[js.Function0[Unit]] = js.native
  
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
  ] = js.native
  
  /**
    * The component is about to load and it has not
    * rendered yet.
    *
    * This is the best place to make any data updates
    * before the first render.
    *
    * componentWillLoad will only be called once.
    */
  var componentWillLoad: js.UndefOr[js.Function0[js.Promise[Unit] | Unit]] = js.native
  
  var componentWillRender: js.UndefOr[js.Function0[js.Promise[Unit] | Unit]] = js.native
  
  /**
    * The component is about to update and re-render.
    *
    * Called multiple times throughout the life of
    * the component as it updates.
    *
    * componentWillUpdate is not called on the first render.
    */
  var componentWillUpdate: js.UndefOr[js.Function0[js.Promise[Unit] | Unit]] = js.native
  
  var connectedCallback: js.UndefOr[js.Function0[Unit]] = js.native
  
  var disconnectedCallback: js.UndefOr[js.Function0[Unit]] = js.native
  
  var render: js.UndefOr[js.Function0[_]] = js.native
}
object ComponentInterface {
  
  @scala.inline
  def apply(): ComponentInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentInterface]
  }
  
  @scala.inline
  implicit class ComponentInterfaceOps[Self <: ComponentInterface] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setComponentDidLoad(value: () => Unit): Self = this.set("componentDidLoad", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteComponentDidLoad: Self = this.set("componentDidLoad", js.undefined)
    
    @scala.inline
    def setComponentDidRender(value: () => Unit): Self = this.set("componentDidRender", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteComponentDidRender: Self = this.set("componentDidRender", js.undefined)
    
    @scala.inline
    def setComponentDidUpdate(value: () => Unit): Self = this.set("componentDidUpdate", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteComponentDidUpdate: Self = this.set("componentDidUpdate", js.undefined)
    
    @scala.inline
    def setComponentShouldUpdate(value: (/* newVal */ js.Any, /* oldVal */ js.Any, /* propName */ String) => Boolean | Unit): Self = this.set("componentShouldUpdate", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteComponentShouldUpdate: Self = this.set("componentShouldUpdate", js.undefined)
    
    @scala.inline
    def setComponentWillLoad(value: () => js.Promise[Unit] | Unit): Self = this.set("componentWillLoad", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteComponentWillLoad: Self = this.set("componentWillLoad", js.undefined)
    
    @scala.inline
    def setComponentWillRender(value: () => js.Promise[Unit] | Unit): Self = this.set("componentWillRender", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteComponentWillRender: Self = this.set("componentWillRender", js.undefined)
    
    @scala.inline
    def setComponentWillUpdate(value: () => js.Promise[Unit] | Unit): Self = this.set("componentWillUpdate", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteComponentWillUpdate: Self = this.set("componentWillUpdate", js.undefined)
    
    @scala.inline
    def setConnectedCallback(value: () => Unit): Self = this.set("connectedCallback", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteConnectedCallback: Self = this.set("connectedCallback", js.undefined)
    
    @scala.inline
    def setDisconnectedCallback(value: () => Unit): Self = this.set("disconnectedCallback", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteDisconnectedCallback: Self = this.set("disconnectedCallback", js.undefined)
    
    @scala.inline
    def setRender(value: () => _): Self = this.set("render", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
  }
}
