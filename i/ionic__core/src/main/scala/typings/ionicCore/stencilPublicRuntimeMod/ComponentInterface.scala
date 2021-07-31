package typings.ionicCore.stencilPublicRuntimeMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentInterface
  extends StObject
     with /* prop */ StringDictionary[js.Any] {
  
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
  
  var render: js.UndefOr[js.Function0[js.Any]] = js.undefined
}
object ComponentInterface {
  
  @scala.inline
  def apply(): ComponentInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentInterface]
  }
  
  @scala.inline
  implicit class ComponentInterfaceMutableBuilder[Self <: ComponentInterface] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponentDidLoad(value: () => Unit): Self = StObject.set(x, "componentDidLoad", js.Any.fromFunction0(value))
    
    @scala.inline
    def setComponentDidLoadUndefined: Self = StObject.set(x, "componentDidLoad", js.undefined)
    
    @scala.inline
    def setComponentDidRender(value: () => Unit): Self = StObject.set(x, "componentDidRender", js.Any.fromFunction0(value))
    
    @scala.inline
    def setComponentDidRenderUndefined: Self = StObject.set(x, "componentDidRender", js.undefined)
    
    @scala.inline
    def setComponentDidUpdate(value: () => Unit): Self = StObject.set(x, "componentDidUpdate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setComponentDidUpdateUndefined: Self = StObject.set(x, "componentDidUpdate", js.undefined)
    
    @scala.inline
    def setComponentShouldUpdate(value: (/* newVal */ js.Any, /* oldVal */ js.Any, /* propName */ String) => Boolean | Unit): Self = StObject.set(x, "componentShouldUpdate", js.Any.fromFunction3(value))
    
    @scala.inline
    def setComponentShouldUpdateUndefined: Self = StObject.set(x, "componentShouldUpdate", js.undefined)
    
    @scala.inline
    def setComponentWillLoad(value: () => js.Promise[Unit] | Unit): Self = StObject.set(x, "componentWillLoad", js.Any.fromFunction0(value))
    
    @scala.inline
    def setComponentWillLoadUndefined: Self = StObject.set(x, "componentWillLoad", js.undefined)
    
    @scala.inline
    def setComponentWillRender(value: () => js.Promise[Unit] | Unit): Self = StObject.set(x, "componentWillRender", js.Any.fromFunction0(value))
    
    @scala.inline
    def setComponentWillRenderUndefined: Self = StObject.set(x, "componentWillRender", js.undefined)
    
    @scala.inline
    def setComponentWillUpdate(value: () => js.Promise[Unit] | Unit): Self = StObject.set(x, "componentWillUpdate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setComponentWillUpdateUndefined: Self = StObject.set(x, "componentWillUpdate", js.undefined)
    
    @scala.inline
    def setConnectedCallback(value: () => Unit): Self = StObject.set(x, "connectedCallback", js.Any.fromFunction0(value))
    
    @scala.inline
    def setConnectedCallbackUndefined: Self = StObject.set(x, "connectedCallback", js.undefined)
    
    @scala.inline
    def setDisconnectedCallback(value: () => Unit): Self = StObject.set(x, "disconnectedCallback", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDisconnectedCallbackUndefined: Self = StObject.set(x, "disconnectedCallback", js.undefined)
    
    @scala.inline
    def setRender(value: () => js.Any): Self = StObject.set(x, "render", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
  }
}
